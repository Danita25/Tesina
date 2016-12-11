/**
 * generated by Xtext 2.10.0
 */
package org.xtext.tesis.gramatica.gramatica;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compleja</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.tesis.gramatica.gramatica.Compleja#getAtributo <em>Atributo</em>}</li>
 *   <li>{@link org.xtext.tesis.gramatica.gramatica.Compleja#getContexto <em>Contexto</em>}</li>
 *   <li>{@link org.xtext.tesis.gramatica.gramatica.Compleja#getLiteral <em>Literal</em>}</li>
 * </ul>
 *
 * @see org.xtext.tesis.gramatica.gramatica.GramaticaPackage#getCompleja()
 * @model
 * @generated
 */
public interface Compleja extends EObject
{
  /**
   * Returns the value of the '<em><b>Atributo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atributo</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atributo</em>' containment reference.
   * @see #setAtributo(EObject)
   * @see org.xtext.tesis.gramatica.gramatica.GramaticaPackage#getCompleja_Atributo()
   * @model containment="true"
   * @generated
   */
  EObject getAtributo();

  /**
   * Sets the value of the '{@link org.xtext.tesis.gramatica.gramatica.Compleja#getAtributo <em>Atributo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Atributo</em>' containment reference.
   * @see #getAtributo()
   * @generated
   */
  void setAtributo(EObject value);

  /**
   * Returns the value of the '<em><b>Contexto</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contexto</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contexto</em>' containment reference.
   * @see #setContexto(Clase)
   * @see org.xtext.tesis.gramatica.gramatica.GramaticaPackage#getCompleja_Contexto()
   * @model containment="true"
   * @generated
   */
  Clase getContexto();

  /**
   * Sets the value of the '{@link org.xtext.tesis.gramatica.gramatica.Compleja#getContexto <em>Contexto</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contexto</em>' containment reference.
   * @see #getContexto()
   * @generated
   */
  void setContexto(Clase value);

  /**
   * Returns the value of the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal</em>' attribute.
   * @see #setLiteral(String)
   * @see org.xtext.tesis.gramatica.gramatica.GramaticaPackage#getCompleja_Literal()
   * @model
   * @generated
   */
  String getLiteral();

  /**
   * Sets the value of the '{@link org.xtext.tesis.gramatica.gramatica.Compleja#getLiteral <em>Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal</em>' attribute.
   * @see #getLiteral()
   * @generated
   */
  void setLiteral(String value);

} // Compleja
