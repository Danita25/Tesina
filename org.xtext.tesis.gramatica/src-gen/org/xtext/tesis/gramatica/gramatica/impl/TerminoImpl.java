/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.xtext.tesis.gramatica.gramatica.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.tesis.gramatica.gramatica.GramaticaPackage;
import org.xtext.tesis.gramatica.gramatica.Termino;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Termino</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.tesis.gramatica.gramatica.impl.TerminoImpl#getIndeterminante <em>Indeterminante</em>}</li>
 *   <li>{@link org.xtext.tesis.gramatica.gramatica.impl.TerminoImpl#getContexto <em>Contexto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerminoImpl extends MinimalEObjectImpl.Container implements Termino
{
  /**
   * The default value of the '{@link #getIndeterminante() <em>Indeterminante</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndeterminante()
   * @generated
   * @ordered
   */
  protected static final String INDETERMINANTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIndeterminante() <em>Indeterminante</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndeterminante()
   * @generated
   * @ordered
   */
  protected String indeterminante = INDETERMINANTE_EDEFAULT;

  /**
   * The default value of the '{@link #getContexto() <em>Contexto</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContexto()
   * @generated
   * @ordered
   */
  protected static final String CONTEXTO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getContexto() <em>Contexto</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContexto()
   * @generated
   * @ordered
   */
  protected String contexto = CONTEXTO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TerminoImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GramaticaPackage.Literals.TERMINO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIndeterminante()
  {
    return indeterminante;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndeterminante(String newIndeterminante)
  {
    String oldIndeterminante = indeterminante;
    indeterminante = newIndeterminante;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GramaticaPackage.TERMINO__INDETERMINANTE, oldIndeterminante, indeterminante));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getContexto()
  {
    return contexto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContexto(String newContexto)
  {
    String oldContexto = contexto;
    contexto = newContexto;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GramaticaPackage.TERMINO__CONTEXTO, oldContexto, contexto));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GramaticaPackage.TERMINO__INDETERMINANTE:
        return getIndeterminante();
      case GramaticaPackage.TERMINO__CONTEXTO:
        return getContexto();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GramaticaPackage.TERMINO__INDETERMINANTE:
        setIndeterminante((String)newValue);
        return;
      case GramaticaPackage.TERMINO__CONTEXTO:
        setContexto((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GramaticaPackage.TERMINO__INDETERMINANTE:
        setIndeterminante(INDETERMINANTE_EDEFAULT);
        return;
      case GramaticaPackage.TERMINO__CONTEXTO:
        setContexto(CONTEXTO_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GramaticaPackage.TERMINO__INDETERMINANTE:
        return INDETERMINANTE_EDEFAULT == null ? indeterminante != null : !INDETERMINANTE_EDEFAULT.equals(indeterminante);
      case GramaticaPackage.TERMINO__CONTEXTO:
        return CONTEXTO_EDEFAULT == null ? contexto != null : !CONTEXTO_EDEFAULT.equals(contexto);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (indeterminante: ");
    result.append(indeterminante);
    result.append(", contexto: ");
    result.append(contexto);
    result.append(')');
    return result.toString();
  }

} //TerminoImpl
