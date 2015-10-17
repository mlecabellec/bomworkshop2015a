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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * TimePeriodABIEType is logically derived from UN/CEFACT TBG17 ABIE PeriodType as defined in the Reusable Aggregate Business Information Entity (RUABIE) XML Schema file.
 * 
 * <p>Classe Java pour TimePeriodABIEType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TimePeriodABIEType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InclusiveIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" minOccurs="0"/&gt;
 *         &lt;element name="StartDateTime" type="{http://www.openapplications.org/oagis/10}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="StartTime" type="{http://www.openapplications.org/oagis/10}xbt_DayOfWeekHourMinuteUTCType" minOccurs="0"/&gt;
 *         &lt;element name="Duration" type="{http://www.openapplications.org/oagis/10}DurationMeasureType" minOccurs="0"/&gt;
 *         &lt;element name="EndDateTime" type="{http://www.openapplications.org/oagis/10}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="EndTime" type="{http://www.openapplications.org/oagis/10}xbt_DayOfWeekHourMinuteUTCType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimePeriodABIEType", propOrder = {
    "inclusiveIndicator",
    "startDateTime",
    "startTime",
    "duration",
    "endDateTime",
    "endTime"
})
@XmlSeeAlso({
    TimePeriodType.class
})
public class TimePeriodABIEType {

    @XmlElement(name = "InclusiveIndicator")
    protected Boolean inclusiveIndicator;
    @XmlElement(name = "StartDateTime")
    @XmlSchemaType(name = "anySimpleType")
    protected String startDateTime;
    @XmlElement(name = "StartTime")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String startTime;
    @XmlElement(name = "Duration")
    @XmlSchemaType(name = "anySimpleType")
    protected String duration;
    @XmlElement(name = "EndDateTime")
    @XmlSchemaType(name = "anySimpleType")
    protected String endDateTime;
    @XmlElement(name = "EndTime")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String endTime;

    /**
     * Obtient la valeur de la propriété inclusiveIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInclusiveIndicator() {
        return inclusiveIndicator;
    }

    /**
     * Définit la valeur de la propriété inclusiveIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInclusiveIndicator(Boolean value) {
        this.inclusiveIndicator = value;
    }

    /**
     * Obtient la valeur de la propriété startDateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDateTime() {
        return startDateTime;
    }

    /**
     * Définit la valeur de la propriété startDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDateTime(String value) {
        this.startDateTime = value;
    }

    /**
     * Obtient la valeur de la propriété startTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * Définit la valeur de la propriété startTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * Obtient la valeur de la propriété duration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Définit la valeur de la propriété duration.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Obtient la valeur de la propriété endDateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDateTime() {
        return endDateTime;
    }

    /**
     * Définit la valeur de la propriété endDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDateTime(String value) {
        this.endDateTime = value;
    }

    /**
     * Obtient la valeur de la propriété endTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * Définit la valeur de la propriété endTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(String value) {
        this.endTime = value;
    }

}
