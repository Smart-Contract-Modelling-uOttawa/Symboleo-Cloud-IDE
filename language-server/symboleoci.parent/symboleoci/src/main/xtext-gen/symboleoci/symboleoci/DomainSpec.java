/**
 * generated by Xtext 2.22.0
 */
package symboleoci.symboleoci;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link symboleoci.symboleoci.DomainSpec#getName <em>Name</em>}</li>
 *   <li>{@link symboleoci.symboleoci.DomainSpec#getDConcepts <em>DConcepts</em>}</li>
 *   <li>{@link symboleoci.symboleoci.DomainSpec#getCtypes <em>Ctypes</em>}</li>
 * </ul>
 *
 * @see symboleoci.symboleoci.SymboleociPackage#getDomainSpec()
 * @model
 * @generated
 */
public interface DomainSpec extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see symboleoci.symboleoci.SymboleociPackage#getDomainSpec_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link symboleoci.symboleoci.DomainSpec#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>DConcepts</b></em>' containment reference list.
   * The list contents are of type {@link symboleoci.symboleoci.DConcept}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>DConcepts</em>' containment reference list.
   * @see symboleoci.symboleoci.SymboleociPackage#getDomainSpec_DConcepts()
   * @model containment="true"
   * @generated
   */
  EList<DConcept> getDConcepts();

  /**
   * Returns the value of the '<em><b>Ctypes</b></em>' containment reference list.
   * The list contents are of type {@link symboleoci.symboleoci.CType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ctypes</em>' containment reference list.
   * @see symboleoci.symboleoci.SymboleociPackage#getDomainSpec_Ctypes()
   * @model containment="true"
   * @generated
   */
  EList<CType> getCtypes();

} // DomainSpec
