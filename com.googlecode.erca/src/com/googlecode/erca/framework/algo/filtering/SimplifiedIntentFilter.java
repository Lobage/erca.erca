 /*********************************************************************************
 * Copyright (c) 2009 Jean-Rémy Falleri <jr.falleri@laposte.net>
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Jean-Rémy Falleri <jr.falleri@laposte.net> - initial API and implementation
 *    Xavier Dolques <xavier-dolques@orange.fr> - adaptation of the filter
 *********************************************************************************/

package com.googlecode.erca.framework.algo.filtering;

import java.util.ArrayList;

import com.googlecode.erca.Attribute;
import com.googlecode.erca.RelationalAttribute;
import com.googlecode.erca.clf.Concept;
import com.googlecode.erca.clf.ConceptLattice;
import com.googlecode.erca.clf.ConceptLatticeFamily;

/**filter simplifying the intent of a concept. For a given concept, if there are more than one link of a kind 
 * to other concepts in the intent, keep only the link with the most specific concept*/
public class SimplifiedIntentFilter implements ClfFilter {

	public void filter(ConceptLatticeFamily clf) {
		for (ConceptLattice conceptLattice: clf.getConceptLattices())
		{
			for (Concept concept : conceptLattice.getConcepts())
			{
				ArrayList<Attribute> attributeToDelete=new ArrayList<Attribute>();
				for (Attribute attribute : concept.getIntent())//for each relational attribute in the intent
				{
					if (attribute instanceof RelationalAttribute)
					{
						//if another relational attribute using the same relation is linked to a more general concept then delete it
						for (Attribute attribute2 : concept.getIntent())
						{
							if (attribute2 instanceof RelationalAttribute)
							{
								RelationalAttribute relAtt1=(RelationalAttribute)attribute;
								RelationalAttribute relAtt2=(RelationalAttribute)attribute2;
								if (relAtt1.getName().equals(relAtt2.getName()) && 
										relAtt1.getValue().getParents().contains(relAtt2.getValue()))
								{
									attributeToDelete.add(relAtt2);
								}
									
								
								
								
							}
						}
					}
				}
				concept.getIntent().removeAll(attributeToDelete);
			}
		}
	}


	


}
