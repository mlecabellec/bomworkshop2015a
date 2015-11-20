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
 * <p>Classe Java pour EMailAddressCommunicationBaseType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EMailAddressCommunicationBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UseCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="EMailAddressID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/&gt;
 *         &lt;element name="HTMLPreferredIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" minOccurs="0"/&gt;
 *         &lt;element name="Preference" type="{http://www.openapplications.org/oagis/10}PreferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "EMailAddressCommunicationBaseType", propOrder = {
    "useCode",
    "eMailAddressID",
    "htmlPreferredIndicator",
    "preference",
    "effectiveTimePeriod"
})
@XmlSeeAlso({
    EMailAddressCommunicationType.class
})
public class EMailAddressCommunicationBaseType
    extends IdentificationType
{

    @XmlElement(name = "UseCode")
    protected CodeType useCode;
    @XmlElement(name = "EMailAddressID")
    protected IDType eMailAddressID;
    @XmlElement(name = "HTMLPreferredIndicator")
    protected Boolean htmlPreferredIndicator;
    @XmlElement(name = "Preference")
    protected List<PreferenceType> preference;
    @XmlElement(name = "EffectiveTimePeriod")
    protected List<TimePeriodType> effectiveTimePeriod;

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
     * Obtient la valeur de la propriété eMailAddressID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getEMailAddressID() {
        return eMailAddressID;
    }

    /**
     * Définit la valeur de la propriété eMailAddressID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setEMailAddressID(IDType value) {
        this.eMailAddressID = value;
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

}
