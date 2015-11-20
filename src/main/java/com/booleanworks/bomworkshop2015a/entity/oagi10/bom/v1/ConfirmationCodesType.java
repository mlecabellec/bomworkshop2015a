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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ConfirmationCodesType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ConfirmationCodesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProcessingConfirmationCode" type="{http://www.openapplications.org/oagis/10}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ConfirmationCode" type="{http://www.openapplications.org/oagis/10}ConfirmationCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
//@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfirmationCodesType", propOrder = {
    "processingConfirmationCode",
    "confirmationCode"
})
public class ConfirmationCodesType {

    @XmlElement(name = "ProcessingConfirmationCode")
    protected List<CodeType> processingConfirmationCode;
    @XmlElement(name = "ConfirmationCode")
    protected ConfirmationCodeType confirmationCode;

    /**
     * Gets the value of the processingConfirmationCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processingConfirmationCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessingConfirmationCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getProcessingConfirmationCode() {
        if (processingConfirmationCode == null) {
            processingConfirmationCode = new ArrayList<CodeType>();
        }
        return this.processingConfirmationCode;
    }

    /**
     * Obtient la valeur de la propriété confirmationCode.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationCodeType }
     *     
     */
    public ConfirmationCodeType getConfirmationCode() {
        return confirmationCode;
    }

    /**
     * Définit la valeur de la propriété confirmationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationCodeType }
     *     
     */
    public void setConfirmationCode(ConfirmationCodeType value) {
        this.confirmationCode = value;
    }

}
