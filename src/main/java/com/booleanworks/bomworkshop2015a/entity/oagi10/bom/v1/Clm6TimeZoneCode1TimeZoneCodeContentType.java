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
 * <p>Classe Java pour clm6TimeZoneCode1_TimeZoneCodeContentType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="clm6TimeZoneCode1_TimeZoneCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;minLength value="1"/&gt;
 *     &lt;maxLength value="10"/&gt;
 *     &lt;enumeration value="M0100"/&gt;
 *     &lt;enumeration value="M0100EU"/&gt;
 *     &lt;enumeration value="M0200"/&gt;
 *     &lt;enumeration value="M0300"/&gt;
 *     &lt;enumeration value="M0300BR"/&gt;
 *     &lt;enumeration value="M0300GL"/&gt;
 *     &lt;enumeration value="M0300US"/&gt;
 *     &lt;enumeration value="M0330US"/&gt;
 *     &lt;enumeration value="M0400"/&gt;
 *     &lt;enumeration value="M0400BR"/&gt;
 *     &lt;enumeration value="M0400CL"/&gt;
 *     &lt;enumeration value="M0400GL"/&gt;
 *     &lt;enumeration value="M0400PY"/&gt;
 *     &lt;enumeration value="M0400US"/&gt;
 *     &lt;enumeration value="M0500"/&gt;
 *     &lt;enumeration value="M0500BR"/&gt;
 *     &lt;enumeration value="M0500CU"/&gt;
 *     &lt;enumeration value="M0500US"/&gt;
 *     &lt;enumeration value="M0600"/&gt;
 *     &lt;enumeration value="M0600CL"/&gt;
 *     &lt;enumeration value="M0600US"/&gt;
 *     &lt;enumeration value="M0700"/&gt;
 *     &lt;enumeration value="M0700US"/&gt;
 *     &lt;enumeration value="M0800"/&gt;
 *     &lt;enumeration value="M0800US"/&gt;
 *     &lt;enumeration value="M0830"/&gt;
 *     &lt;enumeration value="M0900"/&gt;
 *     &lt;enumeration value="M0900US"/&gt;
 *     &lt;enumeration value="M1000"/&gt;
 *     &lt;enumeration value="M1000US"/&gt;
 *     &lt;enumeration value="M1100"/&gt;
 *     &lt;enumeration value="M1200"/&gt;
 *     &lt;enumeration value="P0000"/&gt;
 *     &lt;enumeration value="P0000EU"/&gt;
 *     &lt;enumeration value="P0100"/&gt;
 *     &lt;enumeration value="P0100EU"/&gt;
 *     &lt;enumeration value="P0100NA"/&gt;
 *     &lt;enumeration value="P0200"/&gt;
 *     &lt;enumeration value="P0200EG"/&gt;
 *     &lt;enumeration value="P0200EU"/&gt;
 *     &lt;enumeration value="P0200IL"/&gt;
 *     &lt;enumeration value="P0200JO"/&gt;
 *     &lt;enumeration value="P0200SY"/&gt;
 *     &lt;enumeration value="P0300"/&gt;
 *     &lt;enumeration value="P0300EU"/&gt;
 *     &lt;enumeration value="P0300IQ"/&gt;
 *     &lt;enumeration value="P0330IR"/&gt;
 *     &lt;enumeration value="P0400"/&gt;
 *     &lt;enumeration value="P0400EU"/&gt;
 *     &lt;enumeration value="P0430"/&gt;
 *     &lt;enumeration value="P0500"/&gt;
 *     &lt;enumeration value="P0500EU"/&gt;
 *     &lt;enumeration value="P0530"/&gt;
 *     &lt;enumeration value="P0545"/&gt;
 *     &lt;enumeration value="P0600"/&gt;
 *     &lt;enumeration value="P0600EU"/&gt;
 *     &lt;enumeration value="P0630"/&gt;
 *     &lt;enumeration value="P0700"/&gt;
 *     &lt;enumeration value="P0700EU"/&gt;
 *     &lt;enumeration value="P0800"/&gt;
 *     &lt;enumeration value="P0800EU"/&gt;
 *     &lt;enumeration value="P0900"/&gt;
 *     &lt;enumeration value="P0900EU"/&gt;
 *     &lt;enumeration value="P0930"/&gt;
 *     &lt;enumeration value="P0930AUS"/&gt;
 *     &lt;enumeration value="P1000"/&gt;
 *     &lt;enumeration value="P1000AUS"/&gt;
 *     &lt;enumeration value="P1030AUS"/&gt;
 *     &lt;enumeration value="P1000EU"/&gt;
 *     &lt;enumeration value="P1100"/&gt;
 *     &lt;enumeration value="P1100EU"/&gt;
 *     &lt;enumeration value="P1200"/&gt;
 *     &lt;enumeration value="P1200EU"/&gt;
 *     &lt;enumeration value="P1200NZ"/&gt;
 *     &lt;enumeration value="P1245NZ"/&gt;
 *     &lt;enumeration value="P1300"/&gt;
 *     &lt;enumeration value="P1300EU"/&gt;
 *     &lt;enumeration value="P1400"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "clm6TimeZoneCode1_TimeZoneCodeContentType")
@XmlEnum
public enum Clm6TimeZoneCode1TimeZoneCodeContentType {


    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UTC+01:00&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("M0100")
    M_0100("M0100"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Azores&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("M0100EU")
    M_0100_EU("M0100EU"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UTC-02:00&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("M0200")
    M_0200("M0200"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UTC-03:00&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("M0300")
    M_0300("M0300"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Brazil East&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("M0300BR")
    M_0300_BR("M0300BR"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Greenland&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("M0300GL")
    M_0300_GL("M0300GL"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;St Pierre and Miquelon&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("M0300US")
    M_0300_US("M0300US"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Newfoundland&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("M0330US")
    M_0330_US("M0330US"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UTC-04:00&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("M0400")
    M_0400("M0400"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Brazil West&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("M0400BR")
    M_0400_BR("M0400BR"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Chile&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("M0400CL")
    M_0400_CL("M0400CL"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Western Greenland&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("M0400GL")
    M_0400_GL("M0400GL"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Paraguay&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("M0400PY")
    M_0400_PY("M0400PY"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Atlantic Time (Halifax)&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("M0400US")
    M_0400_US("M0400US"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UTC-05:00&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("M0500")
    M_0500("M0500"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Brazil Andes&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("M0500BR")
    M_0500_BR("M0500BR"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Cuba&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("M0500CU")
    M_0500_CU("M0500CU"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Eastern Time (New York)&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("M0500US")
    M_0500_US("M0500US"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UTC-06:00&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("M0600")
    M_0600("M0600"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Chile Easter Island&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("M0600CL")
    M_0600_CL("M0600CL"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Central Time (Dallas)&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("M0600US")
    M_0600_US("M0600US"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UTC-07:00&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("M0700")
    M_0700("M0700"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Mountain Time (Denver)&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("M0700US")
    M_0700_US("M0700US"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UTC-08:00&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("M0800")
    M_0800("M0800"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Pacific Time (Los Angeles)&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("M0800US")
    M_0800_US("M0800US"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UTC-08:30&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("M0830")
    M_0830("M0830"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UTC-09:00&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("M0900")
    M_0900("M0900"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Alaska (Anchorage)&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("M0900US")
    M_0900_US("M0900US"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UTC-10:00&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("M1000")
    M_1000("M1000"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Hawaii / Alaska (Aleutian)&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("M1000US")
    M_1000_US("M1000US"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UTC-11:00&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("M1100")
    M_1100("M1100"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UTC-12:00&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("M1200")
    M_1200("M1200"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UTC&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P0000")
    P_0000("P0000"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Western Europe&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P0000EU")
    P_0000_EU("P0000EU"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UTC+01:00&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P0100")
    P_0100("P0100"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Central Europe&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P0100EU")
    P_0100_EU("P0100EU"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Namibia&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P0100NA")
    P_0100_NA("P0100NA"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UTC+02:00&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P0200")
    P_0200("P0200"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Egypt&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P0200EG")
    P_0200_EG("P0200EG"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Eastern Europe&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P0200EU")
    P_0200_EU("P0200EU"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Israel&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P0200IL")
    P_0200_IL("P0200IL"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Jordan&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P0200JO")
    P_0200_JO("P0200JO"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Syria&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P0200SY")
    P_0200_SY("P0200SY"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UTC+03:00&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P0300")
    P_0300("P0300"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Russia (Moscow)&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P0300EU")
    P_0300_EU("P0300EU"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Iraq&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P0300IQ")
    P_0300_IQ("P0300IQ"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Iran&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P0330IR")
    P_0330_IR("P0330IR"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UTC+04:00&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P0400")
    P_0400("P0400"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Russia (UTC+04)&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P0400EU")
    P_0400_EU("P0400EU"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UTC+04:30&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P0430")
    P_0430("P0430"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UTC+05:00&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P0500")
    P_0500("P0500"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Russia (UTC+05)&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P0500EU")
    P_0500_EU("P0500EU"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UTC+05:30&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P0530")
    P_0530("P0530"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UTC+05:45&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P0545")
    P_0545("P0545"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UTC+06:00&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P0600")
    P_0600("P0600"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Russia (UTC+06)&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P0600EU")
    P_0600_EU("P0600EU"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UTC+06:30&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P0630")
    P_0630("P0630"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UTC+07:00&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P0700")
    P_0700("P0700"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Russia (UTC+07)&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P0700EU")
    P_0700_EU("P0700EU"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UTC+08:00&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P0800")
    P_0800("P0800"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Russia (UTC+08)&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P0800EU")
    P_0800_EU("P0800EU"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UTC+09:00&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P0900")
    P_0900("P0900"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Russia (UTC+09)&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P0900EU")
    P_0900_EU("P0900EU"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UTC+09:30&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P0930")
    P_0930("P0930"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Australia South Australia&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P0930AUS")
    P_0930_AUS("P0930AUS"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UTC+10:00&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P1000")
    P_1000("P1000"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Australia Capital Territories&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P1000AUS")
    P_1000_AUS("P1000AUS"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Australia Lord Howe Island&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P1030AUS")
    P_1030_AUS("P1030AUS"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Russia (UTC+10)&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P1000EU")
    P_1000_EU("P1000EU"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UTC+11:00&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P1100")
    P_1100("P1100"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Russia (UTC+11)&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P1100EU")
    P_1100_EU("P1100EU"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UTC+12:00&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P1200")
    P_1200("P1200"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Russia (UTC+12)&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P1200EU")
    P_1200_EU("P1200EU"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;New Zealand&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P1200NZ")
    P_1200_NZ("P1200NZ"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;New Zealand Chatham Islands&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P1245NZ")
    P_1245_NZ("P1245NZ"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UTC+13:00&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P1300")
    P_1300("P1300"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Russia (UTC+13)&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P1300EU")
    P_1300_EU("P1300EU"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts_Definition xmlns="http://www.openapplications.org/oagis/10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UTC+14:00&lt;/ccts_Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P1400")
    P_1400("P1400");
    private final String value;

    Clm6TimeZoneCode1TimeZoneCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Clm6TimeZoneCode1TimeZoneCodeContentType fromValue(String v) {
        for (Clm6TimeZoneCode1TimeZoneCodeContentType c: Clm6TimeZoneCode1TimeZoneCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}