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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Person Name Type for specifying a specific individuals designator
 * 
 * <p>Classe Java pour PersonNameBaseType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PersonNameBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FormattedName" type="{http://www.openapplications.org/oagis/10}NameType" minOccurs="0"/&gt;
 *         &lt;element name="PreferredName" type="{http://www.openapplications.org/oagis/10}NameType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GivenName" type="{http://www.openapplications.org/oagis/10}NameType" minOccurs="0"/&gt;
 *         &lt;element name="MiddleName" type="{http://www.openapplications.org/oagis/10}NameType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FamilyName" type="{http://www.openapplications.org/oagis/10}NameType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TitleAffixCode" type="{http://www.openapplications.org/oagis/10}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PreferredSalutationCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="GenerationAffixCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="QualificationAffixCode" type="{http://www.openapplications.org/oagis/10}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Initials" type="{http://www.openapplications.org/oagis/10}TextType" minOccurs="0"/&gt;
 *         &lt;element name="Usage" type="{http://www.openapplications.org/oagis/10}UsageType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveTimePeriod" type="{http://www.openapplications.org/oagis/10}TimePeriodType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="scriptCode" type="{http://www.openapplications.org/oagis/10}CodeType_1E7368" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonNameBaseType", propOrder = {
    "formattedName",
    "preferredName",
    "givenName",
    "middleName",
    "familyName",
    "titleAffixCode",
    "preferredSalutationCode",
    "generationAffixCode",
    "qualificationAffixCode",
    "initials",
    "usage",
    "effectiveTimePeriod"
})
@XmlSeeAlso({
    PersonNameType.class
})
public class PersonNameBaseType
    extends IdentificationType
{

    @XmlElement(name = "FormattedName")
    protected NameType formattedName;
    @XmlElement(name = "PreferredName")
    protected List<NameType> preferredName;
    @XmlElement(name = "GivenName")
    protected NameType givenName;
    @XmlElement(name = "MiddleName")
    protected List<NameType> middleName;
    @XmlElement(name = "FamilyName")
    protected List<NameType> familyName;
    @XmlElement(name = "TitleAffixCode")
    protected List<CodeType> titleAffixCode;
    @XmlElement(name = "PreferredSalutationCode")
    protected CodeType preferredSalutationCode;
    @XmlElement(name = "GenerationAffixCode")
    protected CodeType generationAffixCode;
    @XmlElement(name = "QualificationAffixCode")
    protected List<CodeType> qualificationAffixCode;
    @XmlElement(name = "Initials")
    protected TextType initials;
    @XmlElement(name = "Usage")
    protected List<UsageType> usage;
    @XmlElement(name = "EffectiveTimePeriod")
    protected TimePeriodType effectiveTimePeriod;
    @XmlAttribute(name = "scriptCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String scriptCode;

    /**
     * Obtient la valeur de la propriété formattedName.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getFormattedName() {
        return formattedName;
    }

    /**
     * Définit la valeur de la propriété formattedName.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setFormattedName(NameType value) {
        this.formattedName = value;
    }

    /**
     * Gets the value of the preferredName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preferredName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreferredName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getPreferredName() {
        if (preferredName == null) {
            preferredName = new ArrayList<NameType>();
        }
        return this.preferredName;
    }

    /**
     * Obtient la valeur de la propriété givenName.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getGivenName() {
        return givenName;
    }

    /**
     * Définit la valeur de la propriété givenName.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setGivenName(NameType value) {
        this.givenName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the middleName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiddleName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getMiddleName() {
        if (middleName == null) {
            middleName = new ArrayList<NameType>();
        }
        return this.middleName;
    }

    /**
     * Gets the value of the familyName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the familyName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFamilyName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getFamilyName() {
        if (familyName == null) {
            familyName = new ArrayList<NameType>();
        }
        return this.familyName;
    }

    /**
     * Gets the value of the titleAffixCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titleAffixCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitleAffixCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getTitleAffixCode() {
        if (titleAffixCode == null) {
            titleAffixCode = new ArrayList<CodeType>();
        }
        return this.titleAffixCode;
    }

    /**
     * Obtient la valeur de la propriété preferredSalutationCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getPreferredSalutationCode() {
        return preferredSalutationCode;
    }

    /**
     * Définit la valeur de la propriété preferredSalutationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setPreferredSalutationCode(CodeType value) {
        this.preferredSalutationCode = value;
    }

    /**
     * Obtient la valeur de la propriété generationAffixCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getGenerationAffixCode() {
        return generationAffixCode;
    }

    /**
     * Définit la valeur de la propriété generationAffixCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setGenerationAffixCode(CodeType value) {
        this.generationAffixCode = value;
    }

    /**
     * Gets the value of the qualificationAffixCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualificationAffixCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualificationAffixCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getQualificationAffixCode() {
        if (qualificationAffixCode == null) {
            qualificationAffixCode = new ArrayList<CodeType>();
        }
        return this.qualificationAffixCode;
    }

    /**
     * Obtient la valeur de la propriété initials.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getInitials() {
        return initials;
    }

    /**
     * Définit la valeur de la propriété initials.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setInitials(TextType value) {
        this.initials = value;
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
     * Obtient la valeur de la propriété scriptCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScriptCode() {
        return scriptCode;
    }

    /**
     * Définit la valeur de la propriété scriptCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScriptCode(String value) {
        this.scriptCode = value;
    }

}
