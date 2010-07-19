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

import com.googlecode.erca.clf.Concept;
import com.googlecode.erca.clf.ConceptLattice;
import com.googlecode.erca.clf.ConceptLatticeFamily;
import com.googlecode.erca.rcf.FormalContext;
import com.googlecode.erca.rcf.RelationalContextFamily;
import com.googlecode.exputils.CodeGenerator;

public class XHTMLMetricsExporter extends CodeGenerator {
	
	private ConceptLatticeFamily clf;
	
	private RelationalContextFamily rcf;
	
	public XHTMLMetricsExporter(RelationalContextFamily rcf,ConceptLatticeFamily clf) {
		super();
		this.rcf = rcf;
		this.clf = clf;
	}
	
	@Override
	public void generateCode() {
		appendHeader();
		
		for( FormalContext fc: rcf.getFormalContexts() ) {
			
			appendLine("<table>");
			
			ConceptLattice lattice = clf.getConceptLattice(fc.getName());
			
			int sourceEntityNb = fc.getEntities().size();
			int conceptNb = lattice.getConcepts().size();
			int fusionConceptNb = 0;
			int newConceptNb = 0;
			int fusionEntityNb = 0;
			
			for( Concept c: lattice.getConcepts() )
				if ( c.isNewConcept() )
					newConceptNb++;
				else if ( c.isFusion() ) {
					fusionConceptNb++;
					fusionEntityNb += c.getSimplifiedExtent().size();
				}
			
			appendLine("<h1>" + fc.getName() + " </i> formal context</i></h1>"); 
			
			appendLine("<tr><td>Source entities number</td><td>" + sourceEntityNb + "</td></tr>" );
			appendLine("<tr><td>Total concept number</td><td>" + conceptNb + "</td></tr>" );
			appendLine("<tr><td>Non existing concept number</td><td>" + newConceptNb + "</td></tr>" );
			appendLine("<tr><td>Fusion concept number</td><td>" + fusionConceptNb + "</td></tr>");
			appendLine("<tr><td>Fusioned entities number</td><td>" + fusionEntityNb + "</td></tr>");
			
			appendLine("</table>");
			
		}

		appendFooter();
	}

	
	private void appendHeader() {
		appendLine("<html><head><title>Galatea metrics</title><style type=\"text/css\">" +
				"body { background-color: white; color: black; font-family:Verdana,Geneva,Arial,Helvetica,sans-serif; font-size:medium; }" +
				"table { border: medium solid black; border-collapse: collapse; empty-cells:show; }" +
				"td, th { border: thin solid black; font-size:small; text-align: center; padding: 5px;}" +
				"h1 { margin-bottom: 0.5em;border-bottom: 2px solid black; font-size: 120%;} " +
				"</style></head><body>");
	}

	private void appendFooter() {
		appendLine("</body></html>");
	}
	
}
