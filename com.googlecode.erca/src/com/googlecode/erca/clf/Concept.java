/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.googlecode.erca.clf;


import org.eclipse.emf.common.util.EList;

import com.googlecode.erca.Attribute;
import com.googlecode.erca.Entity;
import com.googlecode.erca.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.googlecode.erca.clf.Concept#getLattice <em>Lattice</em>}</li>
 *   <li>{@link com.googlecode.erca.clf.Concept#getChildren <em>Children</em>}</li>
 *   <li>{@link com.googlecode.erca.clf.Concept#getExtent <em>Extent</em>}</li>
 *   <li>{@link com.googlecode.erca.clf.Concept#getIntent <em>Intent</em>}</li>
 *   <li>{@link com.googlecode.erca.clf.Concept#getCreationStep <em>Creation Step</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.googlecode.erca.clf.ClfPackage#getConcept()
 * @model
 * @generated
 */
public interface Concept extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Lattice</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.googlecode.erca.clf.ConceptLattice#getConcepts <em>Concepts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lattice</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lattice</em>' container reference.
	 * @see #setLattice(ConceptLattice)
	 * @see com.googlecode.erca.clf.ClfPackage#getConcept_Lattice()
	 * @see com.googlecode.erca.clf.ConceptLattice#getConcepts
	 * @model opposite="concepts" required="true" transient="false"
	 * @generated
	 */
	ConceptLattice getLattice();

	/**
	 * Sets the value of the '{@link com.googlecode.erca.clf.Concept#getLattice <em>Lattice</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lattice</em>' container reference.
	 * @see #getLattice()
	 * @generated
	 */
	void setLattice(ConceptLattice value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link com.googlecode.erca.clf.Concept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * This method returns only the direct children of the concept, if you want 
	 * all the children you should see the method {@link com.googlecode.erca.clf.Concept#getAllChildren() getAllChildren()}.
	 * </p><p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see com.googlecode.erca.clf.ClfPackage#getConcept_Children()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Concept> getChildren();

	/**
	 * Returns the value of the '<em><b>Extent</b></em>' reference list.
	 * The list contents are of type {@link com.googlecode.erca.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extent</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extent</em>' reference list.
	 * @see com.googlecode.erca.clf.ClfPackage#getConcept_Extent()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Entity> getExtent();

	/**
	 * Returns the value of the '<em><b>Intent</b></em>' reference list.
	 * The list contents are of type {@link com.googlecode.erca.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intent</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intent</em>' reference list.
	 * @see com.googlecode.erca.clf.ClfPackage#getConcept_Intent()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Attribute> getIntent();

	/**
	 * Returns the value of the '<em><b>Creation Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Step</em>' attribute.
	 * @see #setCreationStep(int)
	 * @see com.googlecode.erca.clf.ClfPackage#getConcept_CreationStep()
	 * @model
	 * @generated
	 */
	int getCreationStep();

	/**
	 * Sets the value of the '{@link com.googlecode.erca.clf.Concept#getCreationStep <em>Creation Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Step</em>' attribute.
	 * @see #getCreationStep()
	 * @generated
	 */
	void setCreationStep(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Entity> getSimplifiedExtent();

	/**
	 * <!-- begin-user-doc -->
	 * Returns all the parents of the concept.
	 * The concept itself is included in the parents
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Concept> getAllParents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Attribute> getSimplifiedIntent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Concept> getParents();

	/**
	 * <!-- begin-user-doc -->
	 * This method return all the children of the concept. The list of children
	 * is created using Breadth First Search order. The concept itself is included.
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Concept> getAllChildren();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isFusion();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isNewConcept();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isDummy();

} // Concept
