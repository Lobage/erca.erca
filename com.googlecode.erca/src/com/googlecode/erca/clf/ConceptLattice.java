/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.googlecode.erca.clf;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

import org.eclipse.emf.common.util.EList;

import com.googlecode.erca.Attribute;
import com.googlecode.erca.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Lattice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.googlecode.erca.clf.ConceptLattice#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link com.googlecode.erca.clf.ConceptLattice#getTop <em>Top</em>}</li>
 *   <li>{@link com.googlecode.erca.clf.ConceptLattice#getConcepts <em>Concepts</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.googlecode.erca.clf.ClfPackage#getConceptLattice()
 * @model
 * @generated
 */
public interface ConceptLattice extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link com.googlecode.erca.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see com.googlecode.erca.clf.ClfPackage#getConceptLattice_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Top</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top</em>' reference.
	 * @see #setTop(Concept)
	 * @see com.googlecode.erca.clf.ClfPackage#getConceptLattice_Top()
	 * @model required="true"
	 * @generated
	 */
	Concept getTop();

	/**
	 * Sets the value of the '{@link com.googlecode.erca.clf.ConceptLattice#getTop <em>Top</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top</em>' reference.
	 * @see #getTop()
	 * @generated
	 */
	void setTop(Concept value);

	/**
	 * Returns the value of the '<em><b>Concepts</b></em>' containment reference list.
	 * The list contents are of type {@link com.googlecode.erca.clf.Concept}.
	 * It is bidirectional and its opposite is '{@link com.googlecode.erca.clf.Concept#getLattice <em>Lattice</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concepts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concepts</em>' containment reference list.
	 * @see com.googlecode.erca.clf.ClfPackage#getConceptLattice_Concepts()
	 * @see com.googlecode.erca.clf.Concept#getLattice
	 * @model opposite="lattice" containment="true" ordered="false"
	 * @generated
	 */
	EList<Concept> getConcepts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model attributeRequired="true"
	 * @generated
	 */
	void deleteAttribute(Attribute attribute);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model attrRequired="true"
	 * @generated
	 */
	Attribute getAttribute(Attribute attr);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true"
	 * @generated
	 */
	Concept getConcept(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	int getMaxDepth();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Concept> getEmptyConcepts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Concept> getNewConcepts();
	
	

} // ConceptLattice
