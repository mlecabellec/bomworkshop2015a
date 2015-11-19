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
 * <p>Classe Java pour oacl_SystemEnvironmentCodeEnumerationType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="oacl_SystemEnvironmentCodeEnumerationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Production"/&gt;
 *     &lt;enumeration value="Test"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@Entity
@XmlType(name = "oacl_SystemEnvironmentCodeEnumerationType")
@XmlEnum
public enum OaclSystemEnvironmentCodeEnumerationType {

    @XmlEnumValue("Production")
    PRODUCTION("Production"),
    @XmlEnumValue("Test")
    TEST("Test");
    private final String value;

    OaclSystemEnvironmentCodeEnumerationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OaclSystemEnvironmentCodeEnumerationType fromValue(String v) {
        for (OaclSystemEnvironmentCodeEnumerationType c: OaclSystemEnvironmentCodeEnumerationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
