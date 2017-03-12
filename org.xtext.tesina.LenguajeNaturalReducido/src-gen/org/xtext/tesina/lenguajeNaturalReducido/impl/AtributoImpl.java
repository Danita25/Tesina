/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.xtext.tesina.lenguajeNaturalReducido.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.tesina.lenguajeNaturalReducido.Atributo;
import org.xtext.tesina.lenguajeNaturalReducido.LenguajeNaturalReducidoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.tesina.lenguajeNaturalReducido.impl.AtributoImpl#getDeterminante <em>Determinante</em>}</li>
 *   <li>{@link org.xtext.tesina.lenguajeNaturalReducido.impl.AtributoImpl#getCuantitativo <em>Cuantitativo</em>}</li>
 *   <li>{@link org.xtext.tesina.lenguajeNaturalReducido.impl.AtributoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link org.xtext.tesina.lenguajeNaturalReducido.impl.AtributoImpl#getEnlace <em>Enlace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtributoImpl extends MinimalEObjectImpl.Container implements Atributo
{
  /**
   * The default value of the '{@link #getDeterminante() <em>Determinante</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeterminante()
   * @generated
   * @ordered
   */
  protected static final String DETERMINANTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDeterminante() <em>Determinante</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeterminante()
   * @generated
   * @ordered
   */
  protected String determinante = DETERMINANTE_EDEFAULT;

  /**
   * The default value of the '{@link #getCuantitativo() <em>Cuantitativo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCuantitativo()
   * @generated
   * @ordered
   */
  protected static final String CUANTITATIVO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCuantitativo() <em>Cuantitativo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCuantitativo()
   * @generated
   * @ordered
   */
  protected String cuantitativo = CUANTITATIVO_EDEFAULT;

  /**
   * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNombre()
   * @generated
   * @ordered
   */
  protected static final String NOMBRE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNombre()
   * @generated
   * @ordered
   */
  protected String nombre = NOMBRE_EDEFAULT;

  /**
   * The default value of the '{@link #getEnlace() <em>Enlace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnlace()
   * @generated
   * @ordered
   */
  protected static final String ENLACE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEnlace() <em>Enlace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnlace()
   * @generated
   * @ordered
   */
  protected String enlace = ENLACE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AtributoImpl()
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
    return LenguajeNaturalReducidoPackage.Literals.ATRIBUTO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDeterminante()
  {
    return determinante;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeterminante(String newDeterminante)
  {
    String oldDeterminante = determinante;
    determinante = newDeterminante;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LenguajeNaturalReducidoPackage.ATRIBUTO__DETERMINANTE, oldDeterminante, determinante));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCuantitativo()
  {
    return cuantitativo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCuantitativo(String newCuantitativo)
  {
    String oldCuantitativo = cuantitativo;
    cuantitativo = newCuantitativo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LenguajeNaturalReducidoPackage.ATRIBUTO__CUANTITATIVO, oldCuantitativo, cuantitativo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNombre()
  {
    return nombre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNombre(String newNombre)
  {
    String oldNombre = nombre;
    nombre = newNombre;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LenguajeNaturalReducidoPackage.ATRIBUTO__NOMBRE, oldNombre, nombre));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEnlace()
  {
    return enlace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnlace(String newEnlace)
  {
    String oldEnlace = enlace;
    enlace = newEnlace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LenguajeNaturalReducidoPackage.ATRIBUTO__ENLACE, oldEnlace, enlace));
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
      case LenguajeNaturalReducidoPackage.ATRIBUTO__DETERMINANTE:
        return getDeterminante();
      case LenguajeNaturalReducidoPackage.ATRIBUTO__CUANTITATIVO:
        return getCuantitativo();
      case LenguajeNaturalReducidoPackage.ATRIBUTO__NOMBRE:
        return getNombre();
      case LenguajeNaturalReducidoPackage.ATRIBUTO__ENLACE:
        return getEnlace();
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
      case LenguajeNaturalReducidoPackage.ATRIBUTO__DETERMINANTE:
        setDeterminante((String)newValue);
        return;
      case LenguajeNaturalReducidoPackage.ATRIBUTO__CUANTITATIVO:
        setCuantitativo((String)newValue);
        return;
      case LenguajeNaturalReducidoPackage.ATRIBUTO__NOMBRE:
        setNombre((String)newValue);
        return;
      case LenguajeNaturalReducidoPackage.ATRIBUTO__ENLACE:
        setEnlace((String)newValue);
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
      case LenguajeNaturalReducidoPackage.ATRIBUTO__DETERMINANTE:
        setDeterminante(DETERMINANTE_EDEFAULT);
        return;
      case LenguajeNaturalReducidoPackage.ATRIBUTO__CUANTITATIVO:
        setCuantitativo(CUANTITATIVO_EDEFAULT);
        return;
      case LenguajeNaturalReducidoPackage.ATRIBUTO__NOMBRE:
        setNombre(NOMBRE_EDEFAULT);
        return;
      case LenguajeNaturalReducidoPackage.ATRIBUTO__ENLACE:
        setEnlace(ENLACE_EDEFAULT);
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
      case LenguajeNaturalReducidoPackage.ATRIBUTO__DETERMINANTE:
        return DETERMINANTE_EDEFAULT == null ? determinante != null : !DETERMINANTE_EDEFAULT.equals(determinante);
      case LenguajeNaturalReducidoPackage.ATRIBUTO__CUANTITATIVO:
        return CUANTITATIVO_EDEFAULT == null ? cuantitativo != null : !CUANTITATIVO_EDEFAULT.equals(cuantitativo);
      case LenguajeNaturalReducidoPackage.ATRIBUTO__NOMBRE:
        return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
      case LenguajeNaturalReducidoPackage.ATRIBUTO__ENLACE:
        return ENLACE_EDEFAULT == null ? enlace != null : !ENLACE_EDEFAULT.equals(enlace);
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
    result.append(" (determinante: ");
    result.append(determinante);
    result.append(", cuantitativo: ");
    result.append(cuantitativo);
    result.append(", nombre: ");
    result.append(nombre);
    result.append(", enlace: ");
    result.append(enlace);
    result.append(')');
    return result.toString();
  }

} //AtributoImpl
