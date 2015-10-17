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
 * <p>Classe Java pour TelephoneCommunicationBaseType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TelephoneCommunicationBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChannelCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="CountryDialingCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="AreaDialingCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="DialNumber" type="{http://www.openapplications.org/oagis/10}TextType" minOccurs="0"/&gt;
 *         &lt;element name="PhoneExtension" type="{http://www.openapplications.org/oagis/10}TextType" minOccurs="0"/&gt;
 *         &lt;element name="Access" type="{http://www.openapplications.org/oagis/10}TextType" minOccurs="0"/&gt;
 *         &lt;element name="FormattedNumber" type="{http://www.openapplications.org/oagis/10}OpenTextType" minOccurs="0"/&gt;
 *         &lt;element name="Preference" type="{http://www.openapplications.org/oagis/10}PreferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveTimePeriod" type="{http://www.openapplications.org/oagis/10}TimePeriodType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Usage" type="{http://www.openapplications.org/oagis/10}UsageType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelephoneCommunicationBaseType", propOrder = {
    "channelCode",
    "countryDialingCode",
    "areaDialingCode",
    "dialNumber",
    "phoneExtension",
    "access",
    "formattedNumber",
    "preference",
    "effectiveTimePeriod",
    "usage"
})
@XmlSeeAlso({
    TelephoneCommunicationType.class
})
public class TelephoneCommunicationBaseType
    extends IdentificationType
{

    @XmlElement(name = "ChannelCode")
    protected CodeType channelCode;
    @XmlElement(name = "CountryDialingCode")
    protected CodeType countryDialingCode;
    @XmlElement(name = "AreaDialingCode")
    protected CodeType areaDialingCode;
    @XmlElement(name = "DialNumber")
    protected TextType dialNumber;
    @XmlElement(name = "PhoneExtension")
    protected TextType phoneExtension;
    @XmlElement(name = "Access")
    protected TextType access;
    @XmlElement(name = "FormattedNumber")
    protected OpenTextType formattedNumber;
    @XmlElement(name = "Preference")
    protected List<PreferenceType> preference;
    @XmlElement(name = "EffectiveTimePeriod")
    protected List<TimePeriodType> effectiveTimePeriod;
    @XmlElement(name = "Usage")
    protected List<UsageType> usage;

    /**
     * Obtient la valeur de la propriété channelCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getChannelCode() {
        return channelCode;
    }

    /**
     * Définit la valeur de la propriété channelCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setChannelCode(CodeType value) {
        this.channelCode = value;
    }

    /**
     * Obtient la valeur de la propriété countryDialingCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCountryDialingCode() {
        return countryDialingCode;
    }

    /**
     * Définit la valeur de la propriété countryDialingCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCountryDialingCode(CodeType value) {
        this.countryDialingCode = value;
    }

    /**
     * Obtient la valeur de la propriété areaDialingCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getAreaDialingCode() {
        return areaDialingCode;
    }

    /**
     * Définit la valeur de la propriété areaDialingCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setAreaDialingCode(CodeType value) {
        this.areaDialingCode = value;
    }

    /**
     * Obtient la valeur de la propriété dialNumber.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getDialNumber() {
        return dialNumber;
    }

    /**
     * Définit la valeur de la propriété dialNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setDialNumber(TextType value) {
        this.dialNumber = value;
    }

    /**
     * Obtient la valeur de la propriété phoneExtension.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getPhoneExtension() {
        return phoneExtension;
    }

    /**
     * Définit la valeur de la propriété phoneExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setPhoneExtension(TextType value) {
        this.phoneExtension = value;
    }

    /**
     * Obtient la valeur de la propriété access.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getAccess() {
        return access;
    }

    /**
     * Définit la valeur de la propriété access.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setAccess(TextType value) {
        this.access = value;
    }

    /**
     * Obtient la valeur de la propriété formattedNumber.
     * 
     * @return
     *     possible object is
     *     {@link OpenTextType }
     *     
     */
    public OpenTextType getFormattedNumber() {
        return formattedNumber;
    }

    /**
     * Définit la valeur de la propriété formattedNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenTextType }
     *     
     */
    public void setFormattedNumber(OpenTextType value) {
        this.formattedNumber = value;
    }

    /**
     * Gets the value of the preference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreferenceType }
     * 
     * 
     */
    public List<PreferenceType> getPreference() {
        if (preference == null) {
            preference = new ArrayList<PreferenceType>();
        }
        return this.preference;
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

    /**
     * Gets the value of the usage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsageType }
     * 
     * 
     */
    public List<UsageType> getUsage() {
        if (usage == null) {
            usage = new ArrayList<UsageType>();
        }
        return this.usage;
    }

}
