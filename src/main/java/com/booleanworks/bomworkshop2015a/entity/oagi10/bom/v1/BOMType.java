//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.10.16 à 03:51:42 PM CEST 
//
package com.booleanworks.bomworkshop2015a.entity.oagi10.bom.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Classe Java pour BOMType complex type.
 *
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette
 * classe.
 *
 * <pre>
 * &lt;complexType name="BOMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BOMHeader" type="{http://www.openapplications.org/oagis/10}BOMHeaderType" minOccurs="0"/&gt;
 *         &lt;element name="BOMItemData" type="{http://www.openapplications.org/oagis/10}BOMItemDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BOMOption" type="{http://www.openapplications.org/oagis/10}BOMOptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BOMOptionClass" type="{http://www.openapplications.org/oagis/10}BOMOptionClassType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlRootElement
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BOMType", propOrder = {
    "bomHeader",
    "bomItemData",
    "bomOption",
    "bomOptionClass"
})
public class BOMType implements Serializable {

    private static final long serialVersionUID = -726596587844463058L;

    @Id
    protected int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @PrePersist
    @PreRemove
    @PreUpdate
    public void prepare() {
        
        //this.id = this.hashCode() ;
        this.id = this.getBOMHeader().getID().hashCode() ;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.bomHeader);
        hash = 89 * hash + Objects.hashCode(this.bomItemData);
        hash = 89 * hash + Objects.hashCode(this.bomOption);
        hash = 89 * hash + Objects.hashCode(this.typeCode);
        hash = 89 * hash + Objects.hashCode(this.actionCode);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BOMType other = (BOMType) obj;
        if (!Objects.equals(this.typeCode, other.typeCode)) {
            return false;
        }
        if (!Objects.equals(this.actionCode, other.actionCode)) {
            return false;
        }
        if (!Objects.equals(this.bomHeader, other.bomHeader)) {
            return false;
        }
        if (!Objects.equals(this.bomItemData, other.bomItemData)) {
            return false;
        }
        if (!Objects.equals(this.bomOption, other.bomOption)) {
            return false;
        }
        if (!Objects.equals(this.bomOptionClass, other.bomOptionClass)) {
            return false;
        }
        return true;
    }

    @XmlElement(name = "BOMHeader")
    protected BOMHeaderType bomHeader;
    @XmlElement(name = "BOMItemData")
    protected List<BOMItemDataType> bomItemData;
    @XmlElement(name = "BOMOption")
    protected List<BOMOptionType> bomOption;
    @XmlElement(name = "BOMOptionClass")
    protected List<BOMOptionClassType> bomOptionClass;
    @XmlAttribute(name = "typeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String typeCode;
    @XmlAttribute(name = "actionCode")
    protected String actionCode;

    /**
     * Obtient la valeur de la propriété bomHeader.
     *
     * @return possible object is {@link BOMHeaderType }
     *
     */
    public BOMHeaderType getBOMHeader() {
        return bomHeader;
    }

    /**
     * Définit la valeur de la propriété bomHeader.
     *
     * @param value allowed object is {@link BOMHeaderType }
     *
     */
    public void setBOMHeader(BOMHeaderType value) {
        this.bomHeader = value;
    }

    /**
     * Gets the value of the bomItemData property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the bomItemData property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBOMItemData().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BOMItemDataType }
     *
     *
     */
    public List<BOMItemDataType> getBOMItemData() {
        if (bomItemData == null) {
            bomItemData = new ArrayList<BOMItemDataType>();
        }
        return this.bomItemData;
    }

    /**
     * Gets the value of the bomOption property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the bomOption property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBOMOption().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BOMOptionType }
     *
     *
     */
    public List<BOMOptionType> getBOMOption() {
        if (bomOption == null) {
            bomOption = new ArrayList<BOMOptionType>();
        }
        return this.bomOption;
    }

    /**
     * Gets the value of the bomOptionClass property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the bomOptionClass property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBOMOptionClass().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BOMOptionClassType }
     *
     *
     */
    public List<BOMOptionClassType> getBOMOptionClass() {
        if (bomOptionClass == null) {
            bomOptionClass = new ArrayList<BOMOptionClassType>();
        }
        return this.bomOptionClass;
    }

    /**
     * Obtient la valeur de la propriété typeCode.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Définit la valeur de la propriété typeCode.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
    }

    /**
     * Obtient la valeur de la propriété actionCode.
     *
     * @return possible object is {@link String }
     *
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Définit la valeur de la propriété actionCode.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

}
