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

import java.io.IOException;
import java.util.Random;

import com.googlecode.erca.*;
import com.googlecode.erca.framework.io.ErcaIO;
import com.googlecode.erca.rcf.*;

public class RandomRcfGenerator {
	
	public static void main(String[] args) throws IOException {
		if (args.length != 7)
			return;
			//logger.fatal("Wrong argument number. Exiting.");
		else {
			int contextNumber = Integer.parseInt(args[0]);
			int entityNumber = Integer.parseInt(args[1]);
			int attributeNumber = Integer.parseInt(args[2]);
			int relationNumber = Integer.parseInt(args[3]);
			double contextDensity = Double.parseDouble(args[4]);
			double relationDensity = Double.parseDouble(args[5]);
			RelationalContextFamily rcf = generateRcf(contextNumber, entityNumber, attributeNumber, relationNumber, contextDensity, relationDensity);
			ErcaIO.saveErcaObject(rcf, args[6]);
		}
	}
	
	public static RelationalContextFamily generateRcf(int contextNumber,int entityNumber,int attributeNumber,int relationNumber,double contextDensity,double relationDensity) {
		RelationalContextFamily rcf = RcfFactory.eINSTANCE.createRelationalContextFamily();
		
		//logger.info("Creating contexts");
		
		for(int i=0 ;i<contextNumber;i++) {
			FormalContext ctx = RcfFactory.eINSTANCE.createFormalContext();
			String ctxName = "Context_" + Integer.toString(i);
			ctx.setName(ctxName);
			rcf.getFormalContexts().add(ctx);
			
			for(int j=0;j<entityNumber;j++) {
				Entity entity = ErcaFactory.eINSTANCE.createEntity();
				String entityName = ctxName + "_Entity_" + Integer.toString(j);
				entity.setName(entityName);
				ctx.getEntities().add(entity);
			}
			
			for(int j=0;j<attributeNumber;j++) {
				BinaryAttribute attribute = ErcaFactory.eINSTANCE.createBinaryAttribute();
				String attributeName = ctxName + "_Attribute_" + Integer.toString(j);
				attribute.setName(attributeName);
				ctx.getAttributes().add(attribute);
			}
			
		}
		
		//logger.info("Creating relations");
		
		int relNum = 0;
		for(int i=0;i<contextNumber;i++) {
			for(int j=0;j<relationNumber;j++) {
				RelationalContext rel = RcfFactory.eINSTANCE.createRelationalContext();
				String relName = "Relation_" + Integer.toString(relNum);
				rel.setName(relName);
				rel.setSourceContext( rcf.getFormalContexts().get(i) );
				rel.setTargetContext( rcf.getFormalContexts().get(rcf.getFormalContexts().size() - (i+1)) );
				rcf.getRelationalContexts().add(rel);
				relNum++;
			}
		}
		
		Random rand = new Random();
		
		//logger.info("Populating contexts");
		
		for(FormalContext ctx: rcf.getFormalContexts()) {
			double currentDensity = 0;
			int Xmax = ctx.getEntities().size();
			int Ymax = ctx.getAttributes().size();
			double ctxSize = Xmax * Ymax;
			while ( currentDensity < contextDensity ) {
				Entity source = ctx.getEntities().get(rand.nextInt(Xmax));
				Attribute target = ctx.getAttributes().get(rand.nextInt(Ymax));
				if (!ctx.hasPair(source, target))
					ctx.addPair(source, target);
				currentDensity = ctx.getRelation().size() / ctxSize;
			}
		}
		
		//logger.info("Populating relations");
		
		for(RelationalContext rel: rcf.getRelationalContexts()) {
			double currentDensity = 0;
			int Xmax = rel.getSourceContext().getEntities().size();
			int Ymax = rel.getTargetContext().getEntities().size();
			double relSize = Xmax * Ymax;
			while ( currentDensity < relationDensity ) {
				Entity source = rel.getSourceContext().getEntities().get(rand.nextInt(Xmax));
				Entity target = rel.getTargetContext().getEntities().get(rand.nextInt(Ymax));
				if (!rel.hasPair(source, target))
					rel.addPair(source, target);
				currentDensity = rel.getRelation().size() / relSize;
			}	
		}
		
		return rcf;
	}
}
