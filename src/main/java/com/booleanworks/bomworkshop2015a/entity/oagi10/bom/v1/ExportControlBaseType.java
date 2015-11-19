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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ExportControlBaseType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ExportControlBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://www.openapplications.org/oagis/10}OpenCodeType" minOccurs="0"/&gt;
 *         &lt;element name="CountryCode" type="{http://www.openapplications.org/oagis/10}CountryCodeType" minOccurs="0"/&gt;
 *         &lt;element name="RegionCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="EncryptionStatusCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/&gt;
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
@XmlType(name = "ExportControlBaseType", propOrder = {
    "code",
    "countryCode",
    "regionCode",
    "encryptionStatusCode"
})
@XmlSeeAlso({
    ExportControlType.class
})
public class ExportControlBaseType
    extends IdentificationType
{

    @XmlElement(name = "Code")
    protected OpenCodeType code;
    @XmlElement(name = "CountryCode")
    protected CountryCodeType countryCode;
    @XmlElement(name = "RegionCode")
    protected CodeType regionCode;
    @XmlElement(name = "EncryptionStatusCode")
    protected CodeType encryptionStatusCode;

    /**
     * Obtient la valeur de la propriété code.
     * 
     * @return
     *     possible object is
     *     {@link OpenCodeType }
     *     
     */
    public OpenCodeType getCode() {
        return code;
    }

    /**
     * Définit la valeur de la propriété code.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenCodeType }
     *     
     */
    public void setCode(OpenCodeType value) {
        this.code = value;
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
     * Obtient la valeur de la propriété regionCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getRegionCode() {
        return regionCode;
    }

    /**
     * Définit la valeur de la propriété regionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setRegionCode(CodeType value) {
        this.regionCode = value;
    }

    /**
     * Obtient la valeur de la propriété encryptionStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getEncryptionStatusCode() {
        return encryptionStatusCode;
    }

    /**
     * Définit la valeur de la propriété encryptionStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setEncryptionStatusCode(CodeType value) {
        this.encryptionStatusCode = value;
    }

}
