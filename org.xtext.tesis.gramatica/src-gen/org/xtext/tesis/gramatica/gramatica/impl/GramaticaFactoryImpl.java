/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.xtext.tesis.gramatica.gramatica.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.tesis.gramatica.gramatica.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GramaticaFactoryImpl extends EFactoryImpl implements GramaticaFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GramaticaFactory init()
  {
    try
    {
      GramaticaFactory theGramaticaFactory = (GramaticaFactory)EPackage.Registry.INSTANCE.getEFactory(GramaticaPackage.eNS_URI);
      if (theGramaticaFactory != null)
      {
        return theGramaticaFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GramaticaFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GramaticaFactoryImpl()
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
      case GramaticaPackage.DOCUMENTO: return createDocumento();
      case GramaticaPackage.ORACION: return createOracion();
      case GramaticaPackage.SIMPLE: return createSimple();
      case GramaticaPackage.COMPUESTA: return createCompuesta();
      case GramaticaPackage.NEXO: return createNexo();
      case GramaticaPackage.DETERMINANTE: return createDeterminante();
      case GramaticaPackage.ATRIBUTO: return createAtributo();
      case GramaticaPackage.SINTAGMA_PREPOSICIONAL: return createSintagmaPreposicional();
      case GramaticaPackage.ENLACE: return createEnlace();
      case GramaticaPackage.TERMINO: return createTermino();
      case GramaticaPackage.INDETERMINANTE: return createIndeterminante();
      case GramaticaPackage.OBLIGACION: return createObligacion();
      case GramaticaPackage.OPERACION: return createOperacion();
      case GramaticaPackage.CONTEXTO: return createContexto();
      case GramaticaPackage.LITERAL: return createLiteral();
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
  public Simple createSimple()
  {
    SimpleImpl simple = new SimpleImpl();
    return simple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Compuesta createCompuesta()
  {
    CompuestaImpl compuesta = new CompuestaImpl();
    return compuesta;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Nexo createNexo()
  {
    NexoImpl nexo = new NexoImpl();
    return nexo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Determinante createDeterminante()
  {
    DeterminanteImpl determinante = new DeterminanteImpl();
    return determinante;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Atributo createAtributo()
  {
    AtributoImpl atributo = new AtributoImpl();
    return atributo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SintagmaPreposicional createSintagmaPreposicional()
  {
    SintagmaPreposicionalImpl sintagmaPreposicional = new SintagmaPreposicionalImpl();
    return sintagmaPreposicional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enlace createEnlace()
  {
    EnlaceImpl enlace = new EnlaceImpl();
    return enlace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Termino createTermino()
  {
    TerminoImpl termino = new TerminoImpl();
    return termino;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Indeterminante createIndeterminante()
  {
    IndeterminanteImpl indeterminante = new IndeterminanteImpl();
    return indeterminante;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Obligacion createObligacion()
  {
    ObligacionImpl obligacion = new ObligacionImpl();
    return obligacion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operacion createOperacion()
  {
    OperacionImpl operacion = new OperacionImpl();
    return operacion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Contexto createContexto()
  {
    ContextoImpl contexto = new ContextoImpl();
    return contexto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GramaticaPackage getGramaticaPackage()
  {
    return (GramaticaPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GramaticaPackage getPackage()
  {
    return GramaticaPackage.eINSTANCE;
  }

} //GramaticaFactoryImpl
