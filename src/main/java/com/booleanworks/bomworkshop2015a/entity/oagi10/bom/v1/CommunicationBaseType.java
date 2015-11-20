//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.10.16 à 03:51:42 PM CEST 
//


package com.booleanworks.bomworkshop2015a.entity.oagi10.bom.v1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * CommunicationABIEType is logically derived from UN/CEFACT TBG17 ABIE CommunicationType as defined in the Reusable Aggregate Business Information Entity (RUABIE) XML Schema file.
 * 
 * <p>Classe Java pour CommunicationBaseType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CommunicationBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.openapplications.org/oagis/10}OpenNameType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ChannelCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="UseCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="CountryDialingCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="AreaDialingCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="DialNumber" type="{http://www.openapplications.org/oagis/10}TextType" minOccurs="0"/&gt;
 *         &lt;element name="PhoneExtension" type="{http://www.openapplications.org/oagis/10}TextType" minOccurs="0"/&gt;
 *         &lt;element name="Access" type="{http://www.openapplications.org/oagis/10}TextType" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://www.openapplications.org/oagis/10}AddressType" minOccurs="0"/&gt;
 *         &lt;element name="URI" type="{http://www.openapplications.org/oagis/10}URIType" minOccurs="0"/&gt;
 *         &lt;element name="HTMLPreferredIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://www.openapplications.org/oagis/10}OpenTextType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveTimePeriod" type="{http://www.openapplications.org/oagis/10}TimePeriodType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Preference" type="{http://www.openapplications.org/oagis/10}PreferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="sequenceNumber" type="{http://www.openapplications.org/oagis/10}NumberType_B98233" /&gt;
 *       &lt;attribute name="preferredIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType_CVW231" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
//@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicationBaseType", propOrder = {
    "name",
    "channelCode",
    "useCode",
    "countryDialingCode",
    "areaDialingCode",
    "dialNumber",
    "phoneExtension",
    "access",
    "address",
    "uri",
    "htmlPreferredIndicator",
    "text",
    "effectiveTimePeriod",
    "preference"
})
@XmlSeeAlso({
    CommunicationType.class
})
public class CommunicationBaseType
    extends IdentificationType
{

    @XmlElement(name = "Name")
    protected List<OpenNameType> name;
    @XmlElement(name = "ChannelCode")
    protected CodeType channelCode;
    @XmlElement(name = "UseCode")
    protected CodeType useCode;
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
    @XmlElement(name = "Address")
    protected AddressType address;
    @XmlElement(name = "URI")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String uri;
    @XmlElement(name = "HTMLPreferredIndicator")
    protected Boolean htmlPreferredIndicator;
    @XmlElement(name = "Text")
    protected List<OpenTextType> text;
    @XmlElement(name = "EffectiveTimePeriod")
    protected List<TimePeriodType> effectiveTimePeriod;
    @XmlElement(name = "Preference")
    protected List<PreferenceType> preference;
    @XmlAttribute(name = "sequenceNumber")
    protected BigInteger sequenceNumber;
    @XmlAttribute(name = "preferredIndicator")
    protected Boolean preferredIndicator;

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
     * Obtient la valeur de la propriété useCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getUseCode() {
        return useCode;
    }

    /**
     * Définit la valeur de la propriété useCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setUseCode(CodeType value) {
        this.useCode = value;
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
     * Obtient la valeur de la propriété address.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Définit la valeur de la propriété address.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Obtient la valeur de la propriété uri.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURI() {
        return uri;
    }

    /**
     * Définit la valeur de la propriété uri.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURI(String value) {
        this.uri = value;
    }

    /**
     * Obtient la valeur de la propriété htmlPreferredIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHTMLPreferredIndicator() {
        return htmlPreferredIndicator;
    }

    /**
     * Définit la valeur de la propriété htmlPreferredIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHTMLPreferredIndicator(Boolean value) {
        this.htmlPreferredIndicator = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the text property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenTextType }
     * 
     * 
     */
    public List<OpenTextType> getText() {
        if (text == null) {
            text = new ArrayList<OpenTextType>();
        }
        return this.text;
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
     * Obtient la valeur de la propriété sequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Définit la valeur de la propriété sequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

    /**
     * Obtient la valeur de la propriété preferredIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferredIndicator() {
        return preferredIndicator;
    }

    /**
     * Définit la valeur de la propriété preferredIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferredIndicator(Boolean value) {
        this.preferredIndicator = value;
    }

}
