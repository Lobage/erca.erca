/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.googlecode.erca.rcf;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.googlecode.erca.rcf.RcfPackage
 * @generated
 */
public interface RcfFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RcfFactory eINSTANCE = com.googlecode.erca.rcf.impl.RcfFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pair</em>'.
	 * @generated
	 */
	Pair createPair();

	/**
	 * Returns a new object of class '<em>Relational Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relational Context</em>'.
	 * @generated
	 */
	RelationalContext createRelationalContext();

	/**
	 * Returns a new object of class '<em>Formal Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Formal Context</em>'.
	 * @generated
	 */
	FormalContext createFormalContext();

	/**
	 * Returns a new object of class '<em>Relational Context Family</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relational Context Family</em>'.
	 * @generated
	 */
	RelationalContextFamily createRelationalContextFamily();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RcfPackage getRcfPackage();

} //RcfFactory
