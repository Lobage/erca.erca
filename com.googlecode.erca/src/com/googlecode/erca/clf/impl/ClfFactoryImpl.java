/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.googlecode.erca.clf.impl;


import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.googlecode.erca.clf.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClfFactoryImpl extends EFactoryImpl implements ClfFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClfFactory init() {
		try {
			ClfFactory theClfFactory = (ClfFactory)EPackage.Registry.INSTANCE.getEFactory("http://code.google.com/erca/erca.ecore/1.5.0#//clf"); 
			if (theClfFactory != null) {
				return theClfFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ClfFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClfFactoryImpl() {
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
			case ClfPackage.CONCEPT: return createConcept();
			case ClfPackage.CONCEPT_LATTICE: return createConceptLattice();
			case ClfPackage.CONCEPT_LATTICE_FAMILY: return createConceptLatticeFamily();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept createConcept() {
		ConceptImpl concept = new ConceptImpl();
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptLattice createConceptLattice() {
		ConceptLatticeImpl conceptLattice = new ConceptLatticeImpl();
		return conceptLattice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptLatticeFamily createConceptLatticeFamily() {
		ConceptLatticeFamilyImpl conceptLatticeFamily = new ConceptLatticeFamilyImpl();
		return conceptLatticeFamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClfPackage getClfPackage() {
		return (ClfPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ClfPackage getPackage() {
		return ClfPackage.eINSTANCE;
	}

} //ClfFactoryImpl
