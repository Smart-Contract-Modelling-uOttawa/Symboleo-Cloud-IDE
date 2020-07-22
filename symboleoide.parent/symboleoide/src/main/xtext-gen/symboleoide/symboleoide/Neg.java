/**
 * generated by Xtext 2.22.0
 */
package symboleoide.symboleoide;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link symboleoide.symboleoide.Neg#getAtomicExpressions <em>Atomic Expressions</em>}</li>
 * </ul>
 *
 * @see symboleoide.symboleoide.SymboleoidePackage#getNeg()
 * @model
 * @generated
 */
public interface Neg extends EObject
{
  /**
   * Returns the value of the '<em><b>Atomic Expressions</b></em>' containment reference list.
   * The list contents are of type {@link symboleoide.symboleoide.Atom}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atomic Expressions</em>' containment reference list.
   * @see symboleoide.symboleoide.SymboleoidePackage#getNeg_AtomicExpressions()
   * @model containment="true"
   * @generated
   */
  EList<Atom> getAtomicExpressions();

} // Neg