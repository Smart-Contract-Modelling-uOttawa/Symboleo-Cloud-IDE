/**
 * generated by Xtext 2.22.0
 */
package symboleoide.symboleoide;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link symboleoide.symboleoide.Interval#getSituationName <em>Situation Name</em>}</li>
 *   <li>{@link symboleoide.symboleoide.Interval#getPoints <em>Points</em>}</li>
 *   <li>{@link symboleoide.symboleoide.Interval#getSituationNames <em>Situation Names</em>}</li>
 *   <li>{@link symboleoide.symboleoide.Interval#getTempOps <em>Temp Ops</em>}</li>
 *   <li>{@link symboleoide.symboleoide.Interval#getIntConsts <em>Int Consts</em>}</li>
 *   <li>{@link symboleoide.symboleoide.Interval#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @see symboleoide.symboleoide.SymboleoidePackage#getInterval()
 * @model
 * @generated
 */
public interface Interval extends EObject
{
  /**
   * Returns the value of the '<em><b>Situation Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Situation Name</em>' containment reference.
   * @see #setSituationName(SitName)
   * @see symboleoide.symboleoide.SymboleoidePackage#getInterval_SituationName()
   * @model containment="true"
   * @generated
   */
  SitName getSituationName();

  /**
   * Sets the value of the '{@link symboleoide.symboleoide.Interval#getSituationName <em>Situation Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Situation Name</em>' containment reference.
   * @see #getSituationName()
   * @generated
   */
  void setSituationName(SitName value);

  /**
   * Returns the value of the '<em><b>Points</b></em>' containment reference list.
   * The list contents are of type {@link symboleoide.symboleoide.Point}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Points</em>' containment reference list.
   * @see symboleoide.symboleoide.SymboleoidePackage#getInterval_Points()
   * @model containment="true"
   * @generated
   */
  EList<Point> getPoints();

  /**
   * Returns the value of the '<em><b>Situation Names</b></em>' containment reference list.
   * The list contents are of type {@link symboleoide.symboleoide.SitName}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Situation Names</em>' containment reference list.
   * @see symboleoide.symboleoide.SymboleoidePackage#getInterval_SituationNames()
   * @model containment="true"
   * @generated
   */
  EList<SitName> getSituationNames();

  /**
   * Returns the value of the '<em><b>Temp Ops</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Temp Ops</em>' attribute list.
   * @see symboleoide.symboleoide.SymboleoidePackage#getInterval_TempOps()
   * @model unique="false"
   * @generated
   */
  EList<String> getTempOps();

  /**
   * Returns the value of the '<em><b>Int Consts</b></em>' containment reference list.
   * The list contents are of type {@link symboleoide.symboleoide.IntConst}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Consts</em>' containment reference list.
   * @see symboleoide.symboleoide.SymboleoidePackage#getInterval_IntConsts()
   * @model containment="true"
   * @generated
   */
  EList<IntConst> getIntConsts();

  /**
   * Returns the value of the '<em><b>Units</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Units</em>' attribute list.
   * @see symboleoide.symboleoide.SymboleoidePackage#getInterval_Units()
   * @model unique="false"
   * @generated
   */
  EList<String> getUnits();

} // Interval
