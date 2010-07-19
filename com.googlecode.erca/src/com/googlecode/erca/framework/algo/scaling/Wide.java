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

package com.googlecode.erca.framework.algo.scaling;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import com.googlecode.erca.Entity;
import com.googlecode.erca.clf.Concept;


public class Wide implements ScalingOperator {

	public boolean accept(EList<Entity> linkedEntities, Concept concept) {
		EList<Entity> intersection = new BasicEList<Entity>();
		intersection.addAll(concept.getExtent());
		intersection.retainAll(linkedEntities);
		if ( ! intersection.isEmpty() )
			return true;
		else
			return false;
	}

}
