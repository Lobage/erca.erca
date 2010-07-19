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

import java.util.HashMap;
import java.util.Map;

public class FilterManager {
	
	private static Map<String,ClfFilter> clfFilters = new HashMap<String, ClfFilter>();
	
	private static Map<String,ConceptLatticeFilter> conceptLatticeFilters = new HashMap<String, ConceptLatticeFilter>();

	@SuppressWarnings("unchecked")
	public static ClfFilter getClfFilter(String name) {
		if ( clfFilters.containsKey(name) )
			return clfFilters.get(name);
		else {
			ClfFilter filter = null;
			try {
				Class clFilter = Class.forName(name);
				filter = (ClfFilter) clFilter.newInstance();
				clfFilters.put(name,filter);
				return filter;
			}
			catch(ClassNotFoundException e) {
				e.printStackTrace();
				return null;
			}
			catch(IllegalAccessException e) {
				e.printStackTrace();
				return null;
			}
			catch(InstantiationException e) {
				e.printStackTrace();
				return null;
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	public static ConceptLatticeFilter getConceptLatticeFilter(String name) {
		if ( conceptLatticeFilters.containsKey(name) )
			return conceptLatticeFilters.get(name);
		else {
			ConceptLatticeFilter filter = null;
			try {
				Class clFilter = Class.forName(name);
				filter = (ConceptLatticeFilter) clFilter.newInstance();
				conceptLatticeFilters.put(name,filter);
				return filter;
			}
			catch(ClassNotFoundException e) {
				e.printStackTrace();
				return null;
			}
			catch(IllegalAccessException e) {
				e.printStackTrace();
				return null;
			}
			catch(InstantiationException e) {
				e.printStackTrace();
				return null;
			}
		}
	}
	
}
