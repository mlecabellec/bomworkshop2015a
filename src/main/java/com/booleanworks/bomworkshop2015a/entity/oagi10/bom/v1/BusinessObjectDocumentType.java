//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.10.16 à 03:51:42 PM CEST 
//


package com.booleanworks.bomworkshop2015a.entity.oagi10.bom.v1;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Is the schema based inheritance for all BODs. The logical model would also include the DataArea.
 * 
 * <p>Classe Java pour BusinessObjectDocumentType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="BusinessObjectDocumentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApplicationArea" type="{http://www.openapplications.org/oagis/10}ApplicationAreaType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="releaseID" use="required" type="{http://www.openapplications.org/oagis/10}NormalizedStringType" /&gt;
 *       &lt;attribute name="versionID" type="{http://www.openapplications.org/oagis/10}NormalizedStringType" /&gt;
 *       &lt;attribute name="systemEnvironmentCode" type="{http://www.openapplications.org/oagis/10}SystemEnvironmentCodeContentType" default="Production" /&gt;
 *       &lt;attribute name="languageCode" type="{http://www.openapplications.org/oagis/10}LanguageCodeContentType" default="en-US" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessObjectDocumentType", propOrder = {
    "applicationArea"
})
@XmlSeeAlso({
    SyncBOMType.class
})
public class BusinessObjectDocumentType {

    @XmlElement(name = "ApplicationArea", required = true)
    protected ApplicationAreaType applicationArea;
    @XmlAttribute(name = "releaseID", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String releaseID;
    @XmlAttribute(name = "versionID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String versionID;
    @XmlAttribute(name = "systemEnvironmentCode")
    protected String systemEnvironmentCode;
    @XmlAttribute(name = "languageCode")
    protected String languageCode;

    /**
     * Obtient la valeur de la propriété applicationArea.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationAreaType }
     *     
     */
    public ApplicationAreaType getApplicationArea() {
        return applicationArea;
    }

    /**
     * Définit la valeur de la propriété applicationArea.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationAreaType }
     *     
     */
    public void setApplicationArea(ApplicationAreaType value) {
        this.applicationArea = value;
    }

    /**
     * Obtient la valeur de la propriété releaseID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseID() {
        return releaseID;
    }

    /**
     * Définit la valeur de la propriété releaseID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseID(String value) {
        this.releaseID = value;
    }

    /**
     * Obtient la valeur de la propriété versionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionID() {
        return versionID;
    }

    /**
     * Définit la valeur de la propriété versionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionID(String value) {
        this.versionID = value;
    }

    /**
     * Obtient la valeur de la propriété systemEnvironmentCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemEnvironmentCode() {
        if (systemEnvironmentCode == null) {
            return "Production";
        } else {
            return systemEnvironmentCode;
        }
    }

    /**
     * Définit la valeur de la propriété systemEnvironmentCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemEnvironmentCode(String value) {
        this.systemEnvironmentCode = value;
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
        if (languageCode == null) {
            return "en-US";
        } else {
            return languageCode;
        }
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
