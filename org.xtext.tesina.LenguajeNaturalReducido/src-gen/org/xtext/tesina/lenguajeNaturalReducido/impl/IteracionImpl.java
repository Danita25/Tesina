/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.xtext.tesina.lenguajeNaturalReducido.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.tesina.lenguajeNaturalReducido.Contenido;
import org.xtext.tesina.lenguajeNaturalReducido.Iteracion;
import org.xtext.tesina.lenguajeNaturalReducido.LenguajeNaturalReducidoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iteracion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.tesina.lenguajeNaturalReducido.impl.IteracionImpl#getCondicion <em>Condicion</em>}</li>
 *   <li>{@link org.xtext.tesina.lenguajeNaturalReducido.impl.IteracionImpl#getContenido <em>Contenido</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IteracionImpl extends MinimalEObjectImpl.Container implements Iteracion
{
  /**
   * The default value of the '{@link #getCondicion() <em>Condicion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondicion()
   * @generated
   * @ordered
   */
  protected static final String CONDICION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCondicion() <em>Condicion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondicion()
   * @generated
   * @ordered
   */
  protected String condicion = CONDICION_EDEFAULT;

  /**
   * The cached value of the '{@link #getContenido() <em>Contenido</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContenido()
   * @generated
   * @ordered
   */
  protected Contenido contenido;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IteracionImpl()
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
    return LenguajeNaturalReducidoPackage.Literals.ITERACION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCondicion()
  {
    return condicion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondicion(String newCondicion)
  {
    String oldCondicion = condicion;
    condicion = newCondicion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LenguajeNaturalReducidoPackage.ITERACION__CONDICION, oldCondicion, condicion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Contenido getContenido()
  {
    return contenido;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContenido(Contenido newContenido, NotificationChain msgs)
  {
    Contenido oldContenido = contenido;
    contenido = newContenido;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LenguajeNaturalReducidoPackage.ITERACION__CONTENIDO, oldContenido, newContenido);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContenido(Contenido newContenido)
  {
    if (newContenido != contenido)
    {
      NotificationChain msgs = null;
      if (contenido != null)
        msgs = ((InternalEObject)contenido).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LenguajeNaturalReducidoPackage.ITERACION__CONTENIDO, null, msgs);
      if (newContenido != null)
        msgs = ((InternalEObject)newContenido).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LenguajeNaturalReducidoPackage.ITERACION__CONTENIDO, null, msgs);
      msgs = basicSetContenido(newContenido, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LenguajeNaturalReducidoPackage.ITERACION__CONTENIDO, newContenido, newContenido));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LenguajeNaturalReducidoPackage.ITERACION__CONTENIDO:
        return basicSetContenido(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case LenguajeNaturalReducidoPackage.ITERACION__CONDICION:
        return getCondicion();
      case LenguajeNaturalReducidoPackage.ITERACION__CONTENIDO:
        return getContenido();
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
      case LenguajeNaturalReducidoPackage.ITERACION__CONDICION:
        setCondicion((String)newValue);
        return;
      case LenguajeNaturalReducidoPackage.ITERACION__CONTENIDO:
        setContenido((Contenido)newValue);
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
      case LenguajeNaturalReducidoPackage.ITERACION__CONDICION:
        setCondicion(CONDICION_EDEFAULT);
        return;
      case LenguajeNaturalReducidoPackage.ITERACION__CONTENIDO:
        setContenido((Contenido)null);
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
      case LenguajeNaturalReducidoPackage.ITERACION__CONDICION:
        return CONDICION_EDEFAULT == null ? condicion != null : !CONDICION_EDEFAULT.equals(condicion);
      case LenguajeNaturalReducidoPackage.ITERACION__CONTENIDO:
        return contenido != null;
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
    result.append(" (condicion: ");
    result.append(condicion);
    result.append(')');
    return result.toString();
  }

} //IteracionImpl
