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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour OpenUserAreaType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="OpenUserAreaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AnyExtension" type="{http://www.openapplications.org/oagis/10}AnyUserAreaType" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://www.openapplications.org/oagis/10}OpenAmountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Code" type="{http://www.openapplications.org/oagis/10}OpenCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DateTime" type="{http://www.openapplications.org/oagis/10}OpenDateTimeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://www.openapplications.org/oagis/10}OpenIDType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Indicator" type="{http://www.openapplications.org/oagis/10}OpenIndicatorType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Measure" type="{http://www.openapplications.org/oagis/10}OpenMeasureType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.openapplications.org/oagis/10}OpenNameType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Number" type="{http://www.openapplications.org/oagis/10}OpenNumberType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{http://www.openapplications.org/oagis/10}OpenQuantityType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://www.openapplications.org/oagis/10}OpenTextType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Time" type="{http://www.openapplications.org/oagis/10}OpenTimeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ValueText" type="{http://www.openapplications.org/oagis/10}OpenFieldValueType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="typeCode" type="{http://www.openapplications.org/oagis/10}CodeType_1E7368" /&gt;
 *       &lt;attribute name="actionCode" type="{http://www.openapplications.org/oagis/10}ActionCodeContentType" /&gt;
 *       &lt;attribute name="sequenceNumber" type="{http://www.openapplications.org/oagis/10}NumberType_B98233" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenUserAreaType", propOrder = {
    "anyExtension",
    "amount",
    "code",
    "dateTime",
    "id",
    "indicator",
    "measure",
    "name",
    "number",
    "quantity",
    "text",
    "time",
    "valueText"
})
@XmlSeeAlso({
    AllExtensionType.class
})
public class OpenUserAreaType {

    @XmlElement(name = "AnyExtension")
    protected AnyUserAreaType anyExtension;
    @XmlElement(name = "Amount")
    protected List<OpenAmountType> amount;
    @XmlElement(name = "Code")
    protected List<OpenCodeType> code;
    @XmlElement(name = "DateTime")
    protected List<OpenDateTimeType> dateTime;
    @XmlElement(name = "ID")
    protected List<OpenIDType> id;
    @XmlElement(name = "Indicator")
    protected List<OpenIndicatorType> indicator;
    @XmlElement(name = "Measure")
    protected List<OpenMeasureType> measure;
    @XmlElement(name = "Name")
    protected List<OpenNameType> name;
    @XmlElement(name = "Number")
    protected List<OpenNumberType> number;
    @XmlElement(name = "Quantity")
    protected List<OpenQuantityType> quantity;
    @XmlElement(name = "Text")
    protected List<OpenTextType> text;
    @XmlElement(name = "Time")
    protected List<OpenTimeType> time;
    @XmlElement(name = "ValueText")
    protected List<OpenFieldValueType> valueText;
    @XmlAttribute(name = "typeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String typeCode;
    @XmlAttribute(name = "actionCode")
    protected String actionCode;
    @XmlAttribute(name = "sequenceNumber")
    protected BigInteger sequenceNumber;

    /**
     * Obtient la valeur de la propriété anyExtension.
     * 
     * @return
     *     possible object is
     *     {@link AnyUserAreaType }
     *     
     */
    public AnyUserAreaType getAnyExtension() {
        return anyExtension;
    }

    /**
     * Définit la valeur de la propriété anyExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyUserAreaType }
     *     
     */
    public void setAnyExtension(AnyUserAreaType value) {
        this.anyExtension = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenAmountType }
     * 
     * 
     */
    public List<OpenAmountType> getAmount() {
        if (amount == null) {
            amount = new ArrayList<OpenAmountType>();
        }
        return this.amount;
    }

    /**
     * Gets the value of the code property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the code property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenCodeType }
     * 
     * 
     */
    public List<OpenCodeType> getCode() {
        if (code == null) {
            code = new ArrayList<OpenCodeType>();
        }
        return this.code;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenDateTimeType }
     * 
     * 
     */
    public List<OpenDateTimeType> getDateTime() {
        if (dateTime == null) {
            dateTime = new ArrayList<OpenDateTimeType>();
        }
        return this.dateTime;
    }

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenIDType }
     * 
     * 
     */
    public List<OpenIDType> getID() {
        if (id == null) {
            id = new ArrayList<OpenIDType>();
        }
        return this.id;
    }

    /**
     * Gets the value of the indicator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indicator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndicator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenIndicatorType }
     * 
     * 
     */
    public List<OpenIndicatorType> getIndicator() {
        if (indicator == null) {
            indicator = new ArrayList<OpenIndicatorType>();
        }
        return this.indicator;
    }

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
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenNameType }
     * 
     * 
     */
    public List<OpenNameType> getName() {
        if (name == null) {
            name = new ArrayList<OpenNameType>();
        }
        return this.name;
    }

    /**
     * Gets the value of the number property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the number property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenNumberType }
     * 
     * 
     */
    public List<OpenNumberType> getNumber() {
        if (number == null) {
            number = new ArrayList<OpenNumberType>();
        }
        return this.number;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenQuantityType }
     * 
     * 
     */
    public List<OpenQuantityType> getQuantity() {
        if (quantity == null) {
            quantity = new ArrayList<OpenQuantityType>();
        }
        return this.quantity;
    }

    /**
     * Gets the value of the text property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the text property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenTextType }
     * 
     * 
     */
    public List<OpenTextType> getText() {
        if (text == null) {
            text = new ArrayList<OpenTextType>();
        }
        return this.text;
    }

    /**
     * Gets the value of the time property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the time property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenTimeType }
     * 
     * 
     */
    public List<OpenTimeType> getTime() {
        if (time == null) {
            time = new ArrayList<OpenTimeType>();
        }
        return this.time;
    }

    /**
     * Gets the value of the valueText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenFieldValueType }
     * 
     * 
     */
    public List<OpenFieldValueType> getValueText() {
        if (valueText == null) {
            valueText = new ArrayList<OpenFieldValueType>();
        }
        return this.valueText;
    }

    /**
     * Obtient la valeur de la propriété typeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Définit la valeur de la propriété typeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
    }

    /**
     * Obtient la valeur de la propriété actionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Définit la valeur de la propriété actionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

    /**
     * Obtient la valeur de la propriété sequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Définit la valeur de la propriété sequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

}
