package com.googlecode.erca.plugin.popup.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.action.IAction;

import com.googlecode.erca.framework.io.ErcaIO;
import com.googlecode.erca.framework.io.in.RcftParser;


public class RcftToRcfAction extends ExportAction {

	public RcftToRcfAction() {
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
				String target = source + ".xmi";
				RcftParser p = new RcftParser(source);
				try {
					p.parse();
					ErcaIO.saveErcaObject(p.getRcf(),target);
					IProgressMonitor monitor = new NullProgressMonitor();
					iFile.getParent().refreshLocal(1, monitor);
				}
				catch(Exception e) {}
			}
		}
	}
}
