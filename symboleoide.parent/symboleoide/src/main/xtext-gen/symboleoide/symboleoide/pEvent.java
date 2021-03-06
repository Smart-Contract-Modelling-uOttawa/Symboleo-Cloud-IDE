/**
 * generated by Xtext 2.22.0
 */
package symboleoide.symboleoide;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>pEvent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link symboleoide.symboleoide.pEvent#getPowEvent <em>Pow Event</em>}</li>
 *   <li>{@link symboleoide.symboleoide.pEvent#getPowName <em>Pow Name</em>}</li>
 * </ul>
 *
 * @see symboleoide.symboleoide.SymboleoidePackage#getpEvent()
 * @model
 * @generated
 */
public interface pEvent extends EObject
{
  /**
   * Returns the value of the '<em><b>Pow Event</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pow Event</em>' attribute.
   * @see #setPowEvent(String)
   * @see symboleoide.symboleoide.SymboleoidePackage#getpEvent_PowEvent()
   * @model
   * @generated
   */
  String getPowEvent();

  /**
   * Sets the value of the '{@link symboleoide.symboleoide.pEvent#getPowEvent <em>Pow Event</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pow Event</em>' attribute.
   * @see #getPowEvent()
   * @generated
   */
  void setPowEvent(String value);

  /**
   * Returns the value of the '<em><b>Pow Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pow Name</em>' reference.
   * @see #setPowName(Pow)
   * @see symboleoide.symboleoide.SymboleoidePackage#getpEvent_PowName()
   * @model
   * @generated
   */
  Pow getPowName();

  /**
   * Sets the value of the '{@link symboleoide.symboleoide.pEvent#getPowName <em>Pow Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pow Name</em>' reference.
   * @see #getPowName()
   * @generated
   */
  void setPowName(Pow value);

} // pEvent
