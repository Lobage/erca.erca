/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.googlecode.erca.rcf;


import org.eclipse.emf.common.util.EList;

import com.googlecode.erca.Attribute;
import com.googlecode.erca.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.googlecode.erca.rcf.FormalContext#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link com.googlecode.erca.rcf.FormalContext#getEntities <em>Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.googlecode.erca.rcf.RcfPackage#getFormalContext()
 * @model
 * @generated
 */
public interface FormalContext extends BinaryContext {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link com.googlecode.erca.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see com.googlecode.erca.rcf.RcfPackage#getFormalContext_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link com.googlecode.erca.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see com.googlecode.erca.rcf.RcfPackage#getFormalContext_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model attributeRequired="true"
	 * @generated
	 */
	EList<Entity> getSourceEntities(Attribute attribute);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model entityRequired="true"
	 * @generated
	 */
	EList<Attribute> getTargetAttributes(Entity entity);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Entity getEntity(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model attrRequired="true"
	 * @generated
	 */
	Attribute getAttribute(Attribute attr);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean hasValuedAttributes();

} // FormalContext
