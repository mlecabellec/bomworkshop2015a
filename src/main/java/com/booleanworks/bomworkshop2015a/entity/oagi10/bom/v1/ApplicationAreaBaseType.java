//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.10.16 à 03:51:42 PM CEST 
//


package com.booleanworks.bomworkshop2015a.entity.oagi10.bom.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ApplicationAreaBaseType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ApplicationAreaBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Sender" type="{http://www.openapplications.org/oagis/10}SenderType" minOccurs="0"/&gt;
 *         &lt;element name="Intermediary" type="{http://www.openapplications.org/oagis/10}IntermediaryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Receiver" type="{http://www.openapplications.org/oagis/10}ReceiverType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CreationDateTime" type="{http://www.openapplications.org/oagis/10}DateTimeType"/&gt;
 *         &lt;element name="Signature" type="{http://www.openapplications.org/oagis/10}SignatureType" minOccurs="0"/&gt;
 *         &lt;element name="ScenarioID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/&gt;
 *         &lt;element name="CorrelationID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/&gt;
 *         &lt;element name="BODID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationAreaBaseType", propOrder = {
    "sender",
    "intermediary",
    "receiver",
    "creationDateTime",
    "signature",
    "scenarioID",
    "correlationID",
    "bodid"
})
@XmlSeeAlso({
    ApplicationAreaType.class
})
public class ApplicationAreaBaseType {

    @XmlElement(name = "Sender")
    protected SenderType sender;
    @XmlElement(name = "Intermediary")
    protected List<IntermediaryType> intermediary;
    @XmlElement(name = "Receiver")
    protected List<ReceiverType> receiver;
    @XmlElement(name = "CreationDateTime", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String creationDateTime;
    @XmlElement(name = "Signature")
    protected SignatureType signature;
    @XmlElement(name = "ScenarioID")
    protected IDType scenarioID;
    @XmlElement(name = "CorrelationID")
    protected IDType correlationID;
    @XmlElement(name = "BODID")
    protected IDType bodid;

    /**
     * Obtient la valeur de la propriété sender.
     * 
     * @return
     *     possible object is
     *     {@link SenderType }
     *     
     */
    public SenderType getSender() {
        return sender;
    }

    /**
     * Définit la valeur de la propriété sender.
     * 
     * @param value
     *     allowed object is
     *     {@link SenderType }
     *     
     */
    public void setSender(SenderType value) {
        this.sender = value;
    }

    /**
     * Gets the value of the intermediary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intermediary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntermediary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntermediaryType }
     * 
     * 
     */
    public List<IntermediaryType> getIntermediary() {
        if (intermediary == null) {
            intermediary = new ArrayList<IntermediaryType>();
        }
        return this.intermediary;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receiver property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceiver().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReceiverType }
     * 
     * 
     */
    public List<ReceiverType> getReceiver() {
        if (receiver == null) {
            receiver = new ArrayList<ReceiverType>();
        }
        return this.receiver;
    }

    /**
     * Obtient la valeur de la propriété creationDateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Définit la valeur de la propriété creationDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationDateTime(String value) {
        this.creationDateTime = value;
    }

    /**
     * Obtient la valeur de la propriété signature.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Définit la valeur de la propriété signature.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

    /**
     * Obtient la valeur de la propriété scenarioID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getScenarioID() {
        return scenarioID;
    }

    /**
     * Définit la valeur de la propriété scenarioID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setScenarioID(IDType value) {
        this.scenarioID = value;
    }

    /**
     * Obtient la valeur de la propriété correlationID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getCorrelationID() {
        return correlationID;
    }

    /**
     * Définit la valeur de la propriété correlationID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setCorrelationID(IDType value) {
        this.correlationID = value;
    }

    /**
     * Obtient la valeur de la propriété bodid.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getBODID() {
        return bodid;
    }

    /**
     * Définit la valeur de la propriété bodid.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setBODID(IDType value) {
        this.bodid = value;
    }

}
