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
 * LocationABIEType is logically derived from UN/CEFACT TBG17 ABIE LocationType as defined in the Reusable Aggregate Business Information Entity (RUABIE) XML Schema file.
 * 
 * <p>Classe Java pour LocationABIEType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LocationABIEType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CAGEID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.openapplications.org/oagis/10}OpenNameType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Directions" type="{http://www.openapplications.org/oagis/10}TextType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Coordinate" type="{http://www.openapplications.org/oagis/10}CoordinateType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://www.openapplications.org/oagis/10}AddressType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Contact" type="{http://www.openapplications.org/oagis/10}ContactType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Communication" type="{http://www.openapplications.org/oagis/10}CommunicationType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "LocationABIEType", propOrder = {
    "cageid",
    "name",
    "directions",
    "coordinate",
    "address",
    "contact",
    "communication"
})
@XmlSeeAlso({
    LocationBaseType.class
})
public class LocationABIEType
    extends IdentificationType
{

    @XmlElement(name = "CAGEID")
    protected IDType cageid;
    @XmlElement(name = "Name")
    protected List<OpenNameType> name;
    @XmlElement(name = "Directions")
    protected List<TextType> directions;
    @XmlElement(name = "Coordinate")
    protected List<CoordinateType> coordinate;
    @XmlElement(name = "Address")
    protected List<AddressType> address;
    @XmlElement(name = "Contact")
    protected List<ContactType> contact;
    @XmlElement(name = "Communication")
    protected List<CommunicationType> communication;

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
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenNameType }
     * 
     * 
     */
    public List<OpenNameType> getName() {
        if (name == null) {
            name = new ArrayList<OpenNameType>();
        }
        return this.name;
    }

    /**
     * Gets the value of the directions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirections().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getDirections() {
        if (directions == null) {
            directions = new ArrayList<TextType>();
        }
        return this.directions;
    }

    /**
     * Gets the value of the coordinate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coordinate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoordinate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoordinateType }
     * 
     * 
     */
    public List<CoordinateType> getCoordinate() {
        if (coordinate == null) {
            coordinate = new ArrayList<CoordinateType>();
        }
        return this.coordinate;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressType }
     * 
     * 
     */
    public List<AddressType> getAddress() {
        if (address == null) {
            address = new ArrayList<AddressType>();
        }
        return this.address;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactType }
     * 
     * 
     */
    public List<ContactType> getContact() {
        if (contact == null) {
            contact = new ArrayList<ContactType>();
        }
        return this.contact;
    }

    /**
     * Gets the value of the communication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the communication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommunication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationType }
     * 
     * 
     */
    public List<CommunicationType> getCommunication() {
        if (communication == null) {
            communication = new ArrayList<CommunicationType>();
        }
        return this.communication;
    }

}
