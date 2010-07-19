/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.googlecode.erca.clf.impl;




import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.googlecode.erca.Attribute;
import com.googlecode.erca.clf.ClfPackage;
import com.googlecode.erca.clf.Concept;
import com.googlecode.erca.clf.ConceptLattice;
import com.googlecode.erca.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept Lattice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.googlecode.erca.clf.impl.ConceptLatticeImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link com.googlecode.erca.clf.impl.ConceptLatticeImpl#getTop <em>Top</em>}</li>
 *   <li>{@link com.googlecode.erca.clf.impl.ConceptLatticeImpl#getConcepts <em>Concepts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConceptLatticeImpl extends NamedElementImpl implements ConceptLattice {
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
	 * The cached value of the '{@link #getTop() <em>Top</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTop()
	 * @generated
	 * @ordered
	 */
	protected Concept top;

	/**
	 * The cached value of the '{@link #getConcepts() <em>Concepts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcepts()
	 * @generated
	 * @ordered
	 */
	protected EList<Concept> concepts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptLatticeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClfPackage.Literals.CONCEPT_LATTICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, ClfPackage.CONCEPT_LATTICE__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept getTop() {
		if (top != null && top.eIsProxy()) {
			InternalEObject oldTop = (InternalEObject)top;
			top = (Concept)eResolveProxy(oldTop);
			if (top != oldTop) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClfPackage.CONCEPT_LATTICE__TOP, oldTop, top));
			}
		}
		return top;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept basicGetTop() {
		return top;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTop(Concept newTop) {
		Concept oldTop = top;
		top = newTop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClfPackage.CONCEPT_LATTICE__TOP, oldTop, top));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Concept> getConcepts() {
		if (concepts == null) {
			concepts = new EObjectContainmentWithInverseEList<Concept>(Concept.class, this, ClfPackage.CONCEPT_LATTICE__CONCEPTS, ClfPackage.CONCEPT__LATTICE);
		}
		return concepts;
	}

	/**
	 * Delete the given attribute from the lattice.
	 * @generated NOT
	 */
	public void deleteAttribute(Attribute attribute) {
		for(Concept concept: this.getConcepts())
			concept.getIntent().remove(attribute);

		this.getAttributes().remove(attribute);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Attribute getAttribute(Attribute attr) {

		for(Attribute myAttr: this.getAttributes() )
			if ( myAttr.sameAs(attr) )
				return myAttr;

		return null;

	}

	/**
	 * Returns the concept with the given name.
	 * @generated NOT
	 */
	public Concept getConcept(String name) {
		for(Concept concept: this.getConcepts() )
			if ( concept.getName().equals(name) )
				return concept;

		return null;
	}

			
	/**
	 * Returns the maximum depth of the concept lattice.
	 * @generated NOT
	 */
	public int getMaxDepth() {
		return calculateMaxDepth(getTop(), 0, new BasicEList<Integer>());
	}

	/**
	 * Returns the list of the empty concepts.
	 * @generated NOT
	 */
	public EList<Concept> getEmptyConcepts() {
		EList<Concept> emptyConcepts = new BasicEList<Concept>();
		for (Concept concept : concepts)
			if ((concept.getSimplifiedExtent().isEmpty())&&((concept.getSimplifiedIntent().isEmpty())))
				emptyConcepts.add(concept);
		
		return emptyConcepts;
	}

	/**
	 * Returns the list of the new concepts.
	 * @generated NOT
	 */
	public EList<Concept> getNewConcepts() {
		EList<Concept> newConcepts = new BasicEList<Concept>();
		for (Concept concept : concepts)
			if (concept.isNewConcept())
				newConcepts.add(concept);

		return newConcepts;
	}

	/**
	 * Returns the maximum depth of the given concept.
	 * @param c a concept.
	 * @param level level of the concept.
	 * @param v a list of integers.
	 * @return
	 * @generated NOT
	 */
	private int calculateMaxDepth(Concept c, int level, EList<Integer> v) {
		if ( c.getChildren().isEmpty() )
			return level + 1;
		else {
			for( Concept cc: c.getChildren() )
				if( !cc.getChildren().isEmpty() )
					v.add(calculateMaxDepth(cc, level+1, v));
				else 
					return level + 1;
			
			int t =0;
			for( int i : v )
				if ( i > t )
					t=i;
			
			return t;			
		}
	}


	


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClfPackage.CONCEPT_LATTICE__CONCEPTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConcepts()).basicAdd(otherEnd, msgs);
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
			case ClfPackage.CONCEPT_LATTICE__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case ClfPackage.CONCEPT_LATTICE__CONCEPTS:
				return ((InternalEList<?>)getConcepts()).basicRemove(otherEnd, msgs);
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
			case ClfPackage.CONCEPT_LATTICE__ATTRIBUTES:
				return getAttributes();
			case ClfPackage.CONCEPT_LATTICE__TOP:
				if (resolve) return getTop();
				return basicGetTop();
			case ClfPackage.CONCEPT_LATTICE__CONCEPTS:
				return getConcepts();
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
			case ClfPackage.CONCEPT_LATTICE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case ClfPackage.CONCEPT_LATTICE__TOP:
				setTop((Concept)newValue);
				return;
			case ClfPackage.CONCEPT_LATTICE__CONCEPTS:
				getConcepts().clear();
				getConcepts().addAll((Collection<? extends Concept>)newValue);
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
			case ClfPackage.CONCEPT_LATTICE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case ClfPackage.CONCEPT_LATTICE__TOP:
				setTop((Concept)null);
				return;
			case ClfPackage.CONCEPT_LATTICE__CONCEPTS:
				getConcepts().clear();
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
			case ClfPackage.CONCEPT_LATTICE__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case ClfPackage.CONCEPT_LATTICE__TOP:
				return top != null;
			case ClfPackage.CONCEPT_LATTICE__CONCEPTS:
				return concepts != null && !concepts.isEmpty();
		}
		return super.eIsSet(featureID);
	}



} //ConceptLatticeImpl
