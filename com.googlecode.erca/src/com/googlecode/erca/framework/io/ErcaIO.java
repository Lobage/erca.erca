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

package com.googlecode.erca.framework.io;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.googlecode.erca.*;
import com.googlecode.erca.clf.*;
import com.googlecode.erca.framework.io.in.RcftParser;
import com.googlecode.erca.rcf.*;

public class ErcaIO {

	public static RelationalContextFamily loadRcft(String path) throws IOException {
		RcftParser p = new RcftParser(path);
		p.parse();
		return p.getRcf();
	}
	
	public static RelationalContextFamily loadRCF(String path) {
		return (RelationalContextFamily) loadErcaObject(path);
	}

	public static FormalContext loadFormalContext(String path) {
		return (FormalContext) loadErcaObject(path);
	}
	
	public static ConceptLattice loadConceptLattice(String path) {
		return (ConceptLattice) loadErcaObject(path);
	}
	
	public static ConceptLatticeFamily loadCLF(String path) {
		return (ConceptLatticeFamily) loadErcaObject(path);
	}
	
	public static EObject loadErcaObject(String path) {
		ResourceSet resourceSet = getErcaResourceSet();
		URI uri = URI.createFileURI(new File(path).getAbsolutePath());
		Resource resource = resourceSet.getResource(uri, true);
		return ((EObject) resource.getContents().get(0));
	}
	
	public static void saveErcaObject(EObject object, String path) throws IOException {
		ResourceSet resourceSet = getErcaResourceSet();
		URI uri = URI.createFileURI(new File(path).getAbsolutePath());
		Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(object);
		resource.save(null);
	}
	
	private static ResourceSet getErcaResourceSet() {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION,new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(ErcaPackage.eNS_URI,ErcaPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(RcfPackage.eNS_URI,RcfPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(ClfPackage.eNS_URI,ClfPackage.eINSTANCE);
		return resourceSet;
	}
}
