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
import org.eclipse.emf.ecore.util.InternalEList;

import com.googlecode.erca.Attribute;
import com.googlecode.erca.CompositeAttribute;
import com.googlecode.erca.Entity;
import com.googlecode.erca.FcaElement;
import com.googlecode.erca.ValuedAttribute;
import com.googlecode.erca.rcf.FormalContext;
import com.googlecode.erca.rcf.RcfPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formal Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.googlecode.erca.rcf.impl.FormalContextImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link com.googlecode.erca.rcf.impl.FormalContextImpl#getEntities <em>Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormalContextImpl extends BinaryContextImpl implements FormalContext {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormalContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RcfPackage.Literals.FORMAL_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, RcfPackage.FORMAL_CONTEXT__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<Entity>(Entity.class, this, RcfPackage.FORMAL_CONTEXT__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Entity> getSourceEntities(Attribute attribute) {
		EList<Entity> entities = new BasicEList<Entity>();
		for(FcaElement e: this.getSourceElements(attribute))
			entities.add((Entity) e);
		
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Attribute> getTargetAttributes(Entity entity) {
		EList<Attribute> attributes = new BasicEList<Attribute>();
		for(FcaElement e: this.getTargetElements(entity))
			attributes.add((Attribute) e);
		
		return attributes;
	}

	/**
	 * Returns the entity with the given name.
	 * @generated NOT
	 */
	public Entity getEntity(String name) {
		for(Entity entity: this.getEntities() ) 
			if ( entity.getName().equals(name)  )
				return entity;

		return null;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc --> 
	 * @generated NOT
	 */
	public Attribute getAttribute(Attribute attr) {
		for(Attribute myAttr : this.getAttributes() )
			if ( myAttr.sameAs(attr) )
				return myAttr;

		return null;
	}

	/**
	 * Returns true if the context contains valued attributes, false either.
	 * @generated NOT
	 */
	public boolean hasValuedAttributes() {
		for( Attribute a1: this.getAttributes() )
			if ( a1 instanceof ValuedAttribute )
				return true;
			else if ( a1 instanceof CompositeAttribute )
				for ( Attribute a2: ((CompositeAttribute) a1).getAttributes() )
					if ( a2 instanceof ValuedAttribute )
						return  true;
		
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RcfPackage.FORMAL_CONTEXT__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case RcfPackage.FORMAL_CONTEXT__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
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
			case RcfPackage.FORMAL_CONTEXT__ATTRIBUTES:
				return getAttributes();
			case RcfPackage.FORMAL_CONTEXT__ENTITIES:
				return getEntities();
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
			case RcfPackage.FORMAL_CONTEXT__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case RcfPackage.FORMAL_CONTEXT__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends Entity>)newValue);
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
			case RcfPackage.FORMAL_CONTEXT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case RcfPackage.FORMAL_CONTEXT__ENTITIES:
				getEntities().clear();
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
			case RcfPackage.FORMAL_CONTEXT__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case RcfPackage.FORMAL_CONTEXT__ENTITIES:
				return entities != null && !entities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FormalContextImpl
