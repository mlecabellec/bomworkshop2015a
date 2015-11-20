//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.10.16 à 03:51:42 PM CEST 
//
package com.booleanworks.bomworkshop2015a.entity.oagi10.bom.v1;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java pour SyncBOMType complex type.
 *
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette
 * classe.
 *
 * <pre>
 * &lt;complexType name="SyncBOMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}BusinessObjectDocumentType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataArea" type="{http://www.openapplications.org/oagis/10}SyncBOMDataAreaType"/&gt;
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
@XmlType(name = "SyncBOMType", propOrder = {
    "dataArea"
})
public class SyncBOMType
        extends BusinessObjectDocumentType implements Serializable {

    private static final long serialVersionUID = -3337403996305943235L;

    @Id
    @XmlTransient
    public Long getId() {
        return (long) this.hashCode();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.dataArea);
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
        final SyncBOMType other = (SyncBOMType) obj;
        if (!Objects.equals(this.dataArea, other.dataArea)) {
            return false;
        }
        return true;
    }
    
    

    @XmlElement(name = "DataArea", required = true)
    protected SyncBOMDataAreaType dataArea;

    /**
     * Obtient la valeur de la propriété dataArea.
     *
     * @return possible object is {@link SyncBOMDataAreaType }
     *
     */
    public SyncBOMDataAreaType getDataArea() {
        return dataArea;
    }

    /**
     * Définit la valeur de la propriété dataArea.
     *
     * @param value allowed object is {@link SyncBOMDataAreaType }
     *
     */
    public void setDataArea(SyncBOMDataAreaType value) {
        this.dataArea = value;
    }

}
