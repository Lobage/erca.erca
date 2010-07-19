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

package com.googlecode.erca.framework.io.out;

import com.googlecode.erca.clf.ConceptLattice;
import com.googlecode.erca.clf.ConceptLatticeFamily;
import com.googlecode.erca.framework.io.ErcaIO;
import com.googlecode.exputils.CodeGenerator;

/**
 * Generates the dot code of a CLF.
 * @author Jean-Rémy Falleri
 *
 */
public class ClfToDot extends CodeGenerator {
	
	private ConceptLatticeFamily clf;
	
	private boolean displayStepNumber;

	private boolean displayExtentSize;

	private boolean displayIntentSize;

	private boolean displaySimplifiedIntent;

	private boolean displaySimplifiedExtent;

	private boolean useColor;
	
	/**
	 * Builds a ClfToDot object.
	 * @param clf a CLF.
	 * @param displaySimplifiedExtent boolean indicating if the extent displayed is simplified.
	 * @param displaySimplifiedIntent boolean indicating if the intent displayed is simplified.
	 * @param displayExtentSize boolean indicating if the extent size is displayed.
	 * @param displayIntentSize boolean indicating if the intent size is displayed.
	 * @param displayStepNumber boolean indicating if the concept step creation number is displayed.
	 * @param useColor boolean indicating if the colors are used.
	 */
	public ClfToDot(ConceptLatticeFamily clf,boolean displaySimplifiedExtent, boolean displaySimplifiedIntent,
			boolean displayExtentSize,boolean displayIntentSize,boolean displayStepNumber,boolean useColor) {
		super();
		this.clf = clf;
		this.displaySimplifiedExtent = displaySimplifiedExtent;
		this.displaySimplifiedIntent = displaySimplifiedIntent;
		this.displayExtentSize = displayExtentSize;
		this.displayIntentSize = displayIntentSize;
		this.displayStepNumber = displayStepNumber;
		this.useColor = useColor;
	}
	
	public ClfToDot(ConceptLatticeFamily clf) {
		this(clf,true,true,false,false,false,true);
	}
	
	public ClfToDot(String path) {
		this(ErcaIO.loadCLF(path));
	}
	
	public void setDisplayStepNumber(boolean state) {
		displayStepNumber = state;
	}
	
	public void setUseColor(boolean state) {
		this.useColor = state;
	}

	@Override
	public void generateCode() {	
		appendHeader();
		
		for(ConceptLattice lattice: clf.getConceptLattices() ) {
			
			appendLine("subgraph cluster_" + lattice.getName() + " {");
			appendLine("label = " + lattice.getName() + ";");
			
			LatticeToDot ltd = new LatticeToDot(lattice,displaySimplifiedExtent,displaySimplifiedIntent,
					displayExtentSize,displayIntentSize,displayStepNumber,useColor);
			
			ltd.generateCodeForClf();
			
			append(ltd.getCode());
			
			appendLine("}");
			
		}
		
		appendFooter();
	}
	
	public void appendHeader() {
		appendLine("digraph G {");
		appendLine("rankdir=BT;");
	}
	
	public void appendFooter() {
		appendLine("}");
	}

}
