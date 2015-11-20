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
 * <p>Classe Java pour EMailAddressCommunicationType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EMailAddressCommunicationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}EMailAddressCommunicationBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Extension" type="{http://www.openapplications.org/oagis/10}EMailAddressCommunicationExtensionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
//@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EMailAddressCommunicationType", propOrder = {
    "extension"
})
public class EMailAddressCommunicationType
    extends EMailAddressCommunicationBaseType
{

    @XmlElement(name = "Extension")
    protected List<EMailAddressCommunicationExtensionType> extension;

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EMailAddressCommunicationExtensionType }
     * 
     * 
     */
    public List<EMailAddressCommunicationExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<EMailAddressCommunicationExtensionType>();
        }
        return this.extension;
    }

}
