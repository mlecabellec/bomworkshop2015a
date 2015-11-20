//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.10.16 à 03:51:42 PM CEST 
//


package com.booleanworks.bomworkshop2015a.entity.oagi10.bom.v1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Manufacturing Item Base Type for standards based detailing of a manufactured item
 * 
 * <p>Classe Java pour ManufacturingItemBaseType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ManufacturingItemBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}ItemInstanceBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Effectivity" type="{http://www.openapplications.org/oagis/10}EffectivityType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveTimePeriod" type="{http://www.openapplications.org/oagis/10}TimePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="ExecutionTimePeriod" type="{http://www.openapplications.org/oagis/10}TimePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="FixedQuantityIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.openapplications.org/oagis/10}LotSizeGroup"/&gt;
 *         &lt;element name="LeadTimeDuration" type="{http://www.openapplications.org/oagis/10}DurationMeasureType" minOccurs="0"/&gt;
 *         &lt;element name="RequiredPercent" type="{http://www.openapplications.org/oagis/10}PercentType" minOccurs="0"/&gt;
 *         &lt;element name="BackFlushedIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" minOccurs="0"/&gt;
 *         &lt;element name="ActualIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" minOccurs="0"/&gt;
 *         &lt;element name="TrackingIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" minOccurs="0"/&gt;
 *         &lt;element name="ScrapIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" minOccurs="0"/&gt;
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
@XmlType(name = "ManufacturingItemBaseType", propOrder = {
    "effectivity",
    "effectiveTimePeriod",
    "executionTimePeriod",
    "fixedQuantityIndicator",
    "maximumLotSizeQuantity",
    "minimumLotSizeQuantity",
    "lotSizeMultiplerNumber",
    "leadTimeDuration",
    "requiredPercent",
    "backFlushedIndicator",
    "actualIndicator",
    "trackingIndicator",
    "scrapIndicator"
})
@XmlSeeAlso({
    BOMItemDataBaseType.class
})
public class ManufacturingItemBaseType
    extends ItemInstanceBaseType
{

    @XmlElement(name = "Effectivity")
    protected List<EffectivityType> effectivity;
    @XmlElement(name = "EffectiveTimePeriod")
    protected TimePeriodType effectiveTimePeriod;
    @XmlElement(name = "ExecutionTimePeriod")
    protected TimePeriodType executionTimePeriod;
    @XmlElement(name = "FixedQuantityIndicator")
    protected Boolean fixedQuantityIndicator;
    @XmlElement(name = "MaximumLotSizeQuantity")
    protected QuantityType maximumLotSizeQuantity;
    @XmlElement(name = "MinimumLotSizeQuantity")
    protected QuantityType minimumLotSizeQuantity;
    @XmlElement(name = "LotSizeMultiplerNumber")
    protected BigDecimal lotSizeMultiplerNumber;
    @XmlElement(name = "LeadTimeDuration")
    @XmlSchemaType(name = "anySimpleType")
    protected String leadTimeDuration;
    @XmlElement(name = "RequiredPercent")
    protected BigDecimal requiredPercent;
    @XmlElement(name = "BackFlushedIndicator")
    protected Boolean backFlushedIndicator;
    @XmlElement(name = "ActualIndicator")
    protected Boolean actualIndicator;
    @XmlElement(name = "TrackingIndicator")
    protected Boolean trackingIndicator;
    @XmlElement(name = "ScrapIndicator")
    protected Boolean scrapIndicator;

    /**
     * Gets the value of the effectivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the effectivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEffectivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EffectivityType }
     * 
     * 
     */
    public List<EffectivityType> getEffectivity() {
        if (effectivity == null) {
            effectivity = new ArrayList<EffectivityType>();
        }
        return this.effectivity;
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

    /**
     * Obtient la valeur de la propriété executionTimePeriod.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getExecutionTimePeriod() {
        return executionTimePeriod;
    }

    /**
     * Définit la valeur de la propriété executionTimePeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setExecutionTimePeriod(TimePeriodType value) {
        this.executionTimePeriod = value;
    }

    /**
     * Obtient la valeur de la propriété fixedQuantityIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFixedQuantityIndicator() {
        return fixedQuantityIndicator;
    }

    /**
     * Définit la valeur de la propriété fixedQuantityIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFixedQuantityIndicator(Boolean value) {
        this.fixedQuantityIndicator = value;
    }

    /**
     * Obtient la valeur de la propriété maximumLotSizeQuantity.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getMaximumLotSizeQuantity() {
        return maximumLotSizeQuantity;
    }

    /**
     * Définit la valeur de la propriété maximumLotSizeQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setMaximumLotSizeQuantity(QuantityType value) {
        this.maximumLotSizeQuantity = value;
    }

    /**
     * Obtient la valeur de la propriété minimumLotSizeQuantity.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getMinimumLotSizeQuantity() {
        return minimumLotSizeQuantity;
    }

    /**
     * Définit la valeur de la propriété minimumLotSizeQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setMinimumLotSizeQuantity(QuantityType value) {
        this.minimumLotSizeQuantity = value;
    }

    /**
     * Obtient la valeur de la propriété lotSizeMultiplerNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLotSizeMultiplerNumber() {
        return lotSizeMultiplerNumber;
    }

    /**
     * Définit la valeur de la propriété lotSizeMultiplerNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLotSizeMultiplerNumber(BigDecimal value) {
        this.lotSizeMultiplerNumber = value;
    }

    /**
     * Obtient la valeur de la propriété leadTimeDuration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeadTimeDuration() {
        return leadTimeDuration;
    }

    /**
     * Définit la valeur de la propriété leadTimeDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeadTimeDuration(String value) {
        this.leadTimeDuration = value;
    }

    /**
     * Obtient la valeur de la propriété requiredPercent.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRequiredPercent() {
        return requiredPercent;
    }

    /**
     * Définit la valeur de la propriété requiredPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRequiredPercent(BigDecimal value) {
        this.requiredPercent = value;
    }

    /**
     * Obtient la valeur de la propriété backFlushedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBackFlushedIndicator() {
        return backFlushedIndicator;
    }

    /**
     * Définit la valeur de la propriété backFlushedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBackFlushedIndicator(Boolean value) {
        this.backFlushedIndicator = value;
    }

    /**
     * Obtient la valeur de la propriété actualIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActualIndicator() {
        return actualIndicator;
    }

    /**
     * Définit la valeur de la propriété actualIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActualIndicator(Boolean value) {
        this.actualIndicator = value;
    }

    /**
     * Obtient la valeur de la propriété trackingIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrackingIndicator() {
        return trackingIndicator;
    }

    /**
     * Définit la valeur de la propriété trackingIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrackingIndicator(Boolean value) {
        this.trackingIndicator = value;
    }

    /**
     * Obtient la valeur de la propriété scrapIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScrapIndicator() {
        return scrapIndicator;
    }

    /**
     * Définit la valeur de la propriété scrapIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScrapIndicator(Boolean value) {
        this.scrapIndicator = value;
    }

}
