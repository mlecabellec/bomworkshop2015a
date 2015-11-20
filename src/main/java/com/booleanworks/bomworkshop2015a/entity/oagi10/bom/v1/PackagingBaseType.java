//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.10.16 à 03:51:42 PM CEST 
//


package com.booleanworks.bomworkshop2015a.entity.oagi10.bom.v1;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PackagingBaseType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PackagingBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}MaterialBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Dimensions" type="{http://www.openapplications.org/oagis/10}DimensionsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="UPCPackagingLevelCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="PerPackageQuantity" type="{http://www.openapplications.org/oagis/10}QuantityType" minOccurs="0"/&gt;
 *         &lt;element name="CapacityPerPackageQuantity" type="{http://www.openapplications.org/oagis/10}QuantityType" minOccurs="0"/&gt;
 *         &lt;element name="OuterPackID" type="{http://www.openapplications.org/oagis/10}OpenIDType" minOccurs="0"/&gt;
 *         &lt;element name="InnerPackID" type="{http://www.openapplications.org/oagis/10}OpenIDType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{http://www.openapplications.org/oagis/10}OpenQuantityType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
//@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackagingBaseType", propOrder = {
    "dimensions",
    "upcPackagingLevelCode",
    "perPackageQuantity",
    "capacityPerPackageQuantity",
    "outerPackID",
    "innerPackID",
    "quantity"
})
@XmlSeeAlso({
    PackagingType.class
})
public class PackagingBaseType
    extends MaterialBaseType
{

    @XmlElement(name = "Dimensions")
    protected List<DimensionsType> dimensions;
    @XmlElement(name = "UPCPackagingLevelCode")
    protected CodeType upcPackagingLevelCode;
    @XmlElement(name = "PerPackageQuantity")
    protected QuantityType perPackageQuantity;
    @XmlElement(name = "CapacityPerPackageQuantity")
    protected QuantityType capacityPerPackageQuantity;
    @XmlElement(name = "OuterPackID")
    protected OpenIDType outerPackID;
    @XmlElement(name = "InnerPackID")
    protected List<OpenIDType> innerPackID;
    @XmlElement(name = "Quantity")
    protected List<OpenQuantityType> quantity;

    /**
     * Gets the value of the dimensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dimensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDimensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DimensionsType }
     * 
     * 
     */
    public List<DimensionsType> getDimensions() {
        if (dimensions == null) {
            dimensions = new ArrayList<DimensionsType>();
        }
        return this.dimensions;
    }

    /**
     * Obtient la valeur de la propriété upcPackagingLevelCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getUPCPackagingLevelCode() {
        return upcPackagingLevelCode;
    }

    /**
     * Définit la valeur de la propriété upcPackagingLevelCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setUPCPackagingLevelCode(CodeType value) {
        this.upcPackagingLevelCode = value;
    }

    /**
     * Obtient la valeur de la propriété perPackageQuantity.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getPerPackageQuantity() {
        return perPackageQuantity;
    }

    /**
     * Définit la valeur de la propriété perPackageQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setPerPackageQuantity(QuantityType value) {
        this.perPackageQuantity = value;
    }

    /**
     * Obtient la valeur de la propriété capacityPerPackageQuantity.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getCapacityPerPackageQuantity() {
        return capacityPerPackageQuantity;
    }

    /**
     * Définit la valeur de la propriété capacityPerPackageQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setCapacityPerPackageQuantity(QuantityType value) {
        this.capacityPerPackageQuantity = value;
    }

    /**
     * Obtient la valeur de la propriété outerPackID.
     * 
     * @return
     *     possible object is
     *     {@link OpenIDType }
     *     
     */
    public OpenIDType getOuterPackID() {
        return outerPackID;
    }

    /**
     * Définit la valeur de la propriété outerPackID.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenIDType }
     *     
     */
    public void setOuterPackID(OpenIDType value) {
        this.outerPackID = value;
    }

    /**
     * Gets the value of the innerPackID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the innerPackID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInnerPackID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenIDType }
     * 
     * 
     */
    public List<OpenIDType> getInnerPackID() {
        if (innerPackID == null) {
            innerPackID = new ArrayList<OpenIDType>();
        }
        return this.innerPackID;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenQuantityType }
     * 
     * 
     */
    public List<OpenQuantityType> getQuantity() {
        if (quantity == null) {
            quantity = new ArrayList<OpenQuantityType>();
        }
        return this.quantity;
    }

}
