/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.googlecode.erca.clf;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.googlecode.erca.clf.ClfPackage
 * @generated
 */
public interface ClfFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClfFactory eINSTANCE = com.googlecode.erca.clf.impl.ClfFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Concept</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept</em>'.
	 * @generated
	 */
	Concept createConcept();

	/**
	 * Returns a new object of class '<em>Concept Lattice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept Lattice</em>'.
	 * @generated
	 */
	ConceptLattice createConceptLattice();

	/**
	 * Returns a new object of class '<em>Concept Lattice Family</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept Lattice Family</em>'.
	 * @generated
	 */
	ConceptLatticeFamily createConceptLatticeFamily();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ClfPackage getClfPackage();

} //ClfFactory
