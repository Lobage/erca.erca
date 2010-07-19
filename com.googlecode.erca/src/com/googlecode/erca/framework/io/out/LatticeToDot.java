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

import com.googlecode.erca.Attribute;
import com.googlecode.erca.Entity;
import com.googlecode.erca.clf.*;
import com.googlecode.erca.framework.io.ErcaIO;
import com.googlecode.exputils.CodeGenerator;

/**
 * Generates the dot code corresponding to a concept lattice.
 * @author Jean-Rémy Falleri
 */
public class LatticeToDot extends CodeGenerator {

	private final static String NEW_CONCEPT_COLOR = "lightblue";
	
	private final static String FUSION_CONCEPT_COLOR = "orange";
	
	private ConceptLattice lattice;
	
	private boolean displayStepNumber;

	private boolean displayExtentSize;

	private boolean displayIntentSize;

	private boolean displaySimplifiedIntent;

	private boolean displaySimplifiedExtent;

	private boolean useColor;

	/**
	 * Initializes a concept lattice drawer.
	 * @param path the path to the concept lattice.
	 */
	public LatticeToDot(String path) {
		this(ErcaIO.loadConceptLattice(path));
	}

	public LatticeToDot(ConceptLattice lattice,boolean displaySimplifiedExtent, boolean displaySimplifiedIntent,
			boolean displayExtentSize,boolean displayIntentSize,boolean displayStepNumber,boolean useColor) {
		this.lattice = lattice;
		this.displaySimplifiedExtent = displaySimplifiedExtent;
		this.displaySimplifiedIntent = displaySimplifiedIntent;
		this.displayExtentSize = displayExtentSize;
		this.displayIntentSize = displayIntentSize;
		this.displayStepNumber = displayStepNumber;
		this.useColor = useColor;
	}

	public LatticeToDot(ConceptLattice lattice) {
		this(lattice,true,true,false,false,false,true);
	}

	/**
	 * Sets if the extent size is displayed.
	 * @param state true or false.
	 */
	public void setDisplayExtentSize(boolean state) {
		this.displayExtentSize = state;
	}

	/**
	 * Sets if the intent size is displayed.
	 * @param state true or false.
	 */
	public void setDisplayIntentSize(boolean state) {
		this.displayIntentSize = state;
	}

	/**
	 * Generates the dot code corresponding to the concept lattice.
	 */
	public void generateCode() {
		appendHeader();

		generateCodeForClf();

		appendFooter();
	}
	
	public void generateCodeForClf() {
		for(Concept c: lattice.getConcepts() ) {
			append(c.hashCode() + " ");
			append("[shape=record,style=filled");
			
			if ( useColor ) {
				if ( c.isNewConcept() )
					append(",fillcolor=" + NEW_CONCEPT_COLOR );
				else if ( c.isFusion() )
					append(",fillcolor=" + FUSION_CONCEPT_COLOR );
			}
			
			
			append(",label=\"{");
			
			append(c.getName());

			if ( displayExtentSize || displayIntentSize || displayStepNumber )
				append(" (");

			if ( displayIntentSize )
				append("I: " + c.getIntent().size());

			if ( displayExtentSize ) { 
				if ( displayIntentSize )
					append(", ");
				append("E: " + c.getExtent().size() );
			}
			
			if ( displayStepNumber ) {
				if ( displayIntentSize || displayExtentSize )
					append(", ");
				append("S: " + c.getCreationStep() );
			}

			if ( displayExtentSize || displayIntentSize || displayStepNumber )
				append(")");

			append("|");

			if ( displaySimplifiedIntent )
				for( Attribute attr: c.getSimplifiedIntent() )
					append( attr.getDescription() + "\\n" );
			else
				for( Attribute attr: c.getIntent() )
					append( attr.getDescription() + "\\n" );

			append("|");

			if ( displaySimplifiedExtent ) 
				for(Entity ent: c.getSimplifiedExtent() ) 
					append(ent.getName() + "\\n");
			else
				for(Entity ent: c.getExtent())
					append(ent.getName() + "\\n");

			append("}\"];\n");
		}

		for( Concept c: lattice.getConcepts() )
			for( Concept child: c.getParents() )
				appendLine("\t" + c.hashCode() + " -> " + child.hashCode() );
	}


	private void appendHeader() {
		appendLine("digraph G { ");
		appendLine("\trankdir=BT;");
	}

	private void appendFooter() {
		append("}");
	}

}
