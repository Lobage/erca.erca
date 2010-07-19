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

import java.util.EventObject;

public class ContextChangeEvent extends EventObject {

	private static final long serialVersionUID = 1L;

	public final static int ROW_DELETED=0;

	public final static int ROW_ADDED=1;

	public final static int ROW_TITLE_CHANGED=2;

	public final static int COL_DELETED=3;

	public final static int COL_ADDED=4;

	public final static int COL_TITLE_CHANGED=5;

	private int action=-1;
	
	private String id="";
	
	private String newName="";
	
	public int getAction() {
		return action;
	}
	
	public String getId() {
		return id;
	}
	
	public String getNewName() {
		return newName;
	}
	
	public ContextChangeEvent(Object source, int action) {
		super(source);
		this.action = action;
	}
	
	public ContextChangeEvent(Object source, int action, String id) {
		super(source);
		this.action = action;
		this.id = id;
	}
	
	public ContextChangeEvent(Object source, int action, String id, String newName) {
		super(source);
		this.action = action;
		this.id = id;
		this.newName = newName;
	}

}
