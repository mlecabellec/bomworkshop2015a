//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.10.16 à 03:51:42 PM CEST 
//


package com.booleanworks.bomworkshop2015a.entity.oagi10.bom.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Allows any digital Signatures to be added to the Instance of the BOD Instance in order to sign for any portion of the BOD content.
 * 
 * <p>Classe Java pour SignatureType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SignatureType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;any minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="qualifyingAgencyId" type="{http://www.openapplications.org/oagis/10}NormalizedStringType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureType", propOrder = {
    "any"
})
public class SignatureType {

    @XmlAnyElement(lax = true)
    protected Object any;
    @XmlAttribute(name = "qualifyingAgencyId")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String qualifyingAgencyId;

    /**
     * Obtient la valeur de la propriété any.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAny() {
        return any;
    }

    /**
     * Définit la valeur de la propriété any.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
    }

    /**
     * Obtient la valeur de la propriété qualifyingAgencyId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifyingAgencyId() {
        return qualifyingAgencyId;
    }

    /**
     * Définit la valeur de la propriété qualifyingAgencyId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifyingAgencyId(String value) {
        this.qualifyingAgencyId = value;
    }

}
