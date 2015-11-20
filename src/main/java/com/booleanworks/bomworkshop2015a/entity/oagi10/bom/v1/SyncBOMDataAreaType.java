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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SyncBOMDataAreaType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SyncBOMDataAreaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Sync" type="{http://www.openapplications.org/oagis/10}SyncType"/&gt;
 *         &lt;element name="BOM" type="{http://www.openapplications.org/oagis/10}BOMType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncBOMDataAreaType", propOrder = {
    "sync",
    "bom"
})
public class SyncBOMDataAreaType  implements Serializable{
    private static final long serialVersionUID = 5637398006345568995L;

    @Id
    @XmlTransient
    public Long getId() {
        return (long) this.hashCode();
    }    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.sync);
        hash = 83 * hash + Objects.hashCode(this.bom);
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
        final SyncBOMDataAreaType other = (SyncBOMDataAreaType) obj;
        if (!Objects.equals(this.sync, other.sync)) {
            return false;
        }
        if (!Objects.equals(this.bom, other.bom)) {
            return false;
        }
        return true;
    }
    
    
    
    @XmlElement(name = "Sync", required = true)
    protected SyncType sync;
    //@Column(name="BOM",columnDefinition="BLOB")
    @XmlElement(name = "BOM", required = true)
    protected List<BOMType> bom;

    /**
     * Obtient la valeur de la propriété sync.
     * 
     * @return
     *     possible object is
     *     {@link SyncType }
     *     
     */
    public SyncType getSync() {
        return sync;
    }

    /**
     * Définit la valeur de la propriété sync.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncType }
     *     
     */
    public void setSync(SyncType value) {
        this.sync = value;
    }

    /**
     * Gets the value of the bom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBOM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BOMType }
     * 
     * 
     */
    public List<BOMType> getBOM() {
        if (bom == null) {
            bom = new ArrayList<BOMType>();
        }
        return this.bom;
    }

}
