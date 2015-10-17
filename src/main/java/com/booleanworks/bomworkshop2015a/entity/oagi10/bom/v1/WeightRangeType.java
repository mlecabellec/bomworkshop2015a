//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.10.16 à 03:51:42 PM CEST 
//


package com.booleanworks.bomworkshop2015a.entity.oagi10.bom.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Weight Range Type for specifying upper and lower limits of a weight range
 * 
 * <p>Classe Java pour WeightRangeType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WeightRangeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MinimumWeightMeasure" type="{http://www.openapplications.org/oagis/10}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="MaximumWeightMeasure" type="{http://www.openapplications.org/oagis/10}MeasureType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeightRangeType", propOrder = {
    "minimumWeightMeasure",
    "maximumWeightMeasure"
})
public class WeightRangeType {

    @XmlElement(name = "MinimumWeightMeasure")
    protected MeasureType minimumWeightMeasure;
    @XmlElement(name = "MaximumWeightMeasure")
    protected MeasureType maximumWeightMeasure;

    /**
     * Obtient la valeur de la propriété minimumWeightMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getMinimumWeightMeasure() {
        return minimumWeightMeasure;
    }

    /**
     * Définit la valeur de la propriété minimumWeightMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setMinimumWeightMeasure(MeasureType value) {
        this.minimumWeightMeasure = value;
    }

    /**
     * Obtient la valeur de la propriété maximumWeightMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getMaximumWeightMeasure() {
        return maximumWeightMeasure;
    }

    /**
     * Définit la valeur de la propriété maximumWeightMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setMaximumWeightMeasure(MeasureType value) {
        this.maximumWeightMeasure = value;
    }

}
