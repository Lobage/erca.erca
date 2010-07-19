/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.googlecode.erca.rcf;


import org.eclipse.emf.common.util.EList;

import com.googlecode.erca.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.googlecode.erca.rcf.RelationalContext#getTargetEntities <em>Target Entities</em>}</li>
 *   <li>{@link com.googlecode.erca.rcf.RelationalContext#getSourceEntities <em>Source Entities</em>}</li>
 *   <li>{@link com.googlecode.erca.rcf.RelationalContext#getTargetContext <em>Target Context</em>}</li>
 *   <li>{@link com.googlecode.erca.rcf.RelationalContext#getSourceContext <em>Source Context</em>}</li>
 *   <li>{@link com.googlecode.erca.rcf.RelationalContext#getScalingOperator <em>Scaling Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.googlecode.erca.rcf.RcfPackage#getRelationalContext()
 * @model
 * @generated
 */
public interface RelationalContext extends BinaryContext {
	/**
	 * Returns the value of the '<em><b>Target Entities</b></em>' containment reference list.
	 * The list contents are of type {@link com.googlecode.erca.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Entities</em>' containment reference list.
	 * @see com.googlecode.erca.rcf.RcfPackage#getRelationalContext_TargetEntities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getTargetEntities();

	/**
	 * Returns the value of the '<em><b>Source Entities</b></em>' reference list.
	 * The list contents are of type {@link com.googlecode.erca.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Entities</em>' reference list.
	 * @see com.googlecode.erca.rcf.RcfPackage#getRelationalContext_SourceEntities()
	 * @model derived="true"
	 * @generated
	 */
	EList<Entity> getSourceEntities();

	/**
	 * Returns the value of the '<em><b>Target Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Context</em>' reference.
	 * @see #setTargetContext(FormalContext)
	 * @see com.googlecode.erca.rcf.RcfPackage#getRelationalContext_TargetContext()
	 * @model required="true"
	 * @generated
	 */
	FormalContext getTargetContext();

	/**
	 * Sets the value of the '{@link com.googlecode.erca.rcf.RelationalContext#getTargetContext <em>Target Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Context</em>' reference.
	 * @see #getTargetContext()
	 * @generated
	 */
	void setTargetContext(FormalContext value);

	/**
	 * Returns the value of the '<em><b>Source Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Context</em>' reference.
	 * @see #setSourceContext(FormalContext)
	 * @see com.googlecode.erca.rcf.RcfPackage#getRelationalContext_SourceContext()
	 * @model required="true"
	 * @generated
	 */
	FormalContext getSourceContext();

	/**
	 * Sets the value of the '{@link com.googlecode.erca.rcf.RelationalContext#getSourceContext <em>Source Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Context</em>' reference.
	 * @see #getSourceContext()
	 * @generated
	 */
	void setSourceContext(FormalContext value);

	/**
	 * Returns the value of the '<em><b>Scaling Operator</b></em>' attribute.
	 * The default value is <code>"com.googlecode.erca.framework.algo.scaling.Wide"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scaling Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scaling Operator</em>' attribute.
	 * @see #setScalingOperator(String)
	 * @see com.googlecode.erca.rcf.RcfPackage#getRelationalContext_ScalingOperator()
	 * @model default="com.googlecode.erca.framework.algo.scaling.Wide" required="true"
	 * @generated
	 */
	String getScalingOperator();

	/**
	 * Sets the value of the '{@link com.googlecode.erca.rcf.RelationalContext#getScalingOperator <em>Scaling Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scaling Operator</em>' attribute.
	 * @see #getScalingOperator()
	 * @generated
	 */
	void setScalingOperator(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model entityRequired="true"
	 * @generated
	 */
	EList<Entity> getTargetEntities(Entity entity);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model entityRequired="true"
	 * @generated
	 */
	EList<Entity> getSourcesEntities(Entity entity);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true"
	 * @generated
	 */
	Entity getTargetEntity(String name);

} // RelationalContext
