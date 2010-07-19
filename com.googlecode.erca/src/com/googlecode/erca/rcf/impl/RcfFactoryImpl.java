/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.googlecode.erca.rcf.impl;


import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.googlecode.erca.rcf.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RcfFactoryImpl extends EFactoryImpl implements RcfFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RcfFactory init() {
		try {
			RcfFactory theRcfFactory = (RcfFactory)EPackage.Registry.INSTANCE.getEFactory("http://code.google.com/erca/erca.ecore/1.5.0#//rcf"); 
			if (theRcfFactory != null) {
				return theRcfFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RcfFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RcfFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RcfPackage.PAIR: return createPair();
			case RcfPackage.RELATIONAL_CONTEXT: return createRelationalContext();
			case RcfPackage.FORMAL_CONTEXT: return createFormalContext();
			case RcfPackage.RELATIONAL_CONTEXT_FAMILY: return createRelationalContextFamily();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pair createPair() {
		PairImpl pair = new PairImpl();
		return pair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalContext createRelationalContext() {
		RelationalContextImpl relationalContext = new RelationalContextImpl();
		return relationalContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalContext createFormalContext() {
		FormalContextImpl formalContext = new FormalContextImpl();
		return formalContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalContextFamily createRelationalContextFamily() {
		RelationalContextFamilyImpl relationalContextFamily = new RelationalContextFamilyImpl();
		return relationalContextFamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RcfPackage getRcfPackage() {
		return (RcfPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RcfPackage getPackage() {
		return RcfPackage.eINSTANCE;
	}

} //RcfFactoryImpl
