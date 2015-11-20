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
 * The Base Type for detailing an object
 * 
 * <p>Classe Java pour ItemBaseType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ItemBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}ItemIdentificationBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.openapplications.org/oagis/10}ItemIDsGroup"/&gt;
 *         &lt;group ref="{http://www.openapplications.org/oagis/10}FreeFormTextGroup"/&gt;
 *         &lt;element name="Classification" type="{http://www.openapplications.org/oagis/10}ClassificationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Specification" type="{http://www.openapplications.org/oagis/10}SpecificationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="HazardousMaterial" type="{http://www.openapplications.org/oagis/10}HazardousMaterialType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Packaging" type="{http://www.openapplications.org/oagis/10}PackagingType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Dimensions" type="{http://www.openapplications.org/oagis/10}DimensionsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ExportControl" type="{http://www.openapplications.org/oagis/10}ExportControlType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="HarmonizedTariff" type="{http://www.openapplications.org/oagis/10}HarmonizedTariffType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Trademark" type="{http://www.openapplications.org/oagis/10}TrademarkType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.openapplications.org/oagis/10}ReferencesGroup"/&gt;
 *         &lt;element name="CountryOfOriginCode" type="{http://www.openapplications.org/oagis/10}CountryCodeType" minOccurs="0"/&gt;
 *         &lt;element name="RFID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/&gt;
 *         &lt;element name="SerialNumberID" type="{http://www.openapplications.org/oagis/10}IDType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Lot" type="{http://www.openapplications.org/oagis/10}LotType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ManufacturingParty" type="{http://www.openapplications.org/oagis/10}PartyType" minOccurs="0"/&gt;
 *         &lt;element name="Party" type="{http://www.openapplications.org/oagis/10}PartyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="serviceIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
//@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemBaseType", propOrder = {
    "customerItemIdentification",
    "manufacturerItemIdentification",
    "supplierItemIdentification",
    "upcid",
    "epcid",
    "gtinid",
    "description",
    "note",
    "classification",
    "specification",
    "hazardousMaterial",
    "packaging",
    "dimensions",
    "exportControl",
    "harmonizedTariff",
    "trademark",
    "documentReference",
    "attachment",
    "countryOfOriginCode",
    "rfid",
    "serialNumberID",
    "lot",
    "manufacturingParty",
    "party"
})
@XmlSeeAlso({
    ItemType.class
})
public abstract class ItemBaseType
    extends ItemIdentificationBaseType
{

    @XmlElement(name = "CustomerItemIdentification")
    protected ItemIdentificationType customerItemIdentification;
    @XmlElement(name = "ManufacturerItemIdentification")
    protected ItemIdentificationType manufacturerItemIdentification;
    @XmlElement(name = "SupplierItemIdentification")
    protected ItemIdentificationType supplierItemIdentification;
    @XmlElement(name = "UPCID")
    protected IDType upcid;
    @XmlElement(name = "EPCID")
    protected IDType epcid;
    @XmlElement(name = "GTINID")
    protected IDType gtinid;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "Note")
    protected List<NoteType> note;
    @XmlElement(name = "Classification")
    protected List<ClassificationType> classification;
    @XmlElement(name = "Specification")
    protected List<SpecificationType> specification;
    @XmlElement(name = "HazardousMaterial")
    protected List<HazardousMaterialType> hazardousMaterial;
    @XmlElement(name = "Packaging")
    protected List<PackagingType> packaging;
    @XmlElement(name = "Dimensions")
    protected List<DimensionsType> dimensions;
    @XmlElement(name = "ExportControl")
    protected List<ExportControlType> exportControl;
    @XmlElement(name = "HarmonizedTariff")
    protected List<HarmonizedTariffType> harmonizedTariff;
    @XmlElement(name = "Trademark")
    protected List<TrademarkType> trademark;
    @XmlElement(name = "DocumentReference")
    protected List<DocumentReferenceType> documentReference;
    @XmlElement(name = "Attachment")
    protected List<AttachmentType> attachment;
    @XmlElement(name = "CountryOfOriginCode")
    protected CountryCodeType countryOfOriginCode;
    @XmlElement(name = "RFID")
    protected IDType rfid;
    @XmlElement(name = "SerialNumberID")
    protected List<IDType> serialNumberID;
    @XmlElement(name = "Lot")
    protected List<LotType> lot;
    @XmlElement(name = "ManufacturingParty")
    protected PartyType manufacturingParty;
    @XmlElement(name = "Party")
    protected List<PartyType> party;
    @XmlAttribute(name = "serviceIndicator")
    protected Boolean serviceIndicator;

    /**
     * Obtient la valeur de la propriété customerItemIdentification.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdentificationType }
     *     
     */
    public ItemIdentificationType getCustomerItemIdentification() {
        return customerItemIdentification;
    }

    /**
     * Définit la valeur de la propriété customerItemIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdentificationType }
     *     
     */
    public void setCustomerItemIdentification(ItemIdentificationType value) {
        this.customerItemIdentification = value;
    }

    /**
     * Obtient la valeur de la propriété manufacturerItemIdentification.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdentificationType }
     *     
     */
    public ItemIdentificationType getManufacturerItemIdentification() {
        return manufacturerItemIdentification;
    }

    /**
     * Définit la valeur de la propriété manufacturerItemIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdentificationType }
     *     
     */
    public void setManufacturerItemIdentification(ItemIdentificationType value) {
        this.manufacturerItemIdentification = value;
    }

    /**
     * Obtient la valeur de la propriété supplierItemIdentification.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdentificationType }
     *     
     */
    public ItemIdentificationType getSupplierItemIdentification() {
        return supplierItemIdentification;
    }

    /**
     * Définit la valeur de la propriété supplierItemIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdentificationType }
     *     
     */
    public void setSupplierItemIdentification(ItemIdentificationType value) {
        this.supplierItemIdentification = value;
    }

    /**
     * Obtient la valeur de la propriété upcid.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getUPCID() {
        return upcid;
    }

    /**
     * Définit la valeur de la propriété upcid.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setUPCID(IDType value) {
        this.upcid = value;
    }

    /**
     * Obtient la valeur de la propriété epcid.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getEPCID() {
        return epcid;
    }

    /**
     * Définit la valeur de la propriété epcid.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setEPCID(IDType value) {
        this.epcid = value;
    }

    /**
     * Obtient la valeur de la propriété gtinid.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getGTINID() {
        return gtinid;
    }

    /**
     * Définit la valeur de la propriété gtinid.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setGTINID(IDType value) {
        this.gtinid = value;
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
     * Gets the value of the classification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationType }
     * 
     * 
     */
    public List<ClassificationType> getClassification() {
        if (classification == null) {
            classification = new ArrayList<ClassificationType>();
        }
        return this.classification;
    }

    /**
     * Gets the value of the specification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecificationType }
     * 
     * 
     */
    public List<SpecificationType> getSpecification() {
        if (specification == null) {
            specification = new ArrayList<SpecificationType>();
        }
        return this.specification;
    }

    /**
     * Gets the value of the hazardousMaterial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hazardousMaterial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazardousMaterial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HazardousMaterialType }
     * 
     * 
     */
    public List<HazardousMaterialType> getHazardousMaterial() {
        if (hazardousMaterial == null) {
            hazardousMaterial = new ArrayList<HazardousMaterialType>();
        }
        return this.hazardousMaterial;
    }

    /**
     * Gets the value of the packaging property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packaging property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackaging().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackagingType }
     * 
     * 
     */
    public List<PackagingType> getPackaging() {
        if (packaging == null) {
            packaging = new ArrayList<PackagingType>();
        }
        return this.packaging;
    }

    /**
     * Gets the value of the dimensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dimensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDimensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DimensionsType }
     * 
     * 
     */
    public List<DimensionsType> getDimensions() {
        if (dimensions == null) {
            dimensions = new ArrayList<DimensionsType>();
        }
        return this.dimensions;
    }

    /**
     * Gets the value of the exportControl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportControl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExportControl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportControlType }
     * 
     * 
     */
    public List<ExportControlType> getExportControl() {
        if (exportControl == null) {
            exportControl = new ArrayList<ExportControlType>();
        }
        return this.exportControl;
    }

    /**
     * Gets the value of the harmonizedTariff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the harmonizedTariff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHarmonizedTariff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HarmonizedTariffType }
     * 
     * 
     */
    public List<HarmonizedTariffType> getHarmonizedTariff() {
        if (harmonizedTariff == null) {
            harmonizedTariff = new ArrayList<HarmonizedTariffType>();
        }
        return this.harmonizedTariff;
    }

    /**
     * Gets the value of the trademark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trademark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrademark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrademarkType }
     * 
     * 
     */
    public List<TrademarkType> getTrademark() {
        if (trademark == null) {
            trademark = new ArrayList<TrademarkType>();
        }
        return this.trademark;
    }

    /**
     * Gets the value of the documentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getDocumentReference() {
        if (documentReference == null) {
            documentReference = new ArrayList<DocumentReferenceType>();
        }
        return this.documentReference;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentType }
     * 
     * 
     */
    public List<AttachmentType> getAttachment() {
        if (attachment == null) {
            attachment = new ArrayList<AttachmentType>();
        }
        return this.attachment;
    }

    /**
     * Obtient la valeur de la propriété countryOfOriginCode.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getCountryOfOriginCode() {
        return countryOfOriginCode;
    }

    /**
     * Définit la valeur de la propriété countryOfOriginCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setCountryOfOriginCode(CountryCodeType value) {
        this.countryOfOriginCode = value;
    }

    /**
     * Obtient la valeur de la propriété rfid.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getRFID() {
        return rfid;
    }

    /**
     * Définit la valeur de la propriété rfid.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setRFID(IDType value) {
        this.rfid = value;
    }

    /**
     * Gets the value of the serialNumberID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serialNumberID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSerialNumberID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDType }
     * 
     * 
     */
    public List<IDType> getSerialNumberID() {
        if (serialNumberID == null) {
            serialNumberID = new ArrayList<IDType>();
        }
        return this.serialNumberID;
    }

    /**
     * Gets the value of the lot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LotType }
     * 
     * 
     */
    public List<LotType> getLot() {
        if (lot == null) {
            lot = new ArrayList<LotType>();
        }
        return this.lot;
    }

    /**
     * Obtient la valeur de la propriété manufacturingParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getManufacturingParty() {
        return manufacturingParty;
    }

    /**
     * Définit la valeur de la propriété manufacturingParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setManufacturingParty(PartyType value) {
        this.manufacturingParty = value;
    }

    /**
     * Gets the value of the party property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the party property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyType }
     * 
     * 
     */
    public List<PartyType> getParty() {
        if (party == null) {
            party = new ArrayList<PartyType>();
        }
        return this.party;
    }

    /**
     * Obtient la valeur de la propriété serviceIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceIndicator() {
        return serviceIndicator;
    }

    /**
     * Définit la valeur de la propriété serviceIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceIndicator(Boolean value) {
        this.serviceIndicator = value;
    }

}
