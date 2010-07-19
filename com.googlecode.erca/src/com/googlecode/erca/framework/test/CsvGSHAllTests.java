package com.googlecode.erca.framework.test;

import java.io.File;

import com.googlecode.erca.framework.algo.ConceptLatticeGenerator;
import com.googlecode.erca.framework.algo.NaiveGSH;
import com.googlecode.erca.framework.io.in.CsvContextParser;
import com.googlecode.erca.framework.io.out.FormalContextToLatex;
import com.googlecode.erca.framework.io.out.LatticeToDot;
import com.googlecode.erca.framework.io.out.RcfToXHTML;
import com.googlecode.erca.rcf.FormalContext;
import com.googlecode.erca.rcf.RcfFactory;
import com.googlecode.erca.rcf.RelationalContextFamily;

public class CsvGSHAllTests {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		String csv = args[0];
		String dest = args[1];
		
		if ( !dest.endsWith("/") )
			dest += "/";
		
		File f = new File(csv);
		String name = f.getName();
		
		CsvContextParser csvParser = new CsvContextParser(csv);
		csvParser.parse();
		
		FormalContext fc = csvParser.getFormalContext();
		
		RelationalContextFamily fakeRcft = RcfFactory.eINSTANCE.createRelationalContextFamily();
		fakeRcft.getFormalContexts().add(fc);
		
		FormalContextToLatex latex = new FormalContextToLatex(fc);
		latex.generateCode();
		latex.toFile(dest + name + ".tex");
		
		NaiveGSH gsh = new NaiveGSH(fc);
		gsh.generateGSH();
		
		LatticeToDot dot1 = new LatticeToDot(gsh.getConceptLattice(),true,true,false,false,false,true);
		dot1.generateCode();
		dot1.toFile(dest + name + ".gsh.dot");
		
		ConceptLatticeGenerator clg = new ConceptLatticeGenerator(fc);
		clg.generateConceptLattice();
		
		LatticeToDot dot2 = new LatticeToDot(clg.getConceptLattice(),true,true,false,false,false,true);
		dot2.generateCode();
		dot2.toFile(dest + name + ".dot");
		
		RcfToXHTML html = new RcfToXHTML(fakeRcft);
		html.generateCode();
		html.toFile(dest + name + ".html");
	}

}
