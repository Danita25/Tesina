/**
 * generated by Xtext 2.10.0
 */
package org.xtext.tesis.gramatica.gramatica.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.tesis.gramatica.gramatica.Atributo;
import org.xtext.tesis.gramatica.gramatica.Clase;
import org.xtext.tesis.gramatica.gramatica.Compleja;
import org.xtext.tesis.gramatica.gramatica.Determinante;
import org.xtext.tesis.gramatica.gramatica.Documento;
import org.xtext.tesis.gramatica.gramatica.GramaticaFactory;
import org.xtext.tesis.gramatica.gramatica.GramaticaPackage;
import org.xtext.tesis.gramatica.gramatica.Negacion;
import org.xtext.tesis.gramatica.gramatica.Obligacion;
import org.xtext.tesis.gramatica.gramatica.ObligacionDeber;
import org.xtext.tesis.gramatica.gramatica.Operacion;
import org.xtext.tesis.gramatica.gramatica.Oracion;
import org.xtext.tesis.gramatica.gramatica.Simple;
import org.xtext.tesis.gramatica.gramatica.SintagmaPreposicional;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GramaticaPackageImpl extends EPackageImpl implements GramaticaPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass documentoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oracionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass determinanteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atributoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sintagmaPreposicionalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass obligacionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass obligacionDeberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass negacionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operacionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass claseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass complejaEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.tesis.gramatica.gramatica.GramaticaPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private GramaticaPackageImpl()
  {
    super(eNS_URI, GramaticaFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link GramaticaPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static GramaticaPackage init()
  {
    if (isInited) return (GramaticaPackage)EPackage.Registry.INSTANCE.getEPackage(GramaticaPackage.eNS_URI);

    // Obtain or create and register package
    GramaticaPackageImpl theGramaticaPackage = (GramaticaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GramaticaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GramaticaPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theGramaticaPackage.createPackageContents();

    // Initialize created meta-data
    theGramaticaPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theGramaticaPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(GramaticaPackage.eNS_URI, theGramaticaPackage);
    return theGramaticaPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDocumento()
  {
    return documentoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumento_PathModelo()
  {
    return (EAttribute)documentoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumento_PathOcl()
  {
    return (EAttribute)documentoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumento_Oraciones()
  {
    return (EReference)documentoEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOracion()
  {
    return oracionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimple()
  {
    return simpleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimple_Determinante()
  {
    return (EReference)simpleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimple_Atributo()
  {
    return (EReference)simpleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimple_Sintagma()
  {
    return (EReference)simpleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimple_Contexto()
  {
    return (EReference)simpleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimple_Obligacion()
  {
    return (EReference)simpleEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimple_Operacion()
  {
    return (EReference)simpleEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimple_Literal()
  {
    return (EAttribute)simpleEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeterminante()
  {
    return determinanteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeterminante_Descripcion()
  {
    return (EAttribute)determinanteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtributo()
  {
    return atributoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtributo_Name()
  {
    return (EAttribute)atributoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSintagmaPreposicional()
  {
    return sintagmaPreposicionalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSintagmaPreposicional_Descripcion()
  {
    return (EAttribute)sintagmaPreposicionalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObligacion()
  {
    return obligacionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObligacion_Negacion()
  {
    return (EReference)obligacionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObligacion_ObligacionDeber()
  {
    return (EReference)obligacionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObligacionDeber()
  {
    return obligacionDeberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObligacionDeber_Descripcion()
  {
    return (EAttribute)obligacionDeberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNegacion()
  {
    return negacionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNegacion_Descripcion()
  {
    return (EAttribute)negacionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperacion()
  {
    return operacionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperacion_Descripcion()
  {
    return (EAttribute)operacionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClase()
  {
    return claseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClase_Name()
  {
    return (EAttribute)claseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompleja()
  {
    return complejaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompleja_Atributo()
  {
    return (EReference)complejaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompleja_Contexto()
  {
    return (EReference)complejaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCompleja_Literal()
  {
    return (EAttribute)complejaEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GramaticaFactory getGramaticaFactory()
  {
    return (GramaticaFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    documentoEClass = createEClass(DOCUMENTO);
    createEAttribute(documentoEClass, DOCUMENTO__PATH_MODELO);
    createEAttribute(documentoEClass, DOCUMENTO__PATH_OCL);
    createEReference(documentoEClass, DOCUMENTO__ORACIONES);

    oracionEClass = createEClass(ORACION);

    simpleEClass = createEClass(SIMPLE);
    createEReference(simpleEClass, SIMPLE__DETERMINANTE);
    createEReference(simpleEClass, SIMPLE__ATRIBUTO);
    createEReference(simpleEClass, SIMPLE__SINTAGMA);
    createEReference(simpleEClass, SIMPLE__CONTEXTO);
    createEReference(simpleEClass, SIMPLE__OBLIGACION);
    createEReference(simpleEClass, SIMPLE__OPERACION);
    createEAttribute(simpleEClass, SIMPLE__LITERAL);

    determinanteEClass = createEClass(DETERMINANTE);
    createEAttribute(determinanteEClass, DETERMINANTE__DESCRIPCION);

    atributoEClass = createEClass(ATRIBUTO);
    createEAttribute(atributoEClass, ATRIBUTO__NAME);

    sintagmaPreposicionalEClass = createEClass(SINTAGMA_PREPOSICIONAL);
    createEAttribute(sintagmaPreposicionalEClass, SINTAGMA_PREPOSICIONAL__DESCRIPCION);

    obligacionEClass = createEClass(OBLIGACION);
    createEReference(obligacionEClass, OBLIGACION__NEGACION);
    createEReference(obligacionEClass, OBLIGACION__OBLIGACION_DEBER);

    obligacionDeberEClass = createEClass(OBLIGACION_DEBER);
    createEAttribute(obligacionDeberEClass, OBLIGACION_DEBER__DESCRIPCION);

    negacionEClass = createEClass(NEGACION);
    createEAttribute(negacionEClass, NEGACION__DESCRIPCION);

    operacionEClass = createEClass(OPERACION);
    createEAttribute(operacionEClass, OPERACION__DESCRIPCION);

    claseEClass = createEClass(CLASE);
    createEAttribute(claseEClass, CLASE__NAME);

    complejaEClass = createEClass(COMPLEJA);
    createEReference(complejaEClass, COMPLEJA__ATRIBUTO);
    createEReference(complejaEClass, COMPLEJA__CONTEXTO);
    createEAttribute(complejaEClass, COMPLEJA__LITERAL);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    simpleEClass.getESuperTypes().add(this.getOracion());

    // Initialize classes and features; add operations and parameters
    initEClass(documentoEClass, Documento.class, "Documento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDocumento_PathModelo(), ecorePackage.getEString(), "pathModelo", null, 0, 1, Documento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDocumento_PathOcl(), ecorePackage.getEString(), "pathOcl", null, 0, 1, Documento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumento_Oraciones(), this.getOracion(), null, "oraciones", null, 0, -1, Documento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oracionEClass, Oracion.class, "Oracion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(simpleEClass, Simple.class, "Simple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSimple_Determinante(), this.getDeterminante(), null, "determinante", null, 0, 1, Simple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimple_Atributo(), this.getAtributo(), null, "atributo", null, 0, 1, Simple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimple_Sintagma(), this.getSintagmaPreposicional(), null, "Sintagma", null, 0, 1, Simple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimple_Contexto(), this.getClase(), null, "contexto", null, 0, 1, Simple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimple_Obligacion(), this.getObligacion(), null, "obligacion", null, 0, 1, Simple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimple_Operacion(), this.getOperacion(), null, "operacion", null, 0, 1, Simple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimple_Literal(), ecorePackage.getEString(), "literal", null, 0, 1, Simple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(determinanteEClass, Determinante.class, "Determinante", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeterminante_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, Determinante.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atributoEClass, Atributo.class, "Atributo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAtributo_Name(), ecorePackage.getEString(), "name", null, 0, 1, Atributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sintagmaPreposicionalEClass, SintagmaPreposicional.class, "SintagmaPreposicional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSintagmaPreposicional_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, SintagmaPreposicional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(obligacionEClass, Obligacion.class, "Obligacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObligacion_Negacion(), this.getNegacion(), null, "negacion", null, 0, 1, Obligacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObligacion_ObligacionDeber(), this.getObligacionDeber(), null, "obligacionDeber", null, 0, 1, Obligacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(obligacionDeberEClass, ObligacionDeber.class, "ObligacionDeber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getObligacionDeber_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, ObligacionDeber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(negacionEClass, Negacion.class, "Negacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNegacion_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, Negacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operacionEClass, Operacion.class, "Operacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOperacion_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, Operacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(claseEClass, Clase.class, "Clase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClase_Name(), ecorePackage.getEString(), "name", null, 0, 1, Clase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(complejaEClass, Compleja.class, "Compleja", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCompleja_Atributo(), ecorePackage.getEObject(), null, "atributo", null, 0, 1, Compleja.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompleja_Contexto(), this.getClase(), null, "contexto", null, 0, 1, Compleja.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCompleja_Literal(), ecorePackage.getEString(), "literal", null, 0, 1, Compleja.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //GramaticaPackageImpl
