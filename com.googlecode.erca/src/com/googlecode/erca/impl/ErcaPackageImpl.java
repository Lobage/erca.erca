/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.googlecode.erca.impl;





import com.googlecode.erca.Attribute;
import com.googlecode.erca.BinaryAttribute;
import com.googlecode.erca.CompositeAttribute;
import com.googlecode.erca.Entity;
import com.googlecode.erca.ErcaFactory;
import com.googlecode.erca.ErcaPackage;
import com.googlecode.erca.FcaElement;
import com.googlecode.erca.NamedElement;
import com.googlecode.erca.RelationalAttribute;
import com.googlecode.erca.ValuedAttribute;
import com.googlecode.erca.clf.ClfPackage;
import com.googlecode.erca.clf.impl.ClfPackageImpl;
import com.googlecode.erca.rcf.RcfPackage;
import com.googlecode.erca.rcf.impl.RcfPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ErcaPackageImpl extends EPackageImpl implements ErcaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fcaElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuedAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalAttributeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.googlecode.erca.ErcaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ErcaPackageImpl() {
		super(eNS_URI, ErcaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ErcaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ErcaPackage init() {
		if (isInited) return (ErcaPackage)EPackage.Registry.INSTANCE.getEPackage(ErcaPackage.eNS_URI);

		// Obtain or create and register package
		ErcaPackageImpl theErcaPackage = (ErcaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ErcaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ErcaPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ClfPackageImpl theClfPackage = (ClfPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClfPackage.eNS_URI) instanceof ClfPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClfPackage.eNS_URI) : ClfPackage.eINSTANCE);
		RcfPackageImpl theRcfPackage = (RcfPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RcfPackage.eNS_URI) instanceof RcfPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RcfPackage.eNS_URI) : RcfPackage.eINSTANCE);

		// Create package meta-data objects
		theErcaPackage.createPackageContents();
		theClfPackage.createPackageContents();
		theRcfPackage.createPackageContents();

		// Initialize created meta-data
		theErcaPackage.initializePackageContents();
		theClfPackage.initializePackageContents();
		theRcfPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theErcaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ErcaPackage.eNS_URI, theErcaPackage);
		return theErcaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFcaElement() {
		return fcaElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryAttribute() {
		return binaryAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValuedAttribute() {
		return valuedAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValuedAttribute_Value() {
		return (EAttribute)valuedAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeAttribute() {
		return compositeAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeAttribute_Attributes() {
		return (EReference)compositeAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationalAttribute() {
		return relationalAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationalAttribute_Value() {
		return (EReference)relationalAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationalAttribute_ScalingOperator() {
		return (EAttribute)relationalAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErcaFactory getErcaFactory() {
		return (ErcaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		entityEClass = createEClass(ENTITY);

		attributeEClass = createEClass(ATTRIBUTE);

		fcaElementEClass = createEClass(FCA_ELEMENT);

		binaryAttributeEClass = createEClass(BINARY_ATTRIBUTE);

		valuedAttributeEClass = createEClass(VALUED_ATTRIBUTE);
		createEAttribute(valuedAttributeEClass, VALUED_ATTRIBUTE__VALUE);

		compositeAttributeEClass = createEClass(COMPOSITE_ATTRIBUTE);
		createEReference(compositeAttributeEClass, COMPOSITE_ATTRIBUTE__ATTRIBUTES);

		relationalAttributeEClass = createEClass(RELATIONAL_ATTRIBUTE);
		createEReference(relationalAttributeEClass, RELATIONAL_ATTRIBUTE__VALUE);
		createEAttribute(relationalAttributeEClass, RELATIONAL_ATTRIBUTE__SCALING_OPERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ClfPackage theClfPackage = (ClfPackage)EPackage.Registry.INSTANCE.getEPackage(ClfPackage.eNS_URI);
		RcfPackage theRcfPackage = (RcfPackage)EPackage.Registry.INSTANCE.getEPackage(RcfPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theClfPackage);
		getESubpackages().add(theRcfPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		entityEClass.getESuperTypes().add(this.getNamedElement());
		entityEClass.getESuperTypes().add(this.getFcaElement());
		attributeEClass.getESuperTypes().add(this.getFcaElement());
		binaryAttributeEClass.getESuperTypes().add(this.getNamedElement());
		binaryAttributeEClass.getESuperTypes().add(this.getAttribute());
		valuedAttributeEClass.getESuperTypes().add(this.getAttribute());
		valuedAttributeEClass.getESuperTypes().add(this.getNamedElement());
		compositeAttributeEClass.getESuperTypes().add(this.getAttribute());
		relationalAttributeEClass.getESuperTypes().add(this.getAttribute());
		relationalAttributeEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeEClass, Attribute.class, "Attribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(attributeEClass, ecorePackage.getEString(), "getDescription", 1, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(attributeEClass, ecorePackage.getEBoolean(), "sameAs", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAttribute(), "attr", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fcaElementEClass, FcaElement.class, "FcaElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryAttributeEClass, BinaryAttribute.class, "BinaryAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valuedAttributeEClass, ValuedAttribute.class, "ValuedAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValuedAttribute_Value(), ecorePackage.getEString(), "value", null, 1, 1, ValuedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeAttributeEClass, CompositeAttribute.class, "CompositeAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeAttribute_Attributes(), this.getValuedAttribute(), null, "attributes", null, 0, -1, CompositeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(compositeAttributeEClass, ecorePackage.getEBoolean(), "isCompatibleWith", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompositeAttribute(), "composite", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(compositeAttributeEClass, ecorePackage.getEBoolean(), "isCoherent", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(compositeAttributeEClass, ecorePackage.getEInt(), "size", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(relationalAttributeEClass, RelationalAttribute.class, "RelationalAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalAttribute_Value(), theClfPackage.getConcept(), null, "value", null, 0, 1, RelationalAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationalAttribute_ScalingOperator(), ecorePackage.getEString(), "scalingOperator", null, 0, 1, RelationalAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ErcaPackageImpl
