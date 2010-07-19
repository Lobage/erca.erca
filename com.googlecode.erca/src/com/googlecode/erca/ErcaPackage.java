/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.googlecode.erca;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.googlecode.erca.ErcaFactory
 * @model kind="package"
 * @generated
 */
public interface ErcaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "erca";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://code.google.com/erca/erca.ecore/1.5.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "erca";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ErcaPackage eINSTANCE = com.googlecode.erca.impl.ErcaPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.googlecode.erca.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.googlecode.erca.impl.NamedElementImpl
	 * @see com.googlecode.erca.impl.ErcaPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.googlecode.erca.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.googlecode.erca.impl.EntityImpl
	 * @see com.googlecode.erca.impl.ErcaPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.googlecode.erca.impl.FcaElementImpl <em>Fca Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.googlecode.erca.impl.FcaElementImpl
	 * @see com.googlecode.erca.impl.ErcaPackageImpl#getFcaElement()
	 * @generated
	 */
	int FCA_ELEMENT = 3;

	/**
	 * The number of structural features of the '<em>Fca Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FCA_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.googlecode.erca.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.googlecode.erca.impl.AttributeImpl
	 * @see com.googlecode.erca.impl.ErcaPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = FCA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.googlecode.erca.impl.BinaryAttributeImpl <em>Binary Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.googlecode.erca.impl.BinaryAttributeImpl
	 * @see com.googlecode.erca.impl.ErcaPackageImpl#getBinaryAttribute()
	 * @generated
	 */
	int BINARY_ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ATTRIBUTE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Binary Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ATTRIBUTE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.googlecode.erca.impl.ValuedAttributeImpl <em>Valued Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.googlecode.erca.impl.ValuedAttributeImpl
	 * @see com.googlecode.erca.impl.ErcaPackageImpl#getValuedAttribute()
	 * @generated
	 */
	int VALUED_ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUED_ATTRIBUTE__NAME = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUED_ATTRIBUTE__VALUE = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Valued Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUED_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.googlecode.erca.impl.CompositeAttributeImpl <em>Composite Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.googlecode.erca.impl.CompositeAttributeImpl
	 * @see com.googlecode.erca.impl.ErcaPackageImpl#getCompositeAttribute()
	 * @generated
	 */
	int COMPOSITE_ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ATTRIBUTE__ATTRIBUTES = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link com.googlecode.erca.impl.RelationalAttributeImpl <em>Relational Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.googlecode.erca.impl.RelationalAttributeImpl
	 * @see com.googlecode.erca.impl.ErcaPackageImpl#getRelationalAttribute()
	 * @generated
	 */
	int RELATIONAL_ATTRIBUTE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_ATTRIBUTE__NAME = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_ATTRIBUTE__VALUE = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scaling Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_ATTRIBUTE__SCALING_OPERATOR = ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relational Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link com.googlecode.erca.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see com.googlecode.erca.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link com.googlecode.erca.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.googlecode.erca.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link com.googlecode.erca.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see com.googlecode.erca.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for class '{@link com.googlecode.erca.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see com.googlecode.erca.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for class '{@link com.googlecode.erca.FcaElement <em>Fca Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fca Element</em>'.
	 * @see com.googlecode.erca.FcaElement
	 * @generated
	 */
	EClass getFcaElement();

	/**
	 * Returns the meta object for class '{@link com.googlecode.erca.BinaryAttribute <em>Binary Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Attribute</em>'.
	 * @see com.googlecode.erca.BinaryAttribute
	 * @generated
	 */
	EClass getBinaryAttribute();

	/**
	 * Returns the meta object for class '{@link com.googlecode.erca.ValuedAttribute <em>Valued Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valued Attribute</em>'.
	 * @see com.googlecode.erca.ValuedAttribute
	 * @generated
	 */
	EClass getValuedAttribute();

	/**
	 * Returns the meta object for the attribute '{@link com.googlecode.erca.ValuedAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.googlecode.erca.ValuedAttribute#getValue()
	 * @see #getValuedAttribute()
	 * @generated
	 */
	EAttribute getValuedAttribute_Value();

	/**
	 * Returns the meta object for class '{@link com.googlecode.erca.CompositeAttribute <em>Composite Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Attribute</em>'.
	 * @see com.googlecode.erca.CompositeAttribute
	 * @generated
	 */
	EClass getCompositeAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link com.googlecode.erca.CompositeAttribute#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see com.googlecode.erca.CompositeAttribute#getAttributes()
	 * @see #getCompositeAttribute()
	 * @generated
	 */
	EReference getCompositeAttribute_Attributes();

	/**
	 * Returns the meta object for class '{@link com.googlecode.erca.RelationalAttribute <em>Relational Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Attribute</em>'.
	 * @see com.googlecode.erca.RelationalAttribute
	 * @generated
	 */
	EClass getRelationalAttribute();

	/**
	 * Returns the meta object for the reference '{@link com.googlecode.erca.RelationalAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see com.googlecode.erca.RelationalAttribute#getValue()
	 * @see #getRelationalAttribute()
	 * @generated
	 */
	EReference getRelationalAttribute_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.googlecode.erca.RelationalAttribute#getScalingOperator <em>Scaling Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scaling Operator</em>'.
	 * @see com.googlecode.erca.RelationalAttribute#getScalingOperator()
	 * @see #getRelationalAttribute()
	 * @generated
	 */
	EAttribute getRelationalAttribute_ScalingOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ErcaFactory getErcaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.googlecode.erca.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.googlecode.erca.impl.NamedElementImpl
		 * @see com.googlecode.erca.impl.ErcaPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link com.googlecode.erca.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.googlecode.erca.impl.EntityImpl
		 * @see com.googlecode.erca.impl.ErcaPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '{@link com.googlecode.erca.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.googlecode.erca.impl.AttributeImpl
		 * @see com.googlecode.erca.impl.ErcaPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '{@link com.googlecode.erca.impl.FcaElementImpl <em>Fca Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.googlecode.erca.impl.FcaElementImpl
		 * @see com.googlecode.erca.impl.ErcaPackageImpl#getFcaElement()
		 * @generated
		 */
		EClass FCA_ELEMENT = eINSTANCE.getFcaElement();

		/**
		 * The meta object literal for the '{@link com.googlecode.erca.impl.BinaryAttributeImpl <em>Binary Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.googlecode.erca.impl.BinaryAttributeImpl
		 * @see com.googlecode.erca.impl.ErcaPackageImpl#getBinaryAttribute()
		 * @generated
		 */
		EClass BINARY_ATTRIBUTE = eINSTANCE.getBinaryAttribute();

		/**
		 * The meta object literal for the '{@link com.googlecode.erca.impl.ValuedAttributeImpl <em>Valued Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.googlecode.erca.impl.ValuedAttributeImpl
		 * @see com.googlecode.erca.impl.ErcaPackageImpl#getValuedAttribute()
		 * @generated
		 */
		EClass VALUED_ATTRIBUTE = eINSTANCE.getValuedAttribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUED_ATTRIBUTE__VALUE = eINSTANCE.getValuedAttribute_Value();

		/**
		 * The meta object literal for the '{@link com.googlecode.erca.impl.CompositeAttributeImpl <em>Composite Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.googlecode.erca.impl.CompositeAttributeImpl
		 * @see com.googlecode.erca.impl.ErcaPackageImpl#getCompositeAttribute()
		 * @generated
		 */
		EClass COMPOSITE_ATTRIBUTE = eINSTANCE.getCompositeAttribute();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_ATTRIBUTE__ATTRIBUTES = eINSTANCE.getCompositeAttribute_Attributes();

		/**
		 * The meta object literal for the '{@link com.googlecode.erca.impl.RelationalAttributeImpl <em>Relational Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.googlecode.erca.impl.RelationalAttributeImpl
		 * @see com.googlecode.erca.impl.ErcaPackageImpl#getRelationalAttribute()
		 * @generated
		 */
		EClass RELATIONAL_ATTRIBUTE = eINSTANCE.getRelationalAttribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_ATTRIBUTE__VALUE = eINSTANCE.getRelationalAttribute_Value();

		/**
		 * The meta object literal for the '<em><b>Scaling Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONAL_ATTRIBUTE__SCALING_OPERATOR = eINSTANCE.getRelationalAttribute_ScalingOperator();

	}

} //ErcaPackage
