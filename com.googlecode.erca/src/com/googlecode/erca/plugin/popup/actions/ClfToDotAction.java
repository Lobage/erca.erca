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

package com.googlecode.erca.plugin.popup.actions;


import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.action.IAction;

import com.googlecode.erca.framework.io.out.ClfToDot;

public class ClfToDotAction extends ExportAction {

	public ClfToDotAction() {
		super();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		for(Object object: selection.toArray() ) {
			if ( object instanceof IFile ) {
				IFile iFile = ((IFile) object);
				String source = iFile.getRawLocation().toFile().getAbsolutePath();
				String target = source + ".dot";
				ClfToDot dotter = new ClfToDot(source);
				dotter.setDisplayStepNumber(true);
				dotter.setUseColor(true);
				dotter.generateCode();
				try {
					dotter.toFile(target);
					IProgressMonitor monitor = new NullProgressMonitor();
					iFile.getParent().refreshLocal(1, monitor);
				}
				catch(Exception e) {}
			}
		}
	}

}
