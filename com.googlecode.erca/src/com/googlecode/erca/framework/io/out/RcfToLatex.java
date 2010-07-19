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

import java.util.Iterator;

import com.googlecode.erca.*;
import com.googlecode.erca.rcf.*;
import com.googlecode.erca.framework.io.ErcaIO;

import com.googlecode.exputils.CodeGenerator;

public class RcfToLatex extends CodeGenerator {

	private RelationalContextFamily rcf;
	
	private boolean rotateAttributes;
	
	public RcfToLatex(String path) {
		this(ErcaIO.loadRCF(path));
	}
	
	public RcfToLatex(RelationalContextFamily rcf) {
		super();
		this.rcf = rcf;
	}

	@Override
	public void generateCode() {
		appendHeader();
		
		for( FormalContext fc: rcf.getFormalContexts() ) {
			FormalContextToLatex fctl = new FormalContextToLatex(fc);
			fctl.generateCode();
			append(fctl.getCode());
		}
		
		for( RelationalContext rc : rcf.getRelationalContexts() ) {
			
			append("\\begin{tabular}");
			
			append("{|l|");
			for(int i = 0;i < rc.getTargetContext().getEntities().size(); i++)
				append("c|");
			append("}");
			
			newLine();
			
			appendLine("\\hline");
			
			append(" & ");

			Iterator<Entity> srcEntIt = rc.getTargetContext().getEntities().iterator();
			
			while( srcEntIt.hasNext() ) {
				Entity ent = srcEntIt.next();
				
				String desc = "\\textbf{" + ent.getName() + "}"; 
				
				if ( rotateAttributes )
					desc = "\\begin{sideways}" + desc + "\\end{sideways}";
				
				if ( srcEntIt.hasNext() )
					append(desc + " & ");
				else
					append(desc + "\\\\");
			}
			
			newLine();
			
			for(Entity srcEnt: rc.getSourceContext().getEntities() ) {
				appendLine("\\hline");
				append("\\textbf{" + srcEnt.getName() + "}");
				
				for( Entity tgtEnt: rc.getTargetContext().getEntities() )
					if ( rc.hasPair(srcEnt,tgtEnt))
						append("& $\\times$ ");
					else
						append(" & ");
				
				append("\\\\");
				newLine();
			}
			appendLine("\\hline");
			appendLine("\\end{tabular}");
			
		}
	
		appendFooter();
	}
	
	private void appendHeader() {
		appendLine("\\begin{table}");
		appendLine("\\centering");
	}

	private void appendFooter() {
		appendLine("\\end{table}");
	}
	
}
