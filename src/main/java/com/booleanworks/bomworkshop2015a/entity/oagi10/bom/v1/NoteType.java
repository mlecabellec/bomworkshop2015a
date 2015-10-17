//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.10.16 à 03:51:42 PM CEST 
//


package com.booleanworks.bomworkshop2015a.entity.oagi10.bom.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * A free form note. The lang attribute identifies the language that the note is in. The author identifies the author of the note. The enrtyDate indicates the date the note was entered or last modified.
 * 
 * <p>Classe Java pour NoteType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="NoteType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.openapplications.org/oagis/10&gt;DescriptionType"&gt;
 *       &lt;attribute name="author" type="{http://www.openapplications.org/oagis/10}StringType" /&gt;
 *       &lt;attribute name="entryDateTime" type="{http://www.openapplications.org/oagis/10}DateTimeType" /&gt;
 *       &lt;attribute name="status" type="{http://www.openapplications.org/oagis/10}StringType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoteType")
public class NoteType
    extends DescriptionType
{

    @XmlAttribute(name = "author")
    protected String author;
    @XmlAttribute(name = "entryDateTime")
    protected String entryDateTime;
    @XmlAttribute(name = "status")
    protected String status;

    /**
     * Obtient la valeur de la propriété author.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Définit la valeur de la propriété author.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Obtient la valeur de la propriété entryDateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryDateTime() {
        return entryDateTime;
    }

    /**
     * Définit la valeur de la propriété entryDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryDateTime(String value) {
        this.entryDateTime = value;
    }

    /**
     * Obtient la valeur de la propriété status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Définit la valeur de la propriété status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
