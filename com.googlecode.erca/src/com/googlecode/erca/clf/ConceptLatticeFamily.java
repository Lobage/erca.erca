/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.googlecode.erca.clf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Lattice Family</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.googlecode.erca.clf.ConceptLatticeFamily#getConceptLattices <em>Concept Lattices</em>}</li>
 *   <li>{@link com.googlecode.erca.clf.ConceptLatticeFamily#getStepNumber <em>Step Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.googlecode.erca.clf.ClfPackage#getConceptLatticeFamily()
 * @model
 * @generated
 */
public interface ConceptLatticeFamily extends EObject {
	/**
	 * Returns the value of the '<em><b>Concept Lattices</b></em>' containment reference list.
	 * The list contents are of type {@link com.googlecode.erca.clf.ConceptLattice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concept Lattices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept Lattices</em>' containment reference list.
	 * @see com.googlecode.erca.clf.ClfPackage#getConceptLatticeFamily_ConceptLattices()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ConceptLattice> getConceptLattices();

	/**
	 * Returns the value of the '<em><b>Step Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Number</em>' attribute.
	 * @see #setStepNumber(int)
	 * @see com.googlecode.erca.clf.ClfPackage#getConceptLatticeFamily_StepNumber()
	 * @model
	 * @generated
	 */
	int getStepNumber();

	/**
	 * Sets the value of the '{@link com.googlecode.erca.clf.ConceptLatticeFamily#getStepNumber <em>Step Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Number</em>' attribute.
	 * @see #getStepNumber()
	 * @generated
	 */
	void setStepNumber(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true"
	 * @generated
	 */
	ConceptLattice getConceptLattice(String name);

} // ConceptLatticeFamily
