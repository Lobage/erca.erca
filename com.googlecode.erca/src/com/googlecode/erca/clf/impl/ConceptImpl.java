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

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.googlecode.erca.Attribute;
import com.googlecode.erca.Entity;
import com.googlecode.erca.clf.ClfPackage;
import com.googlecode.erca.clf.Concept;
import com.googlecode.erca.clf.ConceptLattice;
import com.googlecode.erca.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.googlecode.erca.clf.impl.ConceptImpl#getLattice <em>Lattice</em>}</li>
 *   <li>{@link com.googlecode.erca.clf.impl.ConceptImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link com.googlecode.erca.clf.impl.ConceptImpl#getExtent <em>Extent</em>}</li>
 *   <li>{@link com.googlecode.erca.clf.impl.ConceptImpl#getIntent <em>Intent</em>}</li>
 *   <li>{@link com.googlecode.erca.clf.impl.ConceptImpl#getCreationStep <em>Creation Step</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConceptImpl extends NamedElementImpl implements Concept {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Concept> children;

	/**
	 * The cached value of the '{@link #getExtent() <em>Extent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtent()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> extent;

	/**
	 * The cached value of the '{@link #getIntent() <em>Intent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntent()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> intent;

	/**
	 * The default value of the '{@link #getCreationStep() <em>Creation Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationStep()
	 * @generated
	 * @ordered
	 */
	protected static final int CREATION_STEP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCreationStep() <em>Creation Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationStep()
	 * @generated
	 * @ordered
	 */
	protected int creationStep = CREATION_STEP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClfPackage.Literals.CONCEPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptLattice getLattice() {
		if (eContainerFeatureID() != ClfPackage.CONCEPT__LATTICE) return null;
		return (ConceptLattice)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLattice(ConceptLattice newLattice, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLattice, ClfPackage.CONCEPT__LATTICE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLattice(ConceptLattice newLattice) {
		if (newLattice != eInternalContainer() || (eContainerFeatureID() != ClfPackage.CONCEPT__LATTICE && newLattice != null)) {
			if (EcoreUtil.isAncestor(this, newLattice))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLattice != null)
				msgs = ((InternalEObject)newLattice).eInverseAdd(this, ClfPackage.CONCEPT_LATTICE__CONCEPTS, ConceptLattice.class, msgs);
			msgs = basicSetLattice(newLattice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClfPackage.CONCEPT__LATTICE, newLattice, newLattice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Concept> getChildren() {
		if (children == null) {
			children = new EObjectResolvingEList<Concept>(Concept.class, this, ClfPackage.CONCEPT__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getExtent() {
		if (extent == null) {
			extent = new EObjectResolvingEList<Entity>(Entity.class, this, ClfPackage.CONCEPT__EXTENT);
		}
		return extent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getIntent() {
		if (intent == null) {
			intent = new EObjectResolvingEList<Attribute>(Attribute.class, this, ClfPackage.CONCEPT__INTENT);
		}
		return intent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCreationStep() {
		return creationStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationStep(int newCreationStep) {
		int oldCreationStep = creationStep;
		creationStep = newCreationStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClfPackage.CONCEPT__CREATION_STEP, oldCreationStep, creationStep));
	}

	/**
	 * Returns the simplified extension.
	 * @generated NOT
	 */
	public EList<Entity> getSimplifiedExtent() {
		EList<Entity> simplifiedExtension = new BasicEList<Entity>();
		for(Entity entity: this.getExtent() ) {
			boolean leafEntity = true;
			for(Concept child: this.getChildren() )
				if ( child.getExtent().contains(entity))
					leafEntity = false;
			if ( leafEntity )
				simplifiedExtension.add(entity);
		}
		return simplifiedExtension;
	}

	/**
	 * Returns all the parents of the concept.
	 * @generated NOT
	 */
	public EList<Concept> getAllParents() {
		EList<Concept> result = new BasicEList<Concept>();
		EList<Concept> temp = new BasicEList<Concept>();
		temp.add(this);
		while ( temp.size() > 0 ) {
			Concept concept = temp.remove(0);
			if ( !result.contains(concept)) {
				result.add(concept);
				temp.addAll(concept.getParents());
			}
		}
		return result;
	}

	/**
	 * Returns the simplified intension.
	 * @generated NOT
	 */
	public EList<Attribute> getSimplifiedIntent() {
		EList<Attribute> simplifiedIntension = new BasicEList<Attribute>();
		for(Attribute attribute: this.getIntent() ) {
			boolean leafAttribute = true;
			for(Concept parent: this.getParents() )
				if( parent.getIntent().contains(attribute))
					leafAttribute = false;
			if ( leafAttribute )
				simplifiedIntension.add(attribute);
		}
		return simplifiedIntension;
	}

	/**
	 * Returns the direct parents of the concept.
	 * @generated NOT
	 */
	public EList<Concept> getParents() {
		EList<Concept> parents = new BasicEList<Concept>();
		for(Concept concept: this.getLattice().getConcepts() )
			if ( concept.getChildren().contains(this) )
				parents.add(concept);
		return parents;
	}


	/**
	 * Returns all the children of the concept.
	 * @generated NOT
	 */
	public EList<Concept> getAllChildren() {
		EList<Concept> result = new BasicEList<Concept>();
		EList<Concept> temp = new BasicEList<Concept>();
		temp.add(this);
		while ( temp.size() > 0 ) {
			Concept concept = temp.remove(0);
			if ( !result.contains(concept)) {
				result.add(concept);
				temp.addAll(concept.getChildren());
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isFusion() {
		if ( getSimplifiedExtent().size() > 1 )
			return true;
		
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isNewConcept() {
		if ( getSimplifiedExtent().size() == 0 )
			return true;
		
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isDummy() {
		if ( getExtent().size() == 0 || getIntent().size() == 0 )
			return true;
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClfPackage.CONCEPT__LATTICE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLattice((ConceptLattice)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClfPackage.CONCEPT__LATTICE:
				return basicSetLattice(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ClfPackage.CONCEPT__LATTICE:
				return eInternalContainer().eInverseRemove(this, ClfPackage.CONCEPT_LATTICE__CONCEPTS, ConceptLattice.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClfPackage.CONCEPT__LATTICE:
				return getLattice();
			case ClfPackage.CONCEPT__CHILDREN:
				return getChildren();
			case ClfPackage.CONCEPT__EXTENT:
				return getExtent();
			case ClfPackage.CONCEPT__INTENT:
				return getIntent();
			case ClfPackage.CONCEPT__CREATION_STEP:
				return getCreationStep();
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
			case ClfPackage.CONCEPT__LATTICE:
				setLattice((ConceptLattice)newValue);
				return;
			case ClfPackage.CONCEPT__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Concept>)newValue);
				return;
			case ClfPackage.CONCEPT__EXTENT:
				getExtent().clear();
				getExtent().addAll((Collection<? extends Entity>)newValue);
				return;
			case ClfPackage.CONCEPT__INTENT:
				getIntent().clear();
				getIntent().addAll((Collection<? extends Attribute>)newValue);
				return;
			case ClfPackage.CONCEPT__CREATION_STEP:
				setCreationStep((Integer)newValue);
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
			case ClfPackage.CONCEPT__LATTICE:
				setLattice((ConceptLattice)null);
				return;
			case ClfPackage.CONCEPT__CHILDREN:
				getChildren().clear();
				return;
			case ClfPackage.CONCEPT__EXTENT:
				getExtent().clear();
				return;
			case ClfPackage.CONCEPT__INTENT:
				getIntent().clear();
				return;
			case ClfPackage.CONCEPT__CREATION_STEP:
				setCreationStep(CREATION_STEP_EDEFAULT);
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
			case ClfPackage.CONCEPT__LATTICE:
				return getLattice() != null;
			case ClfPackage.CONCEPT__CHILDREN:
				return children != null && !children.isEmpty();
			case ClfPackage.CONCEPT__EXTENT:
				return extent != null && !extent.isEmpty();
			case ClfPackage.CONCEPT__INTENT:
				return intent != null && !intent.isEmpty();
			case ClfPackage.CONCEPT__CREATION_STEP:
				return creationStep != CREATION_STEP_EDEFAULT;
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
		result.append(" (creationStep: ");
		result.append(creationStep);
		result.append(')');
		return result.toString();
	}

} //ConceptImpl
