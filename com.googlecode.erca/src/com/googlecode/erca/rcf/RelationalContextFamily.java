/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.googlecode.erca.rcf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Context Family</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.googlecode.erca.rcf.RelationalContextFamily#getRelationalContexts <em>Relational Contexts</em>}</li>
 *   <li>{@link com.googlecode.erca.rcf.RelationalContextFamily#getFormalContexts <em>Formal Contexts</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.googlecode.erca.rcf.RcfPackage#getRelationalContextFamily()
 * @model
 * @generated
 */
public interface RelationalContextFamily extends EObject {
	/**
	 * Returns the value of the '<em><b>Relational Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link com.googlecode.erca.rcf.RelationalContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relational Contexts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relational Contexts</em>' containment reference list.
	 * @see com.googlecode.erca.rcf.RcfPackage#getRelationalContextFamily_RelationalContexts()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<RelationalContext> getRelationalContexts();

	/**
	 * Returns the value of the '<em><b>Formal Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link com.googlecode.erca.rcf.FormalContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Contexts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Contexts</em>' containment reference list.
	 * @see com.googlecode.erca.rcf.RcfPackage#getRelationalContextFamily_FormalContexts()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<FormalContext> getFormalContexts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	RelationalContext getRelationalContext(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true"
	 * @generated
	 */
	FormalContext getFormalContext(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model formalContextRequired="true"
	 * @generated
	 */
	EList<RelationalContext> getRelationalContexts(FormalContext formalContext);

} // RelationalContextFamily
