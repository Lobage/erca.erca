/*********************************************************************************
 * Copyright (c) 2007, 2008 Jean-Rémy Falleri <jr.falleri@laposte.net>
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Xavier Dolques <xavier-dolques@wanadoo.fr> - initial API and implementation
 *********************************************************************************/

package com.googlecode.erca.framework.ui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import com.googlecode.erca.Attribute;
import com.googlecode.erca.BinaryAttribute;
import com.googlecode.erca.Entity;
import com.googlecode.erca.ValuedAttribute;
import com.googlecode.erca.framework.io.ErcaIO;
import com.googlecode.erca.rcf.FormalContext;
import com.googlecode.erca.rcf.Pair;
import com.googlecode.erca.rcf.RelationalContext;
import com.googlecode.erca.rcf.RelationalContextFamily;

public class ContextFamilyModel {

	private HashMap<String,ContextModel> contextModels;

	private ArrayList<ContextListener> listeners;

	private ArrayList<String> formalContexts;

	public ContextFamilyModel()
	{
		contextModels=new HashMap<String, ContextModel>();
		listeners=new ArrayList<ContextListener>();
		formalContexts=new ArrayList<String>();
	}

	public void addFormalContext(String name)
	{
		if (name==null)
			return;
		ContextModel cm=new FormalContextModel(name);
		contextModels.put(name,cm);
		formalContexts.add(name);
		fireNewContextEvent(name,cm);
	}

	public void addRelationnalContext(String name, String source, String target)
	{
		ContextModel cm=new RelationalContextModel(name,(FormalContextModel)contextModels.get(source), (FormalContextModel)contextModels.get(target));
		contextModels.put(name,cm);
		fireNewContextEvent(name,cm);
	}

	public void addContextListener(ContextListener cl)
	{
		listeners.add(cl);
	}

	private void fireNewContextEvent(String name, ContextModel cm) {
		ContextEvent event=new ContextEvent(this,"new Context",name, cm);
		for (ContextListener cl:listeners)
			cl.ContextChanged(event);

	}

	private void fireRenameContextEvent(String name, ContextModel cm){
		ContextEvent event=new ContextEvent(this,"new Context name",name, cm);
		for (ContextListener cl:listeners)
			cl.ContextChanged(event);
	}

	public boolean existsContext(String name)
	{
		return (contextModels.containsKey(name));
	}

	public int familySize()
	{
		return contextModels.size();
	}

	public void addRow(String selectedContext) {

		contextModels.get(selectedContext).addRow();

	}

	public void addColumn(String selectedContext) {
		contextModels.get(selectedContext).addColumn();
	}

	public void removeColumn(String selectedContext, String col)
	{
		contextModels.get(selectedContext).removeColumn(col);
	}

	public ArrayList<String> getFormalContexts()
	{
		return formalContexts;
	}

	public Object[] getAttributes(String selectedContext)
	{
		return contextModels.get(selectedContext).getColumnIdentifiers();
	}

	public Object[] getObjects(String selectedContext) {
		return contextModels.get(selectedContext).getRowIdentifiers();
	}

	public void removeRow(String selectedContext, String s) {
		contextModels.get(selectedContext).removeRow(s);
	}

	public void renameRow(String selectedContext,String oldName, String newName) {
		contextModels.get(selectedContext).renameRow(oldName,newName);
	}

	public void renameCol(String selectedContext,String oldName, String newName) {
		contextModels.get(selectedContext).renameCol(oldName,newName);
	}

	public Set<String> getContexts() {
		return contextModels.keySet();
	}

	public void renameContext(String oldName, String newName) {
		contextModels.get(oldName).setName(newName);
		contextModels.put(newName,contextModels.remove(oldName));
		if (formalContexts.contains(oldName)) {
			formalContexts.remove(oldName);
			formalContexts.add(newName);
		}
		fireRenameContextEvent(oldName, contextModels.get(newName));
	}

	public void saveRCF(File f)
	{
		try {
			FileWriter fw=new FileWriter(f);

			for(String fc:formalContexts)
			{
				contextModels.get(fc).saveRCF(fw);
			}
			ArrayList<String> relationalContexts=new ArrayList<String>();
			relationalContexts.addAll(contextModels.keySet());
			relationalContexts.removeAll(formalContexts);
			for (String rc:relationalContexts)
			{
				contextModels.get(rc).saveRCF(fw);
			}
			fw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void loadRCF(File f) throws IOException
	{
		
		String fileExtension=(f.getName().substring(f.getName().lastIndexOf(".")+1));
		System.out.println("file extension : "+fileExtension);
		if (fileExtension.equals("rcft"))
		{
			BufferedReader input = new BufferedReader(new FileReader(f));

			String line = input.readLine();

			while( line != null ) {
				String tline = line.trim();
				if ( tline.startsWith("FormalContext") ) {
					eatFormalContext(input,tline);
				}
				else if ( tline.startsWith("RelationalContext") ) {
					eatRelationalContext(input,tline);
				}
				line = input.readLine();
			}
		}
		if (fileExtension.equals("rcf")|| fileExtension.equals("xmi"))
		{
			RelationalContextFamily rcf=ErcaIO.loadRCF(f.getAbsolutePath());
			eatRCF(rcf);
		}
	}
	/**
	 * @param rcf
	 */
	private void eatRCF(RelationalContextFamily rcf) {
		for (FormalContext fc: rcf.getFormalContexts())
		{
			addFormalContext(fc.getName());
			removeRow(fc.getName(), "Object_0");
			for (Entity e : fc.getEntities())
			{
				addRow(fc.getName(), e.getName());
			}
			
			for (Attribute a : fc.getAttributes())
			{
				addColumn(fc.getName(),a.getDescription());
			}
			ContextModel cm=contextModels.get(fc.getName());
			for (Pair p :fc.getRelation())
			{
				
				int row=cm.getRow(((Entity)p.getSource()).getName());
				int col=cm.findColumn(((Attribute) p.getTarget()).getDescription());
				cm.setValueAt(true, row, col);
				
			}
		}
		for (RelationalContext rc : rcf.getRelationalContexts())
		{
			addRelationnalContext(rc.getName(), rc.getSourceContext().getName(), rc.getTargetContext().getName());
			/*for (Entity e : rc.getSourceContext().getEntities())
			{
				addRow(rc.getName(), e.getName());
			}
			for (Entity e : rc.getTargetContext().getEntities())
			{
				addColumn(rc.getName(), e.getName());
			}*/
			ContextModel cm=contextModels.get(rc.getName());
			for (Pair p :rc.getRelation())
			{
				
				int row=cm.getRow(((Entity)p.getSource()).getName());
				int col=cm.findColumn(((Entity) p.getTarget()).getName());
				cm.setValueAt(true, row, col);
				
			}
		}
		
	}

	private void eatFormalContext(BufferedReader input,String desc) throws IOException {

		String contextName=desc.split("\\ ")[1];
		addFormalContext(contextName);

		input.mark(0);
		String line = input.readLine();
		int currentRow = 0;

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
					addColumn(contextName,attrDesc);
				}
			}
			else {
				String name = tokens[1].trim();
				System.out.println("Entity " + name + " created. Line: " + currentRow);
				if (currentRow == 1 )
					renameRow(contextName, "Object_0", name);
				else
					addRow(contextName,name);
				for(int i = 2 ; i < len ; i++ ) {
					String cell = tokens[i].trim().toLowerCase();
					if ( "x".equals(cell) ) {
						contextModels.get(contextName).setValueAt(true, currentRow-1, i-1);
					}
				}
			}
			currentRow++;

			input.mark(0);

			line = input.readLine();
		}
		if ( line != null )
			input.reset();

	}

	private void addRow(String contextName, String name) {
		contextModels.get(contextName).addRow(name);

	}

	private void addColumn(String contextName, String attrDesc) {
		contextModels.get(contextName).addColumn(attrDesc);

	}

	private void eatRelationalContext(BufferedReader input,String desc) throws IOException {
		String contextName=desc.split("\\ ")[1];
		String source = input.readLine().trim().split("\\ ")[1];
		String target = input.readLine().trim().split("\\ ")[1];
		String sclOp = input.readLine().trim().split("\\ ")[1];
		addRelationnalContext(contextName,source,target );

		input.mark(0);

		String line = input.readLine();
		int currentRow = 0;


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
				}

			}
			else {
				String name = tokens[1].trim();

				for(int i = 2 ; i < len ; i++ ) {
					String cell = tokens[i].trim().toLowerCase();
					if ( "x".equals(cell) ) 
						contextModels.get(contextName).setValueAt(true, currentRow-1, i-1);
				}
			}

			currentRow++;
			input.mark(0);
			line = input.readLine();
		}

		if ( line != null )
			input.reset();

	}
}
