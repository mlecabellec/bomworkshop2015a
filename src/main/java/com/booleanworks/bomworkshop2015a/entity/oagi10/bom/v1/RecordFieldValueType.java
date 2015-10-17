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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour RecordFieldValueType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RecordFieldValueType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.openapplications.org/oagis/10&gt;ValueType_D19E7B"&gt;
 *       &lt;attribute name="formatCode" type="{http://www.openapplications.org/oagis/10}CodeType_1E7368" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordFieldValueType", propOrder = {
    "value"
})
@XmlSeeAlso({
    OpenFieldValueType.class
})
public class RecordFieldValueType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "formatCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String formatCode;

    /**
     * 
     * 				
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_UniqueID xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;D19E7B&lt;/ccts_UniqueID&gt;
     * </pre>
     * 
     * 				
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_VersionID xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts_VersionID&gt;
     * </pre>
     * 
     * 				
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_DictionaryEntryName xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Value. Type&lt;/ccts_DictionaryEntryName&gt;
     * </pre>
     * 
     * 				
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A value is the concept of worth in general that is assigned or is determined by measurement, assessment or calculation.&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 				
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_DataTypeTermName xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Value&lt;/ccts_DataTypeTermName&gt;
     * </pre>
     * 
     * 			
     * 
     * 
     * 					
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_ContentComponentValueDomain xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     * 						&lt;ccts_Definition&gt;Numeric information that is assigned or is determined by value&lt;/ccts_Definition&gt;
     * 						&lt;ccts_DefaultIndicator&gt;False&lt;/ccts_DefaultIndicator&gt;
     * 						&lt;ccts_PrimitiveTypeName&gt;String&lt;/ccts_PrimitiveTypeName&gt;
     * 					&lt;/ccts_ContentComponentValueDomain&gt;
     * </pre>
     * 
     * 				
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
