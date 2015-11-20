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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour HazardousMaterialBaseType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="HazardousMaterialBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}HazardousMaterialABIEType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Party" type="{http://www.openapplications.org/oagis/10}PartyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="HazardousClass" type="{http://www.openapplications.org/oagis/10}TextType" minOccurs="0"/&gt;
 *         &lt;element name="PackingGroup" type="{http://www.openapplications.org/oagis/10}TextType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
//@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HazardousMaterialBaseType", propOrder = {
    "party",
    "hazardousClass",
    "packingGroup"
})
@XmlSeeAlso({
    HazardousMaterialType.class
})
public class HazardousMaterialBaseType
    extends HazardousMaterialABIEType
{

    @XmlElement(name = "Party")
    protected List<PartyType> party;
    @XmlElement(name = "HazardousClass")
    protected TextType hazardousClass;
    @XmlElement(name = "PackingGroup")
    protected TextType packingGroup;

    /**
     * Gets the value of the party property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the party property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyType }
     * 
     * 
     */
    public List<PartyType> getParty() {
        if (party == null) {
            party = new ArrayList<PartyType>();
        }
        return this.party;
    }

    /**
     * Obtient la valeur de la propriété hazardousClass.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getHazardousClass() {
        return hazardousClass;
    }

    /**
     * Définit la valeur de la propriété hazardousClass.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setHazardousClass(TextType value) {
        this.hazardousClass = value;
    }

    /**
     * Obtient la valeur de la propriété packingGroup.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getPackingGroup() {
        return packingGroup;
    }

    /**
     * Définit la valeur de la propriété packingGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setPackingGroup(TextType value) {
        this.packingGroup = value;
    }

}
