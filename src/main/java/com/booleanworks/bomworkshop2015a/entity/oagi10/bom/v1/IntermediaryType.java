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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Identifies the intended receiver of the given BOD instance.
 * 
 * <p>Classe Java pour IntermediaryType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="IntermediaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LogicalID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/&gt;
 *         &lt;element name="ComponentID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://www.openapplications.org/oagis/10}OpenIDType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ReceivedDateTime" type="{http://www.openapplications.org/oagis/10}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="SentDateTime" type="{http://www.openapplications.org/oagis/10}DateTimeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="typeCode" type="{http://www.openapplications.org/oagis/10}CodeType_1E7368" /&gt;
 *       &lt;attribute name="partyRoleCode" type="{http://www.openapplications.org/oagis/10}CodeType_1E7368" /&gt;
 *       &lt;attribute name="sequenceNumber" type="{http://www.openapplications.org/oagis/10}NumberType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
//@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntermediaryType", propOrder = {
    "logicalID",
    "componentID",
    "id",
    "receivedDateTime",
    "sentDateTime"
})
public class IntermediaryType {

    @XmlElement(name = "LogicalID")
    protected IDType logicalID;
    @XmlElement(name = "ComponentID")
    protected IDType componentID;
    @XmlElement(name = "ID")
    protected List<OpenIDType> id;
    @XmlElement(name = "ReceivedDateTime")
    @XmlSchemaType(name = "anySimpleType")
    protected String receivedDateTime;
    @XmlElement(name = "SentDateTime")
    @XmlSchemaType(name = "anySimpleType")
    protected String sentDateTime;
    @XmlAttribute(name = "typeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String typeCode;
    @XmlAttribute(name = "partyRoleCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String partyRoleCode;
    @XmlAttribute(name = "sequenceNumber")
    protected BigDecimal sequenceNumber;

    /**
     * Obtient la valeur de la propriété logicalID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getLogicalID() {
        return logicalID;
    }

    /**
     * Définit la valeur de la propriété logicalID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setLogicalID(IDType value) {
        this.logicalID = value;
    }

    /**
     * Obtient la valeur de la propriété componentID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getComponentID() {
        return componentID;
    }

    /**
     * Définit la valeur de la propriété componentID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setComponentID(IDType value) {
        this.componentID = value;
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
     * Obtient la valeur de la propriété receivedDateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivedDateTime() {
        return receivedDateTime;
    }

    /**
     * Définit la valeur de la propriété receivedDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivedDateTime(String value) {
        this.receivedDateTime = value;
    }

    /**
     * Obtient la valeur de la propriété sentDateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSentDateTime() {
        return sentDateTime;
    }

    /**
     * Définit la valeur de la propriété sentDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSentDateTime(String value) {
        this.sentDateTime = value;
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
     * Obtient la valeur de la propriété partyRoleCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyRoleCode() {
        return partyRoleCode;
    }

    /**
     * Définit la valeur de la propriété partyRoleCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyRoleCode(String value) {
        this.partyRoleCode = value;
    }

    /**
     * Obtient la valeur de la propriété sequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Définit la valeur de la propriété sequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSequenceNumber(BigDecimal value) {
        this.sequenceNumber = value;
    }

}
