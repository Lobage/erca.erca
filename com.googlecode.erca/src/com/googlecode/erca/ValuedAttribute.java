/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.googlecode.erca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valued Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.googlecode.erca.ValuedAttribute#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.googlecode.erca.ErcaPackage#getValuedAttribute()
 * @model
 * @generated
 */
public interface ValuedAttribute extends Attribute, NamedElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see com.googlecode.erca.ErcaPackage#getValuedAttribute_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link com.googlecode.erca.ValuedAttribute#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // ValuedAttribute
