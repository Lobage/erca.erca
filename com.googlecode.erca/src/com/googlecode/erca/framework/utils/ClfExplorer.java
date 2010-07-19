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

package com.googlecode.erca.framework.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

import com.googlecode.erca.Attribute;
import com.googlecode.erca.Entity;
import com.googlecode.erca.ValuedAttribute;
import com.googlecode.erca.clf.Concept;
import com.googlecode.erca.clf.ConceptLattice;
import com.googlecode.erca.clf.ConceptLatticeFamily;
import com.googlecode.erca.framework.io.ErcaIO;

public class ClfExplorer {

	private ConceptLatticeFamily clf;
	
	public static void main(String[] args) throws IOException {
		ClfExplorer explorer = new ClfExplorer(args[0]);
		explorer.launch();
	}
	
	public ClfExplorer(ConceptLatticeFamily clf) {
		this.clf = clf;
	}
	
	public ClfExplorer(String path) {
		this(ErcaIO.loadCLF(path));
	}
	
	public void launch() throws IOException {
		System.out.println("Command (help for help):");
		String input = readInput();
		while ( !input.equals("quit") ) {
			if ( input.equals("help") ) {
				System.out.println("\tdesc concept: print concept description.");
				System.out.println("\tquit: quit the program.");
			}
			else if ( input.startsWith("desc")) {
				String[] tokens = input.split("\\ ");
				handleDesc(tokens[1]);
			}
			else if ( input.startsWith("links") ) {
				String[] tokens = input.split("\\ ");
				handleLinks(tokens[1]);
			}
			
			input = readInput();
		}
		System.exit(0);
	}
	
	public void handleDesc(String name) {
		Concept c = findConcept(name);
		if ( c != null )
			System.out.println(conceptDump(c));
	}
	
	public void handleLinks(String name) {
		List<Concept> lConcepts = linkedConcepts(name);
		for( Concept c: lConcepts )
			System.out.println(conceptDump(c));
	}
	
	public static String readInput() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
	}
	
	public Concept findConcept(String name) {
		for(ConceptLattice lattice: clf.getConceptLattices() )
			for( Concept c: lattice.getConcepts() )
				if ( c.getName().equals(name) )
					return c;
		
		return null;
	}
	
	public List<Concept> linkedConcepts(String name) {
		List<Concept> lConcepts = new LinkedList<Concept>();
		
		for(ConceptLattice l: clf.getConceptLattices() )
			for( Concept c: l.getConcepts() )
				for( Attribute a: c.getSimplifiedIntent() ) {
					if ( a instanceof ValuedAttribute ) {
						ValuedAttribute va = (ValuedAttribute) a;
						if ( va.getValue().equals(name) )
								lConcepts.add(c);
					}
				}
		
	
		return lConcepts;
	}
	
	public String conceptDump(Concept c) {
		String s = new String("Concept " + c.getName() + " in lattice: " + c.getLattice().getName());
		
		s += "\n";
		s += "* Attributes:\n";
		for( Attribute attr: c.getSimplifiedIntent() )
			s += "\t+ " + attr.getDescription() + "\n";
		s += "* Entities:\n";
		for( Entity ent: c.getSimplifiedExtent() )
			s += "\t+ " + ent.getName() + "\n";
		return s;
 	}
	
}
