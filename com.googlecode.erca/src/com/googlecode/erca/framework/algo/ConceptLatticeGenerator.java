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

import java.io.IOException;
import java.util.List;

import com.googlecode.erca.clf.*;
import com.googlecode.erca.framework.algo.filtering.FilterManager;
import com.googlecode.erca.framework.algo.filtering.ConceptLatticeFilter;
import com.googlecode.erca.framework.io.ErcaIO;
import com.googlecode.erca.rcf.*;
import com.googlecode.exputils.NameGenerator;

public class ConceptLatticeGenerator {
	
	private FormalContext formalContext;
	
	private ConceptLattice conceptLattice;
	
	private NameGenerator nameGenerator;
	
	private List<ConceptLatticeFilter> filters;
	
	public static void main(String[] args) throws IOException {
		ConceptLatticeGenerator gen = new ConceptLatticeGenerator(args[0]);
		gen.generateConceptLattice();
		gen.saveConceptLattice("tmp/test.xmi");
	}

	public ConceptLatticeGenerator(String formalContextPath) {
		this(ErcaIO.loadFormalContext(formalContextPath));
	}
	
	public ConceptLatticeGenerator(FormalContext formalContext) {
		this.formalContext = formalContext;
		this.nameGenerator = new NameGenerator("_");
	}
	
	public void addFilter(String name) {
		this.filters.add( FilterManager.getConceptLatticeFilter(name) );
	}
	
	public void applyFilter() {
		for(ConceptLatticeFilter f: filters)
			f.filter(this.conceptLattice);
	}
	
	public void generateConceptLattice() {
		this.conceptLattice = AddExtent.createLattice(formalContext, nameGenerator);
	}

	public ConceptLattice getConceptLattice() {
		return this.conceptLattice;
	}

	public void saveConceptLattice(String path) throws IOException {
		ErcaIO.saveErcaObject(this.conceptLattice, path);
	}

}
