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

import com.googlecode.erca.Attribute;
import com.googlecode.erca.Entity;
import com.googlecode.erca.ErcaFactory;
import com.googlecode.erca.rcf.Pair;
import com.googlecode.erca.rcf.RcfFactory;

public class CtxContextParser extends FormalContextParser {

	private final static Log logger = new SimpleLog("com.googlecode.erca.framework.io.in.CtxContextParser");

	public static void main(String[] args) {
		try {
			CtxContextParser parser = new CtxContextParser("doc/samples/ctx/simpletest.ctx");
			parser.parse();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public CtxContextParser(String path) {
		super(path);
	}

	public void parse() throws IOException {
		BufferedReader input = new BufferedReader(new FileReader(path));
		formalContext = RcfFactory.eINSTANCE.createFormalContext();
		int currentRow = 0;
		List<Attribute> attrs = new ArrayList<Attribute>();
		String line;
		while (( line = input.readLine()) != null) {

			line = line.trim();

			if ( !"".equals(line) && ( !line.startsWith("|") || !line.endsWith("|")) ) {
				logger.warn("Error reading line " + currentRow);
				return;
			}

			String[] tokens = line.split("\\|");
			int len = tokens.length;
			if ( currentRow == 0 ) {
				for(int i = 2 ; i < len ; i++ ) {
					String attrDesc = tokens[i].trim();
					Attribute attr = RcaParsingUtils.attributeFromText(attrDesc);
					attrs.add(i-2,attr);
					formalContext.getAttributes().add(attr);
					logger.debug("Attribute " + attr.getDescription() + " created. Index: " + (i-2));
				}
			}
			else {

				if (  !"".equals(line) ) {

					String name = tokens[1].trim();
					Entity ent = ErcaFactory.eINSTANCE.createEntity();
					logger.debug("Entity " + name + " created. Line: " + currentRow);
					ent.setName(name);
					formalContext.getEntities().add(ent);
					for(int i = 2 ; i < len ; i++ ) {
						String cell = tokens[i].trim().toLowerCase();
						if ( "x".equals(cell) ) {
							Attribute attr = attrs.get(i-2);
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
