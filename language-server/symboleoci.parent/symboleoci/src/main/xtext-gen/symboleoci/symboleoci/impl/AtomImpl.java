/**
 * generated by Xtext 2.22.0
 */
package symboleoci.symboleoci.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import symboleoci.symboleoci.Atom;
import symboleoci.symboleoci.EventProp;
import symboleoci.symboleoci.Interval;
import symboleoci.symboleoci.Name;
import symboleoci.symboleoci.Point;
import symboleoci.symboleoci.Prop;
import symboleoci.symboleoci.SitProp;
import symboleoci.symboleoci.SymboleociPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link symboleoci.symboleoci.impl.AtomImpl#getEventPropositions <em>Event Propositions</em>}</li>
 *   <li>{@link symboleoci.symboleoci.impl.AtomImpl#getSituationPropositions <em>Situation Propositions</em>}</li>
 *   <li>{@link symboleoci.symboleoci.impl.AtomImpl#getShortHandNames <em>Short Hand Names</em>}</li>
 *   <li>{@link symboleoci.symboleoci.impl.AtomImpl#getNames <em>Names</em>}</li>
 *   <li>{@link symboleoci.symboleoci.impl.AtomImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link symboleoci.symboleoci.impl.AtomImpl#getIntervals <em>Intervals</em>}</li>
 *   <li>{@link symboleoci.symboleoci.impl.AtomImpl#getPropositions <em>Propositions</em>}</li>
 *   <li>{@link symboleoci.symboleoci.impl.AtomImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link symboleoci.symboleoci.impl.AtomImpl#getSetExps <em>Set Exps</em>}</li>
 *   <li>{@link symboleoci.symboleoci.impl.AtomImpl#getMetaconstraints <em>Metaconstraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtomImpl extends MinimalEObjectImpl.Container implements Atom
{
  /**
   * The cached value of the '{@link #getEventPropositions() <em>Event Propositions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventPropositions()
   * @generated
   * @ordered
   */
  protected EList<EventProp> eventPropositions;

  /**
   * The cached value of the '{@link #getSituationPropositions() <em>Situation Propositions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSituationPropositions()
   * @generated
   * @ordered
   */
  protected EList<SitProp> situationPropositions;

  /**
   * The cached value of the '{@link #getShortHandNames() <em>Short Hand Names</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShortHandNames()
   * @generated
   * @ordered
   */
  protected EList<Name> shortHandNames;

  /**
   * The cached value of the '{@link #getNames() <em>Names</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNames()
   * @generated
   * @ordered
   */
  protected EList<Name> names;

  /**
   * The cached value of the '{@link #getPoints() <em>Points</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPoints()
   * @generated
   * @ordered
   */
  protected EList<Point> points;

  /**
   * The cached value of the '{@link #getIntervals() <em>Intervals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntervals()
   * @generated
   * @ordered
   */
  protected EList<Interval> intervals;

  /**
   * The cached value of the '{@link #getPropositions() <em>Propositions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropositions()
   * @generated
   * @ordered
   */
  protected EList<Prop> propositions;

  /**
   * The cached value of the '{@link #getVarName() <em>Var Name</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarName()
   * @generated
   * @ordered
   */
  protected EList<Name> varName;

  /**
   * The cached value of the '{@link #getSetExps() <em>Set Exps</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSetExps()
   * @generated
   * @ordered
   */
  protected EList<String> setExps;

  /**
   * The cached value of the '{@link #getMetaconstraints() <em>Metaconstraints</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetaconstraints()
   * @generated
   * @ordered
   */
  protected EList<String> metaconstraints;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AtomImpl()
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
    return SymboleociPackage.Literals.ATOM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EventProp> getEventPropositions()
  {
    if (eventPropositions == null)
    {
      eventPropositions = new EObjectContainmentEList<EventProp>(EventProp.class, this, SymboleociPackage.ATOM__EVENT_PROPOSITIONS);
    }
    return eventPropositions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SitProp> getSituationPropositions()
  {
    if (situationPropositions == null)
    {
      situationPropositions = new EObjectContainmentEList<SitProp>(SitProp.class, this, SymboleociPackage.ATOM__SITUATION_PROPOSITIONS);
    }
    return situationPropositions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Name> getShortHandNames()
  {
    if (shortHandNames == null)
    {
      shortHandNames = new EObjectContainmentEList<Name>(Name.class, this, SymboleociPackage.ATOM__SHORT_HAND_NAMES);
    }
    return shortHandNames;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Name> getNames()
  {
    if (names == null)
    {
      names = new EObjectContainmentEList<Name>(Name.class, this, SymboleociPackage.ATOM__NAMES);
    }
    return names;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Point> getPoints()
  {
    if (points == null)
    {
      points = new EObjectContainmentEList<Point>(Point.class, this, SymboleociPackage.ATOM__POINTS);
    }
    return points;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Interval> getIntervals()
  {
    if (intervals == null)
    {
      intervals = new EObjectContainmentEList<Interval>(Interval.class, this, SymboleociPackage.ATOM__INTERVALS);
    }
    return intervals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Prop> getPropositions()
  {
    if (propositions == null)
    {
      propositions = new EObjectContainmentEList<Prop>(Prop.class, this, SymboleociPackage.ATOM__PROPOSITIONS);
    }
    return propositions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Name> getVarName()
  {
    if (varName == null)
    {
      varName = new EObjectContainmentEList<Name>(Name.class, this, SymboleociPackage.ATOM__VAR_NAME);
    }
    return varName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getSetExps()
  {
    if (setExps == null)
    {
      setExps = new EDataTypeEList<String>(String.class, this, SymboleociPackage.ATOM__SET_EXPS);
    }
    return setExps;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getMetaconstraints()
  {
    if (metaconstraints == null)
    {
      metaconstraints = new EDataTypeEList<String>(String.class, this, SymboleociPackage.ATOM__METACONSTRAINTS);
    }
    return metaconstraints;
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
      case SymboleociPackage.ATOM__EVENT_PROPOSITIONS:
        return ((InternalEList<?>)getEventPropositions()).basicRemove(otherEnd, msgs);
      case SymboleociPackage.ATOM__SITUATION_PROPOSITIONS:
        return ((InternalEList<?>)getSituationPropositions()).basicRemove(otherEnd, msgs);
      case SymboleociPackage.ATOM__SHORT_HAND_NAMES:
        return ((InternalEList<?>)getShortHandNames()).basicRemove(otherEnd, msgs);
      case SymboleociPackage.ATOM__NAMES:
        return ((InternalEList<?>)getNames()).basicRemove(otherEnd, msgs);
      case SymboleociPackage.ATOM__POINTS:
        return ((InternalEList<?>)getPoints()).basicRemove(otherEnd, msgs);
      case SymboleociPackage.ATOM__INTERVALS:
        return ((InternalEList<?>)getIntervals()).basicRemove(otherEnd, msgs);
      case SymboleociPackage.ATOM__PROPOSITIONS:
        return ((InternalEList<?>)getPropositions()).basicRemove(otherEnd, msgs);
      case SymboleociPackage.ATOM__VAR_NAME:
        return ((InternalEList<?>)getVarName()).basicRemove(otherEnd, msgs);
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
      case SymboleociPackage.ATOM__EVENT_PROPOSITIONS:
        return getEventPropositions();
      case SymboleociPackage.ATOM__SITUATION_PROPOSITIONS:
        return getSituationPropositions();
      case SymboleociPackage.ATOM__SHORT_HAND_NAMES:
        return getShortHandNames();
      case SymboleociPackage.ATOM__NAMES:
        return getNames();
      case SymboleociPackage.ATOM__POINTS:
        return getPoints();
      case SymboleociPackage.ATOM__INTERVALS:
        return getIntervals();
      case SymboleociPackage.ATOM__PROPOSITIONS:
        return getPropositions();
      case SymboleociPackage.ATOM__VAR_NAME:
        return getVarName();
      case SymboleociPackage.ATOM__SET_EXPS:
        return getSetExps();
      case SymboleociPackage.ATOM__METACONSTRAINTS:
        return getMetaconstraints();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SymboleociPackage.ATOM__EVENT_PROPOSITIONS:
        getEventPropositions().clear();
        getEventPropositions().addAll((Collection<? extends EventProp>)newValue);
        return;
      case SymboleociPackage.ATOM__SITUATION_PROPOSITIONS:
        getSituationPropositions().clear();
        getSituationPropositions().addAll((Collection<? extends SitProp>)newValue);
        return;
      case SymboleociPackage.ATOM__SHORT_HAND_NAMES:
        getShortHandNames().clear();
        getShortHandNames().addAll((Collection<? extends Name>)newValue);
        return;
      case SymboleociPackage.ATOM__NAMES:
        getNames().clear();
        getNames().addAll((Collection<? extends Name>)newValue);
        return;
      case SymboleociPackage.ATOM__POINTS:
        getPoints().clear();
        getPoints().addAll((Collection<? extends Point>)newValue);
        return;
      case SymboleociPackage.ATOM__INTERVALS:
        getIntervals().clear();
        getIntervals().addAll((Collection<? extends Interval>)newValue);
        return;
      case SymboleociPackage.ATOM__PROPOSITIONS:
        getPropositions().clear();
        getPropositions().addAll((Collection<? extends Prop>)newValue);
        return;
      case SymboleociPackage.ATOM__VAR_NAME:
        getVarName().clear();
        getVarName().addAll((Collection<? extends Name>)newValue);
        return;
      case SymboleociPackage.ATOM__SET_EXPS:
        getSetExps().clear();
        getSetExps().addAll((Collection<? extends String>)newValue);
        return;
      case SymboleociPackage.ATOM__METACONSTRAINTS:
        getMetaconstraints().clear();
        getMetaconstraints().addAll((Collection<? extends String>)newValue);
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
      case SymboleociPackage.ATOM__EVENT_PROPOSITIONS:
        getEventPropositions().clear();
        return;
      case SymboleociPackage.ATOM__SITUATION_PROPOSITIONS:
        getSituationPropositions().clear();
        return;
      case SymboleociPackage.ATOM__SHORT_HAND_NAMES:
        getShortHandNames().clear();
        return;
      case SymboleociPackage.ATOM__NAMES:
        getNames().clear();
        return;
      case SymboleociPackage.ATOM__POINTS:
        getPoints().clear();
        return;
      case SymboleociPackage.ATOM__INTERVALS:
        getIntervals().clear();
        return;
      case SymboleociPackage.ATOM__PROPOSITIONS:
        getPropositions().clear();
        return;
      case SymboleociPackage.ATOM__VAR_NAME:
        getVarName().clear();
        return;
      case SymboleociPackage.ATOM__SET_EXPS:
        getSetExps().clear();
        return;
      case SymboleociPackage.ATOM__METACONSTRAINTS:
        getMetaconstraints().clear();
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
      case SymboleociPackage.ATOM__EVENT_PROPOSITIONS:
        return eventPropositions != null && !eventPropositions.isEmpty();
      case SymboleociPackage.ATOM__SITUATION_PROPOSITIONS:
        return situationPropositions != null && !situationPropositions.isEmpty();
      case SymboleociPackage.ATOM__SHORT_HAND_NAMES:
        return shortHandNames != null && !shortHandNames.isEmpty();
      case SymboleociPackage.ATOM__NAMES:
        return names != null && !names.isEmpty();
      case SymboleociPackage.ATOM__POINTS:
        return points != null && !points.isEmpty();
      case SymboleociPackage.ATOM__INTERVALS:
        return intervals != null && !intervals.isEmpty();
      case SymboleociPackage.ATOM__PROPOSITIONS:
        return propositions != null && !propositions.isEmpty();
      case SymboleociPackage.ATOM__VAR_NAME:
        return varName != null && !varName.isEmpty();
      case SymboleociPackage.ATOM__SET_EXPS:
        return setExps != null && !setExps.isEmpty();
      case SymboleociPackage.ATOM__METACONSTRAINTS:
        return metaconstraints != null && !metaconstraints.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (setExps: ");
    result.append(setExps);
    result.append(", metaconstraints: ");
    result.append(metaconstraints);
    result.append(')');
    return result.toString();
  }

} //AtomImpl