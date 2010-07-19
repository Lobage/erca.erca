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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;


public class Controller implements ActionListener{

	ContextFamilyModel cfm;
	EditorFrame ef;
	public Controller(ContextFamilyModel cfm, EditorFrame ef) {
		this.cfm=cfm;
		ef.addActionListener(this);
	}
		

	public void actionPerformed(ActionEvent e) {
		String[] actionString = e.getActionCommand().split("\n");

		if (actionString[0].equals("Add formal context"))
			cfm.addFormalContext(actionString[1]);
		else if (actionString[0].equals("Save RCF"))
			cfm.saveRCF(new File(actionString[1]));
		else if (actionString[0].equals("Load RCF")) {
			try {
				cfm.loadRCF(new File(actionString[1]));
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		else if (actionString[0].equals("Add relational context"))
			cfm.addRelationnalContext(actionString[1],actionString[2],actionString[3]);
		else if (actionString[0].equals("Set context name"))
			cfm.renameContext(actionString[1],actionString[2]);
		else if (!cfm.getFormalContexts().contains(actionString[1])) //vérifie si le contexte n'est pas relationnel pour pouvoir effectuer des modifications sur la structure des tables
			return;
		else if (actionString[0].equals("Add row"))
			cfm.addRow(actionString[1]);
		else if (actionString[0].equals("Add column"))
			cfm.addColumn(actionString[1]);
		else if (actionString[0].equals("Remove column"))
			cfm.removeColumn(actionString[1], actionString[2]);
		else if (actionString[0].equals("Remove row"))
			cfm.removeRow(actionString[1], actionString[2]);
		else if (actionString[0].equals("Set row name"))
			cfm.renameRow(actionString[1], actionString[2], actionString[3]);
		else if (actionString[0].equals("Set column name"))
			cfm.renameCol(actionString[1], actionString[2], actionString[3]);
		
	}

}
