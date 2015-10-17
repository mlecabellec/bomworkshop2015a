//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.10.16 à 03:51:42 PM CEST 
//


package com.booleanworks.bomworkshop2015a.entity.oagi10.bom.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour BOMItemDataBaseType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="BOMItemDataBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}ManufacturingItemBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductionOrderReference" type="{http://www.openapplications.org/oagis/10}ProductionOrderReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OperationReference" type="{http://www.openapplications.org/oagis/10}OperationReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RouteReference" type="{http://www.openapplications.org/oagis/10}RouteReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ParentItemInstanceIdentification" type="{http://www.openapplications.org/oagis/10}ItemInstanceIdentificationType" minOccurs="0"/&gt;
 *         &lt;element name="ChildItemInstanceIdentification" type="{http://www.openapplications.org/oagis/10}ItemInstanceIdentificationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BOMItemDataBaseType", propOrder = {
    "productionOrderReference",
    "operationReference",
    "routeReference",
    "parentItemInstanceIdentification",
    "childItemInstanceIdentification"
})
@XmlSeeAlso({
    BOMItemDataType.class
})
public class BOMItemDataBaseType
    extends ManufacturingItemBaseType
{

    @XmlElement(name = "ProductionOrderReference")
    protected List<ProductionOrderReferenceType> productionOrderReference;
    @XmlElement(name = "OperationReference")
    protected List<OperationReferenceType> operationReference;
    @XmlElement(name = "RouteReference")
    protected List<RouteReferenceType> routeReference;
    @XmlElement(name = "ParentItemInstanceIdentification")
    protected ItemInstanceIdentificationType parentItemInstanceIdentification;
    @XmlElement(name = "ChildItemInstanceIdentification")
    protected List<ItemInstanceIdentificationType> childItemInstanceIdentification;

    /**
     * Gets the value of the productionOrderReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productionOrderReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductionOrderReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductionOrderReferenceType }
     * 
     * 
     */
    public List<ProductionOrderReferenceType> getProductionOrderReference() {
        if (productionOrderReference == null) {
            productionOrderReference = new ArrayList<ProductionOrderReferenceType>();
        }
        return this.productionOrderReference;
    }

    /**
     * Gets the value of the operationReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationReferenceType }
     * 
     * 
     */
    public List<OperationReferenceType> getOperationReference() {
        if (operationReference == null) {
            operationReference = new ArrayList<OperationReferenceType>();
        }
        return this.operationReference;
    }

    /**
     * Gets the value of the routeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteReferenceType }
     * 
     * 
     */
    public List<RouteReferenceType> getRouteReference() {
        if (routeReference == null) {
            routeReference = new ArrayList<RouteReferenceType>();
        }
        return this.routeReference;
    }

    /**
     * Obtient la valeur de la propriété parentItemInstanceIdentification.
     * 
     * @return
     *     possible object is
     *     {@link ItemInstanceIdentificationType }
     *     
     */
    public ItemInstanceIdentificationType getParentItemInstanceIdentification() {
        return parentItemInstanceIdentification;
    }

    /**
     * Définit la valeur de la propriété parentItemInstanceIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemInstanceIdentificationType }
     *     
     */
    public void setParentItemInstanceIdentification(ItemInstanceIdentificationType value) {
        this.parentItemInstanceIdentification = value;
    }

    /**
     * Gets the value of the childItemInstanceIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childItemInstanceIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildItemInstanceIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemInstanceIdentificationType }
     * 
     * 
     */
    public List<ItemInstanceIdentificationType> getChildItemInstanceIdentification() {
        if (childItemInstanceIdentification == null) {
            childItemInstanceIdentification = new ArrayList<ItemInstanceIdentificationType>();
        }
        return this.childItemInstanceIdentification;
    }

}
