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

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;


public abstract class ContextModel extends DefaultTableModel{

	private static final long serialVersionUID = 1L;

	private int createdrows=0;

	private int createdcolumns=0;

	private String name;

	public ContextModel(int row, int column) {
		super(row,column);
	}

	public ContextModel(String name) {
		super(0,0);
		setName(name);
		addColumn("");
		addRow();
	}

	public Class getColumnClass(int c) {
		if (c>0)
			return Boolean.class;
		else
			return String.class;
	}

	@Override
	public boolean isCellEditable(int row, int column) {
		return column != 0;
	}

	public void addRow() {
		Vector<Object>v =new Vector<Object>(); 
		v.add(new String("Object_"+createdrows++));
		Boolean[] b=new Boolean[getColumnCount()-1];
		Arrays.fill(b, false);
		v.addAll(Arrays.asList(b));
		addRow(v);
	}
	
	public void addRow(String rowName) {
		Vector<Object>v =new Vector<Object>(); 
		v.add(rowName);
		Boolean[] b=new Boolean[getColumnCount()-1];
		Arrays.fill(b, false);
		v.addAll(Arrays.asList(b));
		addRow(v);
	}

	public void addColumn()	{
		addColumn("Attribute_"+createdcolumns++);
	}

	public void removeColumn(String s) {
		removeColumn(findColumn(s));
	}

	public void removeRow(String s)	{
		removeRow(getRow(s));
	}
	
	public int getRow(String s)	{
		for(int i=0;i<getRowCount();i++)
			if(s.equals(getValueAt(i, 0)))
				return i;
			
		return -1;
	}
	
	public void removeColumn(int i)	{
		if ( i < getColumnCount() -1 ) {
			setColumnTitle(i, getColumnName(i+1));
			for (int j=0;j<getRowCount();j++)
				setValueAt(getValueAt(j, i+1), j, i);
			
			removeColumn(i+1);
		}
		else {
			setColumnCount(getColumnCount()-1);
			System.out.println(getColumnCount());
		}
	}

	public Object[] getColumnIdentifiers() {
		
		return columnIdentifiers.subList(1, getColumnCount()).toArray().clone();
		//return Arrays.copyOfRange(columnIdentifiers.toArray(), 1, getColumnCount());
	}
	
	
	
	private void setColumnTitle(int i, String title) {
		Object[] ids=columnIdentifiers.toArray();
		ids[i]=title;
		setColumnIdentifiers(ids);
	}

	public void renameCol(String old, String title) {
		if (!columnIdentifiers.contains(title))
			setColumnTitle(columnIdentifiers.indexOf(old),title);
	}
	
	public Object[] getRowIdentifiers() {
		ArrayList<Object> ids=new ArrayList<Object>();
		for (int i=0;i<getRowCount();i++)
			ids.add(getValueAt(i, 0));

		return ids.toArray();
	}
	
	public void renameRow(String oldName, String newName) {
		if (!Arrays.asList(getRowIdentifiers()).contains(newName))
			setValueAt(newName, getRow(oldName), 0);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract void saveRCF(FileWriter fw) throws IOException ;

}
