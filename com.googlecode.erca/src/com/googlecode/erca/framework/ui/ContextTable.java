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

import javax.swing.JTable;


public class ContextTable extends JTable {
	
	private static final long serialVersionUID = 1L;

	public ContextTable(ContextModel cm) {
		super(cm);
		setAutoResizeMode(AUTO_RESIZE_OFF);
	}
	
}
