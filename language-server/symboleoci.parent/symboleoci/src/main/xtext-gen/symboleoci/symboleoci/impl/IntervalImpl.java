/**
 * generated by Xtext 2.22.0
 */
package symboleoci.symboleoci.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import symboleoci.symboleoci.IntConst;
import symboleoci.symboleoci.Interval;
import symboleoci.symboleoci.Point;
import symboleoci.symboleoci.SitName;
import symboleoci.symboleoci.SymboleociPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link symboleoci.symboleoci.impl.IntervalImpl#getSituationName <em>Situation Name</em>}</li>
 *   <li>{@link symboleoci.symboleoci.impl.IntervalImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link symboleoci.symboleoci.impl.IntervalImpl#getSituationNames <em>Situation Names</em>}</li>
 *   <li>{@link symboleoci.symboleoci.impl.IntervalImpl#getTempOps <em>Temp Ops</em>}</li>
 *   <li>{@link symboleoci.symboleoci.impl.IntervalImpl#getIntConsts <em>Int Consts</em>}</li>
 *   <li>{@link symboleoci.symboleoci.impl.IntervalImpl#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntervalImpl extends MinimalEObjectImpl.Container implements Interval
{
  /**
   * The cached value of the '{@link #getSituationName() <em>Situation Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSituationName()
   * @generated
   * @ordered
   */
  protected SitName situationName;

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
   * The cached value of the '{@link #getSituationNames() <em>Situation Names</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSituationNames()
   * @generated
   * @ordered
   */
  protected EList<SitName> situationNames;

  /**
   * The cached value of the '{@link #getTempOps() <em>Temp Ops</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTempOps()
   * @generated
   * @ordered
   */
  protected EList<String> tempOps;

  /**
   * The cached value of the '{@link #getIntConsts() <em>Int Consts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntConsts()
   * @generated
   * @ordered
   */
  protected EList<IntConst> intConsts;

  /**
   * The cached value of the '{@link #getUnits() <em>Units</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnits()
   * @generated
   * @ordered
   */
  protected EList<String> units;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IntervalImpl()
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
    return SymboleociPackage.Literals.INTERVAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SitName getSituationName()
  {
    return situationName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSituationName(SitName newSituationName, NotificationChain msgs)
  {
    SitName oldSituationName = situationName;
    situationName = newSituationName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymboleociPackage.INTERVAL__SITUATION_NAME, oldSituationName, newSituationName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSituationName(SitName newSituationName)
  {
    if (newSituationName != situationName)
    {
      NotificationChain msgs = null;
      if (situationName != null)
        msgs = ((InternalEObject)situationName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymboleociPackage.INTERVAL__SITUATION_NAME, null, msgs);
      if (newSituationName != null)
        msgs = ((InternalEObject)newSituationName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SymboleociPackage.INTERVAL__SITUATION_NAME, null, msgs);
      msgs = basicSetSituationName(newSituationName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SymboleociPackage.INTERVAL__SITUATION_NAME, newSituationName, newSituationName));
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
      points = new EObjectContainmentEList<Point>(Point.class, this, SymboleociPackage.INTERVAL__POINTS);
    }
    return points;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SitName> getSituationNames()
  {
    if (situationNames == null)
    {
      situationNames = new EObjectContainmentEList<SitName>(SitName.class, this, SymboleociPackage.INTERVAL__SITUATION_NAMES);
    }
    return situationNames;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getTempOps()
  {
    if (tempOps == null)
    {
      tempOps = new EDataTypeEList<String>(String.class, this, SymboleociPackage.INTERVAL__TEMP_OPS);
    }
    return tempOps;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<IntConst> getIntConsts()
  {
    if (intConsts == null)
    {
      intConsts = new EObjectContainmentEList<IntConst>(IntConst.class, this, SymboleociPackage.INTERVAL__INT_CONSTS);
    }
    return intConsts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getUnits()
  {
    if (units == null)
    {
      units = new EDataTypeEList<String>(String.class, this, SymboleociPackage.INTERVAL__UNITS);
    }
    return units;
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
      case SymboleociPackage.INTERVAL__SITUATION_NAME:
        return basicSetSituationName(null, msgs);
      case SymboleociPackage.INTERVAL__POINTS:
        return ((InternalEList<?>)getPoints()).basicRemove(otherEnd, msgs);
      case SymboleociPackage.INTERVAL__SITUATION_NAMES:
        return ((InternalEList<?>)getSituationNames()).basicRemove(otherEnd, msgs);
      case SymboleociPackage.INTERVAL__INT_CONSTS:
        return ((InternalEList<?>)getIntConsts()).basicRemove(otherEnd, msgs);
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
      case SymboleociPackage.INTERVAL__SITUATION_NAME:
        return getSituationName();
      case SymboleociPackage.INTERVAL__POINTS:
        return getPoints();
      case SymboleociPackage.INTERVAL__SITUATION_NAMES:
        return getSituationNames();
      case SymboleociPackage.INTERVAL__TEMP_OPS:
        return getTempOps();
      case SymboleociPackage.INTERVAL__INT_CONSTS:
        return getIntConsts();
      case SymboleociPackage.INTERVAL__UNITS:
        return getUnits();
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
      case SymboleociPackage.INTERVAL__SITUATION_NAME:
        setSituationName((SitName)newValue);
        return;
      case SymboleociPackage.INTERVAL__POINTS:
        getPoints().clear();
        getPoints().addAll((Collection<? extends Point>)newValue);
        return;
      case SymboleociPackage.INTERVAL__SITUATION_NAMES:
        getSituationNames().clear();
        getSituationNames().addAll((Collection<? extends SitName>)newValue);
        return;
      case SymboleociPackage.INTERVAL__TEMP_OPS:
        getTempOps().clear();
        getTempOps().addAll((Collection<? extends String>)newValue);
        return;
      case SymboleociPackage.INTERVAL__INT_CONSTS:
        getIntConsts().clear();
        getIntConsts().addAll((Collection<? extends IntConst>)newValue);
        return;
      case SymboleociPackage.INTERVAL__UNITS:
        getUnits().clear();
        getUnits().addAll((Collection<? extends String>)newValue);
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
      case SymboleociPackage.INTERVAL__SITUATION_NAME:
        setSituationName((SitName)null);
        return;
      case SymboleociPackage.INTERVAL__POINTS:
        getPoints().clear();
        return;
      case SymboleociPackage.INTERVAL__SITUATION_NAMES:
        getSituationNames().clear();
        return;
      case SymboleociPackage.INTERVAL__TEMP_OPS:
        getTempOps().clear();
        return;
      case SymboleociPackage.INTERVAL__INT_CONSTS:
        getIntConsts().clear();
        return;
      case SymboleociPackage.INTERVAL__UNITS:
        getUnits().clear();
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
      case SymboleociPackage.INTERVAL__SITUATION_NAME:
        return situationName != null;
      case SymboleociPackage.INTERVAL__POINTS:
        return points != null && !points.isEmpty();
      case SymboleociPackage.INTERVAL__SITUATION_NAMES:
        return situationNames != null && !situationNames.isEmpty();
      case SymboleociPackage.INTERVAL__TEMP_OPS:
        return tempOps != null && !tempOps.isEmpty();
      case SymboleociPackage.INTERVAL__INT_CONSTS:
        return intConsts != null && !intConsts.isEmpty();
      case SymboleociPackage.INTERVAL__UNITS:
        return units != null && !units.isEmpty();
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
    result.append(" (tempOps: ");
    result.append(tempOps);
    result.append(", units: ");
    result.append(units);
    result.append(')');
    return result.toString();
  }

} //IntervalImpl
