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
 * <p>Classe Java pour OperationReferenceBaseType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="OperationReferenceBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}DocumentReferenceBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GroupName" type="{http://www.openapplications.org/oagis/10}NameType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SequenceCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="StepID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/&gt;
 *         &lt;element name="StepTypeCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/&gt;
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
@XmlType(name = "OperationReferenceBaseType", propOrder = {
    "groupName",
    "sequenceCode",
    "stepID",
    "stepTypeCode"
})
@XmlSeeAlso({
    OperationReferenceType.class
})
public class OperationReferenceBaseType
    extends DocumentReferenceBaseType
{

    @XmlElement(name = "GroupName")
    protected List<NameType> groupName;
    @XmlElement(name = "SequenceCode")
    protected CodeType sequenceCode;
    @XmlElement(name = "StepID")
    protected IDType stepID;
    @XmlElement(name = "StepTypeCode")
    protected CodeType stepTypeCode;

    /**
     * Gets the value of the groupName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getGroupName() {
        if (groupName == null) {
            groupName = new ArrayList<NameType>();
        }
        return this.groupName;
    }

    /**
     * Obtient la valeur de la propriété sequenceCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getSequenceCode() {
        return sequenceCode;
    }

    /**
     * Définit la valeur de la propriété sequenceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setSequenceCode(CodeType value) {
        this.sequenceCode = value;
    }

    /**
     * Obtient la valeur de la propriété stepID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getStepID() {
        return stepID;
    }

    /**
     * Définit la valeur de la propriété stepID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setStepID(IDType value) {
        this.stepID = value;
    }

    /**
     * Obtient la valeur de la propriété stepTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getStepTypeCode() {
        return stepTypeCode;
    }

    /**
     * Définit la valeur de la propriété stepTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setStepTypeCode(CodeType value) {
        this.stepTypeCode = value;
    }

}
