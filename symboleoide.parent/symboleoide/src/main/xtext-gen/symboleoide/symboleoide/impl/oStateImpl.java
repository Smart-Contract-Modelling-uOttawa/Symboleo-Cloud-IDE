/**
 * generated by Xtext 2.22.0
 */
package symboleoide.symboleoide.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import symboleoide.symboleoide.Obl;
import symboleoide.symboleoide.SymboleoidePackage;
import symboleoide.symboleoide.oState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>oState</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link symboleoide.symboleoide.impl.oStateImpl#getOblState <em>Obl State</em>}</li>
 *   <li>{@link symboleoide.symboleoide.impl.oStateImpl#getOblName <em>Obl Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class oStateImpl extends MinimalEObjectImpl.Container implements oState
{
  /**
   * The default value of the '{@link #getOblState() <em>Obl State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOblState()
   * @generated
   * @ordered
   */
  protected static final String OBL_STATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOblState() <em>Obl State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOblState()
   * @generated
   * @ordered
   */
  protected String oblState = OBL_STATE_EDEFAULT;

  /**
   * The cached value of the '{@link #getOblName() <em>Obl Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOblName()
   * @generated
   * @ordered
   */
  protected Obl oblName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected oStateImpl()
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
    return SymboleoidePackage.Literals.OSTATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOblState()
  {
    return oblState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOblState(String newOblState)
  {
    String oldOblState = oblState;
    oblState = newOblState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SymboleoidePackage.OSTATE__OBL_STATE, oldOblState, oblState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Obl getOblName()
  {
    if (oblName != null && oblName.eIsProxy())
    {
      InternalEObject oldOblName = (InternalEObject)oblName;
      oblName = (Obl)eResolveProxy(oldOblName);
      if (oblName != oldOblName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymboleoidePackage.OSTATE__OBL_NAME, oldOblName, oblName));
      }
    }
    return oblName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Obl basicGetOblName()
  {
    return oblName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOblName(Obl newOblName)
  {
    Obl oldOblName = oblName;
    oblName = newOblName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SymboleoidePackage.OSTATE__OBL_NAME, oldOblName, oblName));
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
      case SymboleoidePackage.OSTATE__OBL_STATE:
        return getOblState();
      case SymboleoidePackage.OSTATE__OBL_NAME:
        if (resolve) return getOblName();
        return basicGetOblName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SymboleoidePackage.OSTATE__OBL_STATE:
        setOblState((String)newValue);
        return;
      case SymboleoidePackage.OSTATE__OBL_NAME:
        setOblName((Obl)newValue);
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
      case SymboleoidePackage.OSTATE__OBL_STATE:
        setOblState(OBL_STATE_EDEFAULT);
        return;
      case SymboleoidePackage.OSTATE__OBL_NAME:
        setOblName((Obl)null);
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
      case SymboleoidePackage.OSTATE__OBL_STATE:
        return OBL_STATE_EDEFAULT == null ? oblState != null : !OBL_STATE_EDEFAULT.equals(oblState);
      case SymboleoidePackage.OSTATE__OBL_NAME:
        return oblName != null;
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
    result.append(" (oblState: ");
    result.append(oblState);
    result.append(')');
    return result.toString();
  }

} //oStateImpl