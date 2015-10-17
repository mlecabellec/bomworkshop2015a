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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_UniqueID xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;D995CD&lt;/ccts_UniqueID&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_VersionID xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts_VersionID&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_DictionaryEntryName xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identifier. Type&lt;/ccts_DictionaryEntryName&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;An identifier is a character string used to uniquely identify one instance of an object within an identification scheme that is managed by an agency&lt;/ccts_Definition&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_DataTypeTermName xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identifier&lt;/ccts_DataTypeTermName&gt;
 * </pre>
 * 
 * 			
 * 
 * 
 * 						
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_ContentComponentValueDomain xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
 * 							&lt;ccts_Definition&gt;A character string used to uniquely identify one instance of an object within an identification scheme that is managed by an agency&lt;/ccts_Definition&gt;
 * 							&lt;ccts_DefaultIndicator&gt;False&lt;/ccts_DefaultIndicator&gt;
 * 							&lt;ccts_PrimitiveTypeName&gt;Normalized String&lt;/ccts_PrimitiveTypeName&gt;
 * 						&lt;/ccts_ContentComponentValueDomain&gt;
 * </pre>
 * 
 * 					
 * 
 * <p>Classe Java pour IDType_D995CD complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="IDType_D995CD"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;normalizedString"&gt;
 *       &lt;attribute name="schemeID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" /&gt;
 *       &lt;attribute name="schemeVersionID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" /&gt;
 *       &lt;attribute name="schemeAgencyID" type="{http://www.openapplications.org/oagis/10}clm63055D08B_AgencyIdentificationContentType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IDType_D995CD", propOrder = {
    "value"
})
@XmlSeeAlso({
    IDType.class
})
public class IDTypeD995CD {

    @XmlValue
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String value;
    @XmlAttribute(name = "schemeID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String schemeID;
    @XmlAttribute(name = "schemeVersionID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String schemeVersionID;
    @XmlAttribute(name = "schemeAgencyID")
    protected String schemeAgencyID;

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
     * Obtient la valeur de la propriété schemeID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeID() {
        return schemeID;
    }

    /**
     * Définit la valeur de la propriété schemeID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeID(String value) {
        this.schemeID = value;
    }

    /**
     * Obtient la valeur de la propriété schemeVersionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeVersionID() {
        return schemeVersionID;
    }

    /**
     * Définit la valeur de la propriété schemeVersionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeVersionID(String value) {
        this.schemeVersionID = value;
    }

    /**
     * Obtient la valeur de la propriété schemeAgencyID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeAgencyID() {
        return schemeAgencyID;
    }

    /**
     * Définit la valeur de la propriété schemeAgencyID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeAgencyID(String value) {
        this.schemeAgencyID = value;
    }

}
