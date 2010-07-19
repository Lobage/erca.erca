/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.googlecode.erca;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.googlecode.erca.CompositeAttribute#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.googlecode.erca.ErcaPackage#getCompositeAttribute()
 * @model
 * @generated
 */
public interface CompositeAttribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link com.googlecode.erca.ValuedAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see com.googlecode.erca.ErcaPackage#getCompositeAttribute_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValuedAttribute> getAttributes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" compositeRequired="true"
	 * @generated
	 */
	boolean isCompatibleWith(CompositeAttribute composite);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isCoherent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	int size();

} // CompositeAttribute
