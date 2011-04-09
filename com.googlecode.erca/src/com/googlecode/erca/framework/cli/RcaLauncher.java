package com.googlecode.erca.framework.cli;

import com.googlecode.erca.framework.algo.ClfGenerator;
import com.googlecode.erca.framework.algo.ConceptLatticeGenerator;
import com.googlecode.erca.framework.io.ErcaIO;
import com.googlecode.erca.framework.io.in.CsvContextParser;
import com.googlecode.erca.framework.io.in.RcftParser;
import com.googlecode.erca.framework.io.out.ClfToDot;
import com.googlecode.erca.framework.io.out.LatticeToDot;
import com.googlecode.erca.framework.io.out.RcfToXHTML;
import com.googlecode.erca.framework.ui.EditorFrame;
import com.googlecode.erca.rcf.FormalContext;
import com.googlecode.erca.rcf.RelationalContextFamily;

public class RcaLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		if (args.length==0)
		{
			System.out.println("Erca command line need at least one parameter. Launch it with paramater \"help\" for more information");
		}
		
		String cmd = args[0];
		
		if ( "help".equals(cmd) ) {
			System.out.println("RcaLauncher help");
			System.out.println();
			System.out.println("##########");
			System.out.println("Relational Concept Analysis");
			System.out.println("----------");
			System.out.println("clfdot src tgt");
			System.out.println("\tGenerate a dot file in tgt corresponding to the given (src) concept lattice family.");
			System.out.println("----------");
			System.out.println("clfbuild --rcft src xmi tgt");
			System.out.println("\tGenerate the XMI (xmi) and the concept lattice family (tgt) corresponding to the given relational context family (src) in the rcft format.");
			System.out.println("----------");
			System.out.println("clfbuild --xmi src tgt");
			System.out.println("\tGenerate the concept lattice family (tgt) corresponding to the given relational context family (src) in the xmi format.");
			System.out.println("----------");
			System.out.println("clfbuild-debug --rcft src xmi tgt debugPath");
			System.out.println("\tGenerate the XMI (xmi) and the concept lattice family (tgt) corresponding to the given relational context family (src) in the rcft format.");
			System.out.println("----------");
			System.out.println("clfbuild-debug --xmi src tgt debugPath");
			System.out.println("\tGenerate the concept lattice family (tgt) corresponding to the given relational context family (src) in the xmi format.");
			System.out.println("----------");
			System.out.println("rcfhtml --rcft src tgt");
			System.out.println("\tGenerate the HTML code in tgt corresponding to the given relational context family (src) in the rcft format.");
			System.out.println("----------");
			System.out.println("rcfhtml --xmi src tgt");
			System.out.println("\tGenerate the HTML code in tgt corresponding to the given relational context family (src) in the xmi format.");
			System.out.println("##########");
			System.out.println("Formal Concept Analysis");
			System.out.println("----------");
			System.out.println("latdot src tgt");
			System.out.println("\tGenerate a dot file in tgt corresponding to the given (src) concept lattice.");
			System.out.println("----------");
			System.out.println("latbuild --csv src xmi tgt");
			System.out.println("\tGenerate the XMI (xmi) and the concept lattice (tgt) corresponding to the given formal context (src) in the csv format.");
			System.out.println("----------");
			System.out.println("latbuild --xmi src tgt");
			System.out.println("\tGenerate the concept lattice (tgt) corresponding to the given formalcontext (src) in the xmi format.");
			System.out.println("##########");
			System.out.println("Graphical User Interface");
			System.out.println("----------");
			System.out.println("gui");
			System.out.println("\tLaunch the graphical user interface to edit a relational context family (highly experimental, use at your own risk)");
		}
		else if ( "clfdot".equals(cmd) ) {
			String src = args[1];
			String tgt = args[2];
			ClfToDot dot = new ClfToDot(ErcaIO.loadCLF(src));
			dot.generateCode();
			dot.toFile(tgt);
		}
		else if ( "clfbuild".equals(cmd) ) {
			String type = args[1];
			String src = args[2];
			
			
			if ( "--xmi".equals(type)) {
				String tgt = args[3];
				RelationalContextFamily rcf = ErcaIO.loadRCF(src);
				ClfGenerator clfgen = new ClfGenerator(rcf);
				clfgen.generateClf();
				clfgen.saveClf(tgt);
			}
			else if ( "--rcft".equals(type) ) {
				String xmi = args[3];
				String tgt = args[4];
				System.out.println("Building lattices for ");
				RcftParser p = new RcftParser(src);
				p.parse();
				RelationalContextFamily rcf = p.getRcf();
				ErcaIO.saveErcaObject(rcf,xmi);
				ClfGenerator clfgen = new ClfGenerator(rcf);
				clfgen.generateClf();
				clfgen.saveClf(tgt);
			}
		}
		else if ( "clfbuild-debug".equals(cmd) ) {
			String type = args[1];
			String src = args[2];
			
			
			if ( "--xmi".equals(type)) {
				String tgt = args[3];
				String debugPath= args[4];
				ClfGenerator clfgen = new ClfGenerator(src,-1,true,debugPath);
				clfgen.generateClf();
				clfgen.saveClf(tgt);
			}
			else if ( "--rcft".equals(type) ) {
				String xmi = args[3];
				String tgt = args[4];
				String debugPath= args[5];
				System.out.println("Building lattices for ");
				RcftParser p = new RcftParser(src);
				p.parse();
				RelationalContextFamily rcf = p.getRcf();
				ErcaIO.saveErcaObject(rcf,xmi);
				ClfGenerator clfgen = new ClfGenerator(xmi,-1,true,debugPath);
				clfgen.generateClf();
				clfgen.saveClf(tgt);
			}
		}
		else if ( "rcfhtml".equals(cmd) ) {
			String type = args[1];
			String src = args[2];
			String tgt = args[3];
			RelationalContextFamily rcf = null;
			if ( "--xmi".equals(type))
				rcf = ErcaIO.loadRCF(src);
			else if ( "--rcft".equals(type) )
				rcf = RcftParser.fromFile(src);
			RcfToXHTML xhtml = new RcfToXHTML(rcf);
			xhtml.generateCode();
			xhtml.toFile(tgt);
		}
		else if ( "latbuild".equals(cmd) ) {
			String type = args[1];
					
			if ( "--ctx".equals(type) ) {
				System.out.println("not yet implemented");
				//ConceptLatticeGenerator latgen = new ConceptLatticeGenerator(ErcaIO.fromCtx(src));
				//latgen.generateConceptLattice();
				//ErcaIO.saveErcaObject(latgen.getConceptLattice(),tgt);
			}
			else if ( "--csv".equals(type) ) {
				String src = args[2];
				String xmi = args[3];
				String tgt = args[4];
				System.out.println("Building Lattice for ");
				CsvContextParser p = new CsvContextParser(src);
				p.parse();
				FormalContext fc = p.getFormalContext();
				ErcaIO.saveErcaObject(fc, xmi);
				ConceptLatticeGenerator clgen=new ConceptLatticeGenerator(fc);
				clgen.generateConceptLattice();
				clgen.saveConceptLattice(tgt);
			}
			else if ( "--xmi".equals(type) ) {
				String src = args[2];
				String tgt = args[3];
				FormalContext fc = ErcaIO.loadFormalContext(src);
				ConceptLatticeGenerator latgen = new ConceptLatticeGenerator(fc);
				latgen.generateConceptLattice();
				ErcaIO.saveErcaObject(latgen.getConceptLattice(),tgt);
			}
		}
		else if ( "latdot".equals(cmd)){
			String src=args[1];
			String tgt=args[2];
			LatticeToDot dot = new LatticeToDot(src);
			dot.generateCode();
			dot.toFile(tgt);
		}
		else if ( "gui".equals(cmd)){
			EditorFrame.main(null);
		}
	}

}
