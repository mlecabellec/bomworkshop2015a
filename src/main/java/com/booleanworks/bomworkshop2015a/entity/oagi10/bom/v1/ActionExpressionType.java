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
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * ReturnCriteria identifies the content that is to be returned, given query success. In essence, the expression here has the effect of filtering the part(s) of the found element(s) that are to be returned.
 * 
 * ReturnCriteria plays no role in the query itself. That is handled as a match against the request BOD's noun exemplar. 
 * 
 * ReturnCriteria allows the sender of the BOD to indicate which information (down to the field level) is requested to be returned, given that the query has been successful in matching the exemplar to existing nouns. 
 * 
 * That is, in a GetListPurchaseOrder, if one or more PurchaseOrders with a TotalPrice = $1M were found, ReturnCriteria tells the BOD recipient which parts of the PurchaseOrder should be populated with content when the response (ShowPurchaseOrder) is formulated.
 * 
 * The expressionLanguage indicates the expression language being used. In order for the ReturnCriteria expression to be evaluable by the BOD recipient, the recipient must be capable of processing and interpreting the specified expression language. XPath is the default, due to its ubiquity among XML processing technologies. 
 * 
 * <p>Classe Java pour ActionExpressionType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ActionExpressionType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.openapplications.org/oagis/10&gt;TokenType"&gt;
 *       &lt;attribute name="actionCode" use="required" type="{http://www.openapplications.org/oagis/10}ActionCodeContentType" /&gt;
 *       &lt;attribute name="expressionLanguage" type="{http://www.openapplications.org/oagis/10}TokenType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionExpressionType", propOrder = {
    "value"
})
public class ActionExpressionType {

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "actionCode", required = true)
    protected String actionCode;
    @XmlAttribute(name = "expressionLanguage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String expressionLanguage;

    /**
     * Obtient la valeur de la propriété value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Définit la valeur de la propriété value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
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

    /**
     * Obtient la valeur de la propriété expressionLanguage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpressionLanguage() {
        return expressionLanguage;
    }

    /**
     * Définit la valeur de la propriété expressionLanguage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpressionLanguage(String value) {
        this.expressionLanguage = value;
    }

}
