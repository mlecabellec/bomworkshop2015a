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
 * <p>Classe Java pour UsageBaseType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="UsageBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GeographicalRegionCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="LegalIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" minOccurs="0"/&gt;
 *         &lt;element name="FormattedName" type="{http://www.openapplications.org/oagis/10}NameType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FormattedAddressUse" type="{http://www.openapplications.org/oagis/10}FormattedAddressUseType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveTimePeriod" type="{http://www.openapplications.org/oagis/10}TimePeriodType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsageBaseType", propOrder = {
    "geographicalRegionCode",
    "legalIndicator",
    "formattedName",
    "formattedAddressUse",
    "effectiveTimePeriod"
})
@XmlSeeAlso({
    UsageType.class
})
public class UsageBaseType
    extends IdentificationType
{

    @XmlElement(name = "GeographicalRegionCode")
    protected CodeType geographicalRegionCode;
    @XmlElement(name = "LegalIndicator")
    protected Boolean legalIndicator;
    @XmlElement(name = "FormattedName")
    protected List<NameType> formattedName;
    @XmlElement(name = "FormattedAddressUse")
    protected List<FormattedAddressUseType> formattedAddressUse;
    @XmlElement(name = "EffectiveTimePeriod")
    protected TimePeriodType effectiveTimePeriod;

    /**
     * Obtient la valeur de la propriété geographicalRegionCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getGeographicalRegionCode() {
        return geographicalRegionCode;
    }

    /**
     * Définit la valeur de la propriété geographicalRegionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setGeographicalRegionCode(CodeType value) {
        this.geographicalRegionCode = value;
    }

    /**
     * Obtient la valeur de la propriété legalIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLegalIndicator() {
        return legalIndicator;
    }

    /**
     * Définit la valeur de la propriété legalIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLegalIndicator(Boolean value) {
        this.legalIndicator = value;
    }

    /**
     * Gets the value of the formattedName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formattedName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormattedName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getFormattedName() {
        if (formattedName == null) {
            formattedName = new ArrayList<NameType>();
        }
        return this.formattedName;
    }

    /**
     * Gets the value of the formattedAddressUse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formattedAddressUse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormattedAddressUse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormattedAddressUseType }
     * 
     * 
     */
    public List<FormattedAddressUseType> getFormattedAddressUse() {
        if (formattedAddressUse == null) {
            formattedAddressUse = new ArrayList<FormattedAddressUseType>();
        }
        return this.formattedAddressUse;
    }

    /**
     * Obtient la valeur de la propriété effectiveTimePeriod.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getEffectiveTimePeriod() {
        return effectiveTimePeriod;
    }

    /**
     * Définit la valeur de la propriété effectiveTimePeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setEffectiveTimePeriod(TimePeriodType value) {
        this.effectiveTimePeriod = value;
    }

}
