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

public class ContextEvent extends EventObject {

	private static final long serialVersionUID = 1L;

	private String action;
	
	private String contextName;
	
	private ContextModel context;
	
	public String getAction() {
		return action;
	}
	
	public String getContextName() {
		return contextName;
	}
	
	public ContextModel getContext() {
		return context;
	}
	
	public ContextEvent(Object source, String action,String contextName, ContextModel context)
	{
		super(source);
		this.action = action;
		this.context = context;
		this.contextName = contextName;
	}
	
	

}
