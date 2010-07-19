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
import java.util.Vector;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

public class RelationalContextModel extends ContextModel implements TableModelListener, ContextChangeListener {

	private static final long serialVersionUID = 1L;
	FormalContextModel source;
	FormalContextModel target;
	
	
	public RelationalContextModel(String name,FormalContextModel source, FormalContextModel target) {
		super(0,0);
		setName(name);
		addColumn("");
		this.source=source;
		for (Vector v:(Vector<Vector>)(target.getDataVector()))
		{
			addColumn((String)v.get(0));
		}
		source.addContextChangeListener(this);
		this.target=target;
		for (Vector v:(Vector<Vector>)(source.getDataVector()))
		{
			addRow((String)v.get(0));
		}
		target.addContextChangeListener(this);
		
		
	}

	public void tableChanged(TableModelEvent arg0) {
		System.out.println(arg0);
		System.out.println(arg0.getType());
		System.out.println(arg0.getColumn());
		System.out.println(arg0.getFirstRow());
		System.out.println(arg0.getLastRow());
		
		
		
		
	}

	public void contextChanged(ContextChangeEvent e) {
		switch ( e.getAction() )
		{
		case ContextChangeEvent.ROW_ADDED : 
			System.out.println("row added");
			System.out.println(e.getSource());
			System.out.println(target);
			System.out.println(source.getRowCount()+"  "+(getColumnCount()-1));
			if (e.getSource().equals(source)&&source.getRowCount()!=getRowCount())
				addRow((String)source.getValueAt(source.getRowCount()-1, 0));
			if (e.getSource().equals(target)&&target.getRowCount()!=getColumnCount()-1)
			{
				addColumn((String)target.getValueAt(target.getRowCount()-1, 0));

			}
			break;
		case ContextChangeEvent.ROW_DELETED :
			if (e.getSource().equals(source)&&source.getRowCount()!=getRowCount())
				removeRow(e.getId());
			if (e.getSource().equals(target)&&target.getRowCount()!=getColumnCount()-1)
			{
				removeColumn(e.getId());
			}
			break;
		case ContextChangeEvent.ROW_TITLE_CHANGED :
			if (e.getSource().equals(source))
				renameRow(e.getId(), e.getNewName());
			if (e.getSource().equals(target))
				renameCol(e.getId(), e.getNewName());
		}	
		

	}

	public void saveRCF(FileWriter fw) throws IOException {
		fw.write("RelationalContext "+getName()+"\n");
		fw.write("source "+source.getName()+"\n");
		fw.write("target "+target.getName()+"\n");
		fw.write("scaling fr.lirmm.rca.framework.algo.scaling.Wide \n");
		fw.write("|\t\t|");
		for(Object s:getColumnIdentifiers())
		{
			fw.write(s+"\t|");
		}
		fw.write("\n");
		for(Vector<Object> v: (Vector<Vector<Object>>)dataVector)
		{
			fw.write("|"+v.get(0)+"\t|");
			for (int i=1;i<v.size();i++)
			{
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
