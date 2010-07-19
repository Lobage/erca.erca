/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.googlecode.erca.rcf.util;



import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import com.googlecode.erca.NamedElement;
import com.googlecode.erca.rcf.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.googlecode.erca.rcf.RcfPackage
 * @generated
 */
public class RcfAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RcfPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RcfAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RcfPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RcfSwitch<Adapter> modelSwitch =
		new RcfSwitch<Adapter>() {
			@Override
			public Adapter casePair(Pair object) {
				return createPairAdapter();
			}
			@Override
			public Adapter caseBinaryContext(BinaryContext object) {
				return createBinaryContextAdapter();
			}
			@Override
			public Adapter caseRelationalContext(RelationalContext object) {
				return createRelationalContextAdapter();
			}
			@Override
			public Adapter caseFormalContext(FormalContext object) {
				return createFormalContextAdapter();
			}
			@Override
			public Adapter caseRelationalContextFamily(RelationalContextFamily object) {
				return createRelationalContextFamilyAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.googlecode.erca.rcf.Pair <em>Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.googlecode.erca.rcf.Pair
	 * @generated
	 */
	public Adapter createPairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.googlecode.erca.rcf.BinaryContext <em>Binary Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.googlecode.erca.rcf.BinaryContext
	 * @generated
	 */
	public Adapter createBinaryContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.googlecode.erca.rcf.RelationalContext <em>Relational Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.googlecode.erca.rcf.RelationalContext
	 * @generated
	 */
	public Adapter createRelationalContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.googlecode.erca.rcf.FormalContext <em>Formal Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.googlecode.erca.rcf.FormalContext
	 * @generated
	 */
	public Adapter createFormalContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.googlecode.erca.rcf.RelationalContextFamily <em>Relational Context Family</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.googlecode.erca.rcf.RelationalContextFamily
	 * @generated
	 */
	public Adapter createRelationalContextFamilyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.googlecode.erca.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.googlecode.erca.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RcfAdapterFactory
