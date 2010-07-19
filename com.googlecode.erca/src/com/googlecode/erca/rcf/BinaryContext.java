/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.googlecode.erca.rcf;


import org.eclipse.emf.common.util.EList;

import com.googlecode.erca.FcaElement;
import com.googlecode.erca.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.googlecode.erca.rcf.BinaryContext#getRelation <em>Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.googlecode.erca.rcf.RcfPackage#getBinaryContext()
 * @model abstract="true"
 * @generated
 */
public interface BinaryContext extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Relation</b></em>' containment reference list.
	 * The list contents are of type {@link com.googlecode.erca.rcf.Pair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' containment reference list.
	 * @see com.googlecode.erca.rcf.RcfPackage#getBinaryContext_Relation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pair> getRelation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<FcaElement> getTargetElements(FcaElement element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<FcaElement> getSourceElements(FcaElement element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" sourceRequired="true" targetRequired="true"
	 * @generated
	 */
	boolean hasPair(FcaElement source, FcaElement target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sourceRequired="true" targetRequired="true"
	 * @generated
	 */
	void addPair(FcaElement source, FcaElement target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sourceRequired="true" targetRequired="true"
	 * @generated
	 */
	void removePair(FcaElement source, FcaElement target);

} // BinaryContext
