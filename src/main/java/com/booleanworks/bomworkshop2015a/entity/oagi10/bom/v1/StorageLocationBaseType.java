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
 * <p>Classe Java pour StorageLocationBaseType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StorageLocationBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MajorDivisionID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/&gt;
 *         &lt;element name="MinorDivisionID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/&gt;
 *         &lt;element name="AisleID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/&gt;
 *         &lt;element name="RackID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/&gt;
 *         &lt;element name="RackLevelID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/&gt;
 *         &lt;element name="SubStorageLocationID" type="{http://www.openapplications.org/oagis/10}IDType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.openapplications.org/oagis/10}ContainerInstanceIDsGroup"/&gt;
 *         &lt;element name="InventoryPolicyCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="UOMCode" type="{http://www.openapplications.org/oagis/10}UOMCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageLocationBaseType", propOrder = {
    "majorDivisionID",
    "minorDivisionID",
    "aisleID",
    "rackID",
    "rackLevelID",
    "subStorageLocationID",
    "containerID",
    "rfid",
    "sealID",
    "inventoryPolicyCode",
    "uomCode"
})
@XmlSeeAlso({
    StorageLocationType.class
})
public class StorageLocationBaseType
    extends IdentificationType
{

    @XmlElement(name = "MajorDivisionID")
    protected IDType majorDivisionID;
    @XmlElement(name = "MinorDivisionID")
    protected IDType minorDivisionID;
    @XmlElement(name = "AisleID")
    protected IDType aisleID;
    @XmlElement(name = "RackID")
    protected IDType rackID;
    @XmlElement(name = "RackLevelID")
    protected IDType rackLevelID;
    @XmlElement(name = "SubStorageLocationID")
    protected List<IDType> subStorageLocationID;
    @XmlElement(name = "ContainerID")
    protected List<IDType> containerID;
    @XmlElement(name = "RFID")
    protected IDType rfid;
    @XmlElement(name = "SealID")
    protected IDType sealID;
    @XmlElement(name = "InventoryPolicyCode")
    protected CodeType inventoryPolicyCode;
    @XmlElement(name = "UOMCode")
    protected UOMCodeType uomCode;

    /**
     * Obtient la valeur de la propriété majorDivisionID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getMajorDivisionID() {
        return majorDivisionID;
    }

    /**
     * Définit la valeur de la propriété majorDivisionID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setMajorDivisionID(IDType value) {
        this.majorDivisionID = value;
    }

    /**
     * Obtient la valeur de la propriété minorDivisionID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getMinorDivisionID() {
        return minorDivisionID;
    }

    /**
     * Définit la valeur de la propriété minorDivisionID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setMinorDivisionID(IDType value) {
        this.minorDivisionID = value;
    }

    /**
     * Obtient la valeur de la propriété aisleID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getAisleID() {
        return aisleID;
    }

    /**
     * Définit la valeur de la propriété aisleID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setAisleID(IDType value) {
        this.aisleID = value;
    }

    /**
     * Obtient la valeur de la propriété rackID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getRackID() {
        return rackID;
    }

    /**
     * Définit la valeur de la propriété rackID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setRackID(IDType value) {
        this.rackID = value;
    }

    /**
     * Obtient la valeur de la propriété rackLevelID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getRackLevelID() {
        return rackLevelID;
    }

    /**
     * Définit la valeur de la propriété rackLevelID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setRackLevelID(IDType value) {
        this.rackLevelID = value;
    }

    /**
     * Gets the value of the subStorageLocationID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subStorageLocationID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubStorageLocationID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDType }
     * 
     * 
     */
    public List<IDType> getSubStorageLocationID() {
        if (subStorageLocationID == null) {
            subStorageLocationID = new ArrayList<IDType>();
        }
        return this.subStorageLocationID;
    }

    /**
     * Gets the value of the containerID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containerID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainerID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDType }
     * 
     * 
     */
    public List<IDType> getContainerID() {
        if (containerID == null) {
            containerID = new ArrayList<IDType>();
        }
        return this.containerID;
    }

    /**
     * Obtient la valeur de la propriété rfid.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getRFID() {
        return rfid;
    }

    /**
     * Définit la valeur de la propriété rfid.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setRFID(IDType value) {
        this.rfid = value;
    }

    /**
     * Obtient la valeur de la propriété sealID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getSealID() {
        return sealID;
    }

    /**
     * Définit la valeur de la propriété sealID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setSealID(IDType value) {
        this.sealID = value;
    }

    /**
     * Obtient la valeur de la propriété inventoryPolicyCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getInventoryPolicyCode() {
        return inventoryPolicyCode;
    }

    /**
     * Définit la valeur de la propriété inventoryPolicyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setInventoryPolicyCode(CodeType value) {
        this.inventoryPolicyCode = value;
    }

    /**
     * Obtient la valeur de la propriété uomCode.
     * 
     * @return
     *     possible object is
     *     {@link UOMCodeType }
     *     
     */
    public UOMCodeType getUOMCode() {
        return uomCode;
    }

    /**
     * Définit la valeur de la propriété uomCode.
     * 
     * @param value
     *     allowed object is
     *     {@link UOMCodeType }
     *     
     */
    public void setUOMCode(UOMCodeType value) {
        this.uomCode = value;
    }

}
