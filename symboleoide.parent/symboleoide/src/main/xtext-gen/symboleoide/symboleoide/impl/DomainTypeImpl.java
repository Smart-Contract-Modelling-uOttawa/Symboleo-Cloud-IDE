/**
 * generated by Xtext 2.22.0
 */
package symboleoide.symboleoide.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import symboleoide.symboleoide.DConcept;
import symboleoide.symboleoide.DomainType;
import symboleoide.symboleoide.SymboleoidePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link symboleoide.symboleoide.impl.DomainTypeImpl#getDtypes <em>Dtypes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainTypeImpl extends CTypeImpl implements DomainType
{
  /**
   * The cached value of the '{@link #getDtypes() <em>Dtypes</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDtypes()
   * @generated
   * @ordered
   */
  protected EList<DConcept> dtypes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DomainTypeImpl()
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
    return SymboleoidePackage.Literals.DOMAIN_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<DConcept> getDtypes()
  {
    if (dtypes == null)
    {
      dtypes = new EObjectResolvingEList<DConcept>(DConcept.class, this, SymboleoidePackage.DOMAIN_TYPE__DTYPES);
    }
    return dtypes;
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
      case SymboleoidePackage.DOMAIN_TYPE__DTYPES:
        return getDtypes();
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
      case SymboleoidePackage.DOMAIN_TYPE__DTYPES:
        getDtypes().clear();
        getDtypes().addAll((Collection<? extends DConcept>)newValue);
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
      case SymboleoidePackage.DOMAIN_TYPE__DTYPES:
        getDtypes().clear();
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
      case SymboleoidePackage.DOMAIN_TYPE__DTYPES:
        return dtypes != null && !dtypes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DomainTypeImpl
