/**
 * generated by Xtext 2.25.0
 */
package fr.istic.idm.swag.util;

import fr.istic.idm.swag.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.istic.idm.swag.SwagPackage
 * @generated
 */
public class SwagSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SwagPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwagSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SwagPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SwagPackage.PATH:
      {
        Path path = (Path)theEObject;
        T result = casePath(path);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwagPackage.NODE:
      {
        Node node = (Node)theEObject;
        T result = caseNode(node);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwagPackage.BASIC_NODE:
      {
        BasicNode basicNode = (BasicNode)theEObject;
        T result = caseBasicNode(basicNode);
        if (result == null) result = caseNode(basicNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwagPackage.ARRAY_NODE:
      {
        ArrayNode arrayNode = (ArrayNode)theEObject;
        T result = caseArrayNode(arrayNode);
        if (result == null) result = caseNode(arrayNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwagPackage.FILTER:
      {
        Filter filter = (Filter)theEObject;
        T result = caseFilter(filter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwagPackage.ALL_FILTER:
      {
        AllFilter allFilter = (AllFilter)theEObject;
        T result = caseAllFilter(allFilter);
        if (result == null) result = caseFilter(allFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwagPackage.PATH_FILTER:
      {
        PathFilter pathFilter = (PathFilter)theEObject;
        T result = casePathFilter(pathFilter);
        if (result == null) result = caseFilter(pathFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwagPackage.EQUAL_FILTER:
      {
        EqualFilter equalFilter = (EqualFilter)theEObject;
        T result = caseEqualFilter(equalFilter);
        if (result == null) result = casePathFilter(equalFilter);
        if (result == null) result = caseFilter(equalFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwagPackage.EXIST_FILTER:
      {
        ExistFilter existFilter = (ExistFilter)theEObject;
        T result = caseExistFilter(existFilter);
        if (result == null) result = casePathFilter(existFilter);
        if (result == null) result = caseFilter(existFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwagPackage.INDEX_FILTER:
      {
        IndexFilter indexFilter = (IndexFilter)theEObject;
        T result = caseIndexFilter(indexFilter);
        if (result == null) result = caseFilter(indexFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwagPackage.BOUND_FILTER:
      {
        BoundFilter boundFilter = (BoundFilter)theEObject;
        T result = caseBoundFilter(boundFilter);
        if (result == null) result = caseFilter(boundFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwagPackage.LIST_FILTER:
      {
        ListFilter listFilter = (ListFilter)theEObject;
        T result = caseListFilter(listFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwagPackage.JSON_VALUE:
      {
        JsonValue jsonValue = (JsonValue)theEObject;
        T result = caseJsonValue(jsonValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwagPackage.JSON_NULL:
      {
        JsonNull jsonNull = (JsonNull)theEObject;
        T result = caseJsonNull(jsonNull);
        if (result == null) result = caseJsonValue(jsonNull);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwagPackage.JSON_NUMBER:
      {
        JsonNumber jsonNumber = (JsonNumber)theEObject;
        T result = caseJsonNumber(jsonNumber);
        if (result == null) result = caseJsonValue(jsonNumber);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwagPackage.JSON_BOOLEAN:
      {
        JsonBoolean jsonBoolean = (JsonBoolean)theEObject;
        T result = caseJsonBoolean(jsonBoolean);
        if (result == null) result = caseJsonValue(jsonBoolean);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwagPackage.JSON_STRING:
      {
        JsonString jsonString = (JsonString)theEObject;
        T result = caseJsonString(jsonString);
        if (result == null) result = caseJsonValue(jsonString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Path</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Path</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePath(Path object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNode(Node object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Basic Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Basic Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasicNode(BasicNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayNode(ArrayNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFilter(Filter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>All Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>All Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAllFilter(AllFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Path Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Path Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePathFilter(PathFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equal Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equal Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEqualFilter(EqualFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exist Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exist Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExistFilter(ExistFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Index Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Index Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIndexFilter(IndexFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bound Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bound Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoundFilter(BoundFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListFilter(ListFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Json Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Json Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJsonValue(JsonValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Json Null</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Json Null</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJsonNull(JsonNull object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Json Number</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Json Number</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJsonNumber(JsonNumber object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Json Boolean</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Json Boolean</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJsonBoolean(JsonBoolean object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Json String</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Json String</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJsonString(JsonString object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SwagSwitch