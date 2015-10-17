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
 * <p>Classe Java pour TrademarkBaseType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TrademarkBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MarkAttachment" type="{http://www.openapplications.org/oagis/10}AttachmentType" minOccurs="0"/&gt;
 *         &lt;element name="MarkOwnerParty" type="{http://www.openapplications.org/oagis/10}PartyType" minOccurs="0"/&gt;
 *         &lt;element name="MarkEffectivity" type="{http://www.openapplications.org/oagis/10}EffectivityType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrademarkBaseType", propOrder = {
    "markAttachment",
    "markOwnerParty",
    "markEffectivity"
})
@XmlSeeAlso({
    TrademarkType.class
})
public class TrademarkBaseType
    extends IdentificationType
{

    @XmlElement(name = "MarkAttachment")
    protected AttachmentType markAttachment;
    @XmlElement(name = "MarkOwnerParty")
    protected PartyType markOwnerParty;
    @XmlElement(name = "MarkEffectivity")
    protected List<EffectivityType> markEffectivity;

    /**
     * Obtient la valeur de la propriété markAttachment.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentType }
     *     
     */
    public AttachmentType getMarkAttachment() {
        return markAttachment;
    }

    /**
     * Définit la valeur de la propriété markAttachment.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentType }
     *     
     */
    public void setMarkAttachment(AttachmentType value) {
        this.markAttachment = value;
    }

    /**
     * Obtient la valeur de la propriété markOwnerParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getMarkOwnerParty() {
        return markOwnerParty;
    }

    /**
     * Définit la valeur de la propriété markOwnerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setMarkOwnerParty(PartyType value) {
        this.markOwnerParty = value;
    }

    /**
     * Gets the value of the markEffectivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the markEffectivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarkEffectivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EffectivityType }
     * 
     * 
     */
    public List<EffectivityType> getMarkEffectivity() {
        if (markEffectivity == null) {
            markEffectivity = new ArrayList<EffectivityType>();
        }
        return this.markEffectivity;
    }

}
