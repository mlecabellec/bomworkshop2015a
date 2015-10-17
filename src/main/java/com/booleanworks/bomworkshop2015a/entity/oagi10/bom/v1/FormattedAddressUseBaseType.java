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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour FormattedAddressUseBaseType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="FormattedAddressUseBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PurposeCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine" type="{http://www.openapplications.org/oagis/10}SequencedTextType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="formatCode" type="{http://www.openapplications.org/oagis/10}CodeType_1E7368" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormattedAddressUseBaseType", propOrder = {
    "purposeCode",
    "addressLine"
})
@XmlSeeAlso({
    FormattedAddressUseType.class
})
public class FormattedAddressUseBaseType
    extends IdentificationType
{

    @XmlElement(name = "PurposeCode")
    protected CodeType purposeCode;
    @XmlElement(name = "AddressLine")
    protected List<SequencedTextType> addressLine;
    @XmlAttribute(name = "formatCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String formatCode;

    /**
     * Obtient la valeur de la propriété purposeCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getPurposeCode() {
        return purposeCode;
    }

    /**
     * Définit la valeur de la propriété purposeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setPurposeCode(CodeType value) {
        this.purposeCode = value;
    }

    /**
     * Gets the value of the addressLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SequencedTextType }
     * 
     * 
     */
    public List<SequencedTextType> getAddressLine() {
        if (addressLine == null) {
            addressLine = new ArrayList<SequencedTextType>();
        }
        return this.addressLine;
    }

    /**
     * Obtient la valeur de la propriété formatCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatCode() {
        return formatCode;
    }

    /**
     * Définit la valeur de la propriété formatCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatCode(String value) {
        this.formatCode = value;
    }

}
