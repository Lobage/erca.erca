/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.googlecode.erca;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.googlecode.erca.ErcaPackage
 * @generated
 */
public interface ErcaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ErcaFactory eINSTANCE = com.googlecode.erca.impl.ErcaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	Entity createEntity();

	/**
	 * Returns a new object of class '<em>Fca Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fca Element</em>'.
	 * @generated
	 */
	FcaElement createFcaElement();

	/**
	 * Returns a new object of class '<em>Binary Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Attribute</em>'.
	 * @generated
	 */
	BinaryAttribute createBinaryAttribute();

	/**
	 * Returns a new object of class '<em>Valued Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valued Attribute</em>'.
	 * @generated
	 */
	ValuedAttribute createValuedAttribute();

	/**
	 * Returns a new object of class '<em>Composite Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Attribute</em>'.
	 * @generated
	 */
	CompositeAttribute createCompositeAttribute();

	/**
	 * Returns a new object of class '<em>Relational Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relational Attribute</em>'.
	 * @generated
	 */
	RelationalAttribute createRelationalAttribute();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ErcaPackage getErcaPackage();

} //ErcaFactory
