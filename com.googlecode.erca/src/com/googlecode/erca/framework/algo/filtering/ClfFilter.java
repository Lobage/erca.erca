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

import com.googlecode.erca.clf.ConceptLatticeFamily;

public interface ClfFilter {
	
	public void filter(ConceptLatticeFamily clf);

}
