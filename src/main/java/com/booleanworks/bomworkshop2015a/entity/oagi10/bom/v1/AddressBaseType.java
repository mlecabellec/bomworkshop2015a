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


/**
 * Address BaseType provides the information about the address or semantic address of an associated entity.
 * 
 * <p>Classe Java pour AddressBaseType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AddressBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.openapplications.org/oagis/10}OpenNameType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AttentionOfName" type="{http://www.openapplications.org/oagis/10}NameType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CareOfName" type="{http://www.openapplications.org/oagis/10}NameType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine" type="{http://www.openapplications.org/oagis/10}SequencedTextType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BuildingNumber" type="{http://www.openapplications.org/oagis/10}TextType" minOccurs="0"/&gt;
 *         &lt;element name="BuildingName" type="{http://www.openapplications.org/oagis/10}NameType" minOccurs="0"/&gt;
 *         &lt;element name="BlockName" type="{http://www.openapplications.org/oagis/10}NameType" minOccurs="0"/&gt;
 *         &lt;element name="StreetName" type="{http://www.openapplications.org/oagis/10}NameType" minOccurs="0"/&gt;
 *         &lt;element name="StreetTypeCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="Floor" type="{http://www.openapplications.org/oagis/10}TextType" minOccurs="0"/&gt;
 *         &lt;element name="Unit" type="{http://www.openapplications.org/oagis/10}TextType" minOccurs="0"/&gt;
 *         &lt;element name="StairCase" type="{http://www.openapplications.org/oagis/10}TextType" minOccurs="0"/&gt;
 *         &lt;element name="Door" type="{http://www.openapplications.org/oagis/10}TextType" minOccurs="0"/&gt;
 *         &lt;element name="PostOfficeBox" type="{http://www.openapplications.org/oagis/10}TextType" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryPointID" type="{http://www.openapplications.org/oagis/10}IDType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PlotID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/&gt;
 *         &lt;element name="CityName" type="{http://www.openapplications.org/oagis/10}NameType" minOccurs="0"/&gt;
 *         &lt;element name="CitySubDivisionName" type="{http://www.openapplications.org/oagis/10}OpenNameType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CountrySubDivisionCode" type="{http://www.openapplications.org/oagis/10}CountrySubDivisionCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CountryCode" type="{http://www.openapplications.org/oagis/10}CountryCodeType" minOccurs="0"/&gt;
 *         &lt;element name="PostalCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.openapplications.org/oagis/10}StatusType" minOccurs="0"/&gt;
 *         &lt;element name="Preference" type="{http://www.openapplications.org/oagis/10}PreferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GeographicalCoordinate" type="{http://www.openapplications.org/oagis/10}CoordinateType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Usage" type="{http://www.openapplications.org/oagis/10}UsageType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="languageCode" type="{http://www.openapplications.org/oagis/10}LanguageCodeContentType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
//@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressBaseType", propOrder = {
    "name",
    "attentionOfName",
    "careOfName",
    "addressLine",
    "buildingNumber",
    "buildingName",
    "blockName",
    "streetName",
    "streetTypeCode",
    "floor",
    "unit",
    "stairCase",
    "door",
    "postOfficeBox",
    "deliveryPointID",
    "plotID",
    "cityName",
    "citySubDivisionName",
    "countrySubDivisionCode",
    "countryCode",
    "postalCode",
    "status",
    "preference",
    "geographicalCoordinate",
    "usage"
})
@XmlSeeAlso({
    AddressType.class
})
public abstract class AddressBaseType
    extends IdentificationType
{

    @XmlElement(name = "Name")
    protected List<OpenNameType> name;
    @XmlElement(name = "AttentionOfName")
    protected List<NameType> attentionOfName;
    @XmlElement(name = "CareOfName")
    protected List<NameType> careOfName;
    @XmlElement(name = "AddressLine")
    protected List<SequencedTextType> addressLine;
    @XmlElement(name = "BuildingNumber")
    protected TextType buildingNumber;
    @XmlElement(name = "BuildingName")
    protected NameType buildingName;
    @XmlElement(name = "BlockName")
    protected NameType blockName;
    @XmlElement(name = "StreetName")
    protected NameType streetName;
    @XmlElement(name = "StreetTypeCode")
    protected CodeType streetTypeCode;
    @XmlElement(name = "Floor")
    protected TextType floor;
    @XmlElement(name = "Unit")
    protected TextType unit;
    @XmlElement(name = "StairCase")
    protected TextType stairCase;
    @XmlElement(name = "Door")
    protected TextType door;
    @XmlElement(name = "PostOfficeBox")
    protected TextType postOfficeBox;
    @XmlElement(name = "DeliveryPointID")
    protected List<IDType> deliveryPointID;
    @XmlElement(name = "PlotID")
    protected IDType plotID;
    @XmlElement(name = "CityName")
    protected NameType cityName;
    @XmlElement(name = "CitySubDivisionName")
    protected List<OpenNameType> citySubDivisionName;
    @XmlElement(name = "CountrySubDivisionCode")
    protected List<CountrySubDivisionCodeType> countrySubDivisionCode;
    @XmlElement(name = "CountryCode")
    protected CountryCodeType countryCode;
    @XmlElement(name = "PostalCode")
    protected CodeType postalCode;
    @XmlElement(name = "Status")
    protected StatusType status;
    @XmlElement(name = "Preference")
    protected List<PreferenceType> preference;
    @XmlElement(name = "GeographicalCoordinate")
    protected List<CoordinateType> geographicalCoordinate;
    @XmlElement(name = "Usage")
    protected List<UsageType> usage;
    @XmlAttribute(name = "languageCode")
    protected String languageCode;

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
     * Gets the value of the attentionOfName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attentionOfName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttentionOfName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getAttentionOfName() {
        if (attentionOfName == null) {
            attentionOfName = new ArrayList<NameType>();
        }
        return this.attentionOfName;
    }

    /**
     * Gets the value of the careOfName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the careOfName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCareOfName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getCareOfName() {
        if (careOfName == null) {
            careOfName = new ArrayList<NameType>();
        }
        return this.careOfName;
    }

    /**
     * Gets the value of the addressLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SequencedTextType }
     * 
     * 
     */
    public List<SequencedTextType> getAddressLine() {
        if (addressLine == null) {
            addressLine = new ArrayList<SequencedTextType>();
        }
        return this.addressLine;
    }

    /**
     * Obtient la valeur de la propriété buildingNumber.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getBuildingNumber() {
        return buildingNumber;
    }

    /**
     * Définit la valeur de la propriété buildingNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setBuildingNumber(TextType value) {
        this.buildingNumber = value;
    }

    /**
     * Obtient la valeur de la propriété buildingName.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getBuildingName() {
        return buildingName;
    }

    /**
     * Définit la valeur de la propriété buildingName.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setBuildingName(NameType value) {
        this.buildingName = value;
    }

    /**
     * Obtient la valeur de la propriété blockName.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getBlockName() {
        return blockName;
    }

    /**
     * Définit la valeur de la propriété blockName.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setBlockName(NameType value) {
        this.blockName = value;
    }

    /**
     * Obtient la valeur de la propriété streetName.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getStreetName() {
        return streetName;
    }

    /**
     * Définit la valeur de la propriété streetName.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setStreetName(NameType value) {
        this.streetName = value;
    }

    /**
     * Obtient la valeur de la propriété streetTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getStreetTypeCode() {
        return streetTypeCode;
    }

    /**
     * Définit la valeur de la propriété streetTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setStreetTypeCode(CodeType value) {
        this.streetTypeCode = value;
    }

    /**
     * Obtient la valeur de la propriété floor.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getFloor() {
        return floor;
    }

    /**
     * Définit la valeur de la propriété floor.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setFloor(TextType value) {
        this.floor = value;
    }

    /**
     * Obtient la valeur de la propriété unit.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getUnit() {
        return unit;
    }

    /**
     * Définit la valeur de la propriété unit.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setUnit(TextType value) {
        this.unit = value;
    }

    /**
     * Obtient la valeur de la propriété stairCase.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getStairCase() {
        return stairCase;
    }

    /**
     * Définit la valeur de la propriété stairCase.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setStairCase(TextType value) {
        this.stairCase = value;
    }

    /**
     * Obtient la valeur de la propriété door.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getDoor() {
        return door;
    }

    /**
     * Définit la valeur de la propriété door.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setDoor(TextType value) {
        this.door = value;
    }

    /**
     * Obtient la valeur de la propriété postOfficeBox.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getPostOfficeBox() {
        return postOfficeBox;
    }

    /**
     * Définit la valeur de la propriété postOfficeBox.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setPostOfficeBox(TextType value) {
        this.postOfficeBox = value;
    }

    /**
     * Gets the value of the deliveryPointID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryPointID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryPointID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDType }
     * 
     * 
     */
    public List<IDType> getDeliveryPointID() {
        if (deliveryPointID == null) {
            deliveryPointID = new ArrayList<IDType>();
        }
        return this.deliveryPointID;
    }

    /**
     * Obtient la valeur de la propriété plotID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getPlotID() {
        return plotID;
    }

    /**
     * Définit la valeur de la propriété plotID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setPlotID(IDType value) {
        this.plotID = value;
    }

    /**
     * Obtient la valeur de la propriété cityName.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getCityName() {
        return cityName;
    }

    /**
     * Définit la valeur de la propriété cityName.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setCityName(NameType value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the citySubDivisionName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citySubDivisionName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCitySubDivisionName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenNameType }
     * 
     * 
     */
    public List<OpenNameType> getCitySubDivisionName() {
        if (citySubDivisionName == null) {
            citySubDivisionName = new ArrayList<OpenNameType>();
        }
        return this.citySubDivisionName;
    }

    /**
     * Gets the value of the countrySubDivisionCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countrySubDivisionCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountrySubDivisionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountrySubDivisionCodeType }
     * 
     * 
     */
    public List<CountrySubDivisionCodeType> getCountrySubDivisionCode() {
        if (countrySubDivisionCode == null) {
            countrySubDivisionCode = new ArrayList<CountrySubDivisionCodeType>();
        }
        return this.countrySubDivisionCode;
    }

    /**
     * Obtient la valeur de la propriété countryCode.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getCountryCode() {
        return countryCode;
    }

    /**
     * Définit la valeur de la propriété countryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setCountryCode(CountryCodeType value) {
        this.countryCode = value;
    }

    /**
     * Obtient la valeur de la propriété postalCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getPostalCode() {
        return postalCode;
    }

    /**
     * Définit la valeur de la propriété postalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setPostalCode(CodeType value) {
        this.postalCode = value;
    }

    /**
     * Obtient la valeur de la propriété status.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Définit la valeur de la propriété status.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the preference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreferenceType }
     * 
     * 
     */
    public List<PreferenceType> getPreference() {
        if (preference == null) {
            preference = new ArrayList<PreferenceType>();
        }
        return this.preference;
    }

    /**
     * Gets the value of the geographicalCoordinate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geographicalCoordinate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeographicalCoordinate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoordinateType }
     * 
     * 
     */
    public List<CoordinateType> getGeographicalCoordinate() {
        if (geographicalCoordinate == null) {
            geographicalCoordinate = new ArrayList<CoordinateType>();
        }
        return this.geographicalCoordinate;
    }

    /**
     * Gets the value of the usage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsageType }
     * 
     * 
     */
    public List<UsageType> getUsage() {
        if (usage == null) {
            usage = new ArrayList<UsageType>();
        }
        return this.usage;
    }

    /**
     * Obtient la valeur de la propriété languageCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Définit la valeur de la propriété languageCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

}
