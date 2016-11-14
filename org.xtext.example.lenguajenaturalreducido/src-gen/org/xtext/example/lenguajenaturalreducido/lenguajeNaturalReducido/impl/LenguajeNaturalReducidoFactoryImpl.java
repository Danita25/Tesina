/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.xtext.example.lenguajenaturalreducido.lenguajeNaturalReducido.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.lenguajenaturalreducido.lenguajeNaturalReducido.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LenguajeNaturalReducidoFactoryImpl extends EFactoryImpl implements LenguajeNaturalReducidoFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LenguajeNaturalReducidoFactory init()
  {
    try
    {
      LenguajeNaturalReducidoFactory theLenguajeNaturalReducidoFactory = (LenguajeNaturalReducidoFactory)EPackage.Registry.INSTANCE.getEFactory(LenguajeNaturalReducidoPackage.eNS_URI);
      if (theLenguajeNaturalReducidoFactory != null)
      {
        return theLenguajeNaturalReducidoFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LenguajeNaturalReducidoFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LenguajeNaturalReducidoFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LenguajeNaturalReducidoPackage.DOCUMENTO: return createDocumento();
      case LenguajeNaturalReducidoPackage.ORACION: return createOracion();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Documento createDocumento()
  {
    DocumentoImpl documento = new DocumentoImpl();
    return documento;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Oracion createOracion()
  {
    OracionImpl oracion = new OracionImpl();
    return oracion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LenguajeNaturalReducidoPackage getLenguajeNaturalReducidoPackage()
  {
    return (LenguajeNaturalReducidoPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LenguajeNaturalReducidoPackage getPackage()
  {
    return LenguajeNaturalReducidoPackage.eINSTANCE;
  }

} //LenguajeNaturalReducidoFactoryImpl