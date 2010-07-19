package com.googlecode.erca.framework.test;

import java.io.File;

import com.googlecode.erca.framework.algo.ConceptLatticeGenerator;
import com.googlecode.erca.framework.io.in.CtxContextParser;
import com.googlecode.erca.framework.io.out.FormalContextToLatex;
import com.googlecode.erca.framework.io.out.LatticeToDot;
import com.googlecode.erca.framework.io.out.RcfToXHTML;
import com.googlecode.erca.rcf.FormalContext;
import com.googlecode.erca.rcf.RcfFactory;
import com.googlecode.erca.rcf.RelationalContextFamily;

public class CtxAllTests {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		String ctx = args[0];
		String dest = args[1];
		
		if ( !dest.endsWith("/") )
			dest += "/";
		
		File f = new File(ctx);
		String name = f.getName();
		
		CtxContextParser ctxParser = new CtxContextParser(ctx);
		ctxParser.parse();
		
		FormalContext fc = ctxParser.getFormalContext();
		
		RelationalContextFamily fakeRcft = RcfFactory.eINSTANCE.createRelationalContextFamily();
		fakeRcft.getFormalContexts().add(fc);
		
		FormalContextToLatex latex = new FormalContextToLatex(fc);
		latex.generateCode();
		latex.toFile(dest + name + ".tex");
		
		ConceptLatticeGenerator clg = new ConceptLatticeGenerator(fc);
		clg.generateConceptLattice();
		
		LatticeToDot dot = new LatticeToDot(clg.getConceptLattice());
		dot.generateCode();
		dot.toFile(dest + name + ".dot");
		
		RcfToXHTML html = new RcfToXHTML(fakeRcft);
		html.generateCode();
		html.toFile(dest + name + ".html");
	}

}
