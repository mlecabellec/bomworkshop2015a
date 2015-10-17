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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour DocumentIdentificationBaseType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DocumentIdentificationBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://www.openapplications.org/oagis/10}OpenIDType" minOccurs="0"/&gt;
 *         &lt;element name="RevisionID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/&gt;
 *         &lt;element name="VariationID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/&gt;
 *         &lt;element name="DocumentIDSet" type="{http://www.openapplications.org/oagis/10}IDSetType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentIdentificationBaseType", propOrder = {
    "id",
    "revisionID",
    "variationID",
    "documentIDSet"
})
@XmlSeeAlso({
    HeaderBaseType.class,
    DocumentReferenceBaseType.class
})
public class DocumentIdentificationBaseType {

    @XmlElement(name = "ID")
    protected OpenIDType id;
    @XmlElement(name = "RevisionID")
    protected IDType revisionID;
    @XmlElement(name = "VariationID")
    protected IDType variationID;
    @XmlElement(name = "DocumentIDSet")
    protected List<IDSetType> documentIDSet;

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link OpenIDType }
     *     
     */
    public OpenIDType getID() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenIDType }
     *     
     */
    public void setID(OpenIDType value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété revisionID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getRevisionID() {
        return revisionID;
    }

    /**
     * Définit la valeur de la propriété revisionID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setRevisionID(IDType value) {
        this.revisionID = value;
    }

    /**
     * Obtient la valeur de la propriété variationID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getVariationID() {
        return variationID;
    }

    /**
     * Définit la valeur de la propriété variationID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setVariationID(IDType value) {
        this.variationID = value;
    }

    /**
     * Gets the value of the documentIDSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentIDSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentIDSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDSetType }
     * 
     * 
     */
    public List<IDSetType> getDocumentIDSet() {
        if (documentIDSet == null) {
            documentIDSet = new ArrayList<IDSetType>();
        }
        return this.documentIDSet;
    }

}
