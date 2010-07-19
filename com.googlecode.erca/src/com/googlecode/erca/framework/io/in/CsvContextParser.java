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

package com.googlecode.erca.framework.io.in;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.impl.SimpleLog;

import com.googlecode.erca.*;
import com.googlecode.erca.rcf.*;

public class CsvContextParser extends FormalContextParser {
	
	private final static Log logger = new SimpleLog("com.googlecode.erca.framework.io.in.CsvContextParser");

	public static void main(String[] args) {
		try {
			CsvContextParser parser = new CsvContextParser("doc/samples/csv/simpletest.csv");
			parser.parse();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public CsvContextParser(String path) {
		super(path);
	}

	public static FormalContext fromFile(String path) throws IOException {
		CsvContextParser p = new CsvContextParser(path);
		p.parse();
		return p.getFormalContext();
	}

	public void parse() throws IOException {
		BufferedReader input = new BufferedReader(new FileReader(path));
		formalContext = RcfFactory.eINSTANCE.createFormalContext();
		int currentRow = 0;

		List<Attribute> attrs = new ArrayList<Attribute>();

		String line;
		
		while (( line = input.readLine()) != null) {
			
			line = line.trim();
			String[] tokens = line.split("\\,");
			int len = tokens.length;

			if ( currentRow == 0 ) {

				for(int i = 1 ; i < len ; i++ ) {
					String attrDesc = tokens[i].trim().replaceAll("\\\"","");
					Attribute attr = RcaParsingUtils.attributeFromText(attrDesc);
					formalContext.getAttributes().add(attr);
					attrs.add(i-1,attr);
					logger.debug("Attribute " + attrDesc + " created. Index: " + i);
				}

			}
			else {
				if ( !"".equals(line) ) {
					String name = tokens[0].trim().replaceAll("\\\"","");;
					Entity ent = ErcaFactory.eINSTANCE.createEntity();
					logger.debug("Entity " + name + " created. Line: " + currentRow);
					ent.setName(name);
					formalContext.getEntities().add(ent);
					for(int i = 1 ; i < len ; i++ ) {
						String cell = tokens[i].trim().replaceAll("\\\"","").toLowerCase();
						if ( "x".equals(cell) ) {
							Attribute attr = attrs.get(i-1);
							Pair pair = RcfFactory.eINSTANCE.createPair();
							pair.setSource(ent);
							pair.setTarget(attr);
							formalContext.getRelation().add(pair);
							logger.debug("Pair between " + ent.getName() + " and " + attr.getDescription() + " created. Line: " + currentRow);
						}
					}
				}
			}

			currentRow++;

		}

	}

}
