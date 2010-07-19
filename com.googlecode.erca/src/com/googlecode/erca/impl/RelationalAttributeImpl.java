/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.googlecode.erca.impl;

import com.googlecode.erca.Attribute;
import com.googlecode.erca.ErcaPackage;
import com.googlecode.erca.NamedElement;
import com.googlecode.erca.RelationalAttribute;

import com.googlecode.erca.clf.Concept;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relational Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.googlecode.erca.impl.RelationalAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.googlecode.erca.impl.RelationalAttributeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link com.googlecode.erca.impl.RelationalAttributeImpl#getScalingOperator <em>Scaling Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationalAttributeImpl extends AttributeImpl implements RelationalAttribute {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Concept value;

	/**
	 * The default value of the '{@link #getScalingOperator() <em>Scaling Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalingOperator()
	 * @generated
	 * @ordered
	 */
	protected static final String SCALING_OPERATOR_EDEFAULT = null;
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
	protected RelationalAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErcaPackage.Literals.RELATIONAL_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErcaPackage.RELATIONAL_ATTRIBUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept getValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject)value;
			value = (Concept)eResolveProxy(oldValue);
			if (value != oldValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErcaPackage.RELATIONAL_ATTRIBUTE__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept basicGetValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Concept newValue) {
		Concept oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErcaPackage.RELATIONAL_ATTRIBUTE__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ErcaPackage.RELATIONAL_ATTRIBUTE__SCALING_OPERATOR, oldScalingOperator, scalingOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ErcaPackage.RELATIONAL_ATTRIBUTE__NAME:
				return getName();
			case ErcaPackage.RELATIONAL_ATTRIBUTE__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
			case ErcaPackage.RELATIONAL_ATTRIBUTE__SCALING_OPERATOR:
				return getScalingOperator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ErcaPackage.RELATIONAL_ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case ErcaPackage.RELATIONAL_ATTRIBUTE__VALUE:
				setValue((Concept)newValue);
				return;
			case ErcaPackage.RELATIONAL_ATTRIBUTE__SCALING_OPERATOR:
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
			case ErcaPackage.RELATIONAL_ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ErcaPackage.RELATIONAL_ATTRIBUTE__VALUE:
				setValue((Concept)null);
				return;
			case ErcaPackage.RELATIONAL_ATTRIBUTE__SCALING_OPERATOR:
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
			case ErcaPackage.RELATIONAL_ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ErcaPackage.RELATIONAL_ATTRIBUTE__VALUE:
				return value != null;
			case ErcaPackage.RELATIONAL_ATTRIBUTE__SCALING_OPERATOR:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case ErcaPackage.RELATIONAL_ATTRIBUTE__NAME: return ErcaPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case ErcaPackage.NAMED_ELEMENT__NAME: return ErcaPackage.RELATIONAL_ATTRIBUTE__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", scalingOperator: ");
		result.append(scalingOperator);
		result.append(')');
		return result.toString();
	}

	public boolean sameAs(Attribute a){
		if (! (a instanceof RelationalAttribute))
			return false;
		else
		{
			RelationalAttribute r=(RelationalAttribute)a;
			return r.getName().equals(this.getName())&&r.getValue()==this.getValue();
		}
	}
	
	public String getDescription(){
		return this.getName()+" : "+this.getValue().getName();
	}
} //RelationalAttributeImpl
