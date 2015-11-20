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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour PartyIdentificationType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PartyIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://www.openapplications.org/oagis/10}OpenIDType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PartyIDSet" type="{http://www.openapplications.org/oagis/10}IDSetType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TaxIDSet" type="{http://www.openapplications.org/oagis/10}IDSetType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TaxID" type="{http://www.openapplications.org/oagis/10}IDType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DUNSID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/&gt;
 *         &lt;element name="CAGEID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/&gt;
 *         &lt;element name="DODAACID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/&gt;
 *         &lt;element name="BICID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/&gt;
 *         &lt;element name="SCACID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/&gt;
 *         &lt;element name="CCRID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="typeCode" type="{http://www.openapplications.org/oagis/10}CodeType_1E7368" /&gt;
 *       &lt;attribute name="role" type="{http://www.openapplications.org/oagis/10}PartyRoleCodeContentType" /&gt;
 *       &lt;attribute name="actionCode" type="{http://www.openapplications.org/oagis/10}ActionCodeContentType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
//@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentificationType", propOrder = {
    "id",
    "partyIDSet",
    "taxIDSet",
    "taxID",
    "dunsid",
    "cageid",
    "dodaacid",
    "bicid",
    "scacid",
    "ccrid"
})
@XmlSeeAlso({
    PartyBaseType.class
})
public class PartyIdentificationType {

    @XmlElement(name = "ID")
    protected List<OpenIDType> id;
    @XmlElement(name = "PartyIDSet")
    protected List<IDSetType> partyIDSet;
    @XmlElement(name = "TaxIDSet")
    protected List<IDSetType> taxIDSet;
    @XmlElement(name = "TaxID")
    protected List<IDType> taxID;
    @XmlElement(name = "DUNSID")
    protected IDType dunsid;
    @XmlElement(name = "CAGEID")
    protected IDType cageid;
    @XmlElement(name = "DODAACID")
    protected IDType dodaacid;
    @XmlElement(name = "BICID")
    protected IDType bicid;
    @XmlElement(name = "SCACID")
    protected IDType scacid;
    @XmlElement(name = "CCRID")
    protected IDType ccrid;
    @XmlAttribute(name = "typeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String typeCode;
    @XmlAttribute(name = "role")
    protected String role;
    @XmlAttribute(name = "actionCode")
    protected String actionCode;

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
     * Gets the value of the partyIDSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyIDSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyIDSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDSetType }
     * 
     * 
     */
    public List<IDSetType> getPartyIDSet() {
        if (partyIDSet == null) {
            partyIDSet = new ArrayList<IDSetType>();
        }
        return this.partyIDSet;
    }

    /**
     * Gets the value of the taxIDSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxIDSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxIDSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDSetType }
     * 
     * 
     */
    public List<IDSetType> getTaxIDSet() {
        if (taxIDSet == null) {
            taxIDSet = new ArrayList<IDSetType>();
        }
        return this.taxIDSet;
    }

    /**
     * Gets the value of the taxID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDType }
     * 
     * 
     */
    public List<IDType> getTaxID() {
        if (taxID == null) {
            taxID = new ArrayList<IDType>();
        }
        return this.taxID;
    }

    /**
     * Obtient la valeur de la propriété dunsid.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getDUNSID() {
        return dunsid;
    }

    /**
     * Définit la valeur de la propriété dunsid.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setDUNSID(IDType value) {
        this.dunsid = value;
    }

    /**
     * Obtient la valeur de la propriété cageid.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getCAGEID() {
        return cageid;
    }

    /**
     * Définit la valeur de la propriété cageid.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setCAGEID(IDType value) {
        this.cageid = value;
    }

    /**
     * Obtient la valeur de la propriété dodaacid.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getDODAACID() {
        return dodaacid;
    }

    /**
     * Définit la valeur de la propriété dodaacid.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setDODAACID(IDType value) {
        this.dodaacid = value;
    }

    /**
     * Obtient la valeur de la propriété bicid.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getBICID() {
        return bicid;
    }

    /**
     * Définit la valeur de la propriété bicid.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setBICID(IDType value) {
        this.bicid = value;
    }

    /**
     * Obtient la valeur de la propriété scacid.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getSCACID() {
        return scacid;
    }

    /**
     * Définit la valeur de la propriété scacid.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setSCACID(IDType value) {
        this.scacid = value;
    }

    /**
     * Obtient la valeur de la propriété ccrid.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getCCRID() {
        return ccrid;
    }

    /**
     * Définit la valeur de la propriété ccrid.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setCCRID(IDType value) {
        this.ccrid = value;
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
     * Obtient la valeur de la propriété role.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Définit la valeur de la propriété role.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
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

}
