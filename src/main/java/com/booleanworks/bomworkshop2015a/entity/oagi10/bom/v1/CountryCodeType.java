//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.10.16 à 03:51:42 PM CEST 
//


package com.booleanworks.bomworkshop2015a.entity.oagi10.bom.v1;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_UniqueID xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;BDT000000&lt;/ccts_UniqueID&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_CategoryCode xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;BDT&lt;/ccts_CategoryCode&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_DictionaryEntryName xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Country_ Code. Type&lt;/ccts_DictionaryEntryName&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_VersionID xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts_VersionID&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_DefinitionText xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"/&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_RepresentationTermName xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code&lt;/ccts_RepresentationTermName&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_QualifierTerm xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Country&lt;/ccts_QualifierTerm&gt;
 * </pre>
 * 
 * 			
 * 
 * <p>Classe Java pour CountryCodeType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CountryCodeType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.openapplications.org/oagis/10&gt;CountryCodeContentType"&gt;
 *       &lt;attribute name="listID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" /&gt;
 *       &lt;attribute name="listAgencyID" type="{http://www.openapplications.org/oagis/10}clm63055D08B_AgencyIdentificationContentType" /&gt;
 *       &lt;attribute name="listVersionID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
//@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryCodeType", propOrder = {
    "value"
})
public class CountryCodeType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "listID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String listID;
    @XmlAttribute(name = "listAgencyID")
    protected String listAgencyID;
    @XmlAttribute(name = "listVersionID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String listVersionID;

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
     * Obtient la valeur de la propriété listID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListID() {
        return listID;
    }

    /**
     * Définit la valeur de la propriété listID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListID(String value) {
        this.listID = value;
    }

    /**
     * Obtient la valeur de la propriété listAgencyID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListAgencyID() {
        return listAgencyID;
    }

    /**
     * Définit la valeur de la propriété listAgencyID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListAgencyID(String value) {
        this.listAgencyID = value;
    }

    /**
     * Obtient la valeur de la propriété listVersionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListVersionID() {
        return listVersionID;
    }

    /**
     * Définit la valeur de la propriété listVersionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListVersionID(String value) {
        this.listVersionID = value;
    }

}
