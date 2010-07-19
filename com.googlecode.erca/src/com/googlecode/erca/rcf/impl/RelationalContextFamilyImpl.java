/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.googlecode.erca.rcf.impl;


import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.googlecode.erca.rcf.FormalContext;
import com.googlecode.erca.rcf.RcfPackage;
import com.googlecode.erca.rcf.RelationalContext;
import com.googlecode.erca.rcf.RelationalContextFamily;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relational Context Family</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.googlecode.erca.rcf.impl.RelationalContextFamilyImpl#getRelationalContexts <em>Relational Contexts</em>}</li>
 *   <li>{@link com.googlecode.erca.rcf.impl.RelationalContextFamilyImpl#getFormalContexts <em>Formal Contexts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationalContextFamilyImpl extends EObjectImpl implements RelationalContextFamily {
	/**
	 * The cached value of the '{@link #getRelationalContexts() <em>Relational Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationalContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalContext> relationalContexts;

	/**
	 * The cached value of the '{@link #getFormalContexts() <em>Formal Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<FormalContext> formalContexts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalContextFamilyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RcfPackage.Literals.RELATIONAL_CONTEXT_FAMILY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationalContext> getRelationalContexts() {
		if (relationalContexts == null) {
			relationalContexts = new EObjectContainmentEList<RelationalContext>(RelationalContext.class, this, RcfPackage.RELATIONAL_CONTEXT_FAMILY__RELATIONAL_CONTEXTS);
		}
		return relationalContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormalContext> getFormalContexts() {
		if (formalContexts == null) {
			formalContexts = new EObjectContainmentEList<FormalContext>(FormalContext.class, this, RcfPackage.RELATIONAL_CONTEXT_FAMILY__FORMAL_CONTEXTS);
		}
		return formalContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RelationalContext getRelationalContext(String name) {
		for(RelationalContext relation: this.getRelationalContexts() )
			if ( relation.getName().equals(name) )
				return relation;

		return null;
	}

	/**
	 * Returns the EntityAttributeContext with the given name.
	 * @generated NOT
	 */
	public FormalContext getFormalContext(String name) {
		for(FormalContext context: this.getFormalContexts() )
			if ( context.getName().equals(name) )
				return context;

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<RelationalContext> getRelationalContexts(FormalContext formalContext) {
		EList<RelationalContext> relationalContexts = new BasicEList<RelationalContext>();
		for(RelationalContext relationalContext: getRelationalContexts())
			if ( relationalContext.getSourceContext() == formalContext )
				relationalContexts.add(relationalContext);
		
		return relationalContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RcfPackage.RELATIONAL_CONTEXT_FAMILY__RELATIONAL_CONTEXTS:
				return ((InternalEList<?>)getRelationalContexts()).basicRemove(otherEnd, msgs);
			case RcfPackage.RELATIONAL_CONTEXT_FAMILY__FORMAL_CONTEXTS:
				return ((InternalEList<?>)getFormalContexts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RcfPackage.RELATIONAL_CONTEXT_FAMILY__RELATIONAL_CONTEXTS:
				return getRelationalContexts();
			case RcfPackage.RELATIONAL_CONTEXT_FAMILY__FORMAL_CONTEXTS:
				return getFormalContexts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RcfPackage.RELATIONAL_CONTEXT_FAMILY__RELATIONAL_CONTEXTS:
				getRelationalContexts().clear();
				getRelationalContexts().addAll((Collection<? extends RelationalContext>)newValue);
				return;
			case RcfPackage.RELATIONAL_CONTEXT_FAMILY__FORMAL_CONTEXTS:
				getFormalContexts().clear();
				getFormalContexts().addAll((Collection<? extends FormalContext>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RcfPackage.RELATIONAL_CONTEXT_FAMILY__RELATIONAL_CONTEXTS:
				getRelationalContexts().clear();
				return;
			case RcfPackage.RELATIONAL_CONTEXT_FAMILY__FORMAL_CONTEXTS:
				getFormalContexts().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RcfPackage.RELATIONAL_CONTEXT_FAMILY__RELATIONAL_CONTEXTS:
				return relationalContexts != null && !relationalContexts.isEmpty();
			case RcfPackage.RELATIONAL_CONTEXT_FAMILY__FORMAL_CONTEXTS:
				return formalContexts != null && !formalContexts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RelationalContextFamilyImpl
