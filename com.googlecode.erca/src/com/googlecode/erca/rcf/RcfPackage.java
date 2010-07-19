/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.googlecode.erca.rcf;


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
 * @see com.googlecode.erca.rcf.RcfFactory
 * @model kind="package"
 * @generated
 */
public interface RcfPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rcf";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://code.google.com/erca/erca.ecore/1.5.0#//rcf";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rcf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RcfPackage eINSTANCE = com.googlecode.erca.rcf.impl.RcfPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.googlecode.erca.rcf.impl.PairImpl <em>Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.googlecode.erca.rcf.impl.PairImpl
	 * @see com.googlecode.erca.rcf.impl.RcfPackageImpl#getPair()
	 * @generated
	 */
	int PAIR = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR__SOURCE = 1;

	/**
	 * The number of structural features of the '<em>Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.googlecode.erca.rcf.impl.BinaryContextImpl <em>Binary Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.googlecode.erca.rcf.impl.BinaryContextImpl
	 * @see com.googlecode.erca.rcf.impl.RcfPackageImpl#getBinaryContext()
	 * @generated
	 */
	int BINARY_CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONTEXT__NAME = ErcaPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONTEXT__RELATION = ErcaPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Binary Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONTEXT_FEATURE_COUNT = ErcaPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.googlecode.erca.rcf.impl.RelationalContextImpl <em>Relational Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.googlecode.erca.rcf.impl.RelationalContextImpl
	 * @see com.googlecode.erca.rcf.impl.RcfPackageImpl#getRelationalContext()
	 * @generated
	 */
	int RELATIONAL_CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONTEXT__NAME = BINARY_CONTEXT__NAME;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONTEXT__RELATION = BINARY_CONTEXT__RELATION;

	/**
	 * The feature id for the '<em><b>Target Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONTEXT__TARGET_ENTITIES = BINARY_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONTEXT__SOURCE_ENTITIES = BINARY_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONTEXT__TARGET_CONTEXT = BINARY_CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONTEXT__SOURCE_CONTEXT = BINARY_CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Scaling Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONTEXT__SCALING_OPERATOR = BINARY_CONTEXT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Relational Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONTEXT_FEATURE_COUNT = BINARY_CONTEXT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link com.googlecode.erca.rcf.impl.FormalContextImpl <em>Formal Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.googlecode.erca.rcf.impl.FormalContextImpl
	 * @see com.googlecode.erca.rcf.impl.RcfPackageImpl#getFormalContext()
	 * @generated
	 */
	int FORMAL_CONTEXT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_CONTEXT__NAME = BINARY_CONTEXT__NAME;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_CONTEXT__RELATION = BINARY_CONTEXT__RELATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_CONTEXT__ATTRIBUTES = BINARY_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_CONTEXT__ENTITIES = BINARY_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Formal Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_CONTEXT_FEATURE_COUNT = BINARY_CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.googlecode.erca.rcf.impl.RelationalContextFamilyImpl <em>Relational Context Family</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.googlecode.erca.rcf.impl.RelationalContextFamilyImpl
	 * @see com.googlecode.erca.rcf.impl.RcfPackageImpl#getRelationalContextFamily()
	 * @generated
	 */
	int RELATIONAL_CONTEXT_FAMILY = 4;

	/**
	 * The feature id for the '<em><b>Relational Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONTEXT_FAMILY__RELATIONAL_CONTEXTS = 0;

	/**
	 * The feature id for the '<em><b>Formal Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONTEXT_FAMILY__FORMAL_CONTEXTS = 1;

	/**
	 * The number of structural features of the '<em>Relational Context Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONTEXT_FAMILY_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link com.googlecode.erca.rcf.Pair <em>Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pair</em>'.
	 * @see com.googlecode.erca.rcf.Pair
	 * @generated
	 */
	EClass getPair();

	/**
	 * Returns the meta object for the reference '{@link com.googlecode.erca.rcf.Pair#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see com.googlecode.erca.rcf.Pair#getTarget()
	 * @see #getPair()
	 * @generated
	 */
	EReference getPair_Target();

	/**
	 * Returns the meta object for the reference '{@link com.googlecode.erca.rcf.Pair#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see com.googlecode.erca.rcf.Pair#getSource()
	 * @see #getPair()
	 * @generated
	 */
	EReference getPair_Source();

	/**
	 * Returns the meta object for class '{@link com.googlecode.erca.rcf.BinaryContext <em>Binary Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Context</em>'.
	 * @see com.googlecode.erca.rcf.BinaryContext
	 * @generated
	 */
	EClass getBinaryContext();

	/**
	 * Returns the meta object for the containment reference list '{@link com.googlecode.erca.rcf.BinaryContext#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relation</em>'.
	 * @see com.googlecode.erca.rcf.BinaryContext#getRelation()
	 * @see #getBinaryContext()
	 * @generated
	 */
	EReference getBinaryContext_Relation();

	/**
	 * Returns the meta object for class '{@link com.googlecode.erca.rcf.RelationalContext <em>Relational Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Context</em>'.
	 * @see com.googlecode.erca.rcf.RelationalContext
	 * @generated
	 */
	EClass getRelationalContext();

	/**
	 * Returns the meta object for the containment reference list '{@link com.googlecode.erca.rcf.RelationalContext#getTargetEntities <em>Target Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Entities</em>'.
	 * @see com.googlecode.erca.rcf.RelationalContext#getTargetEntities()
	 * @see #getRelationalContext()
	 * @generated
	 */
	EReference getRelationalContext_TargetEntities();

	/**
	 * Returns the meta object for the reference list '{@link com.googlecode.erca.rcf.RelationalContext#getSourceEntities <em>Source Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Entities</em>'.
	 * @see com.googlecode.erca.rcf.RelationalContext#getSourceEntities()
	 * @see #getRelationalContext()
	 * @generated
	 */
	EReference getRelationalContext_SourceEntities();

	/**
	 * Returns the meta object for the reference '{@link com.googlecode.erca.rcf.RelationalContext#getTargetContext <em>Target Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Context</em>'.
	 * @see com.googlecode.erca.rcf.RelationalContext#getTargetContext()
	 * @see #getRelationalContext()
	 * @generated
	 */
	EReference getRelationalContext_TargetContext();

	/**
	 * Returns the meta object for the reference '{@link com.googlecode.erca.rcf.RelationalContext#getSourceContext <em>Source Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Context</em>'.
	 * @see com.googlecode.erca.rcf.RelationalContext#getSourceContext()
	 * @see #getRelationalContext()
	 * @generated
	 */
	EReference getRelationalContext_SourceContext();

	/**
	 * Returns the meta object for the attribute '{@link com.googlecode.erca.rcf.RelationalContext#getScalingOperator <em>Scaling Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scaling Operator</em>'.
	 * @see com.googlecode.erca.rcf.RelationalContext#getScalingOperator()
	 * @see #getRelationalContext()
	 * @generated
	 */
	EAttribute getRelationalContext_ScalingOperator();

	/**
	 * Returns the meta object for class '{@link com.googlecode.erca.rcf.FormalContext <em>Formal Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formal Context</em>'.
	 * @see com.googlecode.erca.rcf.FormalContext
	 * @generated
	 */
	EClass getFormalContext();

	/**
	 * Returns the meta object for the containment reference list '{@link com.googlecode.erca.rcf.FormalContext#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see com.googlecode.erca.rcf.FormalContext#getAttributes()
	 * @see #getFormalContext()
	 * @generated
	 */
	EReference getFormalContext_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link com.googlecode.erca.rcf.FormalContext#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see com.googlecode.erca.rcf.FormalContext#getEntities()
	 * @see #getFormalContext()
	 * @generated
	 */
	EReference getFormalContext_Entities();

	/**
	 * Returns the meta object for class '{@link com.googlecode.erca.rcf.RelationalContextFamily <em>Relational Context Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Context Family</em>'.
	 * @see com.googlecode.erca.rcf.RelationalContextFamily
	 * @generated
	 */
	EClass getRelationalContextFamily();

	/**
	 * Returns the meta object for the containment reference list '{@link com.googlecode.erca.rcf.RelationalContextFamily#getRelationalContexts <em>Relational Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relational Contexts</em>'.
	 * @see com.googlecode.erca.rcf.RelationalContextFamily#getRelationalContexts()
	 * @see #getRelationalContextFamily()
	 * @generated
	 */
	EReference getRelationalContextFamily_RelationalContexts();

	/**
	 * Returns the meta object for the containment reference list '{@link com.googlecode.erca.rcf.RelationalContextFamily#getFormalContexts <em>Formal Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formal Contexts</em>'.
	 * @see com.googlecode.erca.rcf.RelationalContextFamily#getFormalContexts()
	 * @see #getRelationalContextFamily()
	 * @generated
	 */
	EReference getRelationalContextFamily_FormalContexts();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RcfFactory getRcfFactory();

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
		 * The meta object literal for the '{@link com.googlecode.erca.rcf.impl.PairImpl <em>Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.googlecode.erca.rcf.impl.PairImpl
		 * @see com.googlecode.erca.rcf.impl.RcfPackageImpl#getPair()
		 * @generated
		 */
		EClass PAIR = eINSTANCE.getPair();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAIR__TARGET = eINSTANCE.getPair_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAIR__SOURCE = eINSTANCE.getPair_Source();

		/**
		 * The meta object literal for the '{@link com.googlecode.erca.rcf.impl.BinaryContextImpl <em>Binary Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.googlecode.erca.rcf.impl.BinaryContextImpl
		 * @see com.googlecode.erca.rcf.impl.RcfPackageImpl#getBinaryContext()
		 * @generated
		 */
		EClass BINARY_CONTEXT = eINSTANCE.getBinaryContext();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_CONTEXT__RELATION = eINSTANCE.getBinaryContext_Relation();

		/**
		 * The meta object literal for the '{@link com.googlecode.erca.rcf.impl.RelationalContextImpl <em>Relational Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.googlecode.erca.rcf.impl.RelationalContextImpl
		 * @see com.googlecode.erca.rcf.impl.RcfPackageImpl#getRelationalContext()
		 * @generated
		 */
		EClass RELATIONAL_CONTEXT = eINSTANCE.getRelationalContext();

		/**
		 * The meta object literal for the '<em><b>Target Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_CONTEXT__TARGET_ENTITIES = eINSTANCE.getRelationalContext_TargetEntities();

		/**
		 * The meta object literal for the '<em><b>Source Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_CONTEXT__SOURCE_ENTITIES = eINSTANCE.getRelationalContext_SourceEntities();

		/**
		 * The meta object literal for the '<em><b>Target Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_CONTEXT__TARGET_CONTEXT = eINSTANCE.getRelationalContext_TargetContext();

		/**
		 * The meta object literal for the '<em><b>Source Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_CONTEXT__SOURCE_CONTEXT = eINSTANCE.getRelationalContext_SourceContext();

		/**
		 * The meta object literal for the '<em><b>Scaling Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONAL_CONTEXT__SCALING_OPERATOR = eINSTANCE.getRelationalContext_ScalingOperator();

		/**
		 * The meta object literal for the '{@link com.googlecode.erca.rcf.impl.FormalContextImpl <em>Formal Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.googlecode.erca.rcf.impl.FormalContextImpl
		 * @see com.googlecode.erca.rcf.impl.RcfPackageImpl#getFormalContext()
		 * @generated
		 */
		EClass FORMAL_CONTEXT = eINSTANCE.getFormalContext();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMAL_CONTEXT__ATTRIBUTES = eINSTANCE.getFormalContext_Attributes();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMAL_CONTEXT__ENTITIES = eINSTANCE.getFormalContext_Entities();

		/**
		 * The meta object literal for the '{@link com.googlecode.erca.rcf.impl.RelationalContextFamilyImpl <em>Relational Context Family</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.googlecode.erca.rcf.impl.RelationalContextFamilyImpl
		 * @see com.googlecode.erca.rcf.impl.RcfPackageImpl#getRelationalContextFamily()
		 * @generated
		 */
		EClass RELATIONAL_CONTEXT_FAMILY = eINSTANCE.getRelationalContextFamily();

		/**
		 * The meta object literal for the '<em><b>Relational Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_CONTEXT_FAMILY__RELATIONAL_CONTEXTS = eINSTANCE.getRelationalContextFamily_RelationalContexts();

		/**
		 * The meta object literal for the '<em><b>Formal Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_CONTEXT_FAMILY__FORMAL_CONTEXTS = eINSTANCE.getRelationalContextFamily_FormalContexts();

	}

} //RcfPackage
