//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.10.16 à 03:51:42 PM CEST 
//


package com.booleanworks.bomworkshop2015a.entity.oagi10.bom.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour oacl_ConfirmationCodeEnumerationType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="oacl_ConfirmationCodeEnumerationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Always"/&gt;
 *     &lt;enumeration value="OnError"/&gt;
 *     &lt;enumeration value="OnModification"/&gt;
 *     &lt;enumeration value="OnRejection"/&gt;
 *     &lt;enumeration value="Never"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "oacl_ConfirmationCodeEnumerationType")
@XmlEnum
public enum OaclConfirmationCodeEnumerationType {

    @XmlEnumValue("Always")
    ALWAYS("Always"),
    @XmlEnumValue("OnError")
    ON_ERROR("OnError"),
    @XmlEnumValue("OnModification")
    ON_MODIFICATION("OnModification"),
    @XmlEnumValue("OnRejection")
    ON_REJECTION("OnRejection"),
    @XmlEnumValue("Never")
    NEVER("Never");
    private final String value;

    OaclConfirmationCodeEnumerationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OaclConfirmationCodeEnumerationType fromValue(String v) {
        for (OaclConfirmationCodeEnumerationType c: OaclConfirmationCodeEnumerationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
