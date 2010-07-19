package com.googlecode.erca.framework.io.out;

import java.util.Iterator;

import com.googlecode.erca.Attribute;
import com.googlecode.erca.Entity;
import com.googlecode.erca.rcf.FormalContext;
import com.googlecode.exputils.CodeGenerator;

public class FormalContextToLatex extends CodeGenerator {
	
	private FormalContext formalContext;
	
	private boolean rotateAttributes;

	public FormalContextToLatex(FormalContext formalContext,boolean rotateAttributes) {
		super();
		this.formalContext = formalContext;
		this.rotateAttributes = rotateAttributes;
	}
	
	public FormalContextToLatex(FormalContext formalContext) {
		this(formalContext,true);
	}
	
	@Override
	public void generateCode() {
		append("\\begin{tabular}");
		
		append("{|l|");
		for(int i = 0;i < formalContext.getAttributes().size(); i++)
			append("c|");
		append("}");
		
		newLine();
		
		appendLine("\\hline");
		
		append(" & ");

		Iterator<Attribute> attrIt = formalContext.getAttributes().iterator();
		
		while( attrIt.hasNext() ) {
			Attribute attr = attrIt.next();
			
			String desc = "\\textbf{" + attr.getDescription() + "}"; 
			
			if ( rotateAttributes )
				desc = "\\begin{sideways}" + desc + "\\end{sideways}";
			
			if ( attrIt.hasNext() )
				append(desc + " & ");
			else
				append(desc + "\\\\");
		}
		
		newLine();
		
		for(Entity ent: formalContext.getEntities() ) {
			appendLine("\\hline");
			append("\\textbf{" + ent.getName() + "}");
			
			for( Attribute attr: formalContext.getAttributes() )
				if ( formalContext.hasPair(ent,attr))
					append("& $\\times$ ");
				else
					append(" & ");
			
			append("\\\\");
			newLine();
		}
		appendLine("\\hline");
		appendLine("\\end{tabular}");
	}
	
}
