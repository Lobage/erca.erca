/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.googlecode.erca.rcf;


import org.eclipse.emf.ecore.EObject;

import com.googlecode.erca.FcaElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.googlecode.erca.rcf.Pair#getTarget <em>Target</em>}</li>
 *   <li>{@link com.googlecode.erca.rcf.Pair#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.googlecode.erca.rcf.RcfPackage#getPair()
 * @model
 * @generated
 */
public interface Pair extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(FcaElement)
	 * @see com.googlecode.erca.rcf.RcfPackage#getPair_Target()
	 * @model required="true"
	 * @generated
	 */
	FcaElement getTarget();

	/**
	 * Sets the value of the '{@link com.googlecode.erca.rcf.Pair#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(FcaElement value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(FcaElement)
	 * @see com.googlecode.erca.rcf.RcfPackage#getPair_Source()
	 * @model required="true"
	 * @generated
	 */
	FcaElement getSource();

	/**
	 * Sets the value of the '{@link com.googlecode.erca.rcf.Pair#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(FcaElement value);

} // Pair
