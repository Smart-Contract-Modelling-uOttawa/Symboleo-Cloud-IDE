/**
 * generated by Xtext 2.22.0
 */
package symboleoci.symboleoci;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sit Prop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link symboleoci.symboleoci.SitProp#getSituationName <em>Situation Name</em>}</li>
 *   <li>{@link symboleoci.symboleoci.SitProp#getIntervals <em>Intervals</em>}</li>
 *   <li>{@link symboleoci.symboleoci.SitProp#getOSituationName <em>OSituation Name</em>}</li>
 *   <li>{@link symboleoci.symboleoci.SitProp#getCSituationName <em>CSituation Name</em>}</li>
 *   <li>{@link symboleoci.symboleoci.SitProp#getPSituationName <em>PSituation Name</em>}</li>
 * </ul>
 *
 * @see symboleoci.symboleoci.SymboleociPackage#getSitProp()
 * @model
 * @generated
 */
public interface SitProp extends EObject
{
  /**
   * Returns the value of the '<em><b>Situation Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Situation Name</em>' reference.
   * @see #setSituationName(Name)
   * @see symboleoci.symboleoci.SymboleociPackage#getSitProp_SituationName()
   * @model
   * @generated
   */
  Name getSituationName();

  /**
   * Sets the value of the '{@link symboleoci.symboleoci.SitProp#getSituationName <em>Situation Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Situation Name</em>' reference.
   * @see #getSituationName()
   * @generated
   */
  void setSituationName(Name value);

  /**
   * Returns the value of the '<em><b>Intervals</b></em>' containment reference list.
   * The list contents are of type {@link symboleoci.symboleoci.Interval}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Intervals</em>' containment reference list.
   * @see symboleoci.symboleoci.SymboleociPackage#getSitProp_Intervals()
   * @model containment="true"
   * @generated
   */
  EList<Interval> getIntervals();

  /**
   * Returns the value of the '<em><b>OSituation Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>OSituation Name</em>' containment reference.
   * @see #setOSituationName(oState)
   * @see symboleoci.symboleoci.SymboleociPackage#getSitProp_OSituationName()
   * @model containment="true"
   * @generated
   */
  oState getOSituationName();

  /**
   * Sets the value of the '{@link symboleoci.symboleoci.SitProp#getOSituationName <em>OSituation Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>OSituation Name</em>' containment reference.
   * @see #getOSituationName()
   * @generated
   */
  void setOSituationName(oState value);

  /**
   * Returns the value of the '<em><b>CSituation Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>CSituation Name</em>' containment reference.
   * @see #setCSituationName(cState)
   * @see symboleoci.symboleoci.SymboleociPackage#getSitProp_CSituationName()
   * @model containment="true"
   * @generated
   */
  cState getCSituationName();

  /**
   * Sets the value of the '{@link symboleoci.symboleoci.SitProp#getCSituationName <em>CSituation Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>CSituation Name</em>' containment reference.
   * @see #getCSituationName()
   * @generated
   */
  void setCSituationName(cState value);

  /**
   * Returns the value of the '<em><b>PSituation Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>PSituation Name</em>' containment reference.
   * @see #setPSituationName(pState)
   * @see symboleoci.symboleoci.SymboleociPackage#getSitProp_PSituationName()
   * @model containment="true"
   * @generated
   */
  pState getPSituationName();

  /**
   * Sets the value of the '{@link symboleoci.symboleoci.SitProp#getPSituationName <em>PSituation Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>PSituation Name</em>' containment reference.
   * @see #getPSituationName()
   * @generated
   */
  void setPSituationName(pState value);

} // SitProp