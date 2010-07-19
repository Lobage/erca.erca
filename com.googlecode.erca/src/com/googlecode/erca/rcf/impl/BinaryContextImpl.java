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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import com.googlecode.erca.FcaElement;
import com.googlecode.erca.impl.NamedElementImpl;
import com.googlecode.erca.rcf.BinaryContext;
import com.googlecode.erca.rcf.Pair;
import com.googlecode.erca.rcf.RcfPackage;
import com.googlecode.erca.rcf.impl.PairImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.googlecode.erca.rcf.impl.BinaryContextImpl#getRelation <em>Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BinaryContextImpl extends NamedElementImpl implements BinaryContext {
	/**
	 * The cached value of the '{@link #getRelation() <em>Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<Pair> relation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RcfPackage.Literals.BINARY_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pair> getRelation() {
		if (relation == null) {
			relation = new EObjectContainmentEList<Pair>(Pair.class, this, RcfPackage.BINARY_CONTEXT__RELATION);
		}
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<FcaElement> getTargetElements(FcaElement element) {
		EList<FcaElement> elements = new BasicEList<FcaElement>();
		for(Pair p: this.getRelation() )
			if (EcoreUtil.equals(p.getSource(),element) )
				elements.add(p.getTarget());
		
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<FcaElement> getSourceElements(FcaElement element) {
		EList<FcaElement> elements = new BasicEList<FcaElement>();
		for(Pair p: this.getRelation() )
			if ( EcoreUtil.equals(p.getTarget(), element) )
				elements.add(p.getSource());
		
		return elements;
	}

	/**
	 * Returns true if a pair exist between the two elements, false  either.
	 * @generated NOT
	 */
	public boolean hasPair(FcaElement source, FcaElement target) {
		for(Pair pair: this.getRelation() )
			if ( pair.getSource() == source && pair.getTarget() == target ) 
				return true;
				
		return false;
	}

	/**
	 * Adds a pair  in the relation between the two given elements.
	 * @generated NOT
	 */
	public void addPair(FcaElement source, FcaElement target) {
		Pair p = new PairImpl();
		p.setSource(source);
		p.setTarget(target);
		this.getRelation().add(p);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removePair(FcaElement source, FcaElement target) {
		Pair toRemove = null;
		for(Pair p: this.getRelation() )
			if ( p.getSource() == source && p.getTarget() == target )
				toRemove = p;
		
		if ( toRemove != null ) {
			this.getRelation().remove(toRemove);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RcfPackage.BINARY_CONTEXT__RELATION:
				return ((InternalEList<?>)getRelation()).basicRemove(otherEnd, msgs);
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
			case RcfPackage.BINARY_CONTEXT__RELATION:
				return getRelation();
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
			case RcfPackage.BINARY_CONTEXT__RELATION:
				getRelation().clear();
				getRelation().addAll((Collection<? extends Pair>)newValue);
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
			case RcfPackage.BINARY_CONTEXT__RELATION:
				getRelation().clear();
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
			case RcfPackage.BINARY_CONTEXT__RELATION:
				return relation != null && !relation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BinaryContextImpl
