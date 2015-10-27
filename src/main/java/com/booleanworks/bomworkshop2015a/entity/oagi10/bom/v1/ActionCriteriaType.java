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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ActionCriteriaType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ActionCriteriaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActionExpression" type="{http://www.openapplications.org/oagis/10}ActionExpressionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ChangeStatus" type="{http://www.openapplications.org/oagis/10}ChangeStatusType" minOccurs="0"/&gt;
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
@XmlType(name = "ActionCriteriaType", propOrder = {
    "actionExpression",
    "changeStatus"
})
public class ActionCriteriaType {

    @XmlElement(name = "ActionExpression")
    protected List<ActionExpressionType> actionExpression;
    @XmlElement(name = "ChangeStatus")
    protected ChangeStatusType changeStatus;

    /**
     * Gets the value of the actionExpression property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionExpression property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionExpression().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionExpressionType }
     * 
     * 
     */
    public List<ActionExpressionType> getActionExpression() {
        if (actionExpression == null) {
            actionExpression = new ArrayList<ActionExpressionType>();
        }
        return this.actionExpression;
    }

    /**
     * Obtient la valeur de la propriété changeStatus.
     * 
     * @return
     *     possible object is
     *     {@link ChangeStatusType }
     *     
     */
    public ChangeStatusType getChangeStatus() {
        return changeStatus;
    }

    /**
     * Définit la valeur de la propriété changeStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeStatusType }
     *     
     */
    public void setChangeStatus(ChangeStatusType value) {
        this.changeStatus = value;
    }

}
