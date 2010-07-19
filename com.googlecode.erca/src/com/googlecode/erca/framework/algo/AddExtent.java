 /*********************************************************************************
 * Copyright (c) 2007, 2008 Jean-Rémy Falleri <jr.falleri@laposte.net>
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Jean-Rémy Falleri <jr.falleri@laposte.net> - initial API and implementation
 *********************************************************************************/

package com.googlecode.erca.framework.algo;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import com.googlecode.erca.Attribute;
import com.googlecode.erca.Entity;
import com.googlecode.erca.clf.ClfFactory;
import com.googlecode.erca.clf.Concept;
import com.googlecode.erca.clf.ConceptLattice;
import com.googlecode.erca.rcf.FormalContext;
import com.googlecode.exputils.NameGenerator;

public class AddExtent {
	
	public static ConceptLattice createLattice(FormalContext ctx,NameGenerator nameGenerator) {
		ConceptLattice lattice = ClfFactory.eINSTANCE.createConceptLattice();
		lattice.setName(ctx.getName());
		
		Concept top = ClfFactory.eINSTANCE.createConcept();
		top.setName(nameGenerator.newName("Concept"));
		top.getExtent().addAll(ctx.getEntities());
		lattice.getConcepts().add(top);
		lattice.setTop(top);
		
		for(Attribute attribute: ctx.getAttributes()) {
			Concept concept = AddExtent.addExtent(ctx.getSourceEntities(attribute),top,lattice,nameGenerator);
			for(Concept child: concept.getAllChildren() )
				child.getIntent().add(attribute);
		}
		
		for( Concept c: lattice.getConcepts() )
			c.setCreationStep(0);
		
		return lattice;
	}
	
	public static Concept addExtent(EList<Entity> extent,Concept generator, ConceptLattice lattice,NameGenerator nameGenerator) {
		generator = getMaximalConcept(extent, generator, lattice);
		if ( extent.containsAll(generator.getExtent()) && generator.getExtent().containsAll(extent) ) {
			return generator;
		}

		EList<Concept> newChildren = new BasicEList<Concept>();

		for( Concept candidate: generator.getChildren() ) {
			if ( ! candidate.getExtent().containsAll(extent) ) {
				EList<Entity> intersection = new BasicEList<Entity>();
				intersection.addAll(candidate.getExtent());
				intersection.retainAll(extent);
				candidate = addExtent(intersection, candidate,lattice,nameGenerator);
			}
			boolean addChild = true;
			EList<Concept> conceptsToDelete = new BasicEList<Concept>();

			for(Concept child: newChildren ) {
				if ( child.getExtent().containsAll(candidate.getExtent()) ) {
					addChild = false;
					break;
				}
				else if ( candidate.getExtent().containsAll(child.getExtent()) )
					conceptsToDelete.add(child);
			}
			for( Concept concept: conceptsToDelete )
				newChildren.remove(concept);
			if ( addChild )
				newChildren.add(candidate);
		}

		Concept newConcept = ClfFactory.eINSTANCE.createConcept();
		newConcept.setName( nameGenerator.newName("Concept") );
		newConcept.getIntent().addAll(generator.getIntent());
		newConcept.getExtent().addAll(extent);
		lattice.getConcepts().add(newConcept);

		for (Concept child: newChildren ) {
			generator.getChildren().remove(child);
			newConcept.getChildren().add(child);
		}

		generator.getChildren().add(newConcept);
		return newConcept;
	}

	private static Concept getMaximalConcept(EList<Entity> extent, Concept generator, ConceptLattice lattice) {
		boolean isMaximal = true;
		while ( isMaximal ) {
			isMaximal = false;
			for ( Concept child: generator.getChildren()) {
				if ( child.getExtent().containsAll(extent) ) {
					generator = child;
					isMaximal = true;
					break;
				}
			}
		}
		return generator;
	}

}
