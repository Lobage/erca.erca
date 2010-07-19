/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.googlecode.erca;

import com.googlecode.erca.clf.Concept;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.googlecode.erca.RelationalAttribute#getValue <em>Value</em>}</li>
 *   <li>{@link com.googlecode.erca.RelationalAttribute#getScalingOperator <em>Scaling Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.googlecode.erca.ErcaPackage#getRelationalAttribute()
 * @model
 * @generated
 */
public interface RelationalAttribute extends Attribute, NamedElement {

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Concept)
	 * @see com.googlecode.erca.ErcaPackage#getRelationalAttribute_Value()
	 * @model
	 * @generated
	 */
	Concept getValue();

	/**
	 * Sets the value of the '{@link com.googlecode.erca.RelationalAttribute#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Concept value);

	/**
	 * Returns the value of the '<em><b>Scaling Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scaling Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scaling Operator</em>' attribute.
	 * @see #setScalingOperator(String)
	 * @see com.googlecode.erca.ErcaPackage#getRelationalAttribute_ScalingOperator()
	 * @model
	 * @generated
	 */
	String getScalingOperator();

	/**
	 * Sets the value of the '{@link com.googlecode.erca.RelationalAttribute#getScalingOperator <em>Scaling Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scaling Operator</em>' attribute.
	 * @see #getScalingOperator()
	 * @generated
	 */
	void setScalingOperator(String value);
} // RelationalAttribute
