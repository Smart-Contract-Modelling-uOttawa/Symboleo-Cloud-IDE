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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import symboleoci.symboleoci.DeclarPair;
import symboleoci.symboleoci.Name;
import symboleoci.symboleoci.SymboleociPackage;
import symboleoci.symboleoci.TypeName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declar Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link symboleoci.symboleoci.impl.DeclarPairImpl#getNames <em>Names</em>}</li>
 *   <li>{@link symboleoci.symboleoci.impl.DeclarPairImpl#getName <em>Name</em>}</li>
 *   <li>{@link symboleoci.symboleoci.impl.DeclarPairImpl#getTypeNames <em>Type Names</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeclarPairImpl extends ParamImpl implements DeclarPair
{
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
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getTypeNames() <em>Type Names</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeNames()
   * @generated
   * @ordered
   */
  protected EList<TypeName> typeNames;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeclarPairImpl()
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
    return SymboleociPackage.Literals.DECLAR_PAIR;
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
      names = new EObjectContainmentEList<Name>(Name.class, this, SymboleociPackage.DECLAR_PAIR__NAMES);
    }
    return names;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SymboleociPackage.DECLAR_PAIR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<TypeName> getTypeNames()
  {
    if (typeNames == null)
    {
      typeNames = new EObjectContainmentEList<TypeName>(TypeName.class, this, SymboleociPackage.DECLAR_PAIR__TYPE_NAMES);
    }
    return typeNames;
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
      case SymboleociPackage.DECLAR_PAIR__NAMES:
        return ((InternalEList<?>)getNames()).basicRemove(otherEnd, msgs);
      case SymboleociPackage.DECLAR_PAIR__TYPE_NAMES:
        return ((InternalEList<?>)getTypeNames()).basicRemove(otherEnd, msgs);
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
      case SymboleociPackage.DECLAR_PAIR__NAMES:
        return getNames();
      case SymboleociPackage.DECLAR_PAIR__NAME:
        return getName();
      case SymboleociPackage.DECLAR_PAIR__TYPE_NAMES:
        return getTypeNames();
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
      case SymboleociPackage.DECLAR_PAIR__NAMES:
        getNames().clear();
        getNames().addAll((Collection<? extends Name>)newValue);
        return;
      case SymboleociPackage.DECLAR_PAIR__NAME:
        setName((String)newValue);
        return;
      case SymboleociPackage.DECLAR_PAIR__TYPE_NAMES:
        getTypeNames().clear();
        getTypeNames().addAll((Collection<? extends TypeName>)newValue);
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
      case SymboleociPackage.DECLAR_PAIR__NAMES:
        getNames().clear();
        return;
      case SymboleociPackage.DECLAR_PAIR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SymboleociPackage.DECLAR_PAIR__TYPE_NAMES:
        getTypeNames().clear();
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
      case SymboleociPackage.DECLAR_PAIR__NAMES:
        return names != null && !names.isEmpty();
      case SymboleociPackage.DECLAR_PAIR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SymboleociPackage.DECLAR_PAIR__TYPE_NAMES:
        return typeNames != null && !typeNames.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //DeclarPairImpl