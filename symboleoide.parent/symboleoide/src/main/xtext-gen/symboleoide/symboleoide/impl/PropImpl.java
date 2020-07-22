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

import symboleoide.symboleoide.Junc;
import symboleoide.symboleoide.Prop;
import symboleoide.symboleoide.SymboleoidePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link symboleoide.symboleoide.impl.PropImpl#getJunctions <em>Junctions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropImpl extends MinimalEObjectImpl.Container implements Prop
{
  /**
   * The cached value of the '{@link #getJunctions() <em>Junctions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJunctions()
   * @generated
   * @ordered
   */
  protected EList<Junc> junctions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropImpl()
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
    return SymboleoidePackage.Literals.PROP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Junc> getJunctions()
  {
    if (junctions == null)
    {
      junctions = new EObjectContainmentEList<Junc>(Junc.class, this, SymboleoidePackage.PROP__JUNCTIONS);
    }
    return junctions;
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
      case SymboleoidePackage.PROP__JUNCTIONS:
        return ((InternalEList<?>)getJunctions()).basicRemove(otherEnd, msgs);
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
      case SymboleoidePackage.PROP__JUNCTIONS:
        return getJunctions();
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
      case SymboleoidePackage.PROP__JUNCTIONS:
        getJunctions().clear();
        getJunctions().addAll((Collection<? extends Junc>)newValue);
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
      case SymboleoidePackage.PROP__JUNCTIONS:
        getJunctions().clear();
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
      case SymboleoidePackage.PROP__JUNCTIONS:
        return junctions != null && !junctions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PropImpl