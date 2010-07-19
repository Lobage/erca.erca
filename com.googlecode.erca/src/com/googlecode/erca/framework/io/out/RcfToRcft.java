package com.googlecode.erca.framework.io.out;

import java.io.IOException;

import org.eclipse.emf.common.util.EList;

import com.googlecode.erca.*;
import com.googlecode.erca.framework.io.in.RcftParser;
import com.googlecode.erca.rcf.*;
import com.googlecode.exputils.CodeGenerator;

public class RcfToRcft extends CodeGenerator {
	
	public static void main(String[] args) throws IOException {
		RcftParser p = new RcftParser("test/rcft/simpletest.rcft");
		p.parse();
		RcfToRcft g = new RcfToRcft(p.getRcf());
		g.generateCode();
		g.toFile("tmp/test.rcft");
	}
	
	private RelationalContextFamily rcf;
	
	public RcfToRcft(RelationalContextFamily rcf) {
		this.rcf = rcf;
	}

	@Override
	public void generateCode() {
		for(FormalContext fc: rcf.getFormalContexts() ) {
			appendLine("FormalContext " + fc.getName());
			append("|\t\t|");
			for( Attribute attr: fc.getAttributes() )
				append(" " + attr.getDescription() + "\t|");
			append(LINE_SEPARATOR);
			
			for( Entity ent: fc.getEntities() ) {
				append("| " + ent.getName() +"\t|");
				for( Attribute attr: fc.getAttributes()) {
					if ( fc.hasPair(ent,attr) )
						append(" x\t\t|");
					else
						append(" \t\t|");
				}
				append(LINE_SEPARATOR);
			}
		}
		
		for( RelationalContext rc: rcf.getRelationalContexts() ) {
			
			EList<Entity> targetEntities;
			if ( rc.getTargetEntities().size() > 0 )
				targetEntities = rc.getTargetEntities();
			else
				targetEntities = rc.getTargetContext().getEntities();
			
			appendLine("RelationalContext " + rc.getName());
			appendLine("source " + rc.getSourceContext().getName());
			appendLine("target " + rc.getTargetContext().getName());
			appendLine("scaling " + rc.getScalingOperator() );
			append("|\t\t|");
			for( Entity ent: targetEntities )
				append(" " + ent.getName() + "\t|");
			append(LINE_SEPARATOR);
			
			for( Entity src: rc.getSourceContext().getEntities() ) {
				append("| " + src.getName() + "\t|" );
				for( Entity tgt : targetEntities ) {
					if ( rc.hasPair(src,tgt) )
						append(" x\t\t|");
					else
						append(" \t\t|");
				}
				append(LINE_SEPARATOR);
			}
		}

	}

}
