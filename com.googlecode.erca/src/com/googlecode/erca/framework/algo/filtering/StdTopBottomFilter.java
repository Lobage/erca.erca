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

package com.googlecode.erca.framework.algo.filtering;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import com.googlecode.erca.Attribute;
import com.googlecode.erca.ValuedAttribute;
import com.googlecode.erca.clf.Concept;
import com.googlecode.erca.clf.ConceptLattice;
import com.googlecode.erca.clf.ConceptLatticeFamily;


public class StdTopBottomFilter implements ClfFilter {

	public void filter(ConceptLatticeFamily clf) {
		EList<Concept> conceptsToDelete = new BasicEList<Concept>();
		EList<Concept> nextConceptsToDelete = new BasicEList<Concept>();
		for(ConceptLattice lattice: clf.getConceptLattices() ) {
			for(Concept concept: lattice.getConcepts() ) {
				if ( concept.isDummy() )
					nextConceptsToDelete.add(concept);
			}
		}
		while( nextConceptsToDelete.size() > 0 ) {
			conceptsToDelete.clear();
			conceptsToDelete.addAll(nextConceptsToDelete);
			nextConceptsToDelete.clear();
			for( Concept concept: conceptsToDelete ) {
				ConceptLattice lattice = concept.getLattice();
				if ( lattice.getTop() == concept )
					lattice.setTop(null);
				for(Concept parent: concept.getParents() )
					parent.getChildren().remove(concept);
				lattice.getConcepts().remove(concept);
			}
			for(ConceptLattice lattice: clf.getConceptLattices() ) {
				for(Concept concept: lattice.getConcepts() ) {
					EList<Attribute> intersection = intersection(concept,conceptsToDelete);
					if ( intersection.size() > 0 ) {
						concept.getIntent().removeAll(intersection);
						if ( concept.isDummy() )
							nextConceptsToDelete.add(concept);
					}
				}
			}
		}
	}


	private static EList<Attribute> intersection(Concept concept,EList<Concept> deletedConcepts) {
		EList<Attribute> attributes = new BasicEList<Attribute>();
		for(Attribute attribute: concept.getIntent() ) {
			if ( attribute instanceof ValuedAttribute ) {
				ValuedAttribute va = (ValuedAttribute) attribute;
				for(Concept deletedConcept: deletedConcepts) {
					if ( deletedConcept.getName().equals(va.getValue()) )
						attributes.add(attribute);
				}
			}
		}
		return attributes;
	}


}
