//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.10.16 à 03:51:42 PM CEST 
//


package com.booleanworks.bomworkshop2015a.entity.oagi10.bom.v1;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour oacl_ActionCodeEnumerationType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="oacl_ActionCodeEnumerationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Add"/&gt;
 *     &lt;enumeration value="Change"/&gt;
 *     &lt;enumeration value="Delete"/&gt;
 *     &lt;enumeration value="Replace"/&gt;
 *     &lt;enumeration value="UpSert"/&gt;
 *     &lt;enumeration value="Accepted"/&gt;
 *     &lt;enumeration value="Modified"/&gt;
 *     &lt;enumeration value="Rejected"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
//@Entity
@XmlType(name = "oacl_ActionCodeEnumerationType")
@XmlEnum
public enum OaclActionCodeEnumerationType {

    @XmlEnumValue("Add")
    ADD("Add"),
    @XmlEnumValue("Change")
    CHANGE("Change"),
    @XmlEnumValue("Delete")
    DELETE("Delete"),
    @XmlEnumValue("Replace")
    REPLACE("Replace"),
    @XmlEnumValue("UpSert")
    UP_SERT("UpSert"),
    @XmlEnumValue("Accepted")
    ACCEPTED("Accepted"),
    @XmlEnumValue("Modified")
    MODIFIED("Modified"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected");
    private final String value;

    OaclActionCodeEnumerationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OaclActionCodeEnumerationType fromValue(String v) {
        for (OaclActionCodeEnumerationType c: OaclActionCodeEnumerationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
