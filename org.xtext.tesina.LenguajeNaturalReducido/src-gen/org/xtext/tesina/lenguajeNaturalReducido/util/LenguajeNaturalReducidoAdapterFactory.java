/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.xtext.tesina.lenguajeNaturalReducido.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.tesina.lenguajeNaturalReducido.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.tesina.lenguajeNaturalReducido.LenguajeNaturalReducidoPackage
 * @generated
 */
public class LenguajeNaturalReducidoAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LenguajeNaturalReducidoPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LenguajeNaturalReducidoAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = LenguajeNaturalReducidoPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LenguajeNaturalReducidoSwitch<Adapter> modelSwitch =
    new LenguajeNaturalReducidoSwitch<Adapter>()
    {
      @Override
      public Adapter caseDocumento(Documento object)
      {
        return createDocumentoAdapter();
      }
      @Override
      public Adapter caseOracion(Oracion object)
      {
        return createOracionAdapter();
      }
      @Override
      public Adapter caseContenido(Contenido object)
      {
        return createContenidoAdapter();
      }
      @Override
      public Adapter caseSimple(Simple object)
      {
        return createSimpleAdapter();
      }
      @Override
      public Adapter caseExpresionDerecha(ExpresionDerecha object)
      {
        return createExpresionDerechaAdapter();
      }
      @Override
      public Adapter caseComposicion(Composicion object)
      {
        return createComposicionAdapter();
      }
      @Override
      public Adapter caseNexo(Nexo object)
      {
        return createNexoAdapter();
      }
      @Override
      public Adapter caseExpresion(Expresion object)
      {
        return createExpresionAdapter();
      }
      @Override
      public Adapter caseComparacion(Comparacion object)
      {
        return createComparacionAdapter();
      }
      @Override
      public Adapter casePropiedad(Propiedad object)
      {
        return createPropiedadAdapter();
      }
      @Override
      public Adapter caseIteracion(Iteracion object)
      {
        return createIteracionAdapter();
      }
      @Override
      public Adapter caseAtributo(Atributo object)
      {
        return createAtributoAdapter();
      }
      @Override
      public Adapter caseTermino(Termino object)
      {
        return createTerminoAdapter();
      }
      @Override
      public Adapter caseObligacion(Obligacion object)
      {
        return createObligacionAdapter();
      }
      @Override
      public Adapter caseOperacion(Operacion object)
      {
        return createOperacionAdapter();
      }
      @Override
      public Adapter caseLiteral(Literal object)
      {
        return createLiteralAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.tesina.lenguajeNaturalReducido.Documento <em>Documento</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.tesina.lenguajeNaturalReducido.Documento
   * @generated
   */
  public Adapter createDocumentoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.tesina.lenguajeNaturalReducido.Oracion <em>Oracion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.tesina.lenguajeNaturalReducido.Oracion
   * @generated
   */
  public Adapter createOracionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.tesina.lenguajeNaturalReducido.Contenido <em>Contenido</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.tesina.lenguajeNaturalReducido.Contenido
   * @generated
   */
  public Adapter createContenidoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.tesina.lenguajeNaturalReducido.Simple <em>Simple</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.tesina.lenguajeNaturalReducido.Simple
   * @generated
   */
  public Adapter createSimpleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.tesina.lenguajeNaturalReducido.ExpresionDerecha <em>Expresion Derecha</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.tesina.lenguajeNaturalReducido.ExpresionDerecha
   * @generated
   */
  public Adapter createExpresionDerechaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.tesina.lenguajeNaturalReducido.Composicion <em>Composicion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.tesina.lenguajeNaturalReducido.Composicion
   * @generated
   */
  public Adapter createComposicionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.tesina.lenguajeNaturalReducido.Nexo <em>Nexo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.tesina.lenguajeNaturalReducido.Nexo
   * @generated
   */
  public Adapter createNexoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.tesina.lenguajeNaturalReducido.Expresion <em>Expresion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.tesina.lenguajeNaturalReducido.Expresion
   * @generated
   */
  public Adapter createExpresionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.tesina.lenguajeNaturalReducido.Comparacion <em>Comparacion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.tesina.lenguajeNaturalReducido.Comparacion
   * @generated
   */
  public Adapter createComparacionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.tesina.lenguajeNaturalReducido.Propiedad <em>Propiedad</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.tesina.lenguajeNaturalReducido.Propiedad
   * @generated
   */
  public Adapter createPropiedadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.tesina.lenguajeNaturalReducido.Iteracion <em>Iteracion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.tesina.lenguajeNaturalReducido.Iteracion
   * @generated
   */
  public Adapter createIteracionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.tesina.lenguajeNaturalReducido.Atributo <em>Atributo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.tesina.lenguajeNaturalReducido.Atributo
   * @generated
   */
  public Adapter createAtributoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.tesina.lenguajeNaturalReducido.Termino <em>Termino</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.tesina.lenguajeNaturalReducido.Termino
   * @generated
   */
  public Adapter createTerminoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.tesina.lenguajeNaturalReducido.Obligacion <em>Obligacion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.tesina.lenguajeNaturalReducido.Obligacion
   * @generated
   */
  public Adapter createObligacionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.tesina.lenguajeNaturalReducido.Operacion <em>Operacion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.tesina.lenguajeNaturalReducido.Operacion
   * @generated
   */
  public Adapter createOperacionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.tesina.lenguajeNaturalReducido.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.tesina.lenguajeNaturalReducido.Literal
   * @generated
   */
  public Adapter createLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //LenguajeNaturalReducidoAdapterFactory
