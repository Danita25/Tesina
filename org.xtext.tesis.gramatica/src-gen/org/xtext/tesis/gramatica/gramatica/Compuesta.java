/**
 * generated by Xtext 2.10.0
 */
package org.xtext.tesis.gramatica.gramatica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compuesta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.tesis.gramatica.gramatica.Compuesta#getSimple <em>Simple</em>}</li>
 *   <li>{@link org.xtext.tesis.gramatica.gramatica.Compuesta#getNexo <em>Nexo</em>}</li>
 * </ul>
 *
 * @see org.xtext.tesis.gramatica.gramatica.GramaticaPackage#getCompuesta()
 * @model
 * @generated
 */
public interface Compuesta extends Oracion
{
  /**
   * Returns the value of the '<em><b>Simple</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simple</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simple</em>' containment reference.
   * @see #setSimple(Simple)
   * @see org.xtext.tesis.gramatica.gramatica.GramaticaPackage#getCompuesta_Simple()
   * @model containment="true"
   * @generated
   */
  Simple getSimple();

  /**
   * Sets the value of the '{@link org.xtext.tesis.gramatica.gramatica.Compuesta#getSimple <em>Simple</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Simple</em>' containment reference.
   * @see #getSimple()
   * @generated
   */
  void setSimple(Simple value);

  /**
   * Returns the value of the '<em><b>Nexo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nexo</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nexo</em>' containment reference.
   * @see #setNexo(Nexo)
   * @see org.xtext.tesis.gramatica.gramatica.GramaticaPackage#getCompuesta_Nexo()
   * @model containment="true"
   * @generated
   */
  Nexo getNexo();

  /**
   * Sets the value of the '{@link org.xtext.tesis.gramatica.gramatica.Compuesta#getNexo <em>Nexo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nexo</em>' containment reference.
   * @see #getNexo()
   * @generated
   */
  void setNexo(Nexo value);

} // Compuesta
