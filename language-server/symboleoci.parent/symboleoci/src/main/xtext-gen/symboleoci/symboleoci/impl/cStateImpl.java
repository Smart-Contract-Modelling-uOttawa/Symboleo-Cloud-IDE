/**
 * generated by Xtext 2.22.0
 */
package symboleoci.symboleoci.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import symboleoci.symboleoci.Contract;
import symboleoci.symboleoci.SymboleociPackage;
import symboleoci.symboleoci.cState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>cState</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link symboleoci.symboleoci.impl.cStateImpl#getContrState <em>Contr State</em>}</li>
 *   <li>{@link symboleoci.symboleoci.impl.cStateImpl#getContractName <em>Contract Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class cStateImpl extends MinimalEObjectImpl.Container implements cState
{
  /**
   * The default value of the '{@link #getContrState() <em>Contr State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContrState()
   * @generated
   * @ordered
   */
  protected static final String CONTR_STATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getContrState() <em>Contr State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContrState()
   * @generated
   * @ordered
   */
  protected String contrState = CONTR_STATE_EDEFAULT;

  /**
   * The cached value of the '{@link #getContractName() <em>Contract Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContractName()
   * @generated
   * @ordered
   */
  protected Contract contractName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected cStateImpl()
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
    return SymboleociPackage.Literals.CSTATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getContrState()
  {
    return contrState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setContrState(String newContrState)
  {
    String oldContrState = contrState;
    contrState = newContrState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SymboleociPackage.CSTATE__CONTR_STATE, oldContrState, contrState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Contract getContractName()
  {
    if (contractName != null && contractName.eIsProxy())
    {
      InternalEObject oldContractName = (InternalEObject)contractName;
      contractName = (Contract)eResolveProxy(oldContractName);
      if (contractName != oldContractName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymboleociPackage.CSTATE__CONTRACT_NAME, oldContractName, contractName));
      }
    }
    return contractName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Contract basicGetContractName()
  {
    return contractName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setContractName(Contract newContractName)
  {
    Contract oldContractName = contractName;
    contractName = newContractName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SymboleociPackage.CSTATE__CONTRACT_NAME, oldContractName, contractName));
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
      case SymboleociPackage.CSTATE__CONTR_STATE:
        return getContrState();
      case SymboleociPackage.CSTATE__CONTRACT_NAME:
        if (resolve) return getContractName();
        return basicGetContractName();
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
      case SymboleociPackage.CSTATE__CONTR_STATE:
        setContrState((String)newValue);
        return;
      case SymboleociPackage.CSTATE__CONTRACT_NAME:
        setContractName((Contract)newValue);
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
      case SymboleociPackage.CSTATE__CONTR_STATE:
        setContrState(CONTR_STATE_EDEFAULT);
        return;
      case SymboleociPackage.CSTATE__CONTRACT_NAME:
        setContractName((Contract)null);
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
      case SymboleociPackage.CSTATE__CONTR_STATE:
        return CONTR_STATE_EDEFAULT == null ? contrState != null : !CONTR_STATE_EDEFAULT.equals(contrState);
      case SymboleociPackage.CSTATE__CONTRACT_NAME:
        return contractName != null;
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
    result.append(" (contrState: ");
    result.append(contrState);
    result.append(')');
    return result.toString();
  }

} //cStateImpl
