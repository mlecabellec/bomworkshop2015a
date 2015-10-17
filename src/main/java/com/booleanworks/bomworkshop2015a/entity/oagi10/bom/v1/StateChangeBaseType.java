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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour StateChangeBaseType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StateChangeBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FromStateCode" type="{http://www.openapplications.org/oagis/10}StateCodeType" minOccurs="0"/&gt;
 *         &lt;element name="ToStateCode" type="{http://www.openapplications.org/oagis/10}StateCodeType" minOccurs="0"/&gt;
 *         &lt;element name="ChangeDateTime" type="{http://www.openapplications.org/oagis/10}DateTimeType" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.openapplications.org/oagis/10}FreeFormTextGroup" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StateChangeBaseType", propOrder = {
    "fromStateCode",
    "toStateCode",
    "changeDateTime",
    "description",
    "note"
})
@XmlSeeAlso({
    StateChangeType.class
})
public class StateChangeBaseType
    extends IdentificationType
{

    @XmlElement(name = "FromStateCode")
    protected StateCodeType fromStateCode;
    @XmlElement(name = "ToStateCode")
    protected StateCodeType toStateCode;
    @XmlElement(name = "ChangeDateTime")
    @XmlSchemaType(name = "anySimpleType")
    protected String changeDateTime;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "Note")
    protected List<NoteType> note;

    /**
     * Obtient la valeur de la propriété fromStateCode.
     * 
     * @return
     *     possible object is
     *     {@link StateCodeType }
     *     
     */
    public StateCodeType getFromStateCode() {
        return fromStateCode;
    }

    /**
     * Définit la valeur de la propriété fromStateCode.
     * 
     * @param value
     *     allowed object is
     *     {@link StateCodeType }
     *     
     */
    public void setFromStateCode(StateCodeType value) {
        this.fromStateCode = value;
    }

    /**
     * Obtient la valeur de la propriété toStateCode.
     * 
     * @return
     *     possible object is
     *     {@link StateCodeType }
     *     
     */
    public StateCodeType getToStateCode() {
        return toStateCode;
    }

    /**
     * Définit la valeur de la propriété toStateCode.
     * 
     * @param value
     *     allowed object is
     *     {@link StateCodeType }
     *     
     */
    public void setToStateCode(StateCodeType value) {
        this.toStateCode = value;
    }

    /**
     * Obtient la valeur de la propriété changeDateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeDateTime() {
        return changeDateTime;
    }

    /**
     * Définit la valeur de la propriété changeDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeDateTime(String value) {
        this.changeDateTime = value;
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
