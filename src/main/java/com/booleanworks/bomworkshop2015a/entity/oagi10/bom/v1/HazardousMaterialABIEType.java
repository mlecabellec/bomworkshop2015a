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
 * HazardousMaterialABIEType is logically derived from UN/CEFACT TBG17 ABIE 
 * HazardousMaterialType as defined in the Reusable Aggregate Business Information Entity (RUABIE) XML Schema file.
 * 
 * <p>Classe Java pour HazardousMaterialABIEType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="HazardousMaterialABIEType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MFAGID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/&gt;
 *         &lt;element name="TechnicalName" type="{http://www.openapplications.org/oagis/10}NameType" minOccurs="0"/&gt;
 *         &lt;element name="PlacardEndorsement" type="{http://www.openapplications.org/oagis/10}TextType" minOccurs="0"/&gt;
 *         &lt;element name="PlacardNotation" type="{http://www.openapplications.org/oagis/10}TextType" minOccurs="0"/&gt;
 *         &lt;element name="MarinePollutionLevelCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="ToxicityZoneCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="Temperature" type="{http://www.openapplications.org/oagis/10}OpenMeasureType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FlashpointTemperature" type="{http://www.openapplications.org/oagis/10}TemperatureMeasureType" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryEntryRoute" type="{http://www.openapplications.org/oagis/10}TextType" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.openapplications.org/oagis/10}DescriptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EmergencyContact" type="{http://www.openapplications.org/oagis/10}ContactType" minOccurs="0"/&gt;
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
@XmlType(name = "HazardousMaterialABIEType", propOrder = {
    "mfagid",
    "technicalName",
    "placardEndorsement",
    "placardNotation",
    "marinePollutionLevelCode",
    "toxicityZoneCode",
    "temperature",
    "flashpointTemperature",
    "primaryEntryRoute",
    "description",
    "emergencyContact"
})
@XmlSeeAlso({
    HazardousMaterialBaseType.class
})
public class HazardousMaterialABIEType
    extends IdentificationType
{

    @XmlElement(name = "MFAGID")
    protected IDType mfagid;
    @XmlElement(name = "TechnicalName")
    protected NameType technicalName;
    @XmlElement(name = "PlacardEndorsement")
    protected TextType placardEndorsement;
    @XmlElement(name = "PlacardNotation")
    protected TextType placardNotation;
    @XmlElement(name = "MarinePollutionLevelCode")
    protected CodeType marinePollutionLevelCode;
    @XmlElement(name = "ToxicityZoneCode")
    protected CodeType toxicityZoneCode;
    @XmlElement(name = "Temperature")
    protected List<OpenMeasureType> temperature;
    @XmlElement(name = "FlashpointTemperature")
    protected TemperatureMeasureType flashpointTemperature;
    @XmlElement(name = "PrimaryEntryRoute")
    protected TextType primaryEntryRoute;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "EmergencyContact")
    protected ContactType emergencyContact;

    /**
     * Obtient la valeur de la propriété mfagid.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getMFAGID() {
        return mfagid;
    }

    /**
     * Définit la valeur de la propriété mfagid.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setMFAGID(IDType value) {
        this.mfagid = value;
    }

    /**
     * Obtient la valeur de la propriété technicalName.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getTechnicalName() {
        return technicalName;
    }

    /**
     * Définit la valeur de la propriété technicalName.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setTechnicalName(NameType value) {
        this.technicalName = value;
    }

    /**
     * Obtient la valeur de la propriété placardEndorsement.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getPlacardEndorsement() {
        return placardEndorsement;
    }

    /**
     * Définit la valeur de la propriété placardEndorsement.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setPlacardEndorsement(TextType value) {
        this.placardEndorsement = value;
    }

    /**
     * Obtient la valeur de la propriété placardNotation.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getPlacardNotation() {
        return placardNotation;
    }

    /**
     * Définit la valeur de la propriété placardNotation.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setPlacardNotation(TextType value) {
        this.placardNotation = value;
    }

    /**
     * Obtient la valeur de la propriété marinePollutionLevelCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getMarinePollutionLevelCode() {
        return marinePollutionLevelCode;
    }

    /**
     * Définit la valeur de la propriété marinePollutionLevelCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setMarinePollutionLevelCode(CodeType value) {
        this.marinePollutionLevelCode = value;
    }

    /**
     * Obtient la valeur de la propriété toxicityZoneCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getToxicityZoneCode() {
        return toxicityZoneCode;
    }

    /**
     * Définit la valeur de la propriété toxicityZoneCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setToxicityZoneCode(CodeType value) {
        this.toxicityZoneCode = value;
    }

    /**
     * Gets the value of the temperature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the temperature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemperature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenMeasureType }
     * 
     * 
     */
    public List<OpenMeasureType> getTemperature() {
        if (temperature == null) {
            temperature = new ArrayList<OpenMeasureType>();
        }
        return this.temperature;
    }

    /**
     * Obtient la valeur de la propriété flashpointTemperature.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureMeasureType }
     *     
     */
    public TemperatureMeasureType getFlashpointTemperature() {
        return flashpointTemperature;
    }

    /**
     * Définit la valeur de la propriété flashpointTemperature.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureMeasureType }
     *     
     */
    public void setFlashpointTemperature(TemperatureMeasureType value) {
        this.flashpointTemperature = value;
    }

    /**
     * Obtient la valeur de la propriété primaryEntryRoute.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getPrimaryEntryRoute() {
        return primaryEntryRoute;
    }

    /**
     * Définit la valeur de la propriété primaryEntryRoute.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setPrimaryEntryRoute(TextType value) {
        this.primaryEntryRoute = value;
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
     * Obtient la valeur de la propriété emergencyContact.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getEmergencyContact() {
        return emergencyContact;
    }

    /**
     * Définit la valeur de la propriété emergencyContact.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setEmergencyContact(ContactType value) {
        this.emergencyContact = value;
    }

}
