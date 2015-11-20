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
 * Classification Base Type that specifies the minimum level of information concerning a classification schema
 * 
 * <p>Classe Java pour ClassificationBaseType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ClassificationBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UNSPSCCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="Codes" type="{http://www.openapplications.org/oagis/10}CodesType" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.openapplications.org/oagis/10}FreeFormTextGroup"/&gt;
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
@XmlType(name = "ClassificationBaseType", propOrder = {
    "unspscCode",
    "codes",
    "description",
    "note"
})
@XmlSeeAlso({
    ClassificationType.class
})
public abstract class ClassificationBaseType
    extends IdentificationType
{

    @XmlElement(name = "UNSPSCCode")
    protected CodeType unspscCode;
    @XmlElement(name = "Codes")
    protected CodesType codes;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "Note")
    protected List<NoteType> note;

    /**
     * Obtient la valeur de la propriété unspscCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getUNSPSCCode() {
        return unspscCode;
    }

    /**
     * Définit la valeur de la propriété unspscCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setUNSPSCCode(CodeType value) {
        this.unspscCode = value;
    }

    /**
     * Obtient la valeur de la propriété codes.
     * 
     * @return
     *     possible object is
     *     {@link CodesType }
     *     
     */
    public CodesType getCodes() {
        return codes;
    }

    /**
     * Définit la valeur de la propriété codes.
     * 
     * @param value
     *     allowed object is
     *     {@link CodesType }
     *     
     */
    public void setCodes(CodesType value) {
        this.codes = value;
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

}
