/*********************************************************************************
 * Copyright (c) 2009 Jean-Rémy Falleri <jr.falleri@laposte.net>
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Jean-Rémy Falleri <jr.falleri@laposte.net> - initial API and implementation
 *********************************************************************************/

package com.googlecode.erca.framework.algo;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.googlecode.erca.Attribute;
import com.googlecode.erca.Entity;
import com.googlecode.erca.clf.ClfFactory;
import com.googlecode.erca.clf.Concept;
import com.googlecode.erca.clf.ConceptLattice;
import com.googlecode.erca.rcf.FormalContext;

public class NaiveGSH {

	private int ID;

	private List<Concept> concepts;

	private FormalContext fc;

	private ConceptLattice cl;

	public NaiveGSH(FormalContext fc) {
		this.fc = fc;
		concepts = new LinkedList<Concept>();
		cl = ClfFactory.eINSTANCE.createConceptLattice();
		ID = 0;
	}

	public void generateGSH() {
		for( Entity e : fc.getEntities() ) {
			Concept c = u(e);
			if ( !exists(c) ) {
				c.setName("Concept_" + ID);
				ID++;
				concepts.add(c);
			}
		}

		for( Attribute a : fc.getAttributes() ) {
			Concept c = v(a);
			if ( !exists(c) ) {
				c.setName("Concept_" + ID);
				ID++;
				concepts.add(c);
			}
		}

		HashSet<Concept> addedConcepts = new HashSet<Concept>();

		for( Concept c: concepts )
			add(c,addedConcepts);

		for( Concept c: concepts ) 
			cl.getConcepts().add(c);

		for( Concept c: cl.getConcepts() )
			if ( c.getParents().size() == 0 )
				cl.setTop(c);
	}

	public void add(Concept c,Set<Concept> addedConcepts) {
		if ( addedConcepts.contains(c) )
			return;

		Set<Concept> allParents = allSmallests(c);
		for( Concept p: allParents)
			if ( !addedConcepts.contains(p) )
				add(p,addedConcepts);

		addedConcepts.add(c);
		Set<Concept> smallests = selectSmallests(allParents);

		for ( Concept parent: smallests )
			parent.getChildren().add(c);
	}

	public Set<Concept> allSmallests(Concept c) {
		HashSet<Concept> allSmallests = new HashSet<Concept>();
		for( Concept candidate: concepts)
			if ( c != candidate) 
				if ( smallerThan(candidate,c) )
					allSmallests.add(candidate);		

		return allSmallests;
	}

	private Set<Concept> selectSmallests(Set<Concept> concepts) {
		Set<Concept> smallests = new HashSet<Concept>();
		for ( Concept c: concepts )
			pushToSmallests(c,smallests);

		return smallests;
	}

	private void pushToSmallests(Concept c,Set<Concept> smallests) {
		Concept swap = null;
		for ( Concept current: smallests ) {
			if ( smallerThan(c,current) )
				return;
			else if ( smallerThan(current,c) ) {
				swap = current;
				break;
			}
		}
		if ( swap != null )
			smallests.remove(swap);

		smallests.add(c);

	}

	public boolean sameAs(Concept c1,Concept c2) {
		if ( sameIntent(c1, c2) && sameExtent(c1, c2) ) 
			return true;

		return false;
	}

	public boolean smallerThan(Concept c1,Concept c2) {
		if ( c1.getExtent().containsAll(c2.getExtent())/* && !(c2.getExtent().containsAll(c1.getExtent()))*/ )
			return true;

		return false;
	}

	public ConceptLattice getConceptLattice() {
		return cl;
	}

	public boolean exists(Concept c) {
		for ( Concept candidate: concepts )
			if ( sameAs(candidate,c) )
				return true;

		return false;
	}

	public boolean sameIntent(Concept c1,Concept c2) {
		if ( c1.getIntent().containsAll(c2.getIntent()) && c2.getIntent().containsAll(c1.getIntent()) )
			return true;
		return false;
	}

	public boolean sameExtent(Concept c1,Concept c2) {
		if ( c1.getExtent().containsAll(c2.getExtent()) && c2.getExtent().containsAll(c1.getExtent()) )
			return true;
		return false;
	}

	public Concept u(Entity e) {
		Concept c = ClfFactory.eINSTANCE.createConcept();
		c.getIntent().addAll(fc.getTargetAttributes(e));
		HashSet<Entity> extent = new HashSet<Entity>();
		extent.addAll(fc.getEntities());
		for( Attribute a: fc.getTargetAttributes(e) )
			extent.retainAll(fc.getSourceEntities(a));
		c.getExtent().addAll(extent);
		return c;
	}

	public Concept v(Attribute a) {
		Concept c = ClfFactory.eINSTANCE.createConcept();
		c.getExtent().addAll(fc.getSourceEntities(a));
		HashSet<Attribute> intent = new HashSet<Attribute>();
		intent.addAll(fc.getAttributes());
		for( Entity e: fc.getSourceEntities(a) )
			intent.retainAll(fc.getTargetAttributes(e));
		c.getIntent().addAll(intent);
		return c;
	}

}
