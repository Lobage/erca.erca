package com.googlecode.erca.framework.test;

import java.io.File;

import com.googlecode.erca.framework.algo.ClfGenerator;
import com.googlecode.erca.framework.io.ErcaIO;
import com.googlecode.erca.framework.io.in.RcftParser;
import com.googlecode.erca.framework.io.out.ClfToDot;
import com.googlecode.erca.framework.io.out.RcfToXHTML;
import com.googlecode.erca.framework.io.out.RcfToLatex;


public class RcftAllTests {

	public static void main(String[] args) throws Exception {
		String src = args[0];
		String dest = args[1];
		
		if ( !dest.endsWith("/") )
			dest += "/";
		
		File f = new File(src);
		
		String name = f.getName();
		
		RcftParser p = new RcftParser(src);
		
		p.parse();
			
		RcfToXHTML xhtml = new RcfToXHTML(p.getRcf());
		xhtml.generateCode();
		xhtml.toFile(dest + name + ".html");
		
		RcfToLatex latex = new RcfToLatex(p.getRcf());
		latex.generateCode();
		latex.toFile(dest + name + ".tex" );
		
		ErcaIO.saveErcaObject(p.getRcf(), dest + name + ".rcf");
		
		ClfGenerator clfgen = new ClfGenerator(p.getRcf(),-1,true,new File("tmp/phd2"));

		clfgen.generateClf();
		
		ErcaIO.saveErcaObject(clfgen.getClf(),dest + name + ".clf");
		
		ClfToDot dot = new ClfToDot(clfgen.getClf());
		dot.generateCode();
		dot.toFile(dest + name + ".dot");
	}
	
}
