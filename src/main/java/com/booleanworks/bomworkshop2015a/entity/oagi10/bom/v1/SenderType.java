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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Identifies the sender of the given BOD instance
 * 
 * <p>Classe Java pour SenderType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SenderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LogicalID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/&gt;
 *         &lt;element name="ComponentID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/&gt;
 *         &lt;element name="TaskID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/&gt;
 *         &lt;element name="ConfirmationCodes" type="{http://www.openapplications.org/oagis/10}ConfirmationCodesType" minOccurs="0"/&gt;
 *         &lt;element name="AuthorizationID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://www.openapplications.org/oagis/10}OpenIDType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="typeCode" type="{http://www.openapplications.org/oagis/10}CodeType_1E7368" /&gt;
 *       &lt;attribute name="partyRoleCode" type="{http://www.openapplications.org/oagis/10}CodeType_1E7368" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
//@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SenderType", propOrder = {
    "logicalID",
    "componentID",
    "taskID",
    "referenceID",
    "confirmationCodes",
    "authorizationID",
    "id"
})
public class SenderType {

    @XmlElement(name = "LogicalID")
    protected IDType logicalID;
    @XmlElement(name = "ComponentID")
    protected IDType componentID;
    @XmlElement(name = "TaskID")
    protected IDType taskID;
    @XmlElement(name = "ReferenceID")
    protected IDType referenceID;
    @XmlElement(name = "ConfirmationCodes")
    protected ConfirmationCodesType confirmationCodes;
    @XmlElement(name = "AuthorizationID")
    protected IDType authorizationID;
    @XmlElement(name = "ID")
    protected List<OpenIDType> id;
    @XmlAttribute(name = "typeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String typeCode;
    @XmlAttribute(name = "partyRoleCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String partyRoleCode;

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
     * Obtient la valeur de la propriété taskID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getTaskID() {
        return taskID;
    }

    /**
     * Définit la valeur de la propriété taskID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setTaskID(IDType value) {
        this.taskID = value;
    }

    /**
     * Obtient la valeur de la propriété referenceID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getReferenceID() {
        return referenceID;
    }

    /**
     * Définit la valeur de la propriété referenceID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setReferenceID(IDType value) {
        this.referenceID = value;
    }

    /**
     * Obtient la valeur de la propriété confirmationCodes.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationCodesType }
     *     
     */
    public ConfirmationCodesType getConfirmationCodes() {
        return confirmationCodes;
    }

    /**
     * Définit la valeur de la propriété confirmationCodes.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationCodesType }
     *     
     */
    public void setConfirmationCodes(ConfirmationCodesType value) {
        this.confirmationCodes = value;
    }

    /**
     * Obtient la valeur de la propriété authorizationID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getAuthorizationID() {
        return authorizationID;
    }

    /**
     * Définit la valeur de la propriété authorizationID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setAuthorizationID(IDType value) {
        this.authorizationID = value;
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

}
