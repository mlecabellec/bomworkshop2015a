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
 * <p>Classe Java pour SerialLotBaseType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SerialLotBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemQuantity" type="{http://www.openapplications.org/oagis/10}QuantityType" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{http://www.openapplications.org/oagis/10}OpenQuantityType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Lot" type="{http://www.openapplications.org/oagis/10}LotType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Disposition" type="{http://www.openapplications.org/oagis/10}StatusType" minOccurs="0"/&gt;
 *         &lt;element name="SerialNumberID" type="{http://www.openapplications.org/oagis/10}IDType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ParentSerialNumberID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.openapplications.org/oagis/10}FreeFormTextGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SerialLotBaseType", propOrder = {
    "itemQuantity",
    "quantity",
    "lot",
    "disposition",
    "serialNumberID",
    "parentSerialNumberID",
    "description",
    "note"
})
@XmlSeeAlso({
    SerialLotType.class
})
public class SerialLotBaseType
    extends IdentificationType
{

    @XmlElement(name = "ItemQuantity")
    protected QuantityType itemQuantity;
    @XmlElement(name = "Quantity")
    protected List<OpenQuantityType> quantity;
    @XmlElement(name = "Lot")
    protected List<LotType> lot;
    @XmlElement(name = "Disposition")
    protected StatusType disposition;
    @XmlElement(name = "SerialNumberID")
    protected List<IDType> serialNumberID;
    @XmlElement(name = "ParentSerialNumberID")
    protected IDType parentSerialNumberID;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "Note")
    protected List<NoteType> note;

    /**
     * Obtient la valeur de la propriété itemQuantity.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getItemQuantity() {
        return itemQuantity;
    }

    /**
     * Définit la valeur de la propriété itemQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setItemQuantity(QuantityType value) {
        this.itemQuantity = value;
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

    /**
     * Obtient la valeur de la propriété disposition.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getDisposition() {
        return disposition;
    }

    /**
     * Définit la valeur de la propriété disposition.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setDisposition(StatusType value) {
        this.disposition = value;
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
     * Obtient la valeur de la propriété parentSerialNumberID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getParentSerialNumberID() {
        return parentSerialNumberID;
    }

    /**
     * Définit la valeur de la propriété parentSerialNumberID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setParentSerialNumberID(IDType value) {
        this.parentSerialNumberID = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoteType }
     * 
     * 
     */
    public List<NoteType> getNote() {
        if (note == null) {
            note = new ArrayList<NoteType>();
        }
        return this.note;
    }

}
