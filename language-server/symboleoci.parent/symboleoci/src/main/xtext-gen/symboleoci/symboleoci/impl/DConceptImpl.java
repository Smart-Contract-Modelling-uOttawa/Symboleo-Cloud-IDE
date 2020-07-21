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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import symboleoci.symboleoci.Att;
import symboleoci.symboleoci.CType;
import symboleoci.symboleoci.DConcept;
import symboleoci.symboleoci.SymboleociPackage;
import symboleoci.symboleoci.enumItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DConcept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link symboleoci.symboleoci.impl.DConceptImpl#getName <em>Name</em>}</li>
 *   <li>{@link symboleoci.symboleoci.impl.DConceptImpl#getConceptTypes <em>Concept Types</em>}</li>
 *   <li>{@link symboleoci.symboleoci.impl.DConceptImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link symboleoci.symboleoci.impl.DConceptImpl#getEnumerationItems <em>Enumeration Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DConceptImpl extends MinimalEObjectImpl.Container implements DConcept
{
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
   * The cached value of the '{@link #getConceptTypes() <em>Concept Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConceptTypes()
   * @generated
   * @ordered
   */
  protected EList<CType> conceptTypes;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<Att> attributes;

  /**
   * The cached value of the '{@link #getEnumerationItems() <em>Enumeration Items</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumerationItems()
   * @generated
   * @ordered
   */
  protected EList<enumItem> enumerationItems;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DConceptImpl()
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
    return SymboleociPackage.Literals.DCONCEPT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SymboleociPackage.DCONCEPT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<CType> getConceptTypes()
  {
    if (conceptTypes == null)
    {
      conceptTypes = new EObjectContainmentEList<CType>(CType.class, this, SymboleociPackage.DCONCEPT__CONCEPT_TYPES);
    }
    return conceptTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Att> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<Att>(Att.class, this, SymboleociPackage.DCONCEPT__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<enumItem> getEnumerationItems()
  {
    if (enumerationItems == null)
    {
      enumerationItems = new EObjectContainmentEList<enumItem>(enumItem.class, this, SymboleociPackage.DCONCEPT__ENUMERATION_ITEMS);
    }
    return enumerationItems;
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
      case SymboleociPackage.DCONCEPT__CONCEPT_TYPES:
        return ((InternalEList<?>)getConceptTypes()).basicRemove(otherEnd, msgs);
      case SymboleociPackage.DCONCEPT__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case SymboleociPackage.DCONCEPT__ENUMERATION_ITEMS:
        return ((InternalEList<?>)getEnumerationItems()).basicRemove(otherEnd, msgs);
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
      case SymboleociPackage.DCONCEPT__NAME:
        return getName();
      case SymboleociPackage.DCONCEPT__CONCEPT_TYPES:
        return getConceptTypes();
      case SymboleociPackage.DCONCEPT__ATTRIBUTES:
        return getAttributes();
      case SymboleociPackage.DCONCEPT__ENUMERATION_ITEMS:
        return getEnumerationItems();
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
      case SymboleociPackage.DCONCEPT__NAME:
        setName((String)newValue);
        return;
      case SymboleociPackage.DCONCEPT__CONCEPT_TYPES:
        getConceptTypes().clear();
        getConceptTypes().addAll((Collection<? extends CType>)newValue);
        return;
      case SymboleociPackage.DCONCEPT__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Att>)newValue);
        return;
      case SymboleociPackage.DCONCEPT__ENUMERATION_ITEMS:
        getEnumerationItems().clear();
        getEnumerationItems().addAll((Collection<? extends enumItem>)newValue);
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
      case SymboleociPackage.DCONCEPT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SymboleociPackage.DCONCEPT__CONCEPT_TYPES:
        getConceptTypes().clear();
        return;
      case SymboleociPackage.DCONCEPT__ATTRIBUTES:
        getAttributes().clear();
        return;
      case SymboleociPackage.DCONCEPT__ENUMERATION_ITEMS:
        getEnumerationItems().clear();
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
      case SymboleociPackage.DCONCEPT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SymboleociPackage.DCONCEPT__CONCEPT_TYPES:
        return conceptTypes != null && !conceptTypes.isEmpty();
      case SymboleociPackage.DCONCEPT__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case SymboleociPackage.DCONCEPT__ENUMERATION_ITEMS:
        return enumerationItems != null && !enumerationItems.isEmpty();
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

} //DConceptImpl
