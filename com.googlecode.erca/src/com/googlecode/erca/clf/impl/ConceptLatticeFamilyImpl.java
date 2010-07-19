/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.googlecode.erca.clf.impl;


import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.googlecode.erca.clf.ClfPackage;
import com.googlecode.erca.clf.ConceptLattice;
import com.googlecode.erca.clf.ConceptLatticeFamily;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept Lattice Family</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.googlecode.erca.clf.impl.ConceptLatticeFamilyImpl#getConceptLattices <em>Concept Lattices</em>}</li>
 *   <li>{@link com.googlecode.erca.clf.impl.ConceptLatticeFamilyImpl#getStepNumber <em>Step Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConceptLatticeFamilyImpl extends EObjectImpl implements ConceptLatticeFamily {
	/**
	 * The cached value of the '{@link #getConceptLattices() <em>Concept Lattices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptLattices()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptLattice> conceptLattices;

	/**
	 * The default value of the '{@link #getStepNumber() <em>Step Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int STEP_NUMBER_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getStepNumber() <em>Step Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepNumber()
	 * @generated
	 * @ordered
	 */
	protected int stepNumber = STEP_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptLatticeFamilyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClfPackage.Literals.CONCEPT_LATTICE_FAMILY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptLattice> getConceptLattices() {
		if (conceptLattices == null) {
			conceptLattices = new EObjectContainmentEList<ConceptLattice>(ConceptLattice.class, this, ClfPackage.CONCEPT_LATTICE_FAMILY__CONCEPT_LATTICES);
		}
		return conceptLattices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStepNumber() {
		return stepNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepNumber(int newStepNumber) {
		int oldStepNumber = stepNumber;
		stepNumber = newStepNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClfPackage.CONCEPT_LATTICE_FAMILY__STEP_NUMBER, oldStepNumber, stepNumber));
	}

	/**
	 * Returns the concept lattice with the given name.
	 * @generated NOT
	 */
	public ConceptLattice getConceptLattice(String name) {
		for(ConceptLattice lattice: this.getConceptLattices() )
			if ( lattice.getName().equals(name) )
				return lattice;

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
			case ClfPackage.CONCEPT_LATTICE_FAMILY__CONCEPT_LATTICES:
				return ((InternalEList<?>)getConceptLattices()).basicRemove(otherEnd, msgs);
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
			case ClfPackage.CONCEPT_LATTICE_FAMILY__CONCEPT_LATTICES:
				return getConceptLattices();
			case ClfPackage.CONCEPT_LATTICE_FAMILY__STEP_NUMBER:
				return getStepNumber();
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
			case ClfPackage.CONCEPT_LATTICE_FAMILY__CONCEPT_LATTICES:
				getConceptLattices().clear();
				getConceptLattices().addAll((Collection<? extends ConceptLattice>)newValue);
				return;
			case ClfPackage.CONCEPT_LATTICE_FAMILY__STEP_NUMBER:
				setStepNumber((Integer)newValue);
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
			case ClfPackage.CONCEPT_LATTICE_FAMILY__CONCEPT_LATTICES:
				getConceptLattices().clear();
				return;
			case ClfPackage.CONCEPT_LATTICE_FAMILY__STEP_NUMBER:
				setStepNumber(STEP_NUMBER_EDEFAULT);
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
			case ClfPackage.CONCEPT_LATTICE_FAMILY__CONCEPT_LATTICES:
				return conceptLattices != null && !conceptLattices.isEmpty();
			case ClfPackage.CONCEPT_LATTICE_FAMILY__STEP_NUMBER:
				return stepNumber != STEP_NUMBER_EDEFAULT;
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
		result.append(" (stepNumber: ");
		result.append(stepNumber);
		result.append(')');
		return result.toString();
	}

} //ConceptLatticeFamilyImpl
