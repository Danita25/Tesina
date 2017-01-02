/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.xtext.tesis.gramatica.gramatica.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.tesis.gramatica.gramatica.GramaticaPackage;
import org.xtext.tesis.gramatica.gramatica.Obligacion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Obligacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.tesis.gramatica.gramatica.impl.ObligacionImpl#getNegacion <em>Negacion</em>}</li>
 *   <li>{@link org.xtext.tesis.gramatica.gramatica.impl.ObligacionImpl#getObligacion <em>Obligacion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObligacionImpl extends MinimalEObjectImpl.Container implements Obligacion
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
   * The default value of the '{@link #getObligacion() <em>Obligacion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObligacion()
   * @generated
   * @ordered
   */
  protected static final String OBLIGACION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getObligacion() <em>Obligacion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObligacion()
   * @generated
   * @ordered
   */
  protected String obligacion = OBLIGACION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObligacionImpl()
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
    return GramaticaPackage.Literals.OBLIGACION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GramaticaPackage.OBLIGACION__NEGACION, oldNegacion, negacion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getObligacion()
  {
    return obligacion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObligacion(String newObligacion)
  {
    String oldObligacion = obligacion;
    obligacion = newObligacion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GramaticaPackage.OBLIGACION__OBLIGACION, oldObligacion, obligacion));
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
      case GramaticaPackage.OBLIGACION__NEGACION:
        return getNegacion();
      case GramaticaPackage.OBLIGACION__OBLIGACION:
        return getObligacion();
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
      case GramaticaPackage.OBLIGACION__NEGACION:
        setNegacion((String)newValue);
        return;
      case GramaticaPackage.OBLIGACION__OBLIGACION:
        setObligacion((String)newValue);
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
      case GramaticaPackage.OBLIGACION__NEGACION:
        setNegacion(NEGACION_EDEFAULT);
        return;
      case GramaticaPackage.OBLIGACION__OBLIGACION:
        setObligacion(OBLIGACION_EDEFAULT);
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
      case GramaticaPackage.OBLIGACION__NEGACION:
        return NEGACION_EDEFAULT == null ? negacion != null : !NEGACION_EDEFAULT.equals(negacion);
      case GramaticaPackage.OBLIGACION__OBLIGACION:
        return OBLIGACION_EDEFAULT == null ? obligacion != null : !OBLIGACION_EDEFAULT.equals(obligacion);
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
    result.append(", obligacion: ");
    result.append(obligacion);
    result.append(')');
    return result.toString();
  }

} //ObligacionImpl
