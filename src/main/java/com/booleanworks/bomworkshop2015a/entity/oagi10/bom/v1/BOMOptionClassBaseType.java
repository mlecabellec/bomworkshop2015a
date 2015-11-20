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
 * <p>Classe Java pour BOMOptionClassBaseType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="BOMOptionClassBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.openapplications.org/oagis/10}OpenNameType" minOccurs="0"/&gt;
 *         &lt;element name="ExclusiveIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" minOccurs="0"/&gt;
 *         &lt;element name="MandatoryIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.openapplications.org/oagis/10}FreeFormTextGroup"/&gt;
 *         &lt;element name="BOMOption" type="{http://www.openapplications.org/oagis/10}BOMOptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "BOMOptionClassBaseType", propOrder = {
    "name",
    "exclusiveIndicator",
    "mandatoryIndicator",
    "description",
    "note",
    "bomOption",
    "quantity"
})
@XmlSeeAlso({
    BOMOptionClassType.class
})
public class BOMOptionClassBaseType
    extends IdentificationType
{

    @XmlElement(name = "Name")
    protected OpenNameType name;
    @XmlElement(name = "ExclusiveIndicator")
    protected Boolean exclusiveIndicator;
    @XmlElement(name = "MandatoryIndicator")
    protected Boolean mandatoryIndicator;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "Note")
    protected List<NoteType> note;
    @XmlElement(name = "BOMOption")
    protected List<BOMOptionType> bomOption;
    @XmlElement(name = "Quantity")
    protected List<OpenQuantityType> quantity;

    /**
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link OpenNameType }
     *     
     */
    public OpenNameType getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenNameType }
     *     
     */
    public void setName(OpenNameType value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propriété exclusiveIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExclusiveIndicator() {
        return exclusiveIndicator;
    }

    /**
     * Définit la valeur de la propriété exclusiveIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExclusiveIndicator(Boolean value) {
        this.exclusiveIndicator = value;
    }

    /**
     * Obtient la valeur de la propriété mandatoryIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMandatoryIndicator() {
        return mandatoryIndicator;
    }

    /**
     * Définit la valeur de la propriété mandatoryIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMandatoryIndicator(Boolean value) {
        this.mandatoryIndicator = value;
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

    /**
     * Gets the value of the bomOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bomOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBOMOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BOMOptionType }
     * 
     * 
     */
    public List<BOMOptionType> getBOMOption() {
        if (bomOption == null) {
            bomOption = new ArrayList<BOMOptionType>();
        }
        return this.bomOption;
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
