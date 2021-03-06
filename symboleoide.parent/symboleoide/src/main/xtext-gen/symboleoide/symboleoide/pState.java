/**
 * generated by Xtext 2.22.0
 */
package symboleoide.symboleoide;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>pState</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link symboleoide.symboleoide.pState#getPowState <em>Pow State</em>}</li>
 *   <li>{@link symboleoide.symboleoide.pState#getPowName <em>Pow Name</em>}</li>
 * </ul>
 *
 * @see symboleoide.symboleoide.SymboleoidePackage#getpState()
 * @model
 * @generated
 */
public interface pState extends EObject
{
  /**
   * Returns the value of the '<em><b>Pow State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pow State</em>' attribute.
   * @see #setPowState(String)
   * @see symboleoide.symboleoide.SymboleoidePackage#getpState_PowState()
   * @model
   * @generated
   */
  String getPowState();

  /**
   * Sets the value of the '{@link symboleoide.symboleoide.pState#getPowState <em>Pow State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pow State</em>' attribute.
   * @see #getPowState()
   * @generated
   */
  void setPowState(String value);

  /**
   * Returns the value of the '<em><b>Pow Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pow Name</em>' reference.
   * @see #setPowName(Pow)
   * @see symboleoide.symboleoide.SymboleoidePackage#getpState_PowName()
   * @model
   * @generated
   */
  Pow getPowName();

  /**
   * Sets the value of the '{@link symboleoide.symboleoide.pState#getPowName <em>Pow Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pow Name</em>' reference.
   * @see #getPowName()
   * @generated
   */
  void setPowName(Pow value);

} // pState
