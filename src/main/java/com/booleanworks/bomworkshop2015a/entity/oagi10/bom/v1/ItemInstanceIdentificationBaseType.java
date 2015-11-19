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
 * <p>Classe Java pour ItemInstanceIdentificationBaseType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ItemInstanceIdentificationBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}ItemIdentificationBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.openapplications.org/oagis/10}ItemIDsGroup"/&gt;
 *         &lt;group ref="{http://www.openapplications.org/oagis/10}ItemInstanceIDsGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemInstanceIdentificationBaseType", propOrder = {
    "customerItemIdentification",
    "manufacturerItemIdentification",
    "supplierItemIdentification",
    "upcid",
    "epcid",
    "gtinid",
    "uid",
    "rfid",
    "serialNumberID",
    "serialLot",
    "referenceDesignatorID",
    "findNumberID",
    "lot"
})
@XmlSeeAlso({
    ItemInstanceIdentificationType.class,
    ItemInstanceBaseType.class
})
public class ItemInstanceIdentificationBaseType
    extends ItemIdentificationBaseType
{

    @XmlElement(name = "CustomerItemIdentification")
    protected ItemIdentificationType customerItemIdentification;
    @XmlElement(name = "ManufacturerItemIdentification")
    protected ItemIdentificationType manufacturerItemIdentification;
    @XmlElement(name = "SupplierItemIdentification")
    protected ItemIdentificationType supplierItemIdentification;
    @XmlElement(name = "UPCID")
    protected IDType upcid;
    @XmlElement(name = "EPCID")
    protected IDType epcid;
    @XmlElement(name = "GTINID")
    protected IDType gtinid;
    @XmlElement(name = "UID")
    protected IDType uid;
    @XmlElement(name = "RFID")
    protected List<IDType> rfid;
    @XmlElement(name = "SerialNumberID")
    protected List<IDType> serialNumberID;
    @XmlElement(name = "SerialLot")
    protected List<SerialLotType> serialLot;
    @XmlElement(name = "ReferenceDesignatorID")
    protected SequencedIDType referenceDesignatorID;
    @XmlElement(name = "FindNumberID")
    protected IDType findNumberID;
    @XmlElement(name = "Lot")
    protected List<LotType> lot;

    /**
     * Obtient la valeur de la propriété customerItemIdentification.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdentificationType }
     *     
     */
    public ItemIdentificationType getCustomerItemIdentification() {
        return customerItemIdentification;
    }

    /**
     * Définit la valeur de la propriété customerItemIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdentificationType }
     *     
     */
    public void setCustomerItemIdentification(ItemIdentificationType value) {
        this.customerItemIdentification = value;
    }

    /**
     * Obtient la valeur de la propriété manufacturerItemIdentification.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdentificationType }
     *     
     */
    public ItemIdentificationType getManufacturerItemIdentification() {
        return manufacturerItemIdentification;
    }

    /**
     * Définit la valeur de la propriété manufacturerItemIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdentificationType }
     *     
     */
    public void setManufacturerItemIdentification(ItemIdentificationType value) {
        this.manufacturerItemIdentification = value;
    }

    /**
     * Obtient la valeur de la propriété supplierItemIdentification.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdentificationType }
     *     
     */
    public ItemIdentificationType getSupplierItemIdentification() {
        return supplierItemIdentification;
    }

    /**
     * Définit la valeur de la propriété supplierItemIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdentificationType }
     *     
     */
    public void setSupplierItemIdentification(ItemIdentificationType value) {
        this.supplierItemIdentification = value;
    }

    /**
     * Obtient la valeur de la propriété upcid.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getUPCID() {
        return upcid;
    }

    /**
     * Définit la valeur de la propriété upcid.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setUPCID(IDType value) {
        this.upcid = value;
    }

    /**
     * Obtient la valeur de la propriété epcid.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getEPCID() {
        return epcid;
    }

    /**
     * Définit la valeur de la propriété epcid.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setEPCID(IDType value) {
        this.epcid = value;
    }

    /**
     * Obtient la valeur de la propriété gtinid.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getGTINID() {
        return gtinid;
    }

    /**
     * Définit la valeur de la propriété gtinid.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setGTINID(IDType value) {
        this.gtinid = value;
    }

    /**
     * Obtient la valeur de la propriété uid.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getUID() {
        return uid;
    }

    /**
     * Définit la valeur de la propriété uid.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setUID(IDType value) {
        this.uid = value;
    }

    /**
     * Gets the value of the rfid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rfid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRFID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDType }
     * 
     * 
     */
    public List<IDType> getRFID() {
        if (rfid == null) {
            rfid = new ArrayList<IDType>();
        }
        return this.rfid;
    }

    /**
     * Gets the value of the serialNumberID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serialNumberID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSerialNumberID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDType }
     * 
     * 
     */
    public List<IDType> getSerialNumberID() {
        if (serialNumberID == null) {
            serialNumberID = new ArrayList<IDType>();
        }
        return this.serialNumberID;
    }

    /**
     * Gets the value of the serialLot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serialLot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSerialLot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SerialLotType }
     * 
     * 
     */
    public List<SerialLotType> getSerialLot() {
        if (serialLot == null) {
            serialLot = new ArrayList<SerialLotType>();
        }
        return this.serialLot;
    }

    /**
     * Obtient la valeur de la propriété referenceDesignatorID.
     * 
     * @return
     *     possible object is
     *     {@link SequencedIDType }
     *     
     */
    public SequencedIDType getReferenceDesignatorID() {
        return referenceDesignatorID;
    }

    /**
     * Définit la valeur de la propriété referenceDesignatorID.
     * 
     * @param value
     *     allowed object is
     *     {@link SequencedIDType }
     *     
     */
    public void setReferenceDesignatorID(SequencedIDType value) {
        this.referenceDesignatorID = value;
    }

    /**
     * Obtient la valeur de la propriété findNumberID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getFindNumberID() {
        return findNumberID;
    }

    /**
     * Définit la valeur de la propriété findNumberID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setFindNumberID(IDType value) {
        this.findNumberID = value;
    }

    /**
     * Gets the value of the lot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LotType }
     * 
     * 
     */
    public List<LotType> getLot() {
        if (lot == null) {
            lot = new ArrayList<LotType>();
        }
        return this.lot;
    }

}
