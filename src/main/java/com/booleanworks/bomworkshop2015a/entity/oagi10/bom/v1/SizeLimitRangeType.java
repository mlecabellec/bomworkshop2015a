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
 * Size Limit Range Type for specifying the high and low limits for a size
 * 
 * <p>Classe Java pour SizeLimitRangeType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SizeLimitRangeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UnderSizeMeasure" type="{http://www.openapplications.org/oagis/10}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="OverSizeMeasure" type="{http://www.openapplications.org/oagis/10}MeasureType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SizeLimitRangeType", propOrder = {
    "underSizeMeasure",
    "overSizeMeasure"
})
public class SizeLimitRangeType {

    @XmlElement(name = "UnderSizeMeasure")
    protected MeasureType underSizeMeasure;
    @XmlElement(name = "OverSizeMeasure")
    protected MeasureType overSizeMeasure;

    /**
     * Obtient la valeur de la propriété underSizeMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getUnderSizeMeasure() {
        return underSizeMeasure;
    }

    /**
     * Définit la valeur de la propriété underSizeMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setUnderSizeMeasure(MeasureType value) {
        this.underSizeMeasure = value;
    }

    /**
     * Obtient la valeur de la propriété overSizeMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getOverSizeMeasure() {
        return overSizeMeasure;
    }

    /**
     * Définit la valeur de la propriété overSizeMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setOverSizeMeasure(MeasureType value) {
        this.overSizeMeasure = value;
    }

}
