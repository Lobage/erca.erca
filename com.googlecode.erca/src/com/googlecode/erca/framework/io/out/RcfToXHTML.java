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

import org.eclipse.emf.common.util.EList;

import com.googlecode.erca.*;
import com.googlecode.erca.framework.io.ErcaIO;
import com.googlecode.erca.rcf.*;
import com.googlecode.exputils.CodeGenerator;

public class RcfToXHTML extends CodeGenerator {

	private RelationalContextFamily rcf;
	
	public static void main(String[] args) throws Exception {
		RcfToXHTML xhtmler = new RcfToXHTML("tmp/test.rcf");
		xhtmler.generateCode();
		xhtmler.toFile("tmp/test.html");
	}
	
	public RcfToXHTML(String path) {
		this.rcf = ErcaIO.loadRCF(path);
	}
	
	public RcfToXHTML(RelationalContextFamily rcf) {
		this.rcf = rcf;
	}

	@Override
	public void generateCode() {
		initBuffer();
		
		appendHeader();
		
		for( FormalContext fc: rcf.getFormalContexts() ) {
			appendLine("<p><b>" + fc.getName() + "</b> (formal context)</p>");
			appendLine("<table><tr><td></td>");
			for( Attribute attr: fc.getAttributes() )
				appendLine("<td>" + attr.getDescription() + "</td>");
			appendLine("</tr>");
			
			for( Entity ent: fc.getEntities() ) {
				appendLine("<tr><td>" + ent.getName() + "</td>");
				for( Attribute attr: fc.getAttributes() ) {
					if ( fc.hasPair(ent,attr))
						appendLine("<td>X</td>");
					else
						appendLine("<td></td>");
				}
				appendLine("</tr>");
			}
			appendLine("</table>");
		}
		
		for( RelationalContext rc : rcf.getRelationalContexts() ) {
			appendLine("<p><b>" + rc.getName() + "</b> (relational context)</p>");
			appendLine("<table><tr><td></td>");
			
			EList<Entity> tgtEnts;
			if ( rc.getTargetEntities().size() == 0 )
				tgtEnts = rc.getTargetContext().getEntities();
			else
				tgtEnts = rc.getTargetEntities();
			
			for( Entity tgtEnt: tgtEnts )
				appendLine("<td>" + tgtEnt.getName() + "</td>");
			appendLine("</tr>");
			
			for( Entity srcEnt: rc.getSourceContext().getEntities()) {
				appendLine("<tr><td>" + srcEnt.getName() + "</td>");
				for( Entity tgtEnt: tgtEnts ) {
					
					if ( rc.hasPair(srcEnt,tgtEnt))
						appendLine("<td>X</td>");
					else
						appendLine("<td></td>");
				}
				appendLine("</tr>");
			}
			appendLine("</table>");
			
		}
		
		appendFooter();
	}
	
	private void appendHeader() {
		appendLine("<html><head><title>Relational Context Family</title><style type=\"text/css\">" +
				"body { background-color: white; color: black; font-family:Verdana,Geneva,Arial,Helvetica,sans-serif; font-size:small; }" +
				"table { border: medium solid black; border-collapse: collapse; empty-cells:show; }" +
				"td, th { border: thin solid black; font-size:small; text-align: center; padding: 5px;}" +
				"</style></head><body>");
	}

	private void appendFooter() {
		appendLine("</body></html>");
	}
	
}
