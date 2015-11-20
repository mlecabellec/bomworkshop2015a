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
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour IdentificationType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="IdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://www.openapplications.org/oagis/10}OpenIDType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IDSet" type="{http://www.openapplications.org/oagis/10}IDSetType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="typeCode" type="{http://www.openapplications.org/oagis/10}CodeType_1E7368" /&gt;
 *       &lt;attribute name="actionCode" type="{http://www.openapplications.org/oagis/10}ActionCodeContentType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationType", propOrder = {
    "id",
    "idSet"
})
@XmlSeeAlso({
    StateChangeBaseType.class,
    StatusABIEType.class,
    AttachmentBaseType.class,
    EffectivityBaseType.class,
    PreferenceABIEType.class,
    EffectiveValueListBaseType.class,
    RangeBaseType.class,
    ClassificationBaseType.class,
    SpecificationBaseType.class,
    PropertyBaseType.class,
    HazardousMaterialABIEType.class,
    ContactABIEType.class,
    PersonNameBaseType.class,
    UsageBaseType.class,
    FormattedAddressUseBaseType.class,
    CommunicationBaseType.class,
    AddressBaseType.class,
    CoordinateBaseType.class,
    TelephoneCommunicationBaseType.class,
    EMailAddressCommunicationBaseType.class,
    ElectronicCommunicationBaseType.class,
    LocationABIEType.class,
    StorageLocationBaseType.class,
    MaterialBaseType.class,
    DimensionsABIEType.class,
    ExportControlBaseType.class,
    HarmonizedTariffBaseType.class,
    TrademarkBaseType.class,
    LotBaseType.class,
    FacilityBaseType.class,
    SerialLotBaseType.class,
    BOMOptionBaseType.class,
    BOMOptionClassBaseType.class
})
public class IdentificationType {

    @XmlElement(name = "ID")
    @Id
    protected List<OpenIDType> id;
    @XmlElement(name = "IDSet")
    protected List<IDSetType> idSet;
    @XmlAttribute(name = "typeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String typeCode;
    @XmlAttribute(name = "actionCode")
    protected String actionCode;

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenIDType }
     * 
     * 
     */
    public List<OpenIDType> getID() {
        if (id == null) {
            id = new ArrayList<OpenIDType>();
        }
        return this.id;
    }

    /**
     * Gets the value of the idSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIDSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDSetType }
     * 
     * 
     */
    public List<IDSetType> getIDSet() {
        if (idSet == null) {
            idSet = new ArrayList<IDSetType>();
        }
        return this.idSet;
    }

    /**
     * Obtient la valeur de la propriété typeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Définit la valeur de la propriété typeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
    }

    /**
     * Obtient la valeur de la propriété actionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Définit la valeur de la propriété actionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

    public List<OpenIDType> getId() {
        return id;
    }

    public void setId(List<OpenIDType> id) {
        this.id = id;
    }

}
