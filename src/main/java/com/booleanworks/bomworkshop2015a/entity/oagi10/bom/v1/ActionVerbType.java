//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.10.16 à 03:51:42 PM CEST 
//


package com.booleanworks.bomworkshop2015a.entity.oagi10.bom.v1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour ActionVerbType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ActionVerbType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}VerbType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActionCriteria" type="{http://www.openapplications.org/oagis/10}ActionCriteriaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="recordSetStartNumber" type="{http://www.openapplications.org/oagis/10}PositiveIntegerNumberType" /&gt;
 *       &lt;attribute name="recordSetCountNumber" type="{http://www.openapplications.org/oagis/10}PositiveIntegerNumberType" /&gt;
 *       &lt;attribute name="recordSetTotalNumber" type="{http://www.openapplications.org/oagis/10}PositiveIntegerNumberType" /&gt;
 *       &lt;attribute name="recordSetCompleteIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" /&gt;
 *       &lt;attribute name="recordSetReferenceID" type="{http://www.openapplications.org/oagis/10}IDType_B3F14E" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionVerbType", propOrder = {
    "actionCriteria"
})
@XmlSeeAlso({
    SyncType.class
})
public class ActionVerbType
    extends VerbType
{

    @XmlElement(name = "ActionCriteria")
    protected List<ActionCriteriaType> actionCriteria;
    @XmlAttribute(name = "recordSetStartNumber")
    protected BigInteger recordSetStartNumber;
    @XmlAttribute(name = "recordSetCountNumber")
    protected BigInteger recordSetCountNumber;
    @XmlAttribute(name = "recordSetTotalNumber")
    protected BigInteger recordSetTotalNumber;
    @XmlAttribute(name = "recordSetCompleteIndicator")
    protected Boolean recordSetCompleteIndicator;
    @XmlAttribute(name = "recordSetReferenceID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String recordSetReferenceID;

    /**
     * Gets the value of the actionCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionCriteriaType }
     * 
     * 
     */
    public List<ActionCriteriaType> getActionCriteria() {
        if (actionCriteria == null) {
            actionCriteria = new ArrayList<ActionCriteriaType>();
        }
        return this.actionCriteria;
    }

    /**
     * Obtient la valeur de la propriété recordSetStartNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRecordSetStartNumber() {
        return recordSetStartNumber;
    }

    /**
     * Définit la valeur de la propriété recordSetStartNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRecordSetStartNumber(BigInteger value) {
        this.recordSetStartNumber = value;
    }

    /**
     * Obtient la valeur de la propriété recordSetCountNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRecordSetCountNumber() {
        return recordSetCountNumber;
    }

    /**
     * Définit la valeur de la propriété recordSetCountNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRecordSetCountNumber(BigInteger value) {
        this.recordSetCountNumber = value;
    }

    /**
     * Obtient la valeur de la propriété recordSetTotalNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRecordSetTotalNumber() {
        return recordSetTotalNumber;
    }

    /**
     * Définit la valeur de la propriété recordSetTotalNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRecordSetTotalNumber(BigInteger value) {
        this.recordSetTotalNumber = value;
    }

    /**
     * Obtient la valeur de la propriété recordSetCompleteIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecordSetCompleteIndicator() {
        return recordSetCompleteIndicator;
    }

    /**
     * Définit la valeur de la propriété recordSetCompleteIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecordSetCompleteIndicator(Boolean value) {
        this.recordSetCompleteIndicator = value;
    }

    /**
     * Obtient la valeur de la propriété recordSetReferenceID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordSetReferenceID() {
        return recordSetReferenceID;
    }

    /**
     * Définit la valeur de la propriété recordSetReferenceID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordSetReferenceID(String value) {
        this.recordSetReferenceID = value;
    }

}
