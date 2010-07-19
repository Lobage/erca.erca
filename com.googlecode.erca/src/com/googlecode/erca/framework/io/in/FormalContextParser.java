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

import java.io.IOException;

import com.googlecode.erca.rcf.FormalContext;


public abstract class FormalContextParser {
	
	protected String path;
	
	protected FormalContext formalContext;
	
	public abstract void parse() throws IOException;
	
	public FormalContextParser(String path) {
		this.path = path;
	}
	
	public FormalContext getFormalContext() {
		return formalContext;
	}
	
}
