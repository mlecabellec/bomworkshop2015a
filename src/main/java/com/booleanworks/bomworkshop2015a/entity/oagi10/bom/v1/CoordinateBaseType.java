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
 * The OAGIS CoordinateType allows the use of another coordinate system for the use within a warehousing and inventory environment and the geographic coordinate system.
 * 
 * <p>Classe Java pour CoordinateBaseType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CoordinateBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.openapplications.org/oagis/10}DescriptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceSystemID" type="{http://www.openapplications.org/oagis/10}OpenIDType" minOccurs="0"/&gt;
 *         &lt;element name="VerticalReferenceSystemID" type="{http://www.openapplications.org/oagis/10}OpenIDType" minOccurs="0"/&gt;
 *         &lt;element name="VerticalMeasure" type="{http://www.openapplications.org/oagis/10}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="LatitudeMeasure" type="{http://www.openapplications.org/oagis/10}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="LongitudeMeasure" type="{http://www.openapplications.org/oagis/10}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="VerticalAccuracyMeasure" type="{http://www.openapplications.org/oagis/10}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="HorizontalAccuracyMeasure" type="{http://www.openapplications.org/oagis/10}MeasureType" minOccurs="0"/&gt;
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
@XmlType(name = "CoordinateBaseType", propOrder = {
    "description",
    "referenceSystemID",
    "verticalReferenceSystemID",
    "verticalMeasure",
    "latitudeMeasure",
    "longitudeMeasure",
    "verticalAccuracyMeasure",
    "horizontalAccuracyMeasure"
})
@XmlSeeAlso({
    CoordinateType.class
})
public class CoordinateBaseType
    extends IdentificationType
{

    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "ReferenceSystemID")
    protected OpenIDType referenceSystemID;
    @XmlElement(name = "VerticalReferenceSystemID")
    protected OpenIDType verticalReferenceSystemID;
    @XmlElement(name = "VerticalMeasure")
    protected MeasureType verticalMeasure;
    @XmlElement(name = "LatitudeMeasure")
    protected MeasureType latitudeMeasure;
    @XmlElement(name = "LongitudeMeasure")
    protected MeasureType longitudeMeasure;
    @XmlElement(name = "VerticalAccuracyMeasure")
    protected MeasureType verticalAccuracyMeasure;
    @XmlElement(name = "HorizontalAccuracyMeasure")
    protected MeasureType horizontalAccuracyMeasure;

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * Obtient la valeur de la propriété referenceSystemID.
     * 
     * @return
     *     possible object is
     *     {@link OpenIDType }
     *     
     */
    public OpenIDType getReferenceSystemID() {
        return referenceSystemID;
    }

    /**
     * Définit la valeur de la propriété referenceSystemID.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenIDType }
     *     
     */
    public void setReferenceSystemID(OpenIDType value) {
        this.referenceSystemID = value;
    }

    /**
     * Obtient la valeur de la propriété verticalReferenceSystemID.
     * 
     * @return
     *     possible object is
     *     {@link OpenIDType }
     *     
     */
    public OpenIDType getVerticalReferenceSystemID() {
        return verticalReferenceSystemID;
    }

    /**
     * Définit la valeur de la propriété verticalReferenceSystemID.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenIDType }
     *     
     */
    public void setVerticalReferenceSystemID(OpenIDType value) {
        this.verticalReferenceSystemID = value;
    }

    /**
     * Obtient la valeur de la propriété verticalMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getVerticalMeasure() {
        return verticalMeasure;
    }

    /**
     * Définit la valeur de la propriété verticalMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setVerticalMeasure(MeasureType value) {
        this.verticalMeasure = value;
    }

    /**
     * Obtient la valeur de la propriété latitudeMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getLatitudeMeasure() {
        return latitudeMeasure;
    }

    /**
     * Définit la valeur de la propriété latitudeMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setLatitudeMeasure(MeasureType value) {
        this.latitudeMeasure = value;
    }

    /**
     * Obtient la valeur de la propriété longitudeMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getLongitudeMeasure() {
        return longitudeMeasure;
    }

    /**
     * Définit la valeur de la propriété longitudeMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setLongitudeMeasure(MeasureType value) {
        this.longitudeMeasure = value;
    }

    /**
     * Obtient la valeur de la propriété verticalAccuracyMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getVerticalAccuracyMeasure() {
        return verticalAccuracyMeasure;
    }

    /**
     * Définit la valeur de la propriété verticalAccuracyMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setVerticalAccuracyMeasure(MeasureType value) {
        this.verticalAccuracyMeasure = value;
    }

    /**
     * Obtient la valeur de la propriété horizontalAccuracyMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getHorizontalAccuracyMeasure() {
        return horizontalAccuracyMeasure;
    }

    /**
     * Définit la valeur de la propriété horizontalAccuracyMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setHorizontalAccuracyMeasure(MeasureType value) {
        this.horizontalAccuracyMeasure = value;
    }

}
