/**
 * generated by Xtext 2.22.0
 */
package symboleoci.symboleoci.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import symboleoci.symboleoci.DConcept;
import symboleoci.symboleoci.DomainType;
import symboleoci.symboleoci.SymboleociPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link symboleoci.symboleoci.impl.DomainTypeImpl#getDtypes <em>Dtypes</em>}</li>
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
    return SymboleociPackage.Literals.DOMAIN_TYPE;
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
      dtypes = new EObjectResolvingEList<DConcept>(DConcept.class, this, SymboleociPackage.DOMAIN_TYPE__DTYPES);
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
      case SymboleociPackage.DOMAIN_TYPE__DTYPES:
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
      case SymboleociPackage.DOMAIN_TYPE__DTYPES:
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
      case SymboleociPackage.DOMAIN_TYPE__DTYPES:
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
      case SymboleociPackage.DOMAIN_TYPE__DTYPES:
        return dtypes != null && !dtypes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DomainTypeImpl
