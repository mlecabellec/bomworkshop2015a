//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.10.16 à 03:51:42 PM CEST 
//


package com.booleanworks.bomworkshop2015a.entity.oagi10.bom.v1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour RangeBaseType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RangeBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InclusiveIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" minOccurs="0"/&gt;
 *         &lt;element name="StartID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/&gt;
 *         &lt;element name="RangeCountNumber" type="{http://www.openapplications.org/oagis/10}PositiveIntegerNumberType" minOccurs="0"/&gt;
 *         &lt;element name="EndID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RangeBaseType", propOrder = {
    "inclusiveIndicator",
    "startID",
    "rangeCountNumber",
    "endID"
})
@XmlSeeAlso({
    RangeType.class
})
public class RangeBaseType
    extends IdentificationType
{

    @XmlElement(name = "InclusiveIndicator")
    protected Boolean inclusiveIndicator;
    @XmlElement(name = "StartID")
    protected IDType startID;
    @XmlElement(name = "RangeCountNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger rangeCountNumber;
    @XmlElement(name = "EndID")
    protected IDType endID;

    /**
     * Obtient la valeur de la propriété inclusiveIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInclusiveIndicator() {
        return inclusiveIndicator;
    }

    /**
     * Définit la valeur de la propriété inclusiveIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInclusiveIndicator(Boolean value) {
        this.inclusiveIndicator = value;
    }

    /**
     * Obtient la valeur de la propriété startID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getStartID() {
        return startID;
    }

    /**
     * Définit la valeur de la propriété startID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setStartID(IDType value) {
        this.startID = value;
    }

    /**
     * Obtient la valeur de la propriété rangeCountNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRangeCountNumber() {
        return rangeCountNumber;
    }

    /**
     * Définit la valeur de la propriété rangeCountNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRangeCountNumber(BigInteger value) {
        this.rangeCountNumber = value;
    }

    /**
     * Obtient la valeur de la propriété endID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getEndID() {
        return endID;
    }

    /**
     * Définit la valeur de la propriété endID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setEndID(IDType value) {
        this.endID = value;
    }

}
