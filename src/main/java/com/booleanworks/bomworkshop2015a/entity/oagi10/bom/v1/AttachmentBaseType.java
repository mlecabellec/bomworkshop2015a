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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour AttachmentBaseType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AttachmentBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EmbeddedDataBinaryObject" type="{http://www.openapplications.org/oagis/10}BinaryObjectType" minOccurs="0"/&gt;
 *         &lt;element name="URI" type="{http://www.openapplications.org/oagis/10}URIType" minOccurs="0"/&gt;
 *         &lt;element name="ISBN" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/&gt;
 *         &lt;element name="FileName" type="{http://www.openapplications.org/oagis/10}NameType" minOccurs="0"/&gt;
 *         &lt;element name="DocumentDateTime" type="{http://www.openapplications.org/oagis/10}DateTimeType" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.openapplications.org/oagis/10}FreeFormTextGroup"/&gt;
 *         &lt;element name="FileTypeCode" type="{http://www.openapplications.org/oagis/10}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FileSizeQuantity" type="{http://www.openapplications.org/oagis/10}QuantityType" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://www.openapplications.org/oagis/10}TextType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="inlineIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentBaseType", propOrder = {
    "embeddedDataBinaryObject",
    "uri",
    "isbn",
    "fileName",
    "documentDateTime",
    "description",
    "note",
    "fileTypeCode",
    "fileSizeQuantity",
    "title"
})
@XmlSeeAlso({
    AttachmentType.class
})
public class AttachmentBaseType
    extends IdentificationType
{

    @XmlElement(name = "EmbeddedDataBinaryObject")
    protected BinaryObjectType embeddedDataBinaryObject;
    @XmlElement(name = "URI")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String uri;
    @XmlElement(name = "ISBN")
    protected IDType isbn;
    @XmlElement(name = "FileName")
    protected NameType fileName;
    @XmlElement(name = "DocumentDateTime")
    @XmlSchemaType(name = "anySimpleType")
    protected String documentDateTime;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "Note")
    protected List<NoteType> note;
    @XmlElement(name = "FileTypeCode")
    protected List<CodeType> fileTypeCode;
    @XmlElement(name = "FileSizeQuantity")
    protected QuantityType fileSizeQuantity;
    @XmlElement(name = "Title")
    protected List<TextType> title;
    @XmlAttribute(name = "inlineIndicator")
    protected Boolean inlineIndicator;

    /**
     * Obtient la valeur de la propriété embeddedDataBinaryObject.
     * 
     * @return
     *     possible object is
     *     {@link BinaryObjectType }
     *     
     */
    public BinaryObjectType getEmbeddedDataBinaryObject() {
        return embeddedDataBinaryObject;
    }

    /**
     * Définit la valeur de la propriété embeddedDataBinaryObject.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryObjectType }
     *     
     */
    public void setEmbeddedDataBinaryObject(BinaryObjectType value) {
        this.embeddedDataBinaryObject = value;
    }

    /**
     * Obtient la valeur de la propriété uri.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURI() {
        return uri;
    }

    /**
     * Définit la valeur de la propriété uri.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURI(String value) {
        this.uri = value;
    }

    /**
     * Obtient la valeur de la propriété isbn.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getISBN() {
        return isbn;
    }

    /**
     * Définit la valeur de la propriété isbn.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setISBN(IDType value) {
        this.isbn = value;
    }

    /**
     * Obtient la valeur de la propriété fileName.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getFileName() {
        return fileName;
    }

    /**
     * Définit la valeur de la propriété fileName.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setFileName(NameType value) {
        this.fileName = value;
    }

    /**
     * Obtient la valeur de la propriété documentDateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentDateTime() {
        return documentDateTime;
    }

    /**
     * Définit la valeur de la propriété documentDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentDateTime(String value) {
        this.documentDateTime = value;
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
     * Gets the value of the fileTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getFileTypeCode() {
        if (fileTypeCode == null) {
            fileTypeCode = new ArrayList<CodeType>();
        }
        return this.fileTypeCode;
    }

    /**
     * Obtient la valeur de la propriété fileSizeQuantity.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getFileSizeQuantity() {
        return fileSizeQuantity;
    }

    /**
     * Définit la valeur de la propriété fileSizeQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setFileSizeQuantity(QuantityType value) {
        this.fileSizeQuantity = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the title property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getTitle() {
        if (title == null) {
            title = new ArrayList<TextType>();
        }
        return this.title;
    }

    /**
     * Obtient la valeur de la propriété inlineIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isInlineIndicator() {
        if (inlineIndicator == null) {
            return false;
        } else {
            return inlineIndicator;
        }
    }

    /**
     * Définit la valeur de la propriété inlineIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInlineIndicator(Boolean value) {
        this.inlineIndicator = value;
    }

}
