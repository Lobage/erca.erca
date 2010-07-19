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

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.impl.SimpleLog;

import com.googlecode.erca.*;
import com.googlecode.erca.rcf.*;

/**
 * A parser for the RCFT relational context family description format.
 * @author Jean-Rémy Falleri
 *
 */
public class RcftParser {
	
	private final static Log logger = new SimpleLog("com.googlecode.erca.framework.io.in.RcftParser");

	private RelationalContextFamily rcf;

	private String path;
	
	public RcftParser(String path) {
		this.path = path;
	}

	public RelationalContextFamily getRcf() {
		return this.rcf;
	}
	
	public static RelationalContextFamily fromFile(String path) throws IOException {
		RcftParser p = new RcftParser(path);
		p.parse();
		return p.getRcf();
	}

	public void parse() throws IOException {
		this.rcf = RcfFactory.eINSTANCE.createRelationalContextFamily();
		BufferedReader input = new BufferedReader(new FileReader(path));

		String line = input.readLine();

		while( line != null ) {
			String tline = line.trim();
			if ( tline.startsWith("FormalContext") )
				parseFormalContext(input,tline);
			else if ( tline.startsWith("RelationalContext") )
				parseRelationalContext(input,tline);
			
			line = input.readLine();
		}

	}

	private void parseFormalContext(BufferedReader input,String desc) throws IOException {

		String fcName = desc.split("\\ ")[1]; 
		
		FormalContext fc = RcfFactory.eINSTANCE.createFormalContext();
		fc.setName(fcName);
		
		logger.info("Parsing formal context " + fcName);

		input.mark(0);
		String line = input.readLine();
		int currentRow = 0;
		Map<Integer, Attribute> attrs = new HashMap<Integer, Attribute>();

		while ( line != null ) {

			String tline = line.trim();
			if ( tline.startsWith("FormalContext") )
				break;
			else if ( tline.startsWith("RelationalContext") )
				break;
			else if ( tline.equals("") )
				break;
			
			String[] tokens = line.split("\\|");
			int len = tokens.length;
			if ( currentRow == 0 ) {

				for(int i = 2 ; i < len ; i++ ) {
					String attrDesc = tokens[i].trim();
					Attribute attr = RcaParsingUtils.attributeFromText(attrDesc);
					attrs.put(i,attr);
					fc.getAttributes().add(attr);
					
					logger.debug("Attribute " + attr.getDescription() + " created. Row: " + i);
				}
			}
			else {
				String name = tokens[1].trim();
				Entity ent = ErcaFactory.eINSTANCE.createEntity();
				
				logger.debug("Entity " + name + " created. Line: " + currentRow);
				
				ent.setName(name);
				fc.getEntities().add(ent);
				for(int i = 2 ; i < len ; i++ ) {
					String cell = tokens[i].trim().toLowerCase();
					if ( "x".equals(cell) ) {
						Attribute attr = attrs.get(i);
						Pair pair = RcfFactory.eINSTANCE.createPair();
						pair.setSource(ent);
						pair.setTarget(attr);
						fc.getRelation().add(pair);
						
						logger.debug("Pair between " + ent.getName() + " and " + attr.getDescription() + " created. Line: " + currentRow);
					}
				}
			}

			currentRow++;

			input.mark(0);

			line = input.readLine();
		}

		rcf.getFormalContexts().add(fc);

		if ( line != null )
			input.reset();

	}

	private void parseRelationalContext(BufferedReader input,String desc) throws IOException {
		
		RelationalContext rc = RcfFactory.eINSTANCE.createRelationalContext();
		String rcName = desc.split("\\ ")[1];
		
		logger.info("Parsing relational context " + rcName);
		
		rc.setName( rcName );

		String source = input.readLine().trim().split("\\ ")[1];
		String target = input.readLine().trim().split("\\ ")[1];
		String sclOp = input.readLine().trim().split("\\ ")[1];
		FormalContext sourceFc = rcf.getFormalContext(source);
		FormalContext targetFc = rcf.getFormalContext(target);
		rc.setSourceContext(sourceFc);
		rc.setTargetContext(targetFc);
		rc.setScalingOperator(sclOp);

		input.mark(0);
		
		String line = input.readLine();
		int currentRow = 0;
		Map<Integer, Entity> tgtEnts = new HashMap<Integer, Entity>();

		while ( line != null ) {

			String tline = line.trim();
			if ( tline.startsWith("RelationalContext") )
				break;
			else if ( tline.startsWith("FormalContext") )
				break;
			else if ( tline.equals("") )
				break;

			String[] tokens = line.split("\\|");
			int len = tokens.length;
			if ( currentRow == 0 ) {

				for(int i = 2 ; i < len ; i++ ) {
					String name = tokens[i].trim();
					Entity ent = targetFc.getEntity(name);
					tgtEnts.put(i,ent);
				}
				
			}
			else {
				String name = tokens[1].trim();
				Entity srcEnt = sourceFc.getEntity(name);

				for(int i = 2 ; i < len ; i++ ) {
					String cell = tokens[i].trim().toLowerCase();
					if ( "x".equals(cell) ) {
						Entity tgtEnt = tgtEnts.get(i);
						Pair pair = RcfFactory.eINSTANCE.createPair();
						pair.setSource(srcEnt);
						pair.setTarget(tgtEnt);
						rc.getRelation().add(pair);
						
						logger.debug("Creates pair between " + srcEnt.getName() + " and " + tgtEnt.getName() + ". Line: " + currentRow);
					}
				}
			}

			currentRow++;

			input.mark(0);

			line = input.readLine();
		}
		
		rcf.getRelationalContexts().add(rc);

		if ( line != null )
			input.reset();

	}

}
