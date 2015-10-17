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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour LocationBaseType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LocationBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}LocationABIEType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PostalAddress" type="{http://www.openapplications.org/oagis/10}AddressType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PhysicalAddress" type="{http://www.openapplications.org/oagis/10}AddressType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.openapplications.org/oagis/10}FreeFormTextGroup"/&gt;
 *         &lt;element name="TimeZoneCode" type="{http://www.openapplications.org/oagis/10}clm6TimeZoneCode1_TimeZoneCodeContentType" minOccurs="0"/&gt;
 *         &lt;element name="AvailableTimePeriod" type="{http://www.openapplications.org/oagis/10}TimePeriodType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LocationEquipmentSpecification" type="{http://www.openapplications.org/oagis/10}SpecificationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveTimePeriod" type="{http://www.openapplications.org/oagis/10}TimePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="StorageLocation" type="{http://www.openapplications.org/oagis/10}StorageLocationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationBaseType", propOrder = {
    "postalAddress",
    "physicalAddress",
    "description",
    "note",
    "timeZoneCode",
    "availableTimePeriod",
    "locationEquipmentSpecification",
    "effectiveTimePeriod",
    "storageLocation"
})
@XmlSeeAlso({
    LocationType.class
})
public class LocationBaseType
    extends LocationABIEType
{

    @XmlElement(name = "PostalAddress")
    protected List<AddressType> postalAddress;
    @XmlElement(name = "PhysicalAddress")
    protected List<AddressType> physicalAddress;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "Note")
    protected List<NoteType> note;
    @XmlElement(name = "TimeZoneCode")
    @XmlSchemaType(name = "token")
    protected Clm6TimeZoneCode1TimeZoneCodeContentType timeZoneCode;
    @XmlElement(name = "AvailableTimePeriod")
    protected List<TimePeriodType> availableTimePeriod;
    @XmlElement(name = "LocationEquipmentSpecification")
    protected List<SpecificationType> locationEquipmentSpecification;
    @XmlElement(name = "EffectiveTimePeriod")
    protected TimePeriodType effectiveTimePeriod;
    @XmlElement(name = "StorageLocation")
    protected List<StorageLocationType> storageLocation;

    /**
     * Gets the value of the postalAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postalAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostalAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressType }
     * 
     * 
     */
    public List<AddressType> getPostalAddress() {
        if (postalAddress == null) {
            postalAddress = new ArrayList<AddressType>();
        }
        return this.postalAddress;
    }

    /**
     * Gets the value of the physicalAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressType }
     * 
     * 
     */
    public List<AddressType> getPhysicalAddress() {
        if (physicalAddress == null) {
            physicalAddress = new ArrayList<AddressType>();
        }
        return this.physicalAddress;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoteType }
     * 
     * 
     */
    public List<NoteType> getNote() {
        if (note == null) {
            note = new ArrayList<NoteType>();
        }
        return this.note;
    }

    /**
     * Obtient la valeur de la propriété timeZoneCode.
     * 
     * @return
     *     possible object is
     *     {@link Clm6TimeZoneCode1TimeZoneCodeContentType }
     *     
     */
    public Clm6TimeZoneCode1TimeZoneCodeContentType getTimeZoneCode() {
        return timeZoneCode;
    }

    /**
     * Définit la valeur de la propriété timeZoneCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Clm6TimeZoneCode1TimeZoneCodeContentType }
     *     
     */
    public void setTimeZoneCode(Clm6TimeZoneCode1TimeZoneCodeContentType value) {
        this.timeZoneCode = value;
    }

    /**
     * Gets the value of the availableTimePeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availableTimePeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailableTimePeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimePeriodType }
     * 
     * 
     */
    public List<TimePeriodType> getAvailableTimePeriod() {
        if (availableTimePeriod == null) {
            availableTimePeriod = new ArrayList<TimePeriodType>();
        }
        return this.availableTimePeriod;
    }

    /**
     * Gets the value of the locationEquipmentSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationEquipmentSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationEquipmentSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecificationType }
     * 
     * 
     */
    public List<SpecificationType> getLocationEquipmentSpecification() {
        if (locationEquipmentSpecification == null) {
            locationEquipmentSpecification = new ArrayList<SpecificationType>();
        }
        return this.locationEquipmentSpecification;
    }

    /**
     * Obtient la valeur de la propriété effectiveTimePeriod.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getEffectiveTimePeriod() {
        return effectiveTimePeriod;
    }

    /**
     * Définit la valeur de la propriété effectiveTimePeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setEffectiveTimePeriod(TimePeriodType value) {
        this.effectiveTimePeriod = value;
    }

    /**
     * Gets the value of the storageLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storageLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStorageLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StorageLocationType }
     * 
     * 
     */
    public List<StorageLocationType> getStorageLocation() {
        if (storageLocation == null) {
            storageLocation = new ArrayList<StorageLocationType>();
        }
        return this.storageLocation;
    }

}
