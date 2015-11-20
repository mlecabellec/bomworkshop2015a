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
 * DimensionABIEType is logically derived from UN/CEFACT TBG17 ABIE DimensionType as defined in the Reusable Aggregate Business Information Entity (RUABIE) XML Schema file.
 * 
 * <p>Classe Java pour DimensionsABIEType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DimensionsABIEType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WidthMeasure" type="{http://www.openapplications.org/oagis/10}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="LengthMeasure" type="{http://www.openapplications.org/oagis/10}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="HeightMeasure" type="{http://www.openapplications.org/oagis/10}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.openapplications.org/oagis/10}DescriptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "DimensionsABIEType", propOrder = {
    "widthMeasure",
    "lengthMeasure",
    "heightMeasure",
    "description"
})
@XmlSeeAlso({
    DimensionsBaseType.class
})
public class DimensionsABIEType
    extends IdentificationType
{

    @XmlElement(name = "WidthMeasure")
    protected MeasureType widthMeasure;
    @XmlElement(name = "LengthMeasure")
    protected MeasureType lengthMeasure;
    @XmlElement(name = "HeightMeasure")
    protected MeasureType heightMeasure;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;

    /**
     * Obtient la valeur de la propriété widthMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getWidthMeasure() {
        return widthMeasure;
    }

    /**
     * Définit la valeur de la propriété widthMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setWidthMeasure(MeasureType value) {
        this.widthMeasure = value;
    }

    /**
     * Obtient la valeur de la propriété lengthMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getLengthMeasure() {
        return lengthMeasure;
    }

    /**
     * Définit la valeur de la propriété lengthMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setLengthMeasure(MeasureType value) {
        this.lengthMeasure = value;
    }

    /**
     * Obtient la valeur de la propriété heightMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getHeightMeasure() {
        return heightMeasure;
    }

    /**
     * Définit la valeur de la propriété heightMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setHeightMeasure(MeasureType value) {
        this.heightMeasure = value;
    }

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

}
