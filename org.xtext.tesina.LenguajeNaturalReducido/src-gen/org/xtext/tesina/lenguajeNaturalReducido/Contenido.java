/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.xtext.tesina.lenguajeNaturalReducido;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenido</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.tesina.lenguajeNaturalReducido.Contenido#getPrefijo <em>Prefijo</em>}</li>
 *   <li>{@link org.xtext.tesina.lenguajeNaturalReducido.Contenido#getSimple <em>Simple</em>}</li>
 *   <li>{@link org.xtext.tesina.lenguajeNaturalReducido.Contenido#getComposicion <em>Composicion</em>}</li>
 * </ul>
 *
 * @see org.xtext.tesina.lenguajeNaturalReducido.LenguajeNaturalReducidoPackage#getContenido()
 * @model
 * @generated
 */
public interface Contenido extends EObject
{
  /**
   * Returns the value of the '<em><b>Prefijo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prefijo</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefijo</em>' attribute.
   * @see #setPrefijo(String)
   * @see org.xtext.tesina.lenguajeNaturalReducido.LenguajeNaturalReducidoPackage#getContenido_Prefijo()
   * @model
   * @generated
   */
  String getPrefijo();

  /**
   * Sets the value of the '{@link org.xtext.tesina.lenguajeNaturalReducido.Contenido#getPrefijo <em>Prefijo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prefijo</em>' attribute.
   * @see #getPrefijo()
   * @generated
   */
  void setPrefijo(String value);

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
   * @see org.xtext.tesina.lenguajeNaturalReducido.LenguajeNaturalReducidoPackage#getContenido_Simple()
   * @model containment="true"
   * @generated
   */
  Simple getSimple();

  /**
   * Sets the value of the '{@link org.xtext.tesina.lenguajeNaturalReducido.Contenido#getSimple <em>Simple</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Simple</em>' containment reference.
   * @see #getSimple()
   * @generated
   */
  void setSimple(Simple value);

  /**
   * Returns the value of the '<em><b>Composicion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Composicion</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Composicion</em>' containment reference.
   * @see #setComposicion(Composicion)
   * @see org.xtext.tesina.lenguajeNaturalReducido.LenguajeNaturalReducidoPackage#getContenido_Composicion()
   * @model containment="true"
   * @generated
   */
  Composicion getComposicion();

  /**
   * Sets the value of the '{@link org.xtext.tesina.lenguajeNaturalReducido.Contenido#getComposicion <em>Composicion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Composicion</em>' containment reference.
   * @see #getComposicion()
   * @generated
   */
  void setComposicion(Composicion value);

} // Contenido