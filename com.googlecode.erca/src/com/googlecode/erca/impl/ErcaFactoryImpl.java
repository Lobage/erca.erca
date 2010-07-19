/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.googlecode.erca.impl;

import com.googlecode.erca.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ErcaFactoryImpl extends EFactoryImpl implements ErcaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ErcaFactory init() {
		try {
			ErcaFactory theErcaFactory = (ErcaFactory)EPackage.Registry.INSTANCE.getEFactory("http://code.google.com/erca/erca.ecore/1.5.0"); 
			if (theErcaFactory != null) {
				return theErcaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ErcaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErcaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ErcaPackage.ENTITY: return createEntity();
			case ErcaPackage.FCA_ELEMENT: return createFcaElement();
			case ErcaPackage.BINARY_ATTRIBUTE: return createBinaryAttribute();
			case ErcaPackage.VALUED_ATTRIBUTE: return createValuedAttribute();
			case ErcaPackage.COMPOSITE_ATTRIBUTE: return createCompositeAttribute();
			case ErcaPackage.RELATIONAL_ATTRIBUTE: return createRelationalAttribute();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FcaElement createFcaElement() {
		FcaElementImpl fcaElement = new FcaElementImpl();
		return fcaElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryAttribute createBinaryAttribute() {
		BinaryAttributeImpl binaryAttribute = new BinaryAttributeImpl();
		return binaryAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuedAttribute createValuedAttribute() {
		ValuedAttributeImpl valuedAttribute = new ValuedAttributeImpl();
		return valuedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeAttribute createCompositeAttribute() {
		CompositeAttributeImpl compositeAttribute = new CompositeAttributeImpl();
		return compositeAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalAttribute createRelationalAttribute() {
		RelationalAttributeImpl relationalAttribute = new RelationalAttributeImpl();
		return relationalAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErcaPackage getErcaPackage() {
		return (ErcaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ErcaPackage getPackage() {
		return ErcaPackage.eINSTANCE;
	}

} //ErcaFactoryImpl
