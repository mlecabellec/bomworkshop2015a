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
 * <p>Classe Java pour ProductionOrderReferenceBaseType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ProductionOrderReferenceBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}DocumentReferenceBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemIdentification" type="{http://www.openapplications.org/oagis/10}ItemIdentificationType" minOccurs="0"/&gt;
 *         &lt;element name="Facility" type="{http://www.openapplications.org/oagis/10}FacilityType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SerialLot" type="{http://www.openapplications.org/oagis/10}SerialLotType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductionOrderReferenceBaseType", propOrder = {
    "itemIdentification",
    "facility",
    "serialLot"
})
@XmlSeeAlso({
    ProductionOrderReferenceType.class
})
public class ProductionOrderReferenceBaseType
    extends DocumentReferenceBaseType
{

    @XmlElement(name = "ItemIdentification")
    protected ItemIdentificationType itemIdentification;
    @XmlElement(name = "Facility")
    protected List<FacilityType> facility;
    @XmlElement(name = "SerialLot")
    protected List<SerialLotType> serialLot;

    /**
     * Obtient la valeur de la propriété itemIdentification.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdentificationType }
     *     
     */
    public ItemIdentificationType getItemIdentification() {
        return itemIdentification;
    }

    /**
     * Définit la valeur de la propriété itemIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdentificationType }
     *     
     */
    public void setItemIdentification(ItemIdentificationType value) {
        this.itemIdentification = value;
    }

    /**
     * Gets the value of the facility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilityType }
     * 
     * 
     */
    public List<FacilityType> getFacility() {
        if (facility == null) {
            facility = new ArrayList<FacilityType>();
        }
        return this.facility;
    }

    /**
     * Gets the value of the serialLot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serialLot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSerialLot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SerialLotType }
     * 
     * 
     */
    public List<SerialLotType> getSerialLot() {
        if (serialLot == null) {
            serialLot = new ArrayList<SerialLotType>();
        }
        return this.serialLot;
    }

}
