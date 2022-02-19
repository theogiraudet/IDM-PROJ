/**
 * generated by Xtext 2.25.0
 */
package fr.istic.idm.swag;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.istic.idm.swag.ComplexPath#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see fr.istic.idm.swag.SwagPackage#getComplexPath()
 * @model
 * @generated
 */
public interface ComplexPath extends Path
{
  /**
   * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
   * The list contents are of type {@link fr.istic.idm.swag.Node}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nodes</em>' containment reference list.
   * @see fr.istic.idm.swag.SwagPackage#getComplexPath_Nodes()
   * @model containment="true"
   * @generated
   */
  EList<Node> getNodes();

} // ComplexPath
