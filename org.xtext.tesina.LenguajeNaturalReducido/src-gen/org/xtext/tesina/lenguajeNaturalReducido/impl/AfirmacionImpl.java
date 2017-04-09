/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.xtext.tesina.lenguajeNaturalReducido.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.tesina.lenguajeNaturalReducido.Afirmacion;
import org.xtext.tesina.lenguajeNaturalReducido.LenguajeNaturalReducidoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Afirmacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.tesina.lenguajeNaturalReducido.impl.AfirmacionImpl#getNegacion <em>Negacion</em>}</li>
 *   <li>{@link org.xtext.tesina.lenguajeNaturalReducido.impl.AfirmacionImpl#getAfirmacion <em>Afirmacion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AfirmacionImpl extends MinimalEObjectImpl.Container implements Afirmacion
{
  /**
   * The default value of the '{@link #getNegacion() <em>Negacion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNegacion()
   * @generated
   * @ordered
   */
  protected static final String NEGACION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNegacion() <em>Negacion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNegacion()
   * @generated
   * @ordered
   */
  protected String negacion = NEGACION_EDEFAULT;

  /**
   * The default value of the '{@link #getAfirmacion() <em>Afirmacion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAfirmacion()
   * @generated
   * @ordered
   */
  protected static final String AFIRMACION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAfirmacion() <em>Afirmacion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAfirmacion()
   * @generated
   * @ordered
   */
  protected String afirmacion = AFIRMACION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AfirmacionImpl()
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
    return LenguajeNaturalReducidoPackage.Literals.AFIRMACION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNegacion()
  {
    return negacion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNegacion(String newNegacion)
  {
    String oldNegacion = negacion;
    negacion = newNegacion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LenguajeNaturalReducidoPackage.AFIRMACION__NEGACION, oldNegacion, negacion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAfirmacion()
  {
    return afirmacion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAfirmacion(String newAfirmacion)
  {
    String oldAfirmacion = afirmacion;
    afirmacion = newAfirmacion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LenguajeNaturalReducidoPackage.AFIRMACION__AFIRMACION, oldAfirmacion, afirmacion));
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
      case LenguajeNaturalReducidoPackage.AFIRMACION__NEGACION:
        return getNegacion();
      case LenguajeNaturalReducidoPackage.AFIRMACION__AFIRMACION:
        return getAfirmacion();
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
      case LenguajeNaturalReducidoPackage.AFIRMACION__NEGACION:
        setNegacion((String)newValue);
        return;
      case LenguajeNaturalReducidoPackage.AFIRMACION__AFIRMACION:
        setAfirmacion((String)newValue);
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
      case LenguajeNaturalReducidoPackage.AFIRMACION__NEGACION:
        setNegacion(NEGACION_EDEFAULT);
        return;
      case LenguajeNaturalReducidoPackage.AFIRMACION__AFIRMACION:
        setAfirmacion(AFIRMACION_EDEFAULT);
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
      case LenguajeNaturalReducidoPackage.AFIRMACION__NEGACION:
        return NEGACION_EDEFAULT == null ? negacion != null : !NEGACION_EDEFAULT.equals(negacion);
      case LenguajeNaturalReducidoPackage.AFIRMACION__AFIRMACION:
        return AFIRMACION_EDEFAULT == null ? afirmacion != null : !AFIRMACION_EDEFAULT.equals(afirmacion);
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
    result.append(" (negacion: ");
    result.append(negacion);
    result.append(", afirmacion: ");
    result.append(afirmacion);
    result.append(')');
    return result.toString();
  }

} //AfirmacionImpl