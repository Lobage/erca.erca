/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.googlecode.erca.impl;

import org.eclipse.emf.ecore.EClass;

import com.googlecode.erca.Attribute;
import com.googlecode.erca.BinaryAttribute;
import com.googlecode.erca.ErcaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BinaryAttributeImpl extends NamedElementImpl implements BinaryAttribute {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErcaPackage.Literals.BINARY_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getDescription() {
		return this.getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean sameAs(Attribute attr) {
		if ( ! (attr instanceof BinaryAttribute) )
			return false;
		else {
			BinaryAttribute b = (BinaryAttribute) attr;
			if ( this.getName().equals(b.getName()) )
				return true;
			else
				return false;
		}
		
	}

} //BinaryAttributeImpl
