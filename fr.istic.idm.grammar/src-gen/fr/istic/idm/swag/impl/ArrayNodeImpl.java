/**
 * generated by Xtext 2.25.0
 */
package fr.istic.idm.swag.impl;

import fr.istic.idm.swag.ArrayNode;
import fr.istic.idm.swag.ListFilter;
import fr.istic.idm.swag.SwagPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.istic.idm.swag.impl.ArrayNodeImpl#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayNodeImpl extends NodeImpl implements ArrayNode
{
  /**
   * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilter()
   * @generated
   * @ordered
   */
  protected ListFilter filter;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArrayNodeImpl()
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
    return SwagPackage.Literals.ARRAY_NODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ListFilter getFilter()
  {
    return filter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFilter(ListFilter newFilter, NotificationChain msgs)
  {
    ListFilter oldFilter = filter;
    filter = newFilter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwagPackage.ARRAY_NODE__FILTER, oldFilter, newFilter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFilter(ListFilter newFilter)
  {
    if (newFilter != filter)
    {
      NotificationChain msgs = null;
      if (filter != null)
        msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwagPackage.ARRAY_NODE__FILTER, null, msgs);
      if (newFilter != null)
        msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwagPackage.ARRAY_NODE__FILTER, null, msgs);
      msgs = basicSetFilter(newFilter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwagPackage.ARRAY_NODE__FILTER, newFilter, newFilter));
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
      case SwagPackage.ARRAY_NODE__FILTER:
        return basicSetFilter(null, msgs);
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
      case SwagPackage.ARRAY_NODE__FILTER:
        return getFilter();
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
      case SwagPackage.ARRAY_NODE__FILTER:
        setFilter((ListFilter)newValue);
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
      case SwagPackage.ARRAY_NODE__FILTER:
        setFilter((ListFilter)null);
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
      case SwagPackage.ARRAY_NODE__FILTER:
        return filter != null;
    }
    return super.eIsSet(featureID);
  }

} //ArrayNodeImpl
