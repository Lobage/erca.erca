/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.googlecode.erca.clf;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import com.googlecode.erca.ErcaPackage;

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
 * @see com.googlecode.erca.clf.ClfFactory
 * @model kind="package"
 * @generated
 */
public interface ClfPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "clf";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://code.google.com/erca/erca.ecore/1.5.0#//clf";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "clf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClfPackage eINSTANCE = com.googlecode.erca.clf.impl.ClfPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.googlecode.erca.clf.impl.ConceptImpl <em>Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.googlecode.erca.clf.impl.ConceptImpl
	 * @see com.googlecode.erca.clf.impl.ClfPackageImpl#getConcept()
	 * @generated
	 */
	int CONCEPT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__NAME = ErcaPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Lattice</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__LATTICE = ErcaPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__CHILDREN = ErcaPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__EXTENT = ErcaPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Intent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__INTENT = ErcaPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Creation Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__CREATION_STEP = ErcaPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_FEATURE_COUNT = ErcaPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link com.googlecode.erca.clf.impl.ConceptLatticeImpl <em>Concept Lattice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.googlecode.erca.clf.impl.ConceptLatticeImpl
	 * @see com.googlecode.erca.clf.impl.ClfPackageImpl#getConceptLattice()
	 * @generated
	 */
	int CONCEPT_LATTICE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_LATTICE__NAME = ErcaPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_LATTICE__ATTRIBUTES = ErcaPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Top</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_LATTICE__TOP = ErcaPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Concepts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_LATTICE__CONCEPTS = ErcaPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Concept Lattice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_LATTICE_FEATURE_COUNT = ErcaPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.googlecode.erca.clf.impl.ConceptLatticeFamilyImpl <em>Concept Lattice Family</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.googlecode.erca.clf.impl.ConceptLatticeFamilyImpl
	 * @see com.googlecode.erca.clf.impl.ClfPackageImpl#getConceptLatticeFamily()
	 * @generated
	 */
	int CONCEPT_LATTICE_FAMILY = 2;

	/**
	 * The feature id for the '<em><b>Concept Lattices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_LATTICE_FAMILY__CONCEPT_LATTICES = 0;

	/**
	 * The feature id for the '<em><b>Step Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_LATTICE_FAMILY__STEP_NUMBER = 1;

	/**
	 * The number of structural features of the '<em>Concept Lattice Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_LATTICE_FAMILY_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link com.googlecode.erca.clf.Concept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept</em>'.
	 * @see com.googlecode.erca.clf.Concept
	 * @generated
	 */
	EClass getConcept();

	/**
	 * Returns the meta object for the container reference '{@link com.googlecode.erca.clf.Concept#getLattice <em>Lattice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Lattice</em>'.
	 * @see com.googlecode.erca.clf.Concept#getLattice()
	 * @see #getConcept()
	 * @generated
	 */
	EReference getConcept_Lattice();

	/**
	 * Returns the meta object for the reference list '{@link com.googlecode.erca.clf.Concept#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see com.googlecode.erca.clf.Concept#getChildren()
	 * @see #getConcept()
	 * @generated
	 */
	EReference getConcept_Children();

	/**
	 * Returns the meta object for the reference list '{@link com.googlecode.erca.clf.Concept#getExtent <em>Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extent</em>'.
	 * @see com.googlecode.erca.clf.Concept#getExtent()
	 * @see #getConcept()
	 * @generated
	 */
	EReference getConcept_Extent();

	/**
	 * Returns the meta object for the reference list '{@link com.googlecode.erca.clf.Concept#getIntent <em>Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Intent</em>'.
	 * @see com.googlecode.erca.clf.Concept#getIntent()
	 * @see #getConcept()
	 * @generated
	 */
	EReference getConcept_Intent();

	/**
	 * Returns the meta object for the attribute '{@link com.googlecode.erca.clf.Concept#getCreationStep <em>Creation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Step</em>'.
	 * @see com.googlecode.erca.clf.Concept#getCreationStep()
	 * @see #getConcept()
	 * @generated
	 */
	EAttribute getConcept_CreationStep();

	/**
	 * Returns the meta object for class '{@link com.googlecode.erca.clf.ConceptLattice <em>Concept Lattice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept Lattice</em>'.
	 * @see com.googlecode.erca.clf.ConceptLattice
	 * @generated
	 */
	EClass getConceptLattice();

	/**
	 * Returns the meta object for the containment reference list '{@link com.googlecode.erca.clf.ConceptLattice#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see com.googlecode.erca.clf.ConceptLattice#getAttributes()
	 * @see #getConceptLattice()
	 * @generated
	 */
	EReference getConceptLattice_Attributes();

	/**
	 * Returns the meta object for the reference '{@link com.googlecode.erca.clf.ConceptLattice#getTop <em>Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Top</em>'.
	 * @see com.googlecode.erca.clf.ConceptLattice#getTop()
	 * @see #getConceptLattice()
	 * @generated
	 */
	EReference getConceptLattice_Top();

	/**
	 * Returns the meta object for the containment reference list '{@link com.googlecode.erca.clf.ConceptLattice#getConcepts <em>Concepts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concepts</em>'.
	 * @see com.googlecode.erca.clf.ConceptLattice#getConcepts()
	 * @see #getConceptLattice()
	 * @generated
	 */
	EReference getConceptLattice_Concepts();

	/**
	 * Returns the meta object for class '{@link com.googlecode.erca.clf.ConceptLatticeFamily <em>Concept Lattice Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept Lattice Family</em>'.
	 * @see com.googlecode.erca.clf.ConceptLatticeFamily
	 * @generated
	 */
	EClass getConceptLatticeFamily();

	/**
	 * Returns the meta object for the containment reference list '{@link com.googlecode.erca.clf.ConceptLatticeFamily#getConceptLattices <em>Concept Lattices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concept Lattices</em>'.
	 * @see com.googlecode.erca.clf.ConceptLatticeFamily#getConceptLattices()
	 * @see #getConceptLatticeFamily()
	 * @generated
	 */
	EReference getConceptLatticeFamily_ConceptLattices();

	/**
	 * Returns the meta object for the attribute '{@link com.googlecode.erca.clf.ConceptLatticeFamily#getStepNumber <em>Step Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Number</em>'.
	 * @see com.googlecode.erca.clf.ConceptLatticeFamily#getStepNumber()
	 * @see #getConceptLatticeFamily()
	 * @generated
	 */
	EAttribute getConceptLatticeFamily_StepNumber();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ClfFactory getClfFactory();

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
		 * The meta object literal for the '{@link com.googlecode.erca.clf.impl.ConceptImpl <em>Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.googlecode.erca.clf.impl.ConceptImpl
		 * @see com.googlecode.erca.clf.impl.ClfPackageImpl#getConcept()
		 * @generated
		 */
		EClass CONCEPT = eINSTANCE.getConcept();

		/**
		 * The meta object literal for the '<em><b>Lattice</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT__LATTICE = eINSTANCE.getConcept_Lattice();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT__CHILDREN = eINSTANCE.getConcept_Children();

		/**
		 * The meta object literal for the '<em><b>Extent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT__EXTENT = eINSTANCE.getConcept_Extent();

		/**
		 * The meta object literal for the '<em><b>Intent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT__INTENT = eINSTANCE.getConcept_Intent();

		/**
		 * The meta object literal for the '<em><b>Creation Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCEPT__CREATION_STEP = eINSTANCE.getConcept_CreationStep();

		/**
		 * The meta object literal for the '{@link com.googlecode.erca.clf.impl.ConceptLatticeImpl <em>Concept Lattice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.googlecode.erca.clf.impl.ConceptLatticeImpl
		 * @see com.googlecode.erca.clf.impl.ClfPackageImpl#getConceptLattice()
		 * @generated
		 */
		EClass CONCEPT_LATTICE = eINSTANCE.getConceptLattice();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT_LATTICE__ATTRIBUTES = eINSTANCE.getConceptLattice_Attributes();

		/**
		 * The meta object literal for the '<em><b>Top</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT_LATTICE__TOP = eINSTANCE.getConceptLattice_Top();

		/**
		 * The meta object literal for the '<em><b>Concepts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT_LATTICE__CONCEPTS = eINSTANCE.getConceptLattice_Concepts();

		/**
		 * The meta object literal for the '{@link com.googlecode.erca.clf.impl.ConceptLatticeFamilyImpl <em>Concept Lattice Family</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.googlecode.erca.clf.impl.ConceptLatticeFamilyImpl
		 * @see com.googlecode.erca.clf.impl.ClfPackageImpl#getConceptLatticeFamily()
		 * @generated
		 */
		EClass CONCEPT_LATTICE_FAMILY = eINSTANCE.getConceptLatticeFamily();

		/**
		 * The meta object literal for the '<em><b>Concept Lattices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT_LATTICE_FAMILY__CONCEPT_LATTICES = eINSTANCE.getConceptLatticeFamily_ConceptLattices();

		/**
		 * The meta object literal for the '<em><b>Step Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCEPT_LATTICE_FAMILY__STEP_NUMBER = eINSTANCE.getConceptLatticeFamily_StepNumber();

	}

} //ClfPackage
