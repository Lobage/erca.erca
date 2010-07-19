/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.googlecode.erca.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.googlecode.erca.Attribute;
import com.googlecode.erca.CompositeAttribute;
import com.googlecode.erca.ErcaPackage;
import com.googlecode.erca.ValuedAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.googlecode.erca.impl.CompositeAttributeImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeAttributeImpl extends AttributeImpl implements CompositeAttribute {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<ValuedAttribute> attributes;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErcaPackage.Literals.COMPOSITE_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValuedAttribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<ValuedAttribute>(ValuedAttribute.class, this, ErcaPackage.COMPOSITE_ATTRIBUTE__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isCompatibleWith(CompositeAttribute composite) {
		if ( this.getAttributes().size() != composite.getAttributes().size() )
			return false;

		for( int i = 0 ; i < this.getAttributes().size() ; i++ )
			if ( !this.getAttributes().get(i).getName().equals(composite.getAttributes().get(i).getName()) )
				return false;
		
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isCoherent() {
		for( ValuedAttribute v: this.getAttributes() )
			if ( v.getValue() == null )
				return false;
		
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int size() {
		return this.getAttributes().size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErcaPackage.COMPOSITE_ATTRIBUTE__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
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
			case ErcaPackage.COMPOSITE_ATTRIBUTE__ATTRIBUTES:
				return getAttributes();
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
			case ErcaPackage.COMPOSITE_ATTRIBUTE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends ValuedAttribute>)newValue);
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
			case ErcaPackage.COMPOSITE_ATTRIBUTE__ATTRIBUTES:
				getAttributes().clear();
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
			case ErcaPackage.COMPOSITE_ATTRIBUTE__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	/**
	 * Returns the description of the attribute.
	 * @generated NOT
	 */
	public String getDescription() {
		String s = "(";
		Iterator<ValuedAttribute> thisIt = this.getAttributes().iterator();
		while( thisIt.hasNext() ) {
			Attribute attr = thisIt.next();
			
			if ( thisIt.hasNext() )
				s += attr.getDescription() + ",";
			else
				s += attr.getDescription();
		}
			
		s += ")";
		
		return s;
	}
	
	/**
	 * Returns true if the attribute is the same as the one given in parameter, false either.
	 * @generated NOT
	 */
	public int hashCode() {
		return this.getDescription().hashCode();
	}

	/**
	 * Returns true if the attribute is the same as the one given in parameter, false either.
	 * @generated NOT
	 */
	public boolean sameAs(Attribute attr) {
		if ( ! (attr instanceof CompositeAttribute) )
			return false;
		else {
			CompositeAttribute c = (CompositeAttribute) attr;
			
			if ( this.getAttributes().size() != c.getAttributes().size() )
				return false;
			
			if ( this.getAttributes().size() == 0 )
				return true;
			
			Iterator<ValuedAttribute> vcIt = c.getAttributes().iterator();
			Iterator<ValuedAttribute> thisIt = this.getAttributes().iterator();
			
			while( vcIt.hasNext() ) {
				Attribute a1 = vcIt.next();
				Attribute a2 = thisIt.next();
				if ( !a1.sameAs(a2) )
					return false;
			}
			
			return true;
		}
		
	}

} //CompositeAttributeImpl
