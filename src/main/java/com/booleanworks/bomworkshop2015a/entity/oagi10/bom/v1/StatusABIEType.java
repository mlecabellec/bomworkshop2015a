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
 * StatusABIEType is logically derived from UN/CEFACT TBG17 ABIE StatusType as defined in the Reusable Aggregate Business Information Entity (RUABIE) XML Schema file.
 * 
 * <p>Classe Java pour StatusABIEType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StatusABIEType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://www.openapplications.org/oagis/10}OpenCodeType" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.openapplications.org/oagis/10}DescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="ReasonCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="Reason" type="{http://www.openapplications.org/oagis/10}SequencedTextType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "StatusABIEType", propOrder = {
    "code",
    "description",
    "reasonCode",
    "reason",
    "effectiveTimePeriod"
})
@XmlSeeAlso({
    ChangeStatusBaseType.class,
    StatusBaseType.class
})
public class StatusABIEType
    extends IdentificationType
{

    @XmlElement(name = "Code")
    protected OpenCodeType code;
    @XmlElement(name = "Description")
    protected DescriptionType description;
    @XmlElement(name = "ReasonCode")
    protected CodeType reasonCode;
    @XmlElement(name = "Reason")
    protected List<SequencedTextType> reason;
    @XmlElement(name = "EffectiveTimePeriod")
    protected TimePeriodType effectiveTimePeriod;

    /**
     * Obtient la valeur de la propriété code.
     * 
     * @return
     *     possible object is
     *     {@link OpenCodeType }
     *     
     */
    public OpenCodeType getCode() {
        return code;
    }

    /**
     * Définit la valeur de la propriété code.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenCodeType }
     *     
     */
    public void setCode(OpenCodeType value) {
        this.code = value;
    }

    /**
     * Obtient la valeur de la propriété description.
     * 
     * @return
     *     possible object is
     *     {@link DescriptionType }
     *     
     */
    public DescriptionType getDescription() {
        return description;
    }

    /**
     * Définit la valeur de la propriété description.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionType }
     *     
     */
    public void setDescription(DescriptionType value) {
        this.description = value;
    }

    /**
     * Obtient la valeur de la propriété reasonCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getReasonCode() {
        return reasonCode;
    }

    /**
     * Définit la valeur de la propriété reasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setReasonCode(CodeType value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SequencedTextType }
     * 
     * 
     */
    public List<SequencedTextType> getReason() {
        if (reason == null) {
            reason = new ArrayList<SequencedTextType>();
        }
        return this.reason;
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
