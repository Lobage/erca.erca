/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.googlecode.erca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.googlecode.erca.ErcaPackage#getAttribute()
 * @model abstract="true"
 * @generated
 */
public interface Attribute extends FcaElement {
	/**
	 * <!-- begin-user-doc -->
	 * This method return a complete description of the Attribute
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean sameAs(Attribute attr);

} // Attribute
