/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.googlecode.erca.clf.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import com.googlecode.erca.ErcaPackage;
import com.googlecode.erca.clf.ClfFactory;
import com.googlecode.erca.clf.ClfPackage;
import com.googlecode.erca.clf.Concept;
import com.googlecode.erca.clf.ConceptLattice;
import com.googlecode.erca.clf.ConceptLatticeFamily;
import com.googlecode.erca.impl.ErcaPackageImpl;
import com.googlecode.erca.rcf.RcfPackage;
import com.googlecode.erca.rcf.impl.RcfPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClfPackageImpl extends EPackageImpl implements ClfPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptLatticeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptLatticeFamilyEClass = null;

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
	 * @see com.googlecode.erca.clf.ClfPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ClfPackageImpl() {
		super(eNS_URI, ClfFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ClfPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ClfPackage init() {
		if (isInited) return (ClfPackage)EPackage.Registry.INSTANCE.getEPackage(ClfPackage.eNS_URI);

		// Obtain or create and register package
		ClfPackageImpl theClfPackage = (ClfPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ClfPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ClfPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ErcaPackageImpl theErcaPackage = (ErcaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ErcaPackage.eNS_URI) instanceof ErcaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ErcaPackage.eNS_URI) : ErcaPackage.eINSTANCE);
		RcfPackageImpl theRcfPackage = (RcfPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RcfPackage.eNS_URI) instanceof RcfPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RcfPackage.eNS_URI) : RcfPackage.eINSTANCE);

		// Create package meta-data objects
		theClfPackage.createPackageContents();
		theErcaPackage.createPackageContents();
		theRcfPackage.createPackageContents();

		// Initialize created meta-data
		theClfPackage.initializePackageContents();
		theErcaPackage.initializePackageContents();
		theRcfPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theClfPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ClfPackage.eNS_URI, theClfPackage);
		return theClfPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcept() {
		return conceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcept_Lattice() {
		return (EReference)conceptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcept_Children() {
		return (EReference)conceptEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcept_Extent() {
		return (EReference)conceptEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcept_Intent() {
		return (EReference)conceptEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcept_CreationStep() {
		return (EAttribute)conceptEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptLattice() {
		return conceptLatticeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptLattice_Attributes() {
		return (EReference)conceptLatticeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptLattice_Top() {
		return (EReference)conceptLatticeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptLattice_Concepts() {
		return (EReference)conceptLatticeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptLatticeFamily() {
		return conceptLatticeFamilyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptLatticeFamily_ConceptLattices() {
		return (EReference)conceptLatticeFamilyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConceptLatticeFamily_StepNumber() {
		return (EAttribute)conceptLatticeFamilyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClfFactory getClfFactory() {
		return (ClfFactory)getEFactoryInstance();
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
		conceptEClass = createEClass(CONCEPT);
		createEReference(conceptEClass, CONCEPT__LATTICE);
		createEReference(conceptEClass, CONCEPT__CHILDREN);
		createEReference(conceptEClass, CONCEPT__EXTENT);
		createEReference(conceptEClass, CONCEPT__INTENT);
		createEAttribute(conceptEClass, CONCEPT__CREATION_STEP);

		conceptLatticeEClass = createEClass(CONCEPT_LATTICE);
		createEReference(conceptLatticeEClass, CONCEPT_LATTICE__ATTRIBUTES);
		createEReference(conceptLatticeEClass, CONCEPT_LATTICE__TOP);
		createEReference(conceptLatticeEClass, CONCEPT_LATTICE__CONCEPTS);

		conceptLatticeFamilyEClass = createEClass(CONCEPT_LATTICE_FAMILY);
		createEReference(conceptLatticeFamilyEClass, CONCEPT_LATTICE_FAMILY__CONCEPT_LATTICES);
		createEAttribute(conceptLatticeFamilyEClass, CONCEPT_LATTICE_FAMILY__STEP_NUMBER);
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
		conceptEClass.getESuperTypes().add(theErcaPackage.getNamedElement());
		conceptLatticeEClass.getESuperTypes().add(theErcaPackage.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(conceptEClass, Concept.class, "Concept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcept_Lattice(), this.getConceptLattice(), this.getConceptLattice_Concepts(), "lattice", null, 1, 1, Concept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcept_Children(), this.getConcept(), null, "children", null, 0, -1, Concept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConcept_Extent(), theErcaPackage.getEntity(), null, "extent", null, 0, -1, Concept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConcept_Intent(), theErcaPackage.getAttribute(), null, "intent", null, 0, -1, Concept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConcept_CreationStep(), ecorePackage.getEInt(), "creationStep", null, 0, 1, Concept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(conceptEClass, theErcaPackage.getEntity(), "getSimplifiedExtent", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(conceptEClass, this.getConcept(), "getAllParents", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(conceptEClass, theErcaPackage.getAttribute(), "getSimplifiedIntent", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(conceptEClass, this.getConcept(), "getParents", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(conceptEClass, this.getConcept(), "getAllChildren", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(conceptEClass, ecorePackage.getEBoolean(), "isFusion", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(conceptEClass, ecorePackage.getEBoolean(), "isNewConcept", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(conceptEClass, ecorePackage.getEBoolean(), "isDummy", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(conceptLatticeEClass, ConceptLattice.class, "ConceptLattice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConceptLattice_Attributes(), theErcaPackage.getAttribute(), null, "attributes", null, 0, -1, ConceptLattice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConceptLattice_Top(), this.getConcept(), null, "top", null, 1, 1, ConceptLattice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConceptLattice_Concepts(), this.getConcept(), this.getConcept_Lattice(), "concepts", null, 0, -1, ConceptLattice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = addEOperation(conceptLatticeEClass, null, "deleteAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theErcaPackage.getAttribute(), "attribute", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(conceptLatticeEClass, theErcaPackage.getAttribute(), "getAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theErcaPackage.getAttribute(), "attr", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(conceptLatticeEClass, this.getConcept(), "getConcept", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(conceptLatticeEClass, ecorePackage.getEInt(), "getMaxDepth", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(conceptLatticeEClass, this.getConcept(), "getEmptyConcepts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(conceptLatticeEClass, this.getConcept(), "getNewConcepts", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(conceptLatticeFamilyEClass, ConceptLatticeFamily.class, "ConceptLatticeFamily", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConceptLatticeFamily_ConceptLattices(), this.getConceptLattice(), null, "conceptLattices", null, 0, -1, ConceptLatticeFamily.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConceptLatticeFamily_StepNumber(), ecorePackage.getEInt(), "stepNumber", null, 0, 1, ConceptLatticeFamily.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(conceptLatticeFamilyEClass, this.getConceptLattice(), "getConceptLattice", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
	}

} //ClfPackageImpl
