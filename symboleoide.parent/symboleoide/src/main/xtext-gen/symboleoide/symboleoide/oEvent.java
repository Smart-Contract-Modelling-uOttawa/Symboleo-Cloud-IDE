/**
 * generated by Xtext 2.22.0
 */
package symboleoide.symboleoide;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>oEvent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link symboleoide.symboleoide.oEvent#getOblEvent <em>Obl Event</em>}</li>
 *   <li>{@link symboleoide.symboleoide.oEvent#getOblName <em>Obl Name</em>}</li>
 * </ul>
 *
 * @see symboleoide.symboleoide.SymboleoidePackage#getoEvent()
 * @model
 * @generated
 */
public interface oEvent extends EObject
{
  /**
   * Returns the value of the '<em><b>Obl Event</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Obl Event</em>' attribute.
   * @see #setOblEvent(String)
   * @see symboleoide.symboleoide.SymboleoidePackage#getoEvent_OblEvent()
   * @model
   * @generated
   */
  String getOblEvent();

  /**
   * Sets the value of the '{@link symboleoide.symboleoide.oEvent#getOblEvent <em>Obl Event</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Obl Event</em>' attribute.
   * @see #getOblEvent()
   * @generated
   */
  void setOblEvent(String value);

  /**
   * Returns the value of the '<em><b>Obl Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Obl Name</em>' reference.
   * @see #setOblName(Obl)
   * @see symboleoide.symboleoide.SymboleoidePackage#getoEvent_OblName()
   * @model
   * @generated
   */
  Obl getOblName();

  /**
   * Sets the value of the '{@link symboleoide.symboleoide.oEvent#getOblName <em>Obl Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Obl Name</em>' reference.
   * @see #getOblName()
   * @generated
   */
  void setOblName(Obl value);

} // oEvent
