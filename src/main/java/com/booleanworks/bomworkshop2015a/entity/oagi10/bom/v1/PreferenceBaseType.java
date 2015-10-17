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
 * <p>Classe Java pour PreferenceBaseType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PreferenceBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}PreferenceABIEType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AvailableTimePeriod" type="{http://www.openapplications.org/oagis/10}TimePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="UnavailableTimePeriod" type="{http://www.openapplications.org/oagis/10}TimePeriodType" minOccurs="0"/&gt;
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
@XmlType(name = "PreferenceBaseType", propOrder = {
    "availableTimePeriod",
    "unavailableTimePeriod",
    "description",
    "note"
})
@XmlSeeAlso({
    PreferenceType.class
})
public class PreferenceBaseType
    extends PreferenceABIEType
{

    @XmlElement(name = "AvailableTimePeriod")
    protected TimePeriodType availableTimePeriod;
    @XmlElement(name = "UnavailableTimePeriod")
    protected TimePeriodType unavailableTimePeriod;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "Note")
    protected List<NoteType> note;

    /**
     * Obtient la valeur de la propriété availableTimePeriod.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getAvailableTimePeriod() {
        return availableTimePeriod;
    }

    /**
     * Définit la valeur de la propriété availableTimePeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setAvailableTimePeriod(TimePeriodType value) {
        this.availableTimePeriod = value;
    }

    /**
     * Obtient la valeur de la propriété unavailableTimePeriod.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getUnavailableTimePeriod() {
        return unavailableTimePeriod;
    }

    /**
     * Définit la valeur de la propriété unavailableTimePeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setUnavailableTimePeriod(TimePeriodType value) {
        this.unavailableTimePeriod = value;
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
