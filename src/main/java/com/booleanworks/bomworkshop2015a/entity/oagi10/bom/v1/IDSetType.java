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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Communicates a composite key.
 * 
 * <p>Classe Java pour IDSetType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="IDSetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://www.openapplications.org/oagis/10}OpenIDType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="schemeID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" /&gt;
 *       &lt;attribute name="schemeVersionID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" /&gt;
 *       &lt;attribute name="schemeAgencyID" type="{http://www.openapplications.org/oagis/10}clm63055D08B_AgencyIdentificationContentType" /&gt;
 *       &lt;attribute name="typeCode" type="{http://www.openapplications.org/oagis/10}CodeType_1E7368" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
//@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IDSetType", propOrder = {
    "id"
})
public class IDSetType {

    @XmlElement(name = "ID", required = true)
    protected List<OpenIDType> id;
    @XmlAttribute(name = "schemeID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String schemeID;
    @XmlAttribute(name = "schemeVersionID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String schemeVersionID;
    @XmlAttribute(name = "schemeAgencyID")
    protected String schemeAgencyID;
    @XmlAttribute(name = "typeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String typeCode;

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
     * Obtient la valeur de la propriété schemeID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeID() {
        return schemeID;
    }

    /**
     * Définit la valeur de la propriété schemeID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeID(String value) {
        this.schemeID = value;
    }

    /**
     * Obtient la valeur de la propriété schemeVersionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeVersionID() {
        return schemeVersionID;
    }

    /**
     * Définit la valeur de la propriété schemeVersionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeVersionID(String value) {
        this.schemeVersionID = value;
    }

    /**
     * Obtient la valeur de la propriété schemeAgencyID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeAgencyID() {
        return schemeAgencyID;
    }

    /**
     * Définit la valeur de la propriété schemeAgencyID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeAgencyID(String value) {
        this.schemeAgencyID = value;
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

}
