/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.googlecode.erca.rcf.impl;



import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.googlecode.erca.Entity;
import com.googlecode.erca.FcaElement;
import com.googlecode.erca.rcf.FormalContext;
import com.googlecode.erca.rcf.RcfPackage;
import com.googlecode.erca.rcf.RelationalContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relational Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.googlecode.erca.rcf.impl.RelationalContextImpl#getTargetEntities <em>Target Entities</em>}</li>
 *   <li>{@link com.googlecode.erca.rcf.impl.RelationalContextImpl#getSourceEntities <em>Source Entities</em>}</li>
 *   <li>{@link com.googlecode.erca.rcf.impl.RelationalContextImpl#getTargetContext <em>Target Context</em>}</li>
 *   <li>{@link com.googlecode.erca.rcf.impl.RelationalContextImpl#getSourceContext <em>Source Context</em>}</li>
 *   <li>{@link com.googlecode.erca.rcf.impl.RelationalContextImpl#getScalingOperator <em>Scaling Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationalContextImpl extends BinaryContextImpl implements RelationalContext {
	/**
	 * The cached value of the '{@link #getTargetEntities() <em>Target Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> targetEntities;

	/**
	 * The cached value of the '{@link #getSourceEntities() <em>Source Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> sourceEntities;

	/**
	 * The cached value of the '{@link #getTargetContext() <em>Target Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetContext()
	 * @generated
	 * @ordered
	 */
	protected FormalContext targetContext;

	/**
	 * The cached value of the '{@link #getSourceContext() <em>Source Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceContext()
	 * @generated
	 * @ordered
	 */
	protected FormalContext sourceContext;

	/**
	 * The default value of the '{@link #getScalingOperator() <em>Scaling Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalingOperator()
	 * @generated
	 * @ordered
	 */
	protected static final String SCALING_OPERATOR_EDEFAULT = "com.googlecode.erca.framework.algo.scaling.Wide";

	/**
	 * The cached value of the '{@link #getScalingOperator() <em>Scaling Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalingOperator()
	 * @generated
	 * @ordered
	 */
	protected String scalingOperator = SCALING_OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RcfPackage.Literals.RELATIONAL_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getTargetEntities() {
		if (targetEntities == null) {
			targetEntities = new EObjectContainmentEList<Entity>(Entity.class, this, RcfPackage.RELATIONAL_CONTEXT__TARGET_ENTITIES);
		}
		return targetEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getSourceEntities() {
		if (sourceEntities == null) {
			sourceEntities = new EObjectResolvingEList<Entity>(Entity.class, this, RcfPackage.RELATIONAL_CONTEXT__SOURCE_ENTITIES);
		}
		return sourceEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalContext getTargetContext() {
		if (targetContext != null && targetContext.eIsProxy()) {
			InternalEObject oldTargetContext = (InternalEObject)targetContext;
			targetContext = (FormalContext)eResolveProxy(oldTargetContext);
			if (targetContext != oldTargetContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RcfPackage.RELATIONAL_CONTEXT__TARGET_CONTEXT, oldTargetContext, targetContext));
			}
		}
		return targetContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalContext basicGetTargetContext() {
		return targetContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetContext(FormalContext newTargetContext) {
		FormalContext oldTargetContext = targetContext;
		targetContext = newTargetContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RcfPackage.RELATIONAL_CONTEXT__TARGET_CONTEXT, oldTargetContext, targetContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalContext getSourceContext() {
		if (sourceContext != null && sourceContext.eIsProxy()) {
			InternalEObject oldSourceContext = (InternalEObject)sourceContext;
			sourceContext = (FormalContext)eResolveProxy(oldSourceContext);
			if (sourceContext != oldSourceContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RcfPackage.RELATIONAL_CONTEXT__SOURCE_CONTEXT, oldSourceContext, sourceContext));
			}
		}
		return sourceContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalContext basicGetSourceContext() {
		return sourceContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceContext(FormalContext newSourceContext) {
		FormalContext oldSourceContext = sourceContext;
		sourceContext = newSourceContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RcfPackage.RELATIONAL_CONTEXT__SOURCE_CONTEXT, oldSourceContext, sourceContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScalingOperator() {
		return scalingOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScalingOperator(String newScalingOperator) {
		String oldScalingOperator = scalingOperator;
		scalingOperator = newScalingOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RcfPackage.RELATIONAL_CONTEXT__SCALING_OPERATOR, oldScalingOperator, scalingOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Entity> getTargetEntities(Entity entity) {
		EList<Entity> entities = new BasicEList<Entity>();
		for(FcaElement e: this.getTargetElements(entity)) 
			entities.add((Entity) e);
		
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Entity> getSourcesEntities(Entity entity) {
		EList<Entity> entities = new BasicEList<Entity>();
		for(FcaElement e: this.getSourceElements(entity)) 
			entities.add((Entity) e);
		
		return entities;
		
	}

	/**
	 * Returns the target entity with the given name.
	 * @generated NOT
	 */
	public Entity getTargetEntity(String name) {
		for(Entity entity: this.getTargetEntities() )
			if ( entity.getName().equals(name))
				return entity;
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RcfPackage.RELATIONAL_CONTEXT__TARGET_ENTITIES:
				return ((InternalEList<?>)getTargetEntities()).basicRemove(otherEnd, msgs);
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
			case RcfPackage.RELATIONAL_CONTEXT__TARGET_ENTITIES:
				return getTargetEntities();
			case RcfPackage.RELATIONAL_CONTEXT__SOURCE_ENTITIES:
				return getSourceEntities();
			case RcfPackage.RELATIONAL_CONTEXT__TARGET_CONTEXT:
				if (resolve) return getTargetContext();
				return basicGetTargetContext();
			case RcfPackage.RELATIONAL_CONTEXT__SOURCE_CONTEXT:
				if (resolve) return getSourceContext();
				return basicGetSourceContext();
			case RcfPackage.RELATIONAL_CONTEXT__SCALING_OPERATOR:
				return getScalingOperator();
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
			case RcfPackage.RELATIONAL_CONTEXT__TARGET_ENTITIES:
				getTargetEntities().clear();
				getTargetEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case RcfPackage.RELATIONAL_CONTEXT__SOURCE_ENTITIES:
				getSourceEntities().clear();
				getSourceEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case RcfPackage.RELATIONAL_CONTEXT__TARGET_CONTEXT:
				setTargetContext((FormalContext)newValue);
				return;
			case RcfPackage.RELATIONAL_CONTEXT__SOURCE_CONTEXT:
				setSourceContext((FormalContext)newValue);
				return;
			case RcfPackage.RELATIONAL_CONTEXT__SCALING_OPERATOR:
				setScalingOperator((String)newValue);
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
			case RcfPackage.RELATIONAL_CONTEXT__TARGET_ENTITIES:
				getTargetEntities().clear();
				return;
			case RcfPackage.RELATIONAL_CONTEXT__SOURCE_ENTITIES:
				getSourceEntities().clear();
				return;
			case RcfPackage.RELATIONAL_CONTEXT__TARGET_CONTEXT:
				setTargetContext((FormalContext)null);
				return;
			case RcfPackage.RELATIONAL_CONTEXT__SOURCE_CONTEXT:
				setSourceContext((FormalContext)null);
				return;
			case RcfPackage.RELATIONAL_CONTEXT__SCALING_OPERATOR:
				setScalingOperator(SCALING_OPERATOR_EDEFAULT);
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
			case RcfPackage.RELATIONAL_CONTEXT__TARGET_ENTITIES:
				return targetEntities != null && !targetEntities.isEmpty();
			case RcfPackage.RELATIONAL_CONTEXT__SOURCE_ENTITIES:
				return sourceEntities != null && !sourceEntities.isEmpty();
			case RcfPackage.RELATIONAL_CONTEXT__TARGET_CONTEXT:
				return targetContext != null;
			case RcfPackage.RELATIONAL_CONTEXT__SOURCE_CONTEXT:
				return sourceContext != null;
			case RcfPackage.RELATIONAL_CONTEXT__SCALING_OPERATOR:
				return SCALING_OPERATOR_EDEFAULT == null ? scalingOperator != null : !SCALING_OPERATOR_EDEFAULT.equals(scalingOperator);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (scalingOperator: ");
		result.append(scalingOperator);
		result.append(')');
		return result.toString();
	}

} //RelationalContextImpl
