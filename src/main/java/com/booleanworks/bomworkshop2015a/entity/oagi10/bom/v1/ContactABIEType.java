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
 * ContactABIEType is logically derived from UN/CEFACT TBG17 ABIE ContactType as defined in the Reusable Aggregate Business Information Entity (RUABIE) XML Schema file.
 * 
 * <p>Classe Java pour ContactABIEType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ContactABIEType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PersonName" type="{http://www.openapplications.org/oagis/10}PersonNameType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RoleCode" type="{http://www.openapplications.org/oagis/10}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="JobTitle" type="{http://www.openapplications.org/oagis/10}TextType" minOccurs="0"/&gt;
 *         &lt;element name="Responsibility" type="{http://www.openapplications.org/oagis/10}TextType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OrganizationUnitID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/&gt;
 *         &lt;element name="Communication" type="{http://www.openapplications.org/oagis/10}CommunicationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TelephoneCommunication" type="{http://www.openapplications.org/oagis/10}TelephoneCommunicationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EMailAddressCommunication" type="{http://www.openapplications.org/oagis/10}EMailAddressCommunicationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="InternetAddressCommunication" type="{http://www.openapplications.org/oagis/10}ElectronicCommunicationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Preference" type="{http://www.openapplications.org/oagis/10}PreferenceType" minOccurs="0"/&gt;
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
@XmlType(name = "ContactABIEType", propOrder = {
    "personName",
    "roleCode",
    "jobTitle",
    "responsibility",
    "organizationUnitID",
    "communication",
    "telephoneCommunication",
    "eMailAddressCommunication",
    "internetAddressCommunication",
    "preference"
})
@XmlSeeAlso({
    ContactBaseType.class
})
public abstract class ContactABIEType
    extends IdentificationType
{

    @XmlElement(name = "PersonName")
    protected List<PersonNameType> personName;
    @XmlElement(name = "RoleCode")
    protected List<CodeType> roleCode;
    @XmlElement(name = "JobTitle")
    protected TextType jobTitle;
    @XmlElement(name = "Responsibility")
    protected List<TextType> responsibility;
    @XmlElement(name = "OrganizationUnitID")
    protected IDType organizationUnitID;
    @XmlElement(name = "Communication")
    protected List<CommunicationType> communication;
    @XmlElement(name = "TelephoneCommunication")
    protected List<TelephoneCommunicationType> telephoneCommunication;
    @XmlElement(name = "EMailAddressCommunication")
    protected List<EMailAddressCommunicationType> eMailAddressCommunication;
    @XmlElement(name = "InternetAddressCommunication")
    protected List<ElectronicCommunicationType> internetAddressCommunication;
    @XmlElement(name = "Preference")
    protected PreferenceType preference;
    @XmlAttribute(name = "languageCode")
    protected String languageCode;

    /**
     * Gets the value of the personName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonNameType }
     * 
     * 
     */
    public List<PersonNameType> getPersonName() {
        if (personName == null) {
            personName = new ArrayList<PersonNameType>();
        }
        return this.personName;
    }

    /**
     * Gets the value of the roleCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getRoleCode() {
        if (roleCode == null) {
            roleCode = new ArrayList<CodeType>();
        }
        return this.roleCode;
    }

    /**
     * Obtient la valeur de la propriété jobTitle.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getJobTitle() {
        return jobTitle;
    }

    /**
     * Définit la valeur de la propriété jobTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setJobTitle(TextType value) {
        this.jobTitle = value;
    }

    /**
     * Gets the value of the responsibility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responsibility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponsibility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getResponsibility() {
        if (responsibility == null) {
            responsibility = new ArrayList<TextType>();
        }
        return this.responsibility;
    }

    /**
     * Obtient la valeur de la propriété organizationUnitID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getOrganizationUnitID() {
        return organizationUnitID;
    }

    /**
     * Définit la valeur de la propriété organizationUnitID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setOrganizationUnitID(IDType value) {
        this.organizationUnitID = value;
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

    /**
     * Gets the value of the telephoneCommunication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephoneCommunication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephoneCommunication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TelephoneCommunicationType }
     * 
     * 
     */
    public List<TelephoneCommunicationType> getTelephoneCommunication() {
        if (telephoneCommunication == null) {
            telephoneCommunication = new ArrayList<TelephoneCommunicationType>();
        }
        return this.telephoneCommunication;
    }

    /**
     * Gets the value of the eMailAddressCommunication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eMailAddressCommunication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEMailAddressCommunication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EMailAddressCommunicationType }
     * 
     * 
     */
    public List<EMailAddressCommunicationType> getEMailAddressCommunication() {
        if (eMailAddressCommunication == null) {
            eMailAddressCommunication = new ArrayList<EMailAddressCommunicationType>();
        }
        return this.eMailAddressCommunication;
    }

    /**
     * Gets the value of the internetAddressCommunication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internetAddressCommunication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternetAddressCommunication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElectronicCommunicationType }
     * 
     * 
     */
    public List<ElectronicCommunicationType> getInternetAddressCommunication() {
        if (internetAddressCommunication == null) {
            internetAddressCommunication = new ArrayList<ElectronicCommunicationType>();
        }
        return this.internetAddressCommunication;
    }

    /**
     * Obtient la valeur de la propriété preference.
     * 
     * @return
     *     possible object is
     *     {@link PreferenceType }
     *     
     */
    public PreferenceType getPreference() {
        return preference;
    }

    /**
     * Définit la valeur de la propriété preference.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferenceType }
     *     
     */
    public void setPreference(PreferenceType value) {
        this.preference = value;
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
