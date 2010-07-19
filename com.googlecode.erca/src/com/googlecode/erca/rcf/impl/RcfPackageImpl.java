/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.googlecode.erca.rcf.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import com.googlecode.erca.ErcaPackage;
import com.googlecode.erca.clf.ClfPackage;
import com.googlecode.erca.clf.impl.ClfPackageImpl;
import com.googlecode.erca.impl.ErcaPackageImpl;
import com.googlecode.erca.rcf.BinaryContext;
import com.googlecode.erca.rcf.FormalContext;
import com.googlecode.erca.rcf.Pair;
import com.googlecode.erca.rcf.RcfFactory;
import com.googlecode.erca.rcf.RcfPackage;
import com.googlecode.erca.rcf.RelationalContext;
import com.googlecode.erca.rcf.RelationalContextFamily;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RcfPackageImpl extends EPackageImpl implements RcfPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formalContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalContextFamilyEClass = null;

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
	 * @see com.googlecode.erca.rcf.RcfPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RcfPackageImpl() {
		super(eNS_URI, RcfFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RcfPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RcfPackage init() {
		if (isInited) return (RcfPackage)EPackage.Registry.INSTANCE.getEPackage(RcfPackage.eNS_URI);

		// Obtain or create and register package
		RcfPackageImpl theRcfPackage = (RcfPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RcfPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RcfPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ErcaPackageImpl theErcaPackage = (ErcaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ErcaPackage.eNS_URI) instanceof ErcaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ErcaPackage.eNS_URI) : ErcaPackage.eINSTANCE);
		ClfPackageImpl theClfPackage = (ClfPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClfPackage.eNS_URI) instanceof ClfPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClfPackage.eNS_URI) : ClfPackage.eINSTANCE);

		// Create package meta-data objects
		theRcfPackage.createPackageContents();
		theErcaPackage.createPackageContents();
		theClfPackage.createPackageContents();

		// Initialize created meta-data
		theRcfPackage.initializePackageContents();
		theErcaPackage.initializePackageContents();
		theClfPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRcfPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RcfPackage.eNS_URI, theRcfPackage);
		return theRcfPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPair() {
		return pairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPair_Target() {
		return (EReference)pairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPair_Source() {
		return (EReference)pairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryContext() {
		return binaryContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryContext_Relation() {
		return (EReference)binaryContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationalContext() {
		return relationalContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationalContext_TargetEntities() {
		return (EReference)relationalContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationalContext_SourceEntities() {
		return (EReference)relationalContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationalContext_TargetContext() {
		return (EReference)relationalContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationalContext_SourceContext() {
		return (EReference)relationalContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationalContext_ScalingOperator() {
		return (EAttribute)relationalContextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormalContext() {
		return formalContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormalContext_Attributes() {
		return (EReference)formalContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormalContext_Entities() {
		return (EReference)formalContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationalContextFamily() {
		return relationalContextFamilyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationalContextFamily_RelationalContexts() {
		return (EReference)relationalContextFamilyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationalContextFamily_FormalContexts() {
		return (EReference)relationalContextFamilyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RcfFactory getRcfFactory() {
		return (RcfFactory)getEFactoryInstance();
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
		pairEClass = createEClass(PAIR);
		createEReference(pairEClass, PAIR__TARGET);
		createEReference(pairEClass, PAIR__SOURCE);

		binaryContextEClass = createEClass(BINARY_CONTEXT);
		createEReference(binaryContextEClass, BINARY_CONTEXT__RELATION);

		relationalContextEClass = createEClass(RELATIONAL_CONTEXT);
		createEReference(relationalContextEClass, RELATIONAL_CONTEXT__TARGET_ENTITIES);
		createEReference(relationalContextEClass, RELATIONAL_CONTEXT__SOURCE_ENTITIES);
		createEReference(relationalContextEClass, RELATIONAL_CONTEXT__TARGET_CONTEXT);
		createEReference(relationalContextEClass, RELATIONAL_CONTEXT__SOURCE_CONTEXT);
		createEAttribute(relationalContextEClass, RELATIONAL_CONTEXT__SCALING_OPERATOR);

		formalContextEClass = createEClass(FORMAL_CONTEXT);
		createEReference(formalContextEClass, FORMAL_CONTEXT__ATTRIBUTES);
		createEReference(formalContextEClass, FORMAL_CONTEXT__ENTITIES);

		relationalContextFamilyEClass = createEClass(RELATIONAL_CONTEXT_FAMILY);
		createEReference(relationalContextFamilyEClass, RELATIONAL_CONTEXT_FAMILY__RELATIONAL_CONTEXTS);
		createEReference(relationalContextFamilyEClass, RELATIONAL_CONTEXT_FAMILY__FORMAL_CONTEXTS);
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
		ErcaPackage theErcaPackage = (ErcaPackage)EPackage.Registry.INSTANCE.getEPackage(ErcaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		binaryContextEClass.getESuperTypes().add(theErcaPackage.getNamedElement());
		relationalContextEClass.getESuperTypes().add(this.getBinaryContext());
		formalContextEClass.getESuperTypes().add(this.getBinaryContext());

		// Initialize classes and features; add operations and parameters
		initEClass(pairEClass, Pair.class, "Pair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPair_Target(), theErcaPackage.getFcaElement(), null, "target", null, 1, 1, Pair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPair_Source(), theErcaPackage.getFcaElement(), null, "source", null, 1, 1, Pair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryContextEClass, BinaryContext.class, "BinaryContext", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryContext_Relation(), this.getPair(), null, "relation", null, 0, -1, BinaryContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(binaryContextEClass, theErcaPackage.getFcaElement(), "getTargetElements", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theErcaPackage.getFcaElement(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(binaryContextEClass, theErcaPackage.getFcaElement(), "getSourceElements", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theErcaPackage.getFcaElement(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(binaryContextEClass, ecorePackage.getEBoolean(), "hasPair", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theErcaPackage.getFcaElement(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theErcaPackage.getFcaElement(), "target", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(binaryContextEClass, null, "addPair", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theErcaPackage.getFcaElement(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theErcaPackage.getFcaElement(), "target", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(binaryContextEClass, null, "removePair", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theErcaPackage.getFcaElement(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theErcaPackage.getFcaElement(), "target", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(relationalContextEClass, RelationalContext.class, "RelationalContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalContext_TargetEntities(), theErcaPackage.getEntity(), null, "targetEntities", null, 0, -1, RelationalContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalContext_SourceEntities(), theErcaPackage.getEntity(), null, "sourceEntities", null, 0, -1, RelationalContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalContext_TargetContext(), this.getFormalContext(), null, "targetContext", null, 1, 1, RelationalContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalContext_SourceContext(), this.getFormalContext(), null, "sourceContext", null, 1, 1, RelationalContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationalContext_ScalingOperator(), ecorePackage.getEString(), "scalingOperator", "com.googlecode.erca.framework.algo.scaling.Wide", 1, 1, RelationalContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(relationalContextEClass, theErcaPackage.getEntity(), "getTargetEntities", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theErcaPackage.getEntity(), "entity", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(relationalContextEClass, theErcaPackage.getEntity(), "getSourcesEntities", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theErcaPackage.getEntity(), "entity", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(relationalContextEClass, theErcaPackage.getEntity(), "getTargetEntity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(formalContextEClass, FormalContext.class, "FormalContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFormalContext_Attributes(), theErcaPackage.getAttribute(), null, "attributes", null, 0, -1, FormalContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormalContext_Entities(), theErcaPackage.getEntity(), null, "entities", null, 0, -1, FormalContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(formalContextEClass, theErcaPackage.getEntity(), "getSourceEntities", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theErcaPackage.getAttribute(), "attribute", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(formalContextEClass, theErcaPackage.getAttribute(), "getTargetAttributes", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theErcaPackage.getEntity(), "entity", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(formalContextEClass, theErcaPackage.getEntity(), "getEntity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(formalContextEClass, theErcaPackage.getAttribute(), "getAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theErcaPackage.getAttribute(), "attr", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(formalContextEClass, ecorePackage.getEBoolean(), "hasValuedAttributes", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(relationalContextFamilyEClass, RelationalContextFamily.class, "RelationalContextFamily", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalContextFamily_RelationalContexts(), this.getRelationalContext(), null, "relationalContexts", null, 0, -1, RelationalContextFamily.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRelationalContextFamily_FormalContexts(), this.getFormalContext(), null, "formalContexts", null, 0, -1, RelationalContextFamily.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(relationalContextFamilyEClass, this.getRelationalContext(), "getRelationalContext", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(relationalContextFamilyEClass, this.getFormalContext(), "getFormalContext", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(relationalContextFamilyEClass, this.getRelationalContext(), "getRelationalContexts", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFormalContext(), "formalContext", 1, 1, IS_UNIQUE, IS_ORDERED);
	}

} //RcfPackageImpl
