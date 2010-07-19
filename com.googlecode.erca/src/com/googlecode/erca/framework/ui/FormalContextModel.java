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
import java.util.Vector;

public class FormalContextModel extends ContextModel {

	private static final long serialVersionUID = 1L;
	
	private ArrayList<ContextChangeListener> ccls;
	
	public FormalContextModel(String name) {
		super(0,0);
		setName(name);
		ccls=new ArrayList<ContextChangeListener>();
		addColumn("");
		addRow();
	}
	
	
	@Override
	public void addColumn(Object arg0) {
		super.addColumn(arg0);
		fireContextChangeEvent(new ContextChangeEvent(this,ContextChangeEvent.COL_ADDED));
		
	}


	@Override
	public void addColumn() {
		super.addColumn();
		fireContextChangeEvent(new ContextChangeEvent(this,ContextChangeEvent.COL_ADDED));
		
	}

	@Override
	public void addRow() {
		super.addRow();
		fireContextChangeEvent(new ContextChangeEvent(this,ContextChangeEvent.ROW_ADDED));
	}

	@Override
	public void removeColumn(String s) {
		super.removeColumn(s);
		fireContextChangeEvent(new ContextChangeEvent(this,ContextChangeEvent.COL_DELETED,s));
	}

	@Override
	public void removeRow(String s) {
		super.removeRow(s);
		fireContextChangeEvent(new ContextChangeEvent(this,ContextChangeEvent.ROW_DELETED,s));
	}

	@Override
	public void renameCol(String old, String title) {
		super.renameCol(old, title);
		fireContextChangeEvent(new ContextChangeEvent(this,ContextChangeEvent.COL_TITLE_CHANGED,old,title));
	}
	
	@Override
	public void renameRow(String oldName, String newName) {
		super.renameRow(oldName, newName);
		fireContextChangeEvent(new ContextChangeEvent(this,ContextChangeEvent.ROW_TITLE_CHANGED,oldName,newName));
	}
	
	public void fireContextChangeEvent(ContextChangeEvent e) {	
		for (ContextChangeListener ccl: ccls)
			ccl.contextChanged(e);
	}
	
	public void addContextChangeListener(ContextChangeListener ccl)	{
		ccls.add(ccl);
	}
	
	@Override
	public void saveRCF(FileWriter fw) throws IOException {
		fw.write("FormalContext "+getName()+"\n");
		fw.write("|\t\t|");
		for(Object s:getColumnIdentifiers())
			fw.write(s+"\t|");
		fw.write("\n");
		for(Vector<Object> v: (Vector<Vector<Object>>)dataVector) {
			fw.write("|"+v.get(0)+"\t|");
			for (int i=1;i<v.size();i++) {
				if (v.get(i)!=null&&(Boolean)v.get(i))
					fw.write("x\t\t|");
				else
					fw.write("\t\t|");
			}
			fw.write("\n");
		}
		
		fw.write("\n");
	}

}