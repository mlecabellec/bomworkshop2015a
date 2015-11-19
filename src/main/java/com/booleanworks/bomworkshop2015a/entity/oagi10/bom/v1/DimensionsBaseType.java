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
 * <p>Classe Java pour DimensionsBaseType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DimensionsBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}DimensionsABIEType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Measure" type="{http://www.openapplications.org/oagis/10}OpenMeasureType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="VolumeMeasure" type="{http://www.openapplications.org/oagis/10}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="NetVolumeMeasure" type="{http://www.openapplications.org/oagis/10}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="GrossVolumeMeasure" type="{http://www.openapplications.org/oagis/10}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="DimensionRandomSizeIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" minOccurs="0"/&gt;
 *         &lt;element name="SizeLimitRange" type="{http://www.openapplications.org/oagis/10}SizeLimitRangeType" minOccurs="0"/&gt;
 *         &lt;element name="WeightRange" type="{http://www.openapplications.org/oagis/10}WeightRangeType" minOccurs="0"/&gt;
 *         &lt;element name="NetWeightMeasure" type="{http://www.openapplications.org/oagis/10}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="TareWeightMeasure" type="{http://www.openapplications.org/oagis/10}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="GrossWeightMeasure" type="{http://www.openapplications.org/oagis/10}MeasureType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DimensionsBaseType", propOrder = {
    "measure",
    "volumeMeasure",
    "netVolumeMeasure",
    "grossVolumeMeasure",
    "dimensionRandomSizeIndicator",
    "sizeLimitRange",
    "weightRange",
    "netWeightMeasure",
    "tareWeightMeasure",
    "grossWeightMeasure"
})
@XmlSeeAlso({
    DimensionsType.class
})
public class DimensionsBaseType
    extends DimensionsABIEType
{

    @XmlElement(name = "Measure")
    protected List<OpenMeasureType> measure;
    @XmlElement(name = "VolumeMeasure")
    protected MeasureType volumeMeasure;
    @XmlElement(name = "NetVolumeMeasure")
    protected MeasureType netVolumeMeasure;
    @XmlElement(name = "GrossVolumeMeasure")
    protected MeasureType grossVolumeMeasure;
    @XmlElement(name = "DimensionRandomSizeIndicator")
    protected Boolean dimensionRandomSizeIndicator;
    @XmlElement(name = "SizeLimitRange")
    protected SizeLimitRangeType sizeLimitRange;
    @XmlElement(name = "WeightRange")
    protected WeightRangeType weightRange;
    @XmlElement(name = "NetWeightMeasure")
    protected MeasureType netWeightMeasure;
    @XmlElement(name = "TareWeightMeasure")
    protected MeasureType tareWeightMeasure;
    @XmlElement(name = "GrossWeightMeasure")
    protected MeasureType grossWeightMeasure;

    /**
     * Gets the value of the measure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenMeasureType }
     * 
     * 
     */
    public List<OpenMeasureType> getMeasure() {
        if (measure == null) {
            measure = new ArrayList<OpenMeasureType>();
        }
        return this.measure;
    }

    /**
     * Obtient la valeur de la propriété volumeMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getVolumeMeasure() {
        return volumeMeasure;
    }

    /**
     * Définit la valeur de la propriété volumeMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setVolumeMeasure(MeasureType value) {
        this.volumeMeasure = value;
    }

    /**
     * Obtient la valeur de la propriété netVolumeMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getNetVolumeMeasure() {
        return netVolumeMeasure;
    }

    /**
     * Définit la valeur de la propriété netVolumeMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setNetVolumeMeasure(MeasureType value) {
        this.netVolumeMeasure = value;
    }

    /**
     * Obtient la valeur de la propriété grossVolumeMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getGrossVolumeMeasure() {
        return grossVolumeMeasure;
    }

    /**
     * Définit la valeur de la propriété grossVolumeMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setGrossVolumeMeasure(MeasureType value) {
        this.grossVolumeMeasure = value;
    }

    /**
     * Obtient la valeur de la propriété dimensionRandomSizeIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDimensionRandomSizeIndicator() {
        return dimensionRandomSizeIndicator;
    }

    /**
     * Définit la valeur de la propriété dimensionRandomSizeIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDimensionRandomSizeIndicator(Boolean value) {
        this.dimensionRandomSizeIndicator = value;
    }

    /**
     * Obtient la valeur de la propriété sizeLimitRange.
     * 
     * @return
     *     possible object is
     *     {@link SizeLimitRangeType }
     *     
     */
    public SizeLimitRangeType getSizeLimitRange() {
        return sizeLimitRange;
    }

    /**
     * Définit la valeur de la propriété sizeLimitRange.
     * 
     * @param value
     *     allowed object is
     *     {@link SizeLimitRangeType }
     *     
     */
    public void setSizeLimitRange(SizeLimitRangeType value) {
        this.sizeLimitRange = value;
    }

    /**
     * Obtient la valeur de la propriété weightRange.
     * 
     * @return
     *     possible object is
     *     {@link WeightRangeType }
     *     
     */
    public WeightRangeType getWeightRange() {
        return weightRange;
    }

    /**
     * Définit la valeur de la propriété weightRange.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightRangeType }
     *     
     */
    public void setWeightRange(WeightRangeType value) {
        this.weightRange = value;
    }

    /**
     * Obtient la valeur de la propriété netWeightMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getNetWeightMeasure() {
        return netWeightMeasure;
    }

    /**
     * Définit la valeur de la propriété netWeightMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setNetWeightMeasure(MeasureType value) {
        this.netWeightMeasure = value;
    }

    /**
     * Obtient la valeur de la propriété tareWeightMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getTareWeightMeasure() {
        return tareWeightMeasure;
    }

    /**
     * Définit la valeur de la propriété tareWeightMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setTareWeightMeasure(MeasureType value) {
        this.tareWeightMeasure = value;
    }

    /**
     * Obtient la valeur de la propriété grossWeightMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getGrossWeightMeasure() {
        return grossWeightMeasure;
    }

    /**
     * Définit la valeur de la propriété grossWeightMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setGrossWeightMeasure(MeasureType value) {
        this.grossWeightMeasure = value;
    }

}
