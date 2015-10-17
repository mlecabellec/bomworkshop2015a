//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.10.16 à 03:51:42 PM CEST 
//


package com.booleanworks.bomworkshop2015a.entity.oagi10.bom.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour HarmonizedTariffType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="HarmonizedTariffType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}HarmonizedTariffBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Extension" type="{http://www.openapplications.org/oagis/10}HarmonizedTariffExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HarmonizedTariffType", propOrder = {
    "extension"
})
public class HarmonizedTariffType
    extends HarmonizedTariffBaseType
{

    @XmlElement(name = "Extension")
    protected HarmonizedTariffExtensionType extension;

    /**
     * Obtient la valeur de la propriété extension.
     * 
     * @return
     *     possible object is
     *     {@link HarmonizedTariffExtensionType }
     *     
     */
    public HarmonizedTariffExtensionType getExtension() {
        return extension;
    }

    /**
     * Définit la valeur de la propriété extension.
     * 
     * @param value
     *     allowed object is
     *     {@link HarmonizedTariffExtensionType }
     *     
     */
    public void setExtension(HarmonizedTariffExtensionType value) {
        this.extension = value;
    }

}
