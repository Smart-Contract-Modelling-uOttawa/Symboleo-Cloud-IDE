/**
 * generated by Xtext 2.22.0
 */
package symboleoide.symboleoide;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link symboleoide.symboleoide.Pow#getName <em>Name</em>}</li>
 *   <li>{@link symboleoide.symboleoide.Pow#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link symboleoide.symboleoide.Pow#getRoles <em>Roles</em>}</li>
 *   <li>{@link symboleoide.symboleoide.Pow#getAntecedents <em>Antecedents</em>}</li>
 *   <li>{@link symboleoide.symboleoide.Pow#getConsequents <em>Consequents</em>}</li>
 * </ul>
 *
 * @see symboleoide.symboleoide.SymboleoidePackage#getPow()
 * @model
 * @generated
 */
public interface Pow extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see symboleoide.symboleoide.SymboleoidePackage#getPow_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link symboleoide.symboleoide.Pow#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trigger</em>' containment reference.
   * @see #setTrigger(Prop)
   * @see symboleoide.symboleoide.SymboleoidePackage#getPow_Trigger()
   * @model containment="true"
   * @generated
   */
  Prop getTrigger();

  /**
   * Sets the value of the '{@link symboleoide.symboleoide.Pow#getTrigger <em>Trigger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trigger</em>' containment reference.
   * @see #getTrigger()
   * @generated
   */
  void setTrigger(Prop value);

  /**
   * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
   * The list contents are of type {@link symboleoide.symboleoide.Name}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Roles</em>' containment reference list.
   * @see symboleoide.symboleoide.SymboleoidePackage#getPow_Roles()
   * @model containment="true"
   * @generated
   */
  EList<Name> getRoles();

  /**
   * Returns the value of the '<em><b>Antecedents</b></em>' containment reference list.
   * The list contents are of type {@link symboleoide.symboleoide.Prop}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Antecedents</em>' containment reference list.
   * @see symboleoide.symboleoide.SymboleoidePackage#getPow_Antecedents()
   * @model containment="true"
   * @generated
   */
  EList<Prop> getAntecedents();

  /**
   * Returns the value of the '<em><b>Consequents</b></em>' containment reference list.
   * The list contents are of type {@link symboleoide.symboleoide.Prop}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Consequents</em>' containment reference list.
   * @see symboleoide.symboleoide.SymboleoidePackage#getPow_Consequents()
   * @model containment="true"
   * @generated
   */
  EList<Prop> getConsequents();

} // Pow