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
 * <p>Classe Java pour EffectivityBaseType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EffectivityBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.openapplications.org/oagis/10}OpenNameType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Preference" type="{http://www.openapplications.org/oagis/10}PreferenceType" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveValueList" type="{http://www.openapplications.org/oagis/10}EffectiveValueListType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveRange" type="{http://www.openapplications.org/oagis/10}RangeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveTimePeriod" type="{http://www.openapplications.org/oagis/10}TimePeriodType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "EffectivityBaseType", propOrder = {
    "name",
    "preference",
    "effectiveValueList",
    "effectiveRange",
    "effectiveTimePeriod"
})
@XmlSeeAlso({
    EffectivityType.class
})
public class EffectivityBaseType
    extends IdentificationType
{

    @XmlElement(name = "Name")
    protected List<OpenNameType> name;
    @XmlElement(name = "Preference")
    protected PreferenceType preference;
    @XmlElement(name = "EffectiveValueList")
    protected List<EffectiveValueListType> effectiveValueList;
    @XmlElement(name = "EffectiveRange")
    protected List<RangeType> effectiveRange;
    @XmlElement(name = "EffectiveTimePeriod")
    protected List<TimePeriodType> effectiveTimePeriod;

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenNameType }
     * 
     * 
     */
    public List<OpenNameType> getName() {
        if (name == null) {
            name = new ArrayList<OpenNameType>();
        }
        return this.name;
    }

    /**
     * Obtient la valeur de la propriété preference.
     * 
     * @return
     *     possible object is
     *     {@link PreferenceType }
     *     
     */
    public PreferenceType getPreference() {
        return preference;
    }

    /**
     * Définit la valeur de la propriété preference.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferenceType }
     *     
     */
    public void setPreference(PreferenceType value) {
        this.preference = value;
    }

    /**
     * Gets the value of the effectiveValueList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the effectiveValueList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEffectiveValueList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EffectiveValueListType }
     * 
     * 
     */
    public List<EffectiveValueListType> getEffectiveValueList() {
        if (effectiveValueList == null) {
            effectiveValueList = new ArrayList<EffectiveValueListType>();
        }
        return this.effectiveValueList;
    }

    /**
     * Gets the value of the effectiveRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the effectiveRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEffectiveRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RangeType }
     * 
     * 
     */
    public List<RangeType> getEffectiveRange() {
        if (effectiveRange == null) {
            effectiveRange = new ArrayList<RangeType>();
        }
        return this.effectiveRange;
    }

    /**
     * Gets the value of the effectiveTimePeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the effectiveTimePeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEffectiveTimePeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimePeriodType }
     * 
     * 
     */
    public List<TimePeriodType> getEffectiveTimePeriod() {
        if (effectiveTimePeriod == null) {
            effectiveTimePeriod = new ArrayList<TimePeriodType>();
        }
        return this.effectiveTimePeriod;
    }

}
