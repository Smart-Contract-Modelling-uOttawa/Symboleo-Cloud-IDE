/**
 * generated by Xtext 2.22.0
 */
package symboleoide.symboleoide.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import symboleoide.symboleoide.Name;
import symboleoide.symboleoide.SitName;
import symboleoide.symboleoide.SymboleoidePackage;
import symboleoide.symboleoide.cEvent;
import symboleoide.symboleoide.cState;
import symboleoide.symboleoide.oEvent;
import symboleoide.symboleoide.oState;
import symboleoide.symboleoide.pEvent;
import symboleoide.symboleoide.pState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sit Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link symboleoide.symboleoide.impl.SitNameImpl#getSitName <em>Sit Name</em>}</li>
 *   <li>{@link symboleoide.symboleoide.impl.SitNameImpl#getOStates <em>OStates</em>}</li>
 *   <li>{@link symboleoide.symboleoide.impl.SitNameImpl#getPStates <em>PStates</em>}</li>
 *   <li>{@link symboleoide.symboleoide.impl.SitNameImpl#getCStates <em>CStates</em>}</li>
 *   <li>{@link symboleoide.symboleoide.impl.SitNameImpl#getOEvents <em>OEvents</em>}</li>
 *   <li>{@link symboleoide.symboleoide.impl.SitNameImpl#getCEvents <em>CEvents</em>}</li>
 *   <li>{@link symboleoide.symboleoide.impl.SitNameImpl#getPEvents <em>PEvents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SitNameImpl extends MinimalEObjectImpl.Container implements SitName
{
  /**
   * The cached value of the '{@link #getSitName() <em>Sit Name</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSitName()
   * @generated
   * @ordered
   */
  protected EList<Name> sitName;

  /**
   * The cached value of the '{@link #getOStates() <em>OStates</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOStates()
   * @generated
   * @ordered
   */
  protected EList<oState> oStates;

  /**
   * The cached value of the '{@link #getPStates() <em>PStates</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPStates()
   * @generated
   * @ordered
   */
  protected EList<pState> pStates;

  /**
   * The cached value of the '{@link #getCStates() <em>CStates</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCStates()
   * @generated
   * @ordered
   */
  protected EList<cState> cStates;

  /**
   * The cached value of the '{@link #getOEvents() <em>OEvents</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOEvents()
   * @generated
   * @ordered
   */
  protected EList<oEvent> oEvents;

  /**
   * The cached value of the '{@link #getCEvents() <em>CEvents</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCEvents()
   * @generated
   * @ordered
   */
  protected EList<cEvent> cEvents;

  /**
   * The cached value of the '{@link #getPEvents() <em>PEvents</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPEvents()
   * @generated
   * @ordered
   */
  protected EList<pEvent> pEvents;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SitNameImpl()
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
    return SymboleoidePackage.Literals.SIT_NAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Name> getSitName()
  {
    if (sitName == null)
    {
      sitName = new EObjectContainmentEList<Name>(Name.class, this, SymboleoidePackage.SIT_NAME__SIT_NAME);
    }
    return sitName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<oState> getOStates()
  {
    if (oStates == null)
    {
      oStates = new EObjectContainmentEList<oState>(oState.class, this, SymboleoidePackage.SIT_NAME__OSTATES);
    }
    return oStates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<pState> getPStates()
  {
    if (pStates == null)
    {
      pStates = new EObjectContainmentEList<pState>(pState.class, this, SymboleoidePackage.SIT_NAME__PSTATES);
    }
    return pStates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<cState> getCStates()
  {
    if (cStates == null)
    {
      cStates = new EObjectContainmentEList<cState>(cState.class, this, SymboleoidePackage.SIT_NAME__CSTATES);
    }
    return cStates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<oEvent> getOEvents()
  {
    if (oEvents == null)
    {
      oEvents = new EObjectContainmentEList<oEvent>(oEvent.class, this, SymboleoidePackage.SIT_NAME__OEVENTS);
    }
    return oEvents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<cEvent> getCEvents()
  {
    if (cEvents == null)
    {
      cEvents = new EObjectContainmentEList<cEvent>(cEvent.class, this, SymboleoidePackage.SIT_NAME__CEVENTS);
    }
    return cEvents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<pEvent> getPEvents()
  {
    if (pEvents == null)
    {
      pEvents = new EObjectContainmentEList<pEvent>(pEvent.class, this, SymboleoidePackage.SIT_NAME__PEVENTS);
    }
    return pEvents;
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
      case SymboleoidePackage.SIT_NAME__SIT_NAME:
        return ((InternalEList<?>)getSitName()).basicRemove(otherEnd, msgs);
      case SymboleoidePackage.SIT_NAME__OSTATES:
        return ((InternalEList<?>)getOStates()).basicRemove(otherEnd, msgs);
      case SymboleoidePackage.SIT_NAME__PSTATES:
        return ((InternalEList<?>)getPStates()).basicRemove(otherEnd, msgs);
      case SymboleoidePackage.SIT_NAME__CSTATES:
        return ((InternalEList<?>)getCStates()).basicRemove(otherEnd, msgs);
      case SymboleoidePackage.SIT_NAME__OEVENTS:
        return ((InternalEList<?>)getOEvents()).basicRemove(otherEnd, msgs);
      case SymboleoidePackage.SIT_NAME__CEVENTS:
        return ((InternalEList<?>)getCEvents()).basicRemove(otherEnd, msgs);
      case SymboleoidePackage.SIT_NAME__PEVENTS:
        return ((InternalEList<?>)getPEvents()).basicRemove(otherEnd, msgs);
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
      case SymboleoidePackage.SIT_NAME__SIT_NAME:
        return getSitName();
      case SymboleoidePackage.SIT_NAME__OSTATES:
        return getOStates();
      case SymboleoidePackage.SIT_NAME__PSTATES:
        return getPStates();
      case SymboleoidePackage.SIT_NAME__CSTATES:
        return getCStates();
      case SymboleoidePackage.SIT_NAME__OEVENTS:
        return getOEvents();
      case SymboleoidePackage.SIT_NAME__CEVENTS:
        return getCEvents();
      case SymboleoidePackage.SIT_NAME__PEVENTS:
        return getPEvents();
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
      case SymboleoidePackage.SIT_NAME__SIT_NAME:
        getSitName().clear();
        getSitName().addAll((Collection<? extends Name>)newValue);
        return;
      case SymboleoidePackage.SIT_NAME__OSTATES:
        getOStates().clear();
        getOStates().addAll((Collection<? extends oState>)newValue);
        return;
      case SymboleoidePackage.SIT_NAME__PSTATES:
        getPStates().clear();
        getPStates().addAll((Collection<? extends pState>)newValue);
        return;
      case SymboleoidePackage.SIT_NAME__CSTATES:
        getCStates().clear();
        getCStates().addAll((Collection<? extends cState>)newValue);
        return;
      case SymboleoidePackage.SIT_NAME__OEVENTS:
        getOEvents().clear();
        getOEvents().addAll((Collection<? extends oEvent>)newValue);
        return;
      case SymboleoidePackage.SIT_NAME__CEVENTS:
        getCEvents().clear();
        getCEvents().addAll((Collection<? extends cEvent>)newValue);
        return;
      case SymboleoidePackage.SIT_NAME__PEVENTS:
        getPEvents().clear();
        getPEvents().addAll((Collection<? extends pEvent>)newValue);
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
      case SymboleoidePackage.SIT_NAME__SIT_NAME:
        getSitName().clear();
        return;
      case SymboleoidePackage.SIT_NAME__OSTATES:
        getOStates().clear();
        return;
      case SymboleoidePackage.SIT_NAME__PSTATES:
        getPStates().clear();
        return;
      case SymboleoidePackage.SIT_NAME__CSTATES:
        getCStates().clear();
        return;
      case SymboleoidePackage.SIT_NAME__OEVENTS:
        getOEvents().clear();
        return;
      case SymboleoidePackage.SIT_NAME__CEVENTS:
        getCEvents().clear();
        return;
      case SymboleoidePackage.SIT_NAME__PEVENTS:
        getPEvents().clear();
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
      case SymboleoidePackage.SIT_NAME__SIT_NAME:
        return sitName != null && !sitName.isEmpty();
      case SymboleoidePackage.SIT_NAME__OSTATES:
        return oStates != null && !oStates.isEmpty();
      case SymboleoidePackage.SIT_NAME__PSTATES:
        return pStates != null && !pStates.isEmpty();
      case SymboleoidePackage.SIT_NAME__CSTATES:
        return cStates != null && !cStates.isEmpty();
      case SymboleoidePackage.SIT_NAME__OEVENTS:
        return oEvents != null && !oEvents.isEmpty();
      case SymboleoidePackage.SIT_NAME__CEVENTS:
        return cEvents != null && !cEvents.isEmpty();
      case SymboleoidePackage.SIT_NAME__PEVENTS:
        return pEvents != null && !pEvents.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SitNameImpl
