//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.10.16 à 03:51:42 PM CEST 
//


package com.booleanworks.bomworkshop2015a.entity.oagi10.bom.v1;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Entity;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.booleanworks.bomworkshop2015a.oagi10.bom.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@Entity
@XmlRegistry
public class ObjectFactory {

    private final static QName _SyncBOM_QNAME = new QName("http://www.openapplications.org/oagis/10", "SyncBOM");
    private final static QName _ApplicationArea_QNAME = new QName("http://www.openapplications.org/oagis/10", "ApplicationArea");
    private final static QName _Sender_QNAME = new QName("http://www.openapplications.org/oagis/10", "Sender");
    private final static QName _LogicalID_QNAME = new QName("http://www.openapplications.org/oagis/10", "LogicalID");
    private final static QName _ComponentID_QNAME = new QName("http://www.openapplications.org/oagis/10", "ComponentID");
    private final static QName _TaskID_QNAME = new QName("http://www.openapplications.org/oagis/10", "TaskID");
    private final static QName _ReferenceID_QNAME = new QName("http://www.openapplications.org/oagis/10", "ReferenceID");
    private final static QName _ConfirmationCodes_QNAME = new QName("http://www.openapplications.org/oagis/10", "ConfirmationCodes");
    private final static QName _ProcessingConfirmationCode_QNAME = new QName("http://www.openapplications.org/oagis/10", "ProcessingConfirmationCode");
    private final static QName _ConfirmationCode_QNAME = new QName("http://www.openapplications.org/oagis/10", "ConfirmationCode");
    private final static QName _AuthorizationID_QNAME = new QName("http://www.openapplications.org/oagis/10", "AuthorizationID");
    private final static QName _ID_QNAME = new QName("http://www.openapplications.org/oagis/10", "ID");
    private final static QName _Intermediary_QNAME = new QName("http://www.openapplications.org/oagis/10", "Intermediary");
    private final static QName _ReceivedDateTime_QNAME = new QName("http://www.openapplications.org/oagis/10", "ReceivedDateTime");
    private final static QName _SentDateTime_QNAME = new QName("http://www.openapplications.org/oagis/10", "SentDateTime");
    private final static QName _Receiver_QNAME = new QName("http://www.openapplications.org/oagis/10", "Receiver");
    private final static QName _CreationDateTime_QNAME = new QName("http://www.openapplications.org/oagis/10", "CreationDateTime");
    private final static QName _Signature_QNAME = new QName("http://www.openapplications.org/oagis/10", "Signature");
    private final static QName _BODID_QNAME = new QName("http://www.openapplications.org/oagis/10", "BODID");
    private final static QName _Sync_QNAME = new QName("http://www.openapplications.org/oagis/10", "Sync");
    private final static QName _ActionCriteria_QNAME = new QName("http://www.openapplications.org/oagis/10", "ActionCriteria");
    private final static QName _ActionExpression_QNAME = new QName("http://www.openapplications.org/oagis/10", "ActionExpression");
    private final static QName _ChangeStatus_QNAME = new QName("http://www.openapplications.org/oagis/10", "ChangeStatus");
    private final static QName _IDSet_QNAME = new QName("http://www.openapplications.org/oagis/10", "IDSet");
    private final static QName _Code_QNAME = new QName("http://www.openapplications.org/oagis/10", "Code");
    private final static QName _Description_QNAME = new QName("http://www.openapplications.org/oagis/10", "Description");
    private final static QName _ReasonCode_QNAME = new QName("http://www.openapplications.org/oagis/10", "ReasonCode");
    private final static QName _Reason_QNAME = new QName("http://www.openapplications.org/oagis/10", "Reason");
    private final static QName _EffectiveTimePeriod_QNAME = new QName("http://www.openapplications.org/oagis/10", "EffectiveTimePeriod");
    private final static QName _InclusiveIndicator_QNAME = new QName("http://www.openapplications.org/oagis/10", "InclusiveIndicator");
    private final static QName _StartDateTime_QNAME = new QName("http://www.openapplications.org/oagis/10", "StartDateTime");
    private final static QName _StartTime_QNAME = new QName("http://www.openapplications.org/oagis/10", "StartTime");
    private final static QName _Duration_QNAME = new QName("http://www.openapplications.org/oagis/10", "Duration");
    private final static QName _EndDateTime_QNAME = new QName("http://www.openapplications.org/oagis/10", "EndDateTime");
    private final static QName _EndTime_QNAME = new QName("http://www.openapplications.org/oagis/10", "EndTime");
    private final static QName _StateChange_QNAME = new QName("http://www.openapplications.org/oagis/10", "StateChange");
    private final static QName _FromStateCode_QNAME = new QName("http://www.openapplications.org/oagis/10", "FromStateCode");
    private final static QName _ToStateCode_QNAME = new QName("http://www.openapplications.org/oagis/10", "ToStateCode");
    private final static QName _ChangeDateTime_QNAME = new QName("http://www.openapplications.org/oagis/10", "ChangeDateTime");
    private final static QName _Note_QNAME = new QName("http://www.openapplications.org/oagis/10", "Note");
    private final static QName _BOM_QNAME = new QName("http://www.openapplications.org/oagis/10", "BOM");
    private final static QName _BOMHeader_QNAME = new QName("http://www.openapplications.org/oagis/10", "BOMHeader");
    private final static QName _RevisionID_QNAME = new QName("http://www.openapplications.org/oagis/10", "RevisionID");
    private final static QName _VariationID_QNAME = new QName("http://www.openapplications.org/oagis/10", "VariationID");
    private final static QName _DocumentIDSet_QNAME = new QName("http://www.openapplications.org/oagis/10", "DocumentIDSet");
    private final static QName _LastModificationDateTime_QNAME = new QName("http://www.openapplications.org/oagis/10", "LastModificationDateTime");
    private final static QName _DocumentDateTime_QNAME = new QName("http://www.openapplications.org/oagis/10", "DocumentDateTime");
    private final static QName _DocumentReference_QNAME = new QName("http://www.openapplications.org/oagis/10", "DocumentReference");
    private final static QName _Status_QNAME = new QName("http://www.openapplications.org/oagis/10", "Status");
    private final static QName _LineNumberID_QNAME = new QName("http://www.openapplications.org/oagis/10", "LineNumberID");
    private final static QName _LineIDSet_QNAME = new QName("http://www.openapplications.org/oagis/10", "LineIDSet");
    private final static QName _Attachment_QNAME = new QName("http://www.openapplications.org/oagis/10", "Attachment");
    private final static QName _EmbeddedDataBinaryObject_QNAME = new QName("http://www.openapplications.org/oagis/10", "EmbeddedDataBinaryObject");
    private final static QName _URI_QNAME = new QName("http://www.openapplications.org/oagis/10", "URI");
    private final static QName _ISBN_QNAME = new QName("http://www.openapplications.org/oagis/10", "ISBN");
    private final static QName _FileName_QNAME = new QName("http://www.openapplications.org/oagis/10", "FileName");
    private final static QName _FileTypeCode_QNAME = new QName("http://www.openapplications.org/oagis/10", "FileTypeCode");
    private final static QName _FileSizeQuantity_QNAME = new QName("http://www.openapplications.org/oagis/10", "FileSizeQuantity");
    private final static QName _Title_QNAME = new QName("http://www.openapplications.org/oagis/10", "Title");
    private final static QName _AlternateBOMReference_QNAME = new QName("http://www.openapplications.org/oagis/10", "AlternateBOMReference");
    private final static QName _Effectivity_QNAME = new QName("http://www.openapplications.org/oagis/10", "Effectivity");
    private final static QName _Name_QNAME = new QName("http://www.openapplications.org/oagis/10", "Name");
    private final static QName _Preference_QNAME = new QName("http://www.openapplications.org/oagis/10", "Preference");
    private final static QName _PrioritySequenceValue_QNAME = new QName("http://www.openapplications.org/oagis/10", "PrioritySequenceValue");
    private final static QName _AvailableTimePeriod_QNAME = new QName("http://www.openapplications.org/oagis/10", "AvailableTimePeriod");
    private final static QName _UnavailableTimePeriod_QNAME = new QName("http://www.openapplications.org/oagis/10", "UnavailableTimePeriod");
    private final static QName _EffectiveValueList_QNAME = new QName("http://www.openapplications.org/oagis/10", "EffectiveValueList");
    private final static QName _EffectiveRange_QNAME = new QName("http://www.openapplications.org/oagis/10", "EffectiveRange");
    private final static QName _StartID_QNAME = new QName("http://www.openapplications.org/oagis/10", "StartID");
    private final static QName _RangeCountNumber_QNAME = new QName("http://www.openapplications.org/oagis/10", "RangeCountNumber");
    private final static QName _EndID_QNAME = new QName("http://www.openapplications.org/oagis/10", "EndID");
    private final static QName _Item_QNAME = new QName("http://www.openapplications.org/oagis/10", "Item");
    private final static QName _ItemIDSet_QNAME = new QName("http://www.openapplications.org/oagis/10", "ItemIDSet");
    private final static QName _CustomerItemIdentification_QNAME = new QName("http://www.openapplications.org/oagis/10", "CustomerItemIdentification");
    private final static QName _ManufacturerItemIdentification_QNAME = new QName("http://www.openapplications.org/oagis/10", "ManufacturerItemIdentification");
    private final static QName _SupplierItemIdentification_QNAME = new QName("http://www.openapplications.org/oagis/10", "SupplierItemIdentification");
    private final static QName _UPCID_QNAME = new QName("http://www.openapplications.org/oagis/10", "UPCID");
    private final static QName _EPCID_QNAME = new QName("http://www.openapplications.org/oagis/10", "EPCID");
    private final static QName _GTINID_QNAME = new QName("http://www.openapplications.org/oagis/10", "GTINID");
    private final static QName _Classification_QNAME = new QName("http://www.openapplications.org/oagis/10", "Classification");
    private final static QName _UNSPSCCode_QNAME = new QName("http://www.openapplications.org/oagis/10", "UNSPSCCode");
    private final static QName _Codes_QNAME = new QName("http://www.openapplications.org/oagis/10", "Codes");
    private final static QName _Specification_QNAME = new QName("http://www.openapplications.org/oagis/10", "Specification");
    private final static QName _Property_QNAME = new QName("http://www.openapplications.org/oagis/10", "Property");
    private final static QName _ParentID_QNAME = new QName("http://www.openapplications.org/oagis/10", "ParentID");
    private final static QName _NameValue_QNAME = new QName("http://www.openapplications.org/oagis/10", "NameValue");
    private final static QName _Key_QNAME = new QName("http://www.openapplications.org/oagis/10", "Key");
    private final static QName _HazardousMaterial_QNAME = new QName("http://www.openapplications.org/oagis/10", "HazardousMaterial");
    private final static QName _MFAGID_QNAME = new QName("http://www.openapplications.org/oagis/10", "MFAGID");
    private final static QName _TechnicalName_QNAME = new QName("http://www.openapplications.org/oagis/10", "TechnicalName");
    private final static QName _PlacardEndorsement_QNAME = new QName("http://www.openapplications.org/oagis/10", "PlacardEndorsement");
    private final static QName _PlacardNotation_QNAME = new QName("http://www.openapplications.org/oagis/10", "PlacardNotation");
    private final static QName _MarinePollutionLevelCode_QNAME = new QName("http://www.openapplications.org/oagis/10", "MarinePollutionLevelCode");
    private final static QName _ToxicityZoneCode_QNAME = new QName("http://www.openapplications.org/oagis/10", "ToxicityZoneCode");
    private final static QName _Temperature_QNAME = new QName("http://www.openapplications.org/oagis/10", "Temperature");
    private final static QName _FlashpointTemperature_QNAME = new QName("http://www.openapplications.org/oagis/10", "FlashpointTemperature");
    private final static QName _PrimaryEntryRoute_QNAME = new QName("http://www.openapplications.org/oagis/10", "PrimaryEntryRoute");
    private final static QName _EmergencyContact_QNAME = new QName("http://www.openapplications.org/oagis/10", "EmergencyContact");
    private final static QName _PersonName_QNAME = new QName("http://www.openapplications.org/oagis/10", "PersonName");
    private final static QName _FormattedName_QNAME = new QName("http://www.openapplications.org/oagis/10", "FormattedName");
    private final static QName _PreferredName_QNAME = new QName("http://www.openapplications.org/oagis/10", "PreferredName");
    private final static QName _GivenName_QNAME = new QName("http://www.openapplications.org/oagis/10", "GivenName");
    private final static QName _MiddleName_QNAME = new QName("http://www.openapplications.org/oagis/10", "MiddleName");
    private final static QName _FamilyName_QNAME = new QName("http://www.openapplications.org/oagis/10", "FamilyName");
    private final static QName _TitleAffixCode_QNAME = new QName("http://www.openapplications.org/oagis/10", "TitleAffixCode");
    private final static QName _PreferredSalutationCode_QNAME = new QName("http://www.openapplications.org/oagis/10", "PreferredSalutationCode");
    private final static QName _GenerationAffixCode_QNAME = new QName("http://www.openapplications.org/oagis/10", "GenerationAffixCode");
    private final static QName _QualificationAffixCode_QNAME = new QName("http://www.openapplications.org/oagis/10", "QualificationAffixCode");
    private final static QName _Initials_QNAME = new QName("http://www.openapplications.org/oagis/10", "Initials");
    private final static QName _Usage_QNAME = new QName("http://www.openapplications.org/oagis/10", "Usage");
    private final static QName _GeographicalRegionCode_QNAME = new QName("http://www.openapplications.org/oagis/10", "GeographicalRegionCode");
    private final static QName _LegalIndicator_QNAME = new QName("http://www.openapplications.org/oagis/10", "LegalIndicator");
    private final static QName _FormattedAddressUse_QNAME = new QName("http://www.openapplications.org/oagis/10", "FormattedAddressUse");
    private final static QName _AddressLine_QNAME = new QName("http://www.openapplications.org/oagis/10", "AddressLine");
    private final static QName _RoleCode_QNAME = new QName("http://www.openapplications.org/oagis/10", "RoleCode");
    private final static QName _JobTitle_QNAME = new QName("http://www.openapplications.org/oagis/10", "JobTitle");
    private final static QName _Responsibility_QNAME = new QName("http://www.openapplications.org/oagis/10", "Responsibility");
    private final static QName _Communication_QNAME = new QName("http://www.openapplications.org/oagis/10", "Communication");
    private final static QName _ChannelCode_QNAME = new QName("http://www.openapplications.org/oagis/10", "ChannelCode");
    private final static QName _UseCode_QNAME = new QName("http://www.openapplications.org/oagis/10", "UseCode");
    private final static QName _CountryDialingCode_QNAME = new QName("http://www.openapplications.org/oagis/10", "CountryDialingCode");
    private final static QName _AreaDialingCode_QNAME = new QName("http://www.openapplications.org/oagis/10", "AreaDialingCode");
    private final static QName _DialNumber_QNAME = new QName("http://www.openapplications.org/oagis/10", "DialNumber");
    private final static QName _PhoneExtension_QNAME = new QName("http://www.openapplications.org/oagis/10", "PhoneExtension");
    private final static QName _Access_QNAME = new QName("http://www.openapplications.org/oagis/10", "Access");
    private final static QName _Address_QNAME = new QName("http://www.openapplications.org/oagis/10", "Address");
    private final static QName _AttentionOfName_QNAME = new QName("http://www.openapplications.org/oagis/10", "AttentionOfName");
    private final static QName _CareOfName_QNAME = new QName("http://www.openapplications.org/oagis/10", "CareOfName");
    private final static QName _BuildingNumber_QNAME = new QName("http://www.openapplications.org/oagis/10", "BuildingNumber");
    private final static QName _BuildingName_QNAME = new QName("http://www.openapplications.org/oagis/10", "BuildingName");
    private final static QName _BlockName_QNAME = new QName("http://www.openapplications.org/oagis/10", "BlockName");
    private final static QName _StreetName_QNAME = new QName("http://www.openapplications.org/oagis/10", "StreetName");
    private final static QName _StreetTypeCode_QNAME = new QName("http://www.openapplications.org/oagis/10", "StreetTypeCode");
    private final static QName _Floor_QNAME = new QName("http://www.openapplications.org/oagis/10", "Floor");
    private final static QName _Unit_QNAME = new QName("http://www.openapplications.org/oagis/10", "Unit");
    private final static QName _StairCase_QNAME = new QName("http://www.openapplications.org/oagis/10", "StairCase");
    private final static QName _PostOfficeBox_QNAME = new QName("http://www.openapplications.org/oagis/10", "PostOfficeBox");
    private final static QName _DeliveryPointID_QNAME = new QName("http://www.openapplications.org/oagis/10", "DeliveryPointID");
    private final static QName _PlotID_QNAME = new QName("http://www.openapplications.org/oagis/10", "PlotID");
    private final static QName _CityName_QNAME = new QName("http://www.openapplications.org/oagis/10", "CityName");
    private final static QName _CitySubDivisionName_QNAME = new QName("http://www.openapplications.org/oagis/10", "CitySubDivisionName");
    private final static QName _CountrySubDivisionCode_QNAME = new QName("http://www.openapplications.org/oagis/10", "CountrySubDivisionCode");
    private final static QName _CountryCode_QNAME = new QName("http://www.openapplications.org/oagis/10", "CountryCode");
    private final static QName _PostalCode_QNAME = new QName("http://www.openapplications.org/oagis/10", "PostalCode");
    private final static QName _GeographicalCoordinate_QNAME = new QName("http://www.openapplications.org/oagis/10", "GeographicalCoordinate");
    private final static QName _ReferenceSystemID_QNAME = new QName("http://www.openapplications.org/oagis/10", "ReferenceSystemID");
    private final static QName _VerticalReferenceSystemID_QNAME = new QName("http://www.openapplications.org/oagis/10", "VerticalReferenceSystemID");
    private final static QName _VerticalMeasure_QNAME = new QName("http://www.openapplications.org/oagis/10", "VerticalMeasure");
    private final static QName _LatitudeMeasure_QNAME = new QName("http://www.openapplications.org/oagis/10", "LatitudeMeasure");
    private final static QName _LongitudeMeasure_QNAME = new QName("http://www.openapplications.org/oagis/10", "LongitudeMeasure");
    private final static QName _VerticalAccuracyMeasure_QNAME = new QName("http://www.openapplications.org/oagis/10", "VerticalAccuracyMeasure");
    private final static QName _HorizontalAccuracyMeasure_QNAME = new QName("http://www.openapplications.org/oagis/10", "HorizontalAccuracyMeasure");
    private final static QName _HTMLPreferredIndicator_QNAME = new QName("http://www.openapplications.org/oagis/10", "HTMLPreferredIndicator");
    private final static QName _Text_QNAME = new QName("http://www.openapplications.org/oagis/10", "Text");
    private final static QName _TelephoneCommunication_QNAME = new QName("http://www.openapplications.org/oagis/10", "TelephoneCommunication");
    private final static QName _FormattedNumber_QNAME = new QName("http://www.openapplications.org/oagis/10", "FormattedNumber");
    private final static QName _EMailAddressCommunication_QNAME = new QName("http://www.openapplications.org/oagis/10", "EMailAddressCommunication");
    private final static QName _EMailAddressID_QNAME = new QName("http://www.openapplications.org/oagis/10", "EMailAddressID");
    private final static QName _InternetAddressCommunication_QNAME = new QName("http://www.openapplications.org/oagis/10", "InternetAddressCommunication");
    private final static QName _Party_QNAME = new QName("http://www.openapplications.org/oagis/10", "Party");
    private final static QName _PartyIDSet_QNAME = new QName("http://www.openapplications.org/oagis/10", "PartyIDSet");
    private final static QName _TaxIDSet_QNAME = new QName("http://www.openapplications.org/oagis/10", "TaxIDSet");
    private final static QName _TaxID_QNAME = new QName("http://www.openapplications.org/oagis/10", "TaxID");
    private final static QName _DUNSID_QNAME = new QName("http://www.openapplications.org/oagis/10", "DUNSID");
    private final static QName _CAGEID_QNAME = new QName("http://www.openapplications.org/oagis/10", "CAGEID");
    private final static QName _DODAACID_QNAME = new QName("http://www.openapplications.org/oagis/10", "DODAACID");
    private final static QName _BICID_QNAME = new QName("http://www.openapplications.org/oagis/10", "BICID");
    private final static QName _SCACID_QNAME = new QName("http://www.openapplications.org/oagis/10", "SCACID");
    private final static QName _CCRID_QNAME = new QName("http://www.openapplications.org/oagis/10", "CCRID");
    private final static QName _AccountID_QNAME = new QName("http://www.openapplications.org/oagis/10", "AccountID");
    private final static QName _Location_QNAME = new QName("http://www.openapplications.org/oagis/10", "Location");
    private final static QName _Directions_QNAME = new QName("http://www.openapplications.org/oagis/10", "Directions");
    private final static QName _Coordinate_QNAME = new QName("http://www.openapplications.org/oagis/10", "Coordinate");
    private final static QName _Contact_QNAME = new QName("http://www.openapplications.org/oagis/10", "Contact");
    private final static QName _PostalAddress_QNAME = new QName("http://www.openapplications.org/oagis/10", "PostalAddress");
    private final static QName _PhysicalAddress_QNAME = new QName("http://www.openapplications.org/oagis/10", "PhysicalAddress");
    private final static QName _TimeZoneCode_QNAME = new QName("http://www.openapplications.org/oagis/10", "TimeZoneCode");
    private final static QName _LocationEquipmentSpecification_QNAME = new QName("http://www.openapplications.org/oagis/10", "LocationEquipmentSpecification");
    private final static QName _StorageLocation_QNAME = new QName("http://www.openapplications.org/oagis/10", "StorageLocation");
    private final static QName _MajorDivisionID_QNAME = new QName("http://www.openapplications.org/oagis/10", "MajorDivisionID");
    private final static QName _MinorDivisionID_QNAME = new QName("http://www.openapplications.org/oagis/10", "MinorDivisionID");
    private final static QName _AisleID_QNAME = new QName("http://www.openapplications.org/oagis/10", "AisleID");
    private final static QName _RackID_QNAME = new QName("http://www.openapplications.org/oagis/10", "RackID");
    private final static QName _RackLevelID_QNAME = new QName("http://www.openapplications.org/oagis/10", "RackLevelID");
    private final static QName _SubStorageLocationID_QNAME = new QName("http://www.openapplications.org/oagis/10", "SubStorageLocationID");
    private final static QName _ContainerID_QNAME = new QName("http://www.openapplications.org/oagis/10", "ContainerID");
    private final static QName _RFID_QNAME = new QName("http://www.openapplications.org/oagis/10", "RFID");
    private final static QName _SealID_QNAME = new QName("http://www.openapplications.org/oagis/10", "SealID");
    private final static QName _InventoryPolicyCode_QNAME = new QName("http://www.openapplications.org/oagis/10", "InventoryPolicyCode");
    private final static QName _UOMCode_QNAME = new QName("http://www.openapplications.org/oagis/10", "UOMCode");
    private final static QName _HazardousClass_QNAME = new QName("http://www.openapplications.org/oagis/10", "HazardousClass");
    private final static QName _PackingGroup_QNAME = new QName("http://www.openapplications.org/oagis/10", "PackingGroup");
    private final static QName _Packaging_QNAME = new QName("http://www.openapplications.org/oagis/10", "Packaging");
    private final static QName _Dimensions_QNAME = new QName("http://www.openapplications.org/oagis/10", "Dimensions");
    private final static QName _WidthMeasure_QNAME = new QName("http://www.openapplications.org/oagis/10", "WidthMeasure");
    private final static QName _LengthMeasure_QNAME = new QName("http://www.openapplications.org/oagis/10", "LengthMeasure");
    private final static QName _HeightMeasure_QNAME = new QName("http://www.openapplications.org/oagis/10", "HeightMeasure");
    private final static QName _Measure_QNAME = new QName("http://www.openapplications.org/oagis/10", "Measure");
    private final static QName _VolumeMeasure_QNAME = new QName("http://www.openapplications.org/oagis/10", "VolumeMeasure");
    private final static QName _NetVolumeMeasure_QNAME = new QName("http://www.openapplications.org/oagis/10", "NetVolumeMeasure");
    private final static QName _GrossVolumeMeasure_QNAME = new QName("http://www.openapplications.org/oagis/10", "GrossVolumeMeasure");
    private final static QName _DimensionRandomSizeIndicator_QNAME = new QName("http://www.openapplications.org/oagis/10", "DimensionRandomSizeIndicator");
    private final static QName _SizeLimitRange_QNAME = new QName("http://www.openapplications.org/oagis/10", "SizeLimitRange");
    private final static QName _UnderSizeMeasure_QNAME = new QName("http://www.openapplications.org/oagis/10", "UnderSizeMeasure");
    private final static QName _OverSizeMeasure_QNAME = new QName("http://www.openapplications.org/oagis/10", "OverSizeMeasure");
    private final static QName _WeightRange_QNAME = new QName("http://www.openapplications.org/oagis/10", "WeightRange");
    private final static QName _MinimumWeightMeasure_QNAME = new QName("http://www.openapplications.org/oagis/10", "MinimumWeightMeasure");
    private final static QName _MaximumWeightMeasure_QNAME = new QName("http://www.openapplications.org/oagis/10", "MaximumWeightMeasure");
    private final static QName _NetWeightMeasure_QNAME = new QName("http://www.openapplications.org/oagis/10", "NetWeightMeasure");
    private final static QName _TareWeightMeasure_QNAME = new QName("http://www.openapplications.org/oagis/10", "TareWeightMeasure");
    private final static QName _GrossWeightMeasure_QNAME = new QName("http://www.openapplications.org/oagis/10", "GrossWeightMeasure");
    private final static QName _UPCPackagingLevelCode_QNAME = new QName("http://www.openapplications.org/oagis/10", "UPCPackagingLevelCode");
    private final static QName _PerPackageQuantity_QNAME = new QName("http://www.openapplications.org/oagis/10", "PerPackageQuantity");
    private final static QName _CapacityPerPackageQuantity_QNAME = new QName("http://www.openapplications.org/oagis/10", "CapacityPerPackageQuantity");
    private final static QName _OuterPackID_QNAME = new QName("http://www.openapplications.org/oagis/10", "OuterPackID");
    private final static QName _InnerPackID_QNAME = new QName("http://www.openapplications.org/oagis/10", "InnerPackID");
    private final static QName _Quantity_QNAME = new QName("http://www.openapplications.org/oagis/10", "Quantity");
    private final static QName _ExportControl_QNAME = new QName("http://www.openapplications.org/oagis/10", "ExportControl");
    private final static QName _RegionCode_QNAME = new QName("http://www.openapplications.org/oagis/10", "RegionCode");
    private final static QName _EncryptionStatusCode_QNAME = new QName("http://www.openapplications.org/oagis/10", "EncryptionStatusCode");
    private final static QName _HarmonizedTariff_QNAME = new QName("http://www.openapplications.org/oagis/10", "HarmonizedTariff");
    private final static QName _Trademark_QNAME = new QName("http://www.openapplications.org/oagis/10", "Trademark");
    private final static QName _MarkAttachment_QNAME = new QName("http://www.openapplications.org/oagis/10", "MarkAttachment");
    private final static QName _MarkOwnerParty_QNAME = new QName("http://www.openapplications.org/oagis/10", "MarkOwnerParty");
    private final static QName _MarkEffectivity_QNAME = new QName("http://www.openapplications.org/oagis/10", "MarkEffectivity");
    private final static QName _CountryOfOriginCode_QNAME = new QName("http://www.openapplications.org/oagis/10", "CountryOfOriginCode");
    private final static QName _SerialNumberID_QNAME = new QName("http://www.openapplications.org/oagis/10", "SerialNumberID");
    private final static QName _Lot_QNAME = new QName("http://www.openapplications.org/oagis/10", "Lot");
    private final static QName _LotIDs_QNAME = new QName("http://www.openapplications.org/oagis/10", "LotIDs");
    private final static QName _Disposition_QNAME = new QName("http://www.openapplications.org/oagis/10", "Disposition");
    private final static QName _ManufacturingParty_QNAME = new QName("http://www.openapplications.org/oagis/10", "ManufacturingParty");
    private final static QName _ParentBOMReference_QNAME = new QName("http://www.openapplications.org/oagis/10", "ParentBOMReference");
    private final static QName _ChildBOMReference_QNAME = new QName("http://www.openapplications.org/oagis/10", "ChildBOMReference");
    private final static QName _RouteReference_QNAME = new QName("http://www.openapplications.org/oagis/10", "RouteReference");
    private final static QName _ProductionOrderReference_QNAME = new QName("http://www.openapplications.org/oagis/10", "ProductionOrderReference");
    private final static QName _ItemIdentification_QNAME = new QName("http://www.openapplications.org/oagis/10", "ItemIdentification");
    private final static QName _Facility_QNAME = new QName("http://www.openapplications.org/oagis/10", "Facility");
    private final static QName _SerialLot_QNAME = new QName("http://www.openapplications.org/oagis/10", "SerialLot");
    private final static QName _ItemQuantity_QNAME = new QName("http://www.openapplications.org/oagis/10", "ItemQuantity");
    private final static QName _ParentSerialNumberID_QNAME = new QName("http://www.openapplications.org/oagis/10", "ParentSerialNumberID");
    private final static QName _OperationReference_QNAME = new QName("http://www.openapplications.org/oagis/10", "OperationReference");
    private final static QName _GroupName_QNAME = new QName("http://www.openapplications.org/oagis/10", "GroupName");
    private final static QName _SequenceCode_QNAME = new QName("http://www.openapplications.org/oagis/10", "SequenceCode");
    private final static QName _StepID_QNAME = new QName("http://www.openapplications.org/oagis/10", "StepID");
    private final static QName _StepTypeCode_QNAME = new QName("http://www.openapplications.org/oagis/10", "StepTypeCode");
    private final static QName _UsageDescription_QNAME = new QName("http://www.openapplications.org/oagis/10", "UsageDescription");
    private final static QName _TrackingIndicator_QNAME = new QName("http://www.openapplications.org/oagis/10", "TrackingIndicator");
    private final static QName _BatchSizeQuantity_QNAME = new QName("http://www.openapplications.org/oagis/10", "BatchSizeQuantity");
    private final static QName _BOMItemData_QNAME = new QName("http://www.openapplications.org/oagis/10", "BOMItemData");
    private final static QName _UID_QNAME = new QName("http://www.openapplications.org/oagis/10", "UID");
    private final static QName _ReferenceDesignatorID_QNAME = new QName("http://www.openapplications.org/oagis/10", "ReferenceDesignatorID");
    private final static QName _FindNumberID_QNAME = new QName("http://www.openapplications.org/oagis/10", "FindNumberID");
    private final static QName _ExecutionTimePeriod_QNAME = new QName("http://www.openapplications.org/oagis/10", "ExecutionTimePeriod");
    private final static QName _FixedQuantityIndicator_QNAME = new QName("http://www.openapplications.org/oagis/10", "FixedQuantityIndicator");
    private final static QName _MaximumLotSizeQuantity_QNAME = new QName("http://www.openapplications.org/oagis/10", "MaximumLotSizeQuantity");
    private final static QName _MinimumLotSizeQuantity_QNAME = new QName("http://www.openapplications.org/oagis/10", "MinimumLotSizeQuantity");
    private final static QName _LotSizeMultiplerNumber_QNAME = new QName("http://www.openapplications.org/oagis/10", "LotSizeMultiplerNumber");
    private final static QName _LeadTimeDuration_QNAME = new QName("http://www.openapplications.org/oagis/10", "LeadTimeDuration");
    private final static QName _RequiredPercent_QNAME = new QName("http://www.openapplications.org/oagis/10", "RequiredPercent");
    private final static QName _BackFlushedIndicator_QNAME = new QName("http://www.openapplications.org/oagis/10", "BackFlushedIndicator");
    private final static QName _ActualIndicator_QNAME = new QName("http://www.openapplications.org/oagis/10", "ActualIndicator");
    private final static QName _ScrapIndicator_QNAME = new QName("http://www.openapplications.org/oagis/10", "ScrapIndicator");
    private final static QName _ParentItemInstanceIdentification_QNAME = new QName("http://www.openapplications.org/oagis/10", "ParentItemInstanceIdentification");
    private final static QName _ChildItemInstanceIdentification_QNAME = new QName("http://www.openapplications.org/oagis/10", "ChildItemInstanceIdentification");
    private final static QName _BOMOption_QNAME = new QName("http://www.openapplications.org/oagis/10", "BOMOption");
    private final static QName _DefaultIndicator_QNAME = new QName("http://www.openapplications.org/oagis/10", "DefaultIndicator");
    private final static QName _ExclusiveIndicator_QNAME = new QName("http://www.openapplications.org/oagis/10", "ExclusiveIndicator");
    private final static QName _BOMOptionClass_QNAME = new QName("http://www.openapplications.org/oagis/10", "BOMOptionClass");
    private final static QName _MandatoryIndicator_QNAME = new QName("http://www.openapplications.org/oagis/10", "MandatoryIndicator");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.booleanworks.bomworkshop2015a.oagi10.bom.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SyncBOMType }
     * 
     */
    public SyncBOMType createSyncBOMType() {
        return new SyncBOMType();
    }

    /**
     * Create an instance of {@link ApplicationAreaType }
     * 
     */
    public ApplicationAreaType createApplicationAreaType() {
        return new ApplicationAreaType();
    }

    /**
     * Create an instance of {@link SenderType }
     * 
     */
    public SenderType createSenderType() {
        return new SenderType();
    }

    /**
     * Create an instance of {@link IDType }
     * 
     */
    public IDType createIDType() {
        return new IDType();
    }

    /**
     * Create an instance of {@link ConfirmationCodesType }
     * 
     */
    public ConfirmationCodesType createConfirmationCodesType() {
        return new ConfirmationCodesType();
    }

    /**
     * Create an instance of {@link CodeType }
     * 
     */
    public CodeType createCodeType() {
        return new CodeType();
    }

    /**
     * Create an instance of {@link ConfirmationCodeType }
     * 
     */
    public ConfirmationCodeType createConfirmationCodeType() {
        return new ConfirmationCodeType();
    }

    /**
     * Create an instance of {@link OpenIDType }
     * 
     */
    public OpenIDType createOpenIDType() {
        return new OpenIDType();
    }

    /**
     * Create an instance of {@link IntermediaryType }
     * 
     */
    public IntermediaryType createIntermediaryType() {
        return new IntermediaryType();
    }

    /**
     * Create an instance of {@link ReceiverType }
     * 
     */
    public ReceiverType createReceiverType() {
        return new ReceiverType();
    }

    /**
     * Create an instance of {@link SignatureType }
     * 
     */
    public SignatureType createSignatureType() {
        return new SignatureType();
    }

    /**
     * Create an instance of {@link SyncType }
     * 
     */
    public SyncType createSyncType() {
        return new SyncType();
    }

    /**
     * Create an instance of {@link ActionCriteriaType }
     * 
     */
    public ActionCriteriaType createActionCriteriaType() {
        return new ActionCriteriaType();
    }

    /**
     * Create an instance of {@link ActionExpressionType }
     * 
     */
    public ActionExpressionType createActionExpressionType() {
        return new ActionExpressionType();
    }

    /**
     * Create an instance of {@link ChangeStatusType }
     * 
     */
    public ChangeStatusType createChangeStatusType() {
        return new ChangeStatusType();
    }

    /**
     * Create an instance of {@link IDSetType }
     * 
     */
    public IDSetType createIDSetType() {
        return new IDSetType();
    }

    /**
     * Create an instance of {@link OpenCodeType }
     * 
     */
    public OpenCodeType createOpenCodeType() {
        return new OpenCodeType();
    }

    /**
     * Create an instance of {@link DescriptionType }
     * 
     */
    public DescriptionType createDescriptionType() {
        return new DescriptionType();
    }

    /**
     * Create an instance of {@link SequencedTextType }
     * 
     */
    public SequencedTextType createSequencedTextType() {
        return new SequencedTextType();
    }

    /**
     * Create an instance of {@link TimePeriodType }
     * 
     */
    public TimePeriodType createTimePeriodType() {
        return new TimePeriodType();
    }

    /**
     * Create an instance of {@link StateChangeType }
     * 
     */
    public StateChangeType createStateChangeType() {
        return new StateChangeType();
    }

    /**
     * Create an instance of {@link StateCodeType }
     * 
     */
    public StateCodeType createStateCodeType() {
        return new StateCodeType();
    }

    /**
     * Create an instance of {@link NoteType }
     * 
     */
    public NoteType createNoteType() {
        return new NoteType();
    }

    /**
     * Create an instance of {@link BOMType }
     * 
     */
    public BOMType createBOMType() {
        return new BOMType();
    }

    /**
     * Create an instance of {@link BOMHeaderType }
     * 
     */
    public BOMHeaderType createBOMHeaderType() {
        return new BOMHeaderType();
    }

    /**
     * Create an instance of {@link DocumentReferenceType }
     * 
     */
    public DocumentReferenceType createDocumentReferenceType() {
        return new DocumentReferenceType();
    }

    /**
     * Create an instance of {@link StatusType }
     * 
     */
    public StatusType createStatusType() {
        return new StatusType();
    }

    /**
     * Create an instance of {@link AttachmentType }
     * 
     */
    public AttachmentType createAttachmentType() {
        return new AttachmentType();
    }

    /**
     * Create an instance of {@link BinaryObjectType }
     * 
     */
    public BinaryObjectType createBinaryObjectType() {
        return new BinaryObjectType();
    }

    /**
     * Create an instance of {@link NameType }
     * 
     */
    public NameType createNameType() {
        return new NameType();
    }

    /**
     * Create an instance of {@link QuantityType }
     * 
     */
    public QuantityType createQuantityType() {
        return new QuantityType();
    }

    /**
     * Create an instance of {@link TextType }
     * 
     */
    public TextType createTextType() {
        return new TextType();
    }

    /**
     * Create an instance of {@link BOMReferenceType }
     * 
     */
    public BOMReferenceType createBOMReferenceType() {
        return new BOMReferenceType();
    }

    /**
     * Create an instance of {@link EffectivityType }
     * 
     */
    public EffectivityType createEffectivityType() {
        return new EffectivityType();
    }

    /**
     * Create an instance of {@link OpenNameType }
     * 
     */
    public OpenNameType createOpenNameType() {
        return new OpenNameType();
    }

    /**
     * Create an instance of {@link PreferenceType }
     * 
     */
    public PreferenceType createPreferenceType() {
        return new PreferenceType();
    }

    /**
     * Create an instance of {@link EffectiveValueListType }
     * 
     */
    public EffectiveValueListType createEffectiveValueListType() {
        return new EffectiveValueListType();
    }

    /**
     * Create an instance of {@link RangeType }
     * 
     */
    public RangeType createRangeType() {
        return new RangeType();
    }

    /**
     * Create an instance of {@link ItemType }
     * 
     */
    public ItemType createItemType() {
        return new ItemType();
    }

    /**
     * Create an instance of {@link ItemIdentificationType }
     * 
     */
    public ItemIdentificationType createItemIdentificationType() {
        return new ItemIdentificationType();
    }

    /**
     * Create an instance of {@link ClassificationType }
     * 
     */
    public ClassificationType createClassificationType() {
        return new ClassificationType();
    }

    /**
     * Create an instance of {@link CodesType }
     * 
     */
    public CodesType createCodesType() {
        return new CodesType();
    }

    /**
     * Create an instance of {@link SpecificationType }
     * 
     */
    public SpecificationType createSpecificationType() {
        return new SpecificationType();
    }

    /**
     * Create an instance of {@link PropertyType }
     * 
     */
    public PropertyType createPropertyType() {
        return new PropertyType();
    }

    /**
     * Create an instance of {@link NameValuePairType }
     * 
     */
    public NameValuePairType createNameValuePairType() {
        return new NameValuePairType();
    }

    /**
     * Create an instance of {@link HazardousMaterialType }
     * 
     */
    public HazardousMaterialType createHazardousMaterialType() {
        return new HazardousMaterialType();
    }

    /**
     * Create an instance of {@link OpenMeasureType }
     * 
     */
    public OpenMeasureType createOpenMeasureType() {
        return new OpenMeasureType();
    }

    /**
     * Create an instance of {@link TemperatureMeasureType }
     * 
     */
    public TemperatureMeasureType createTemperatureMeasureType() {
        return new TemperatureMeasureType();
    }

    /**
     * Create an instance of {@link ContactType }
     * 
     */
    public ContactType createContactType() {
        return new ContactType();
    }

    /**
     * Create an instance of {@link PersonNameType }
     * 
     */
    public PersonNameType createPersonNameType() {
        return new PersonNameType();
    }

    /**
     * Create an instance of {@link UsageType }
     * 
     */
    public UsageType createUsageType() {
        return new UsageType();
    }

    /**
     * Create an instance of {@link FormattedAddressUseType }
     * 
     */
    public FormattedAddressUseType createFormattedAddressUseType() {
        return new FormattedAddressUseType();
    }

    /**
     * Create an instance of {@link CommunicationType }
     * 
     */
    public CommunicationType createCommunicationType() {
        return new CommunicationType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link CountrySubDivisionCodeType }
     * 
     */
    public CountrySubDivisionCodeType createCountrySubDivisionCodeType() {
        return new CountrySubDivisionCodeType();
    }

    /**
     * Create an instance of {@link CountryCodeType }
     * 
     */
    public CountryCodeType createCountryCodeType() {
        return new CountryCodeType();
    }

    /**
     * Create an instance of {@link CoordinateType }
     * 
     */
    public CoordinateType createCoordinateType() {
        return new CoordinateType();
    }

    /**
     * Create an instance of {@link MeasureType }
     * 
     */
    public MeasureType createMeasureType() {
        return new MeasureType();
    }

    /**
     * Create an instance of {@link OpenTextType }
     * 
     */
    public OpenTextType createOpenTextType() {
        return new OpenTextType();
    }

    /**
     * Create an instance of {@link TelephoneCommunicationType }
     * 
     */
    public TelephoneCommunicationType createTelephoneCommunicationType() {
        return new TelephoneCommunicationType();
    }

    /**
     * Create an instance of {@link EMailAddressCommunicationType }
     * 
     */
    public EMailAddressCommunicationType createEMailAddressCommunicationType() {
        return new EMailAddressCommunicationType();
    }

    /**
     * Create an instance of {@link ElectronicCommunicationType }
     * 
     */
    public ElectronicCommunicationType createElectronicCommunicationType() {
        return new ElectronicCommunicationType();
    }

    /**
     * Create an instance of {@link PartyType }
     * 
     */
    public PartyType createPartyType() {
        return new PartyType();
    }

    /**
     * Create an instance of {@link LocationType }
     * 
     */
    public LocationType createLocationType() {
        return new LocationType();
    }

    /**
     * Create an instance of {@link StorageLocationType }
     * 
     */
    public StorageLocationType createStorageLocationType() {
        return new StorageLocationType();
    }

    /**
     * Create an instance of {@link UOMCodeType }
     * 
     */
    public UOMCodeType createUOMCodeType() {
        return new UOMCodeType();
    }

    /**
     * Create an instance of {@link PackagingType }
     * 
     */
    public PackagingType createPackagingType() {
        return new PackagingType();
    }

    /**
     * Create an instance of {@link DimensionsType }
     * 
     */
    public DimensionsType createDimensionsType() {
        return new DimensionsType();
    }

    /**
     * Create an instance of {@link SizeLimitRangeType }
     * 
     */
    public SizeLimitRangeType createSizeLimitRangeType() {
        return new SizeLimitRangeType();
    }

    /**
     * Create an instance of {@link WeightRangeType }
     * 
     */
    public WeightRangeType createWeightRangeType() {
        return new WeightRangeType();
    }

    /**
     * Create an instance of {@link OpenQuantityType }
     * 
     */
    public OpenQuantityType createOpenQuantityType() {
        return new OpenQuantityType();
    }

    /**
     * Create an instance of {@link ExportControlType }
     * 
     */
    public ExportControlType createExportControlType() {
        return new ExportControlType();
    }

    /**
     * Create an instance of {@link HarmonizedTariffType }
     * 
     */
    public HarmonizedTariffType createHarmonizedTariffType() {
        return new HarmonizedTariffType();
    }

    /**
     * Create an instance of {@link TrademarkType }
     * 
     */
    public TrademarkType createTrademarkType() {
        return new TrademarkType();
    }

    /**
     * Create an instance of {@link LotType }
     * 
     */
    public LotType createLotType() {
        return new LotType();
    }

    /**
     * Create an instance of {@link SequencedIDsType }
     * 
     */
    public SequencedIDsType createSequencedIDsType() {
        return new SequencedIDsType();
    }

    /**
     * Create an instance of {@link BOMReferenceBaseType }
     * 
     */
    public BOMReferenceBaseType createBOMReferenceBaseType() {
        return new BOMReferenceBaseType();
    }

    /**
     * Create an instance of {@link RouteReferenceType }
     * 
     */
    public RouteReferenceType createRouteReferenceType() {
        return new RouteReferenceType();
    }

    /**
     * Create an instance of {@link ProductionOrderReferenceType }
     * 
     */
    public ProductionOrderReferenceType createProductionOrderReferenceType() {
        return new ProductionOrderReferenceType();
    }

    /**
     * Create an instance of {@link FacilityType }
     * 
     */
    public FacilityType createFacilityType() {
        return new FacilityType();
    }

    /**
     * Create an instance of {@link SerialLotType }
     * 
     */
    public SerialLotType createSerialLotType() {
        return new SerialLotType();
    }

    /**
     * Create an instance of {@link OperationReferenceType }
     * 
     */
    public OperationReferenceType createOperationReferenceType() {
        return new OperationReferenceType();
    }

    /**
     * Create an instance of {@link BOMItemDataType }
     * 
     */
    public BOMItemDataType createBOMItemDataType() {
        return new BOMItemDataType();
    }

    /**
     * Create an instance of {@link SequencedIDType }
     * 
     */
    public SequencedIDType createSequencedIDType() {
        return new SequencedIDType();
    }

    /**
     * Create an instance of {@link ItemInstanceIdentificationType }
     * 
     */
    public ItemInstanceIdentificationType createItemInstanceIdentificationType() {
        return new ItemInstanceIdentificationType();
    }

    /**
     * Create an instance of {@link BOMOptionType }
     * 
     */
    public BOMOptionType createBOMOptionType() {
        return new BOMOptionType();
    }

    /**
     * Create an instance of {@link BOMOptionClassType }
     * 
     */
    public BOMOptionClassType createBOMOptionClassType() {
        return new BOMOptionClassType();
    }

    /**
     * Create an instance of {@link BusinessObjectDocumentType }
     * 
     */
    public BusinessObjectDocumentType createBusinessObjectDocumentType() {
        return new BusinessObjectDocumentType();
    }

    /**
     * Create an instance of {@link ApplicationAreaBaseType }
     * 
     */
    public ApplicationAreaBaseType createApplicationAreaBaseType() {
        return new ApplicationAreaBaseType();
    }

    /**
     * Create an instance of {@link IDTypeD995CD }
     * 
     */
    public IDTypeD995CD createIDTypeD995CD() {
        return new IDTypeD995CD();
    }

    /**
     * Create an instance of {@link CodeType1DEB05 }
     * 
     */
    public CodeType1DEB05 createCodeType1DEB05() {
        return new CodeType1DEB05();
    }

    /**
     * Create an instance of {@link ApplicationAreaExtensionType }
     * 
     */
    public ApplicationAreaExtensionType createApplicationAreaExtensionType() {
        return new ApplicationAreaExtensionType();
    }

    /**
     * Create an instance of {@link AllExtensionType }
     * 
     */
    public AllExtensionType createAllExtensionType() {
        return new AllExtensionType();
    }

    /**
     * Create an instance of {@link OpenUserAreaType }
     * 
     */
    public OpenUserAreaType createOpenUserAreaType() {
        return new OpenUserAreaType();
    }

    /**
     * Create an instance of {@link AnyUserAreaType }
     * 
     */
    public AnyUserAreaType createAnyUserAreaType() {
        return new AnyUserAreaType();
    }

    /**
     * Create an instance of {@link OpenAmountType }
     * 
     */
    public OpenAmountType createOpenAmountType() {
        return new OpenAmountType();
    }

    /**
     * Create an instance of {@link AmountType }
     * 
     */
    public AmountType createAmountType() {
        return new AmountType();
    }

    /**
     * Create an instance of {@link AmountType0723C8 }
     * 
     */
    public AmountType0723C8 createAmountType0723C8() {
        return new AmountType0723C8();
    }

    /**
     * Create an instance of {@link OpenDateTimeType }
     * 
     */
    public OpenDateTimeType createOpenDateTimeType() {
        return new OpenDateTimeType();
    }

    /**
     * Create an instance of {@link OpenIndicatorType }
     * 
     */
    public OpenIndicatorType createOpenIndicatorType() {
        return new OpenIndicatorType();
    }

    /**
     * Create an instance of {@link MeasureType671290 }
     * 
     */
    public MeasureType671290 createMeasureType671290() {
        return new MeasureType671290();
    }

    /**
     * Create an instance of {@link NameType02FC2Z }
     * 
     */
    public NameType02FC2Z createNameType02FC2Z() {
        return new NameType02FC2Z();
    }

    /**
     * Create an instance of {@link OpenNumberType }
     * 
     */
    public OpenNumberType createOpenNumberType() {
        return new OpenNumberType();
    }

    /**
     * Create an instance of {@link QuantityType201330 }
     * 
     */
    public QuantityType201330 createQuantityType201330() {
        return new QuantityType201330();
    }

    /**
     * Create an instance of {@link TextType62S0B4 }
     * 
     */
    public TextType62S0B4 createTextType62S0B4() {
        return new TextType62S0B4();
    }

    /**
     * Create an instance of {@link OpenTimeType }
     * 
     */
    public OpenTimeType createOpenTimeType() {
        return new OpenTimeType();
    }

    /**
     * Create an instance of {@link OpenFieldValueType }
     * 
     */
    public OpenFieldValueType createOpenFieldValueType() {
        return new OpenFieldValueType();
    }

    /**
     * Create an instance of {@link RecordFieldValueType }
     * 
     */
    public RecordFieldValueType createRecordFieldValueType() {
        return new RecordFieldValueType();
    }

    /**
     * Create an instance of {@link SyncBOMDataAreaType }
     * 
     */
    public SyncBOMDataAreaType createSyncBOMDataAreaType() {
        return new SyncBOMDataAreaType();
    }

    /**
     * Create an instance of {@link ActionVerbType }
     * 
     */
    public ActionVerbType createActionVerbType() {
        return new ActionVerbType();
    }

    /**
     * Create an instance of {@link ChangeStatusBaseType }
     * 
     */
    public ChangeStatusBaseType createChangeStatusBaseType() {
        return new ChangeStatusBaseType();
    }

    /**
     * Create an instance of {@link StatusABIEType }
     * 
     */
    public StatusABIEType createStatusABIEType() {
        return new StatusABIEType();
    }

    /**
     * Create an instance of {@link IdentificationType }
     * 
     */
    public IdentificationType createIdentificationType() {
        return new IdentificationType();
    }

    /**
     * Create an instance of {@link TimePeriodABIEType }
     * 
     */
    public TimePeriodABIEType createTimePeriodABIEType() {
        return new TimePeriodABIEType();
    }

    /**
     * Create an instance of {@link StateChangeBaseType }
     * 
     */
    public StateChangeBaseType createStateChangeBaseType() {
        return new StateChangeBaseType();
    }

    /**
     * Create an instance of {@link StateChangeExtensionType }
     * 
     */
    public StateChangeExtensionType createStateChangeExtensionType() {
        return new StateChangeExtensionType();
    }

    /**
     * Create an instance of {@link ChangeStatusExtensionType }
     * 
     */
    public ChangeStatusExtensionType createChangeStatusExtensionType() {
        return new ChangeStatusExtensionType();
    }

    /**
     * Create an instance of {@link BOMHeaderBaseType }
     * 
     */
    public BOMHeaderBaseType createBOMHeaderBaseType() {
        return new BOMHeaderBaseType();
    }

    /**
     * Create an instance of {@link StatusHeaderBaseType }
     * 
     */
    public StatusHeaderBaseType createStatusHeaderBaseType() {
        return new StatusHeaderBaseType();
    }

    /**
     * Create an instance of {@link DocumentIdentificationBaseType }
     * 
     */
    public DocumentIdentificationBaseType createDocumentIdentificationBaseType() {
        return new DocumentIdentificationBaseType();
    }

    /**
     * Create an instance of {@link StatusBaseType }
     * 
     */
    public StatusBaseType createStatusBaseType() {
        return new StatusBaseType();
    }

    /**
     * Create an instance of {@link StatusExtensionType }
     * 
     */
    public StatusExtensionType createStatusExtensionType() {
        return new StatusExtensionType();
    }

    /**
     * Create an instance of {@link DocumentReferenceExtensionType }
     * 
     */
    public DocumentReferenceExtensionType createDocumentReferenceExtensionType() {
        return new DocumentReferenceExtensionType();
    }

    /**
     * Create an instance of {@link AttachmentBaseType }
     * 
     */
    public AttachmentBaseType createAttachmentBaseType() {
        return new AttachmentBaseType();
    }

    /**
     * Create an instance of {@link BinaryObjectType290B4F }
     * 
     */
    public BinaryObjectType290B4F createBinaryObjectType290B4F() {
        return new BinaryObjectType290B4F();
    }

    /**
     * Create an instance of {@link AttachmentExtensionType }
     * 
     */
    public AttachmentExtensionType createAttachmentExtensionType() {
        return new AttachmentExtensionType();
    }

    /**
     * Create an instance of {@link EffectivityBaseType }
     * 
     */
    public EffectivityBaseType createEffectivityBaseType() {
        return new EffectivityBaseType();
    }

    /**
     * Create an instance of {@link PreferenceBaseType }
     * 
     */
    public PreferenceBaseType createPreferenceBaseType() {
        return new PreferenceBaseType();
    }

    /**
     * Create an instance of {@link PreferenceABIEType }
     * 
     */
    public PreferenceABIEType createPreferenceABIEType() {
        return new PreferenceABIEType();
    }

    /**
     * Create an instance of {@link PreferenceExtensionType }
     * 
     */
    public PreferenceExtensionType createPreferenceExtensionType() {
        return new PreferenceExtensionType();
    }

    /**
     * Create an instance of {@link EffectiveValueListBaseType }
     * 
     */
    public EffectiveValueListBaseType createEffectiveValueListBaseType() {
        return new EffectiveValueListBaseType();
    }

    /**
     * Create an instance of {@link EffectiveValueListExtensionType }
     * 
     */
    public EffectiveValueListExtensionType createEffectiveValueListExtensionType() {
        return new EffectiveValueListExtensionType();
    }

    /**
     * Create an instance of {@link RangeBaseType }
     * 
     */
    public RangeBaseType createRangeBaseType() {
        return new RangeBaseType();
    }

    /**
     * Create an instance of {@link RangeExtensionType }
     * 
     */
    public RangeExtensionType createRangeExtensionType() {
        return new RangeExtensionType();
    }

    /**
     * Create an instance of {@link EffectivityExtensionType }
     * 
     */
    public EffectivityExtensionType createEffectivityExtensionType() {
        return new EffectivityExtensionType();
    }

    /**
     * Create an instance of {@link ItemIdentificationBaseType }
     * 
     */
    public ItemIdentificationBaseType createItemIdentificationBaseType() {
        return new ItemIdentificationBaseType();
    }

    /**
     * Create an instance of {@link ItemIdentificationExtensionType }
     * 
     */
    public ItemIdentificationExtensionType createItemIdentificationExtensionType() {
        return new ItemIdentificationExtensionType();
    }

    /**
     * Create an instance of {@link ClassificationExtensionType }
     * 
     */
    public ClassificationExtensionType createClassificationExtensionType() {
        return new ClassificationExtensionType();
    }

    /**
     * Create an instance of {@link SpecificationBaseType }
     * 
     */
    public SpecificationBaseType createSpecificationBaseType() {
        return new SpecificationBaseType();
    }

    /**
     * Create an instance of {@link PropertyBaseType }
     * 
     */
    public PropertyBaseType createPropertyBaseType() {
        return new PropertyBaseType();
    }

    /**
     * Create an instance of {@link PropertyExtensionType }
     * 
     */
    public PropertyExtensionType createPropertyExtensionType() {
        return new PropertyExtensionType();
    }

    /**
     * Create an instance of {@link SpecificationExtensionType }
     * 
     */
    public SpecificationExtensionType createSpecificationExtensionType() {
        return new SpecificationExtensionType();
    }

    /**
     * Create an instance of {@link HazardousMaterialBaseType }
     * 
     */
    public HazardousMaterialBaseType createHazardousMaterialBaseType() {
        return new HazardousMaterialBaseType();
    }

    /**
     * Create an instance of {@link HazardousMaterialABIEType }
     * 
     */
    public HazardousMaterialABIEType createHazardousMaterialABIEType() {
        return new HazardousMaterialABIEType();
    }

    /**
     * Create an instance of {@link ContactBaseType }
     * 
     */
    public ContactBaseType createContactBaseType() {
        return new ContactBaseType();
    }

    /**
     * Create an instance of {@link PersonNameBaseType }
     * 
     */
    public PersonNameBaseType createPersonNameBaseType() {
        return new PersonNameBaseType();
    }

    /**
     * Create an instance of {@link UsageBaseType }
     * 
     */
    public UsageBaseType createUsageBaseType() {
        return new UsageBaseType();
    }

    /**
     * Create an instance of {@link FormattedAddressUseBaseType }
     * 
     */
    public FormattedAddressUseBaseType createFormattedAddressUseBaseType() {
        return new FormattedAddressUseBaseType();
    }

    /**
     * Create an instance of {@link FormattedAddressUseExtensionType }
     * 
     */
    public FormattedAddressUseExtensionType createFormattedAddressUseExtensionType() {
        return new FormattedAddressUseExtensionType();
    }

    /**
     * Create an instance of {@link UsageExtensionType }
     * 
     */
    public UsageExtensionType createUsageExtensionType() {
        return new UsageExtensionType();
    }

    /**
     * Create an instance of {@link PersonNameExtensionType }
     * 
     */
    public PersonNameExtensionType createPersonNameExtensionType() {
        return new PersonNameExtensionType();
    }

    /**
     * Create an instance of {@link CommunicationBaseType }
     * 
     */
    public CommunicationBaseType createCommunicationBaseType() {
        return new CommunicationBaseType();
    }

    /**
     * Create an instance of {@link CoordinateBaseType }
     * 
     */
    public CoordinateBaseType createCoordinateBaseType() {
        return new CoordinateBaseType();
    }

    /**
     * Create an instance of {@link CoordinateExtensionType }
     * 
     */
    public CoordinateExtensionType createCoordinateExtensionType() {
        return new CoordinateExtensionType();
    }

    /**
     * Create an instance of {@link AddressExtensionType }
     * 
     */
    public AddressExtensionType createAddressExtensionType() {
        return new AddressExtensionType();
    }

    /**
     * Create an instance of {@link CommunicationExtensionType }
     * 
     */
    public CommunicationExtensionType createCommunicationExtensionType() {
        return new CommunicationExtensionType();
    }

    /**
     * Create an instance of {@link TelephoneCommunicationBaseType }
     * 
     */
    public TelephoneCommunicationBaseType createTelephoneCommunicationBaseType() {
        return new TelephoneCommunicationBaseType();
    }

    /**
     * Create an instance of {@link TelephoneCommunicationExtensionType }
     * 
     */
    public TelephoneCommunicationExtensionType createTelephoneCommunicationExtensionType() {
        return new TelephoneCommunicationExtensionType();
    }

    /**
     * Create an instance of {@link EMailAddressCommunicationBaseType }
     * 
     */
    public EMailAddressCommunicationBaseType createEMailAddressCommunicationBaseType() {
        return new EMailAddressCommunicationBaseType();
    }

    /**
     * Create an instance of {@link EMailAddressCommunicationExtensionType }
     * 
     */
    public EMailAddressCommunicationExtensionType createEMailAddressCommunicationExtensionType() {
        return new EMailAddressCommunicationExtensionType();
    }

    /**
     * Create an instance of {@link ElectronicCommunicationBaseType }
     * 
     */
    public ElectronicCommunicationBaseType createElectronicCommunicationBaseType() {
        return new ElectronicCommunicationBaseType();
    }

    /**
     * Create an instance of {@link ElectronicCommunicationExtensionType }
     * 
     */
    public ElectronicCommunicationExtensionType createElectronicCommunicationExtensionType() {
        return new ElectronicCommunicationExtensionType();
    }

    /**
     * Create an instance of {@link ContactExtensionType }
     * 
     */
    public ContactExtensionType createContactExtensionType() {
        return new ContactExtensionType();
    }

    /**
     * Create an instance of {@link PartyIdentificationType }
     * 
     */
    public PartyIdentificationType createPartyIdentificationType() {
        return new PartyIdentificationType();
    }

    /**
     * Create an instance of {@link LocationBaseType }
     * 
     */
    public LocationBaseType createLocationBaseType() {
        return new LocationBaseType();
    }

    /**
     * Create an instance of {@link LocationABIEType }
     * 
     */
    public LocationABIEType createLocationABIEType() {
        return new LocationABIEType();
    }

    /**
     * Create an instance of {@link StorageLocationBaseType }
     * 
     */
    public StorageLocationBaseType createStorageLocationBaseType() {
        return new StorageLocationBaseType();
    }

    /**
     * Create an instance of {@link StorageLocationExtensionType }
     * 
     */
    public StorageLocationExtensionType createStorageLocationExtensionType() {
        return new StorageLocationExtensionType();
    }

    /**
     * Create an instance of {@link LocationExtensionType }
     * 
     */
    public LocationExtensionType createLocationExtensionType() {
        return new LocationExtensionType();
    }

    /**
     * Create an instance of {@link PartyExtensionType }
     * 
     */
    public PartyExtensionType createPartyExtensionType() {
        return new PartyExtensionType();
    }

    /**
     * Create an instance of {@link HazardousMaterialExtensionType }
     * 
     */
    public HazardousMaterialExtensionType createHazardousMaterialExtensionType() {
        return new HazardousMaterialExtensionType();
    }

    /**
     * Create an instance of {@link PackagingBaseType }
     * 
     */
    public PackagingBaseType createPackagingBaseType() {
        return new PackagingBaseType();
    }

    /**
     * Create an instance of {@link MaterialBaseType }
     * 
     */
    public MaterialBaseType createMaterialBaseType() {
        return new MaterialBaseType();
    }

    /**
     * Create an instance of {@link DimensionsBaseType }
     * 
     */
    public DimensionsBaseType createDimensionsBaseType() {
        return new DimensionsBaseType();
    }

    /**
     * Create an instance of {@link DimensionsABIEType }
     * 
     */
    public DimensionsABIEType createDimensionsABIEType() {
        return new DimensionsABIEType();
    }

    /**
     * Create an instance of {@link DimensionExtensionType }
     * 
     */
    public DimensionExtensionType createDimensionExtensionType() {
        return new DimensionExtensionType();
    }

    /**
     * Create an instance of {@link PackagingExtensionType }
     * 
     */
    public PackagingExtensionType createPackagingExtensionType() {
        return new PackagingExtensionType();
    }

    /**
     * Create an instance of {@link ExportControlBaseType }
     * 
     */
    public ExportControlBaseType createExportControlBaseType() {
        return new ExportControlBaseType();
    }

    /**
     * Create an instance of {@link ExportControlExtensionType }
     * 
     */
    public ExportControlExtensionType createExportControlExtensionType() {
        return new ExportControlExtensionType();
    }

    /**
     * Create an instance of {@link HarmonizedTariffBaseType }
     * 
     */
    public HarmonizedTariffBaseType createHarmonizedTariffBaseType() {
        return new HarmonizedTariffBaseType();
    }

    /**
     * Create an instance of {@link HarmonizedTariffExtensionType }
     * 
     */
    public HarmonizedTariffExtensionType createHarmonizedTariffExtensionType() {
        return new HarmonizedTariffExtensionType();
    }

    /**
     * Create an instance of {@link TrademarkBaseType }
     * 
     */
    public TrademarkBaseType createTrademarkBaseType() {
        return new TrademarkBaseType();
    }

    /**
     * Create an instance of {@link TrademarkExtensionType }
     * 
     */
    public TrademarkExtensionType createTrademarkExtensionType() {
        return new TrademarkExtensionType();
    }

    /**
     * Create an instance of {@link LotBaseType }
     * 
     */
    public LotBaseType createLotBaseType() {
        return new LotBaseType();
    }

    /**
     * Create an instance of {@link LotExtensionType }
     * 
     */
    public LotExtensionType createLotExtensionType() {
        return new LotExtensionType();
    }

    /**
     * Create an instance of {@link ItemExtensionType }
     * 
     */
    public ItemExtensionType createItemExtensionType() {
        return new ItemExtensionType();
    }

    /**
     * Create an instance of {@link BOMReferenceExtensionType }
     * 
     */
    public BOMReferenceExtensionType createBOMReferenceExtensionType() {
        return new BOMReferenceExtensionType();
    }

    /**
     * Create an instance of {@link RouteReferenceBaseType }
     * 
     */
    public RouteReferenceBaseType createRouteReferenceBaseType() {
        return new RouteReferenceBaseType();
    }

    /**
     * Create an instance of {@link ProductionOrderReferenceBaseType }
     * 
     */
    public ProductionOrderReferenceBaseType createProductionOrderReferenceBaseType() {
        return new ProductionOrderReferenceBaseType();
    }

    /**
     * Create an instance of {@link FacilityBaseType }
     * 
     */
    public FacilityBaseType createFacilityBaseType() {
        return new FacilityBaseType();
    }

    /**
     * Create an instance of {@link FacilityExtensionType }
     * 
     */
    public FacilityExtensionType createFacilityExtensionType() {
        return new FacilityExtensionType();
    }

    /**
     * Create an instance of {@link SerialLotBaseType }
     * 
     */
    public SerialLotBaseType createSerialLotBaseType() {
        return new SerialLotBaseType();
    }

    /**
     * Create an instance of {@link SerialLotExtensionType }
     * 
     */
    public SerialLotExtensionType createSerialLotExtensionType() {
        return new SerialLotExtensionType();
    }

    /**
     * Create an instance of {@link ProductionOrderReferenceExtensionType }
     * 
     */
    public ProductionOrderReferenceExtensionType createProductionOrderReferenceExtensionType() {
        return new ProductionOrderReferenceExtensionType();
    }

    /**
     * Create an instance of {@link OperationReferenceBaseType }
     * 
     */
    public OperationReferenceBaseType createOperationReferenceBaseType() {
        return new OperationReferenceBaseType();
    }

    /**
     * Create an instance of {@link OperationReferenceExtensionType }
     * 
     */
    public OperationReferenceExtensionType createOperationReferenceExtensionType() {
        return new OperationReferenceExtensionType();
    }

    /**
     * Create an instance of {@link RouteReferenceExtensionType }
     * 
     */
    public RouteReferenceExtensionType createRouteReferenceExtensionType() {
        return new RouteReferenceExtensionType();
    }

    /**
     * Create an instance of {@link BOMHeaderExtensionType }
     * 
     */
    public BOMHeaderExtensionType createBOMHeaderExtensionType() {
        return new BOMHeaderExtensionType();
    }

    /**
     * Create an instance of {@link BOMItemDataBaseType }
     * 
     */
    public BOMItemDataBaseType createBOMItemDataBaseType() {
        return new BOMItemDataBaseType();
    }

    /**
     * Create an instance of {@link ManufacturingItemBaseType }
     * 
     */
    public ManufacturingItemBaseType createManufacturingItemBaseType() {
        return new ManufacturingItemBaseType();
    }

    /**
     * Create an instance of {@link ItemInstanceBaseType }
     * 
     */
    public ItemInstanceBaseType createItemInstanceBaseType() {
        return new ItemInstanceBaseType();
    }

    /**
     * Create an instance of {@link ItemInstanceIdentificationBaseType }
     * 
     */
    public ItemInstanceIdentificationBaseType createItemInstanceIdentificationBaseType() {
        return new ItemInstanceIdentificationBaseType();
    }

    /**
     * Create an instance of {@link ItemInstanceIdentificationExtensionType }
     * 
     */
    public ItemInstanceIdentificationExtensionType createItemInstanceIdentificationExtensionType() {
        return new ItemInstanceIdentificationExtensionType();
    }

    /**
     * Create an instance of {@link BOMItemDataExtensionType }
     * 
     */
    public BOMItemDataExtensionType createBOMItemDataExtensionType() {
        return new BOMItemDataExtensionType();
    }

    /**
     * Create an instance of {@link BOMOptionBaseType }
     * 
     */
    public BOMOptionBaseType createBOMOptionBaseType() {
        return new BOMOptionBaseType();
    }

    /**
     * Create an instance of {@link BOMOptionExtensionType }
     * 
     */
    public BOMOptionExtensionType createBOMOptionExtensionType() {
        return new BOMOptionExtensionType();
    }

    /**
     * Create an instance of {@link BOMOptionClassBaseType }
     * 
     */
    public BOMOptionClassBaseType createBOMOptionClassBaseType() {
        return new BOMOptionClassBaseType();
    }

    /**
     * Create an instance of {@link BOMOptionClassExtensionType }
     * 
     */
    public BOMOptionClassExtensionType createBOMOptionClassExtensionType() {
        return new BOMOptionClassExtensionType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncBOMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "SyncBOM")
    public JAXBElement<SyncBOMType> createSyncBOM(SyncBOMType value) {
        return new JAXBElement<SyncBOMType>(_SyncBOM_QNAME, SyncBOMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationAreaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "ApplicationArea")
    public JAXBElement<ApplicationAreaType> createApplicationArea(ApplicationAreaType value) {
        return new JAXBElement<ApplicationAreaType>(_ApplicationArea_QNAME, ApplicationAreaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SenderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Sender")
    public JAXBElement<SenderType> createSender(SenderType value) {
        return new JAXBElement<SenderType>(_Sender_QNAME, SenderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "LogicalID")
    public JAXBElement<IDType> createLogicalID(IDType value) {
        return new JAXBElement<IDType>(_LogicalID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "ComponentID")
    public JAXBElement<IDType> createComponentID(IDType value) {
        return new JAXBElement<IDType>(_ComponentID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "TaskID")
    public JAXBElement<IDType> createTaskID(IDType value) {
        return new JAXBElement<IDType>(_TaskID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "ReferenceID")
    public JAXBElement<IDType> createReferenceID(IDType value) {
        return new JAXBElement<IDType>(_ReferenceID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmationCodesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "ConfirmationCodes")
    public JAXBElement<ConfirmationCodesType> createConfirmationCodes(ConfirmationCodesType value) {
        return new JAXBElement<ConfirmationCodesType>(_ConfirmationCodes_QNAME, ConfirmationCodesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "ProcessingConfirmationCode")
    public JAXBElement<CodeType> createProcessingConfirmationCode(CodeType value) {
        return new JAXBElement<CodeType>(_ProcessingConfirmationCode_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmationCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "ConfirmationCode")
    public JAXBElement<ConfirmationCodeType> createConfirmationCode(ConfirmationCodeType value) {
        return new JAXBElement<ConfirmationCodeType>(_ConfirmationCode_QNAME, ConfirmationCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "AuthorizationID")
    public JAXBElement<IDType> createAuthorizationID(IDType value) {
        return new JAXBElement<IDType>(_AuthorizationID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "ID")
    public JAXBElement<OpenIDType> createID(OpenIDType value) {
        return new JAXBElement<OpenIDType>(_ID_QNAME, OpenIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntermediaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Intermediary")
    public JAXBElement<IntermediaryType> createIntermediary(IntermediaryType value) {
        return new JAXBElement<IntermediaryType>(_Intermediary_QNAME, IntermediaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "ReceivedDateTime")
    public JAXBElement<String> createReceivedDateTime(String value) {
        return new JAXBElement<String>(_ReceivedDateTime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "SentDateTime")
    public JAXBElement<String> createSentDateTime(String value) {
        return new JAXBElement<String>(_SentDateTime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiverType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Receiver")
    public JAXBElement<ReceiverType> createReceiver(ReceiverType value) {
        return new JAXBElement<ReceiverType>(_Receiver_QNAME, ReceiverType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "CreationDateTime")
    public JAXBElement<String> createCreationDateTime(String value) {
        return new JAXBElement<String>(_CreationDateTime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Signature")
    public JAXBElement<SignatureType> createSignature(SignatureType value) {
        return new JAXBElement<SignatureType>(_Signature_QNAME, SignatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "BODID")
    public JAXBElement<IDType> createBODID(IDType value) {
        return new JAXBElement<IDType>(_BODID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Sync")
    public JAXBElement<SyncType> createSync(SyncType value) {
        return new JAXBElement<SyncType>(_Sync_QNAME, SyncType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActionCriteriaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "ActionCriteria")
    public JAXBElement<ActionCriteriaType> createActionCriteria(ActionCriteriaType value) {
        return new JAXBElement<ActionCriteriaType>(_ActionCriteria_QNAME, ActionCriteriaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActionExpressionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "ActionExpression")
    public JAXBElement<ActionExpressionType> createActionExpression(ActionExpressionType value) {
        return new JAXBElement<ActionExpressionType>(_ActionExpression_QNAME, ActionExpressionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "ChangeStatus")
    public JAXBElement<ChangeStatusType> createChangeStatus(ChangeStatusType value) {
        return new JAXBElement<ChangeStatusType>(_ChangeStatus_QNAME, ChangeStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "IDSet")
    public JAXBElement<IDSetType> createIDSet(IDSetType value) {
        return new JAXBElement<IDSetType>(_IDSet_QNAME, IDSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Code")
    public JAXBElement<OpenCodeType> createCode(OpenCodeType value) {
        return new JAXBElement<OpenCodeType>(_Code_QNAME, OpenCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescriptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Description")
    public JAXBElement<DescriptionType> createDescription(DescriptionType value) {
        return new JAXBElement<DescriptionType>(_Description_QNAME, DescriptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "ReasonCode")
    public JAXBElement<CodeType> createReasonCode(CodeType value) {
        return new JAXBElement<CodeType>(_ReasonCode_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SequencedTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Reason")
    public JAXBElement<SequencedTextType> createReason(SequencedTextType value) {
        return new JAXBElement<SequencedTextType>(_Reason_QNAME, SequencedTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimePeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "EffectiveTimePeriod")
    public JAXBElement<TimePeriodType> createEffectiveTimePeriod(TimePeriodType value) {
        return new JAXBElement<TimePeriodType>(_EffectiveTimePeriod_QNAME, TimePeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "InclusiveIndicator")
    public JAXBElement<Boolean> createInclusiveIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_InclusiveIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "StartDateTime")
    public JAXBElement<String> createStartDateTime(String value) {
        return new JAXBElement<String>(_StartDateTime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "StartTime")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStartTime(String value) {
        return new JAXBElement<String>(_StartTime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Duration")
    public JAXBElement<String> createDuration(String value) {
        return new JAXBElement<String>(_Duration_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "EndDateTime")
    public JAXBElement<String> createEndDateTime(String value) {
        return new JAXBElement<String>(_EndDateTime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "EndTime")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEndTime(String value) {
        return new JAXBElement<String>(_EndTime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateChangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "StateChange")
    public JAXBElement<StateChangeType> createStateChange(StateChangeType value) {
        return new JAXBElement<StateChangeType>(_StateChange_QNAME, StateChangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "FromStateCode")
    public JAXBElement<StateCodeType> createFromStateCode(StateCodeType value) {
        return new JAXBElement<StateCodeType>(_FromStateCode_QNAME, StateCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "ToStateCode")
    public JAXBElement<StateCodeType> createToStateCode(StateCodeType value) {
        return new JAXBElement<StateCodeType>(_ToStateCode_QNAME, StateCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "ChangeDateTime")
    public JAXBElement<String> createChangeDateTime(String value) {
        return new JAXBElement<String>(_ChangeDateTime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Note")
    public JAXBElement<NoteType> createNote(NoteType value) {
        return new JAXBElement<NoteType>(_Note_QNAME, NoteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BOMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "BOM")
    public JAXBElement<BOMType> createBOM(BOMType value) {
        return new JAXBElement<BOMType>(_BOM_QNAME, BOMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BOMHeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "BOMHeader")
    public JAXBElement<BOMHeaderType> createBOMHeader(BOMHeaderType value) {
        return new JAXBElement<BOMHeaderType>(_BOMHeader_QNAME, BOMHeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "RevisionID")
    public JAXBElement<IDType> createRevisionID(IDType value) {
        return new JAXBElement<IDType>(_RevisionID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "VariationID")
    public JAXBElement<IDType> createVariationID(IDType value) {
        return new JAXBElement<IDType>(_VariationID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "DocumentIDSet")
    public JAXBElement<IDSetType> createDocumentIDSet(IDSetType value) {
        return new JAXBElement<IDSetType>(_DocumentIDSet_QNAME, IDSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "LastModificationDateTime")
    public JAXBElement<String> createLastModificationDateTime(String value) {
        return new JAXBElement<String>(_LastModificationDateTime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "DocumentDateTime")
    public JAXBElement<String> createDocumentDateTime(String value) {
        return new JAXBElement<String>(_DocumentDateTime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "DocumentReference")
    public JAXBElement<DocumentReferenceType> createDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_DocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Status")
    public JAXBElement<StatusType> createStatus(StatusType value) {
        return new JAXBElement<StatusType>(_Status_QNAME, StatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "LineNumberID")
    public JAXBElement<OpenIDType> createLineNumberID(OpenIDType value) {
        return new JAXBElement<OpenIDType>(_LineNumberID_QNAME, OpenIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "LineIDSet")
    public JAXBElement<IDSetType> createLineIDSet(IDSetType value) {
        return new JAXBElement<IDSetType>(_LineIDSet_QNAME, IDSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttachmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Attachment")
    public JAXBElement<AttachmentType> createAttachment(AttachmentType value) {
        return new JAXBElement<AttachmentType>(_Attachment_QNAME, AttachmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinaryObjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "EmbeddedDataBinaryObject")
    public JAXBElement<BinaryObjectType> createEmbeddedDataBinaryObject(BinaryObjectType value) {
        return new JAXBElement<BinaryObjectType>(_EmbeddedDataBinaryObject_QNAME, BinaryObjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "URI")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createURI(String value) {
        return new JAXBElement<String>(_URI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "ISBN")
    public JAXBElement<IDType> createISBN(IDType value) {
        return new JAXBElement<IDType>(_ISBN_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "FileName")
    public JAXBElement<NameType> createFileName(NameType value) {
        return new JAXBElement<NameType>(_FileName_QNAME, NameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "FileTypeCode")
    public JAXBElement<CodeType> createFileTypeCode(CodeType value) {
        return new JAXBElement<CodeType>(_FileTypeCode_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuantityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "FileSizeQuantity")
    public JAXBElement<QuantityType> createFileSizeQuantity(QuantityType value) {
        return new JAXBElement<QuantityType>(_FileSizeQuantity_QNAME, QuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Title")
    public JAXBElement<TextType> createTitle(TextType value) {
        return new JAXBElement<TextType>(_Title_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BOMReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "AlternateBOMReference")
    public JAXBElement<BOMReferenceType> createAlternateBOMReference(BOMReferenceType value) {
        return new JAXBElement<BOMReferenceType>(_AlternateBOMReference_QNAME, BOMReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EffectivityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Effectivity")
    public JAXBElement<EffectivityType> createEffectivity(EffectivityType value) {
        return new JAXBElement<EffectivityType>(_Effectivity_QNAME, EffectivityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Name")
    public JAXBElement<OpenNameType> createName(OpenNameType value) {
        return new JAXBElement<OpenNameType>(_Name_QNAME, OpenNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Preference")
    public JAXBElement<PreferenceType> createPreference(PreferenceType value) {
        return new JAXBElement<PreferenceType>(_Preference_QNAME, PreferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "PrioritySequenceValue")
    public JAXBElement<BigInteger> createPrioritySequenceValue(BigInteger value) {
        return new JAXBElement<BigInteger>(_PrioritySequenceValue_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimePeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "AvailableTimePeriod")
    public JAXBElement<TimePeriodType> createAvailableTimePeriod(TimePeriodType value) {
        return new JAXBElement<TimePeriodType>(_AvailableTimePeriod_QNAME, TimePeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimePeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "UnavailableTimePeriod")
    public JAXBElement<TimePeriodType> createUnavailableTimePeriod(TimePeriodType value) {
        return new JAXBElement<TimePeriodType>(_UnavailableTimePeriod_QNAME, TimePeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EffectiveValueListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "EffectiveValueList")
    public JAXBElement<EffectiveValueListType> createEffectiveValueList(EffectiveValueListType value) {
        return new JAXBElement<EffectiveValueListType>(_EffectiveValueList_QNAME, EffectiveValueListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "EffectiveRange")
    public JAXBElement<RangeType> createEffectiveRange(RangeType value) {
        return new JAXBElement<RangeType>(_EffectiveRange_QNAME, RangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "StartID")
    public JAXBElement<IDType> createStartID(IDType value) {
        return new JAXBElement<IDType>(_StartID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "RangeCountNumber")
    public JAXBElement<BigInteger> createRangeCountNumber(BigInteger value) {
        return new JAXBElement<BigInteger>(_RangeCountNumber_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "EndID")
    public JAXBElement<IDType> createEndID(IDType value) {
        return new JAXBElement<IDType>(_EndID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Item")
    public JAXBElement<ItemType> createItem(ItemType value) {
        return new JAXBElement<ItemType>(_Item_QNAME, ItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "ItemIDSet")
    public JAXBElement<IDSetType> createItemIDSet(IDSetType value) {
        return new JAXBElement<IDSetType>(_ItemIDSet_QNAME, IDSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemIdentificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "CustomerItemIdentification")
    public JAXBElement<ItemIdentificationType> createCustomerItemIdentification(ItemIdentificationType value) {
        return new JAXBElement<ItemIdentificationType>(_CustomerItemIdentification_QNAME, ItemIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemIdentificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "ManufacturerItemIdentification")
    public JAXBElement<ItemIdentificationType> createManufacturerItemIdentification(ItemIdentificationType value) {
        return new JAXBElement<ItemIdentificationType>(_ManufacturerItemIdentification_QNAME, ItemIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemIdentificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "SupplierItemIdentification")
    public JAXBElement<ItemIdentificationType> createSupplierItemIdentification(ItemIdentificationType value) {
        return new JAXBElement<ItemIdentificationType>(_SupplierItemIdentification_QNAME, ItemIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "UPCID")
    public JAXBElement<IDType> createUPCID(IDType value) {
        return new JAXBElement<IDType>(_UPCID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "EPCID")
    public JAXBElement<IDType> createEPCID(IDType value) {
        return new JAXBElement<IDType>(_EPCID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "GTINID")
    public JAXBElement<IDType> createGTINID(IDType value) {
        return new JAXBElement<IDType>(_GTINID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Classification")
    public JAXBElement<ClassificationType> createClassification(ClassificationType value) {
        return new JAXBElement<ClassificationType>(_Classification_QNAME, ClassificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "UNSPSCCode")
    public JAXBElement<CodeType> createUNSPSCCode(CodeType value) {
        return new JAXBElement<CodeType>(_UNSPSCCode_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Codes")
    public JAXBElement<CodesType> createCodes(CodesType value) {
        return new JAXBElement<CodesType>(_Codes_QNAME, CodesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Specification")
    public JAXBElement<SpecificationType> createSpecification(SpecificationType value) {
        return new JAXBElement<SpecificationType>(_Specification_QNAME, SpecificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Property")
    public JAXBElement<PropertyType> createProperty(PropertyType value) {
        return new JAXBElement<PropertyType>(_Property_QNAME, PropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "ParentID")
    public JAXBElement<IDType> createParentID(IDType value) {
        return new JAXBElement<IDType>(_ParentID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameValuePairType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "NameValue")
    public JAXBElement<NameValuePairType> createNameValue(NameValuePairType value) {
        return new JAXBElement<NameValuePairType>(_NameValue_QNAME, NameValuePairType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Key")
    public JAXBElement<TextType> createKey(TextType value) {
        return new JAXBElement<TextType>(_Key_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HazardousMaterialType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "HazardousMaterial")
    public JAXBElement<HazardousMaterialType> createHazardousMaterial(HazardousMaterialType value) {
        return new JAXBElement<HazardousMaterialType>(_HazardousMaterial_QNAME, HazardousMaterialType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "MFAGID")
    public JAXBElement<IDType> createMFAGID(IDType value) {
        return new JAXBElement<IDType>(_MFAGID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "TechnicalName")
    public JAXBElement<NameType> createTechnicalName(NameType value) {
        return new JAXBElement<NameType>(_TechnicalName_QNAME, NameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "PlacardEndorsement")
    public JAXBElement<TextType> createPlacardEndorsement(TextType value) {
        return new JAXBElement<TextType>(_PlacardEndorsement_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "PlacardNotation")
    public JAXBElement<TextType> createPlacardNotation(TextType value) {
        return new JAXBElement<TextType>(_PlacardNotation_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "MarinePollutionLevelCode")
    public JAXBElement<CodeType> createMarinePollutionLevelCode(CodeType value) {
        return new JAXBElement<CodeType>(_MarinePollutionLevelCode_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "ToxicityZoneCode")
    public JAXBElement<CodeType> createToxicityZoneCode(CodeType value) {
        return new JAXBElement<CodeType>(_ToxicityZoneCode_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenMeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Temperature")
    public JAXBElement<OpenMeasureType> createTemperature(OpenMeasureType value) {
        return new JAXBElement<OpenMeasureType>(_Temperature_QNAME, OpenMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemperatureMeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "FlashpointTemperature")
    public JAXBElement<TemperatureMeasureType> createFlashpointTemperature(TemperatureMeasureType value) {
        return new JAXBElement<TemperatureMeasureType>(_FlashpointTemperature_QNAME, TemperatureMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "PrimaryEntryRoute")
    public JAXBElement<TextType> createPrimaryEntryRoute(TextType value) {
        return new JAXBElement<TextType>(_PrimaryEntryRoute_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "EmergencyContact")
    public JAXBElement<ContactType> createEmergencyContact(ContactType value) {
        return new JAXBElement<ContactType>(_EmergencyContact_QNAME, ContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "PersonName")
    public JAXBElement<PersonNameType> createPersonName(PersonNameType value) {
        return new JAXBElement<PersonNameType>(_PersonName_QNAME, PersonNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "FormattedName")
    public JAXBElement<NameType> createFormattedName(NameType value) {
        return new JAXBElement<NameType>(_FormattedName_QNAME, NameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "PreferredName")
    public JAXBElement<NameType> createPreferredName(NameType value) {
        return new JAXBElement<NameType>(_PreferredName_QNAME, NameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "GivenName")
    public JAXBElement<NameType> createGivenName(NameType value) {
        return new JAXBElement<NameType>(_GivenName_QNAME, NameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "MiddleName")
    public JAXBElement<NameType> createMiddleName(NameType value) {
        return new JAXBElement<NameType>(_MiddleName_QNAME, NameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "FamilyName")
    public JAXBElement<NameType> createFamilyName(NameType value) {
        return new JAXBElement<NameType>(_FamilyName_QNAME, NameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "TitleAffixCode")
    public JAXBElement<CodeType> createTitleAffixCode(CodeType value) {
        return new JAXBElement<CodeType>(_TitleAffixCode_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "PreferredSalutationCode")
    public JAXBElement<CodeType> createPreferredSalutationCode(CodeType value) {
        return new JAXBElement<CodeType>(_PreferredSalutationCode_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "GenerationAffixCode")
    public JAXBElement<CodeType> createGenerationAffixCode(CodeType value) {
        return new JAXBElement<CodeType>(_GenerationAffixCode_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "QualificationAffixCode")
    public JAXBElement<CodeType> createQualificationAffixCode(CodeType value) {
        return new JAXBElement<CodeType>(_QualificationAffixCode_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Initials")
    public JAXBElement<TextType> createInitials(TextType value) {
        return new JAXBElement<TextType>(_Initials_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Usage")
    public JAXBElement<UsageType> createUsage(UsageType value) {
        return new JAXBElement<UsageType>(_Usage_QNAME, UsageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "GeographicalRegionCode")
    public JAXBElement<CodeType> createGeographicalRegionCode(CodeType value) {
        return new JAXBElement<CodeType>(_GeographicalRegionCode_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "LegalIndicator")
    public JAXBElement<Boolean> createLegalIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_LegalIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormattedAddressUseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "FormattedAddressUse")
    public JAXBElement<FormattedAddressUseType> createFormattedAddressUse(FormattedAddressUseType value) {
        return new JAXBElement<FormattedAddressUseType>(_FormattedAddressUse_QNAME, FormattedAddressUseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SequencedTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "AddressLine")
    public JAXBElement<SequencedTextType> createAddressLine(SequencedTextType value) {
        return new JAXBElement<SequencedTextType>(_AddressLine_QNAME, SequencedTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "RoleCode")
    public JAXBElement<CodeType> createRoleCode(CodeType value) {
        return new JAXBElement<CodeType>(_RoleCode_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "JobTitle")
    public JAXBElement<TextType> createJobTitle(TextType value) {
        return new JAXBElement<TextType>(_JobTitle_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Responsibility")
    public JAXBElement<TextType> createResponsibility(TextType value) {
        return new JAXBElement<TextType>(_Responsibility_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommunicationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Communication")
    public JAXBElement<CommunicationType> createCommunication(CommunicationType value) {
        return new JAXBElement<CommunicationType>(_Communication_QNAME, CommunicationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "ChannelCode")
    public JAXBElement<CodeType> createChannelCode(CodeType value) {
        return new JAXBElement<CodeType>(_ChannelCode_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "UseCode")
    public JAXBElement<CodeType> createUseCode(CodeType value) {
        return new JAXBElement<CodeType>(_UseCode_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "CountryDialingCode")
    public JAXBElement<CodeType> createCountryDialingCode(CodeType value) {
        return new JAXBElement<CodeType>(_CountryDialingCode_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "AreaDialingCode")
    public JAXBElement<CodeType> createAreaDialingCode(CodeType value) {
        return new JAXBElement<CodeType>(_AreaDialingCode_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "DialNumber")
    public JAXBElement<TextType> createDialNumber(TextType value) {
        return new JAXBElement<TextType>(_DialNumber_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "PhoneExtension")
    public JAXBElement<TextType> createPhoneExtension(TextType value) {
        return new JAXBElement<TextType>(_PhoneExtension_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Access")
    public JAXBElement<TextType> createAccess(TextType value) {
        return new JAXBElement<TextType>(_Access_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Address")
    public JAXBElement<AddressType> createAddress(AddressType value) {
        return new JAXBElement<AddressType>(_Address_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "AttentionOfName")
    public JAXBElement<NameType> createAttentionOfName(NameType value) {
        return new JAXBElement<NameType>(_AttentionOfName_QNAME, NameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "CareOfName")
    public JAXBElement<NameType> createCareOfName(NameType value) {
        return new JAXBElement<NameType>(_CareOfName_QNAME, NameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "BuildingNumber")
    public JAXBElement<TextType> createBuildingNumber(TextType value) {
        return new JAXBElement<TextType>(_BuildingNumber_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "BuildingName")
    public JAXBElement<NameType> createBuildingName(NameType value) {
        return new JAXBElement<NameType>(_BuildingName_QNAME, NameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "BlockName")
    public JAXBElement<NameType> createBlockName(NameType value) {
        return new JAXBElement<NameType>(_BlockName_QNAME, NameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "StreetName")
    public JAXBElement<NameType> createStreetName(NameType value) {
        return new JAXBElement<NameType>(_StreetName_QNAME, NameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "StreetTypeCode")
    public JAXBElement<CodeType> createStreetTypeCode(CodeType value) {
        return new JAXBElement<CodeType>(_StreetTypeCode_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Floor")
    public JAXBElement<TextType> createFloor(TextType value) {
        return new JAXBElement<TextType>(_Floor_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Unit")
    public JAXBElement<TextType> createUnit(TextType value) {
        return new JAXBElement<TextType>(_Unit_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "StairCase")
    public JAXBElement<TextType> createStairCase(TextType value) {
        return new JAXBElement<TextType>(_StairCase_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "PostOfficeBox")
    public JAXBElement<TextType> createPostOfficeBox(TextType value) {
        return new JAXBElement<TextType>(_PostOfficeBox_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "DeliveryPointID")
    public JAXBElement<IDType> createDeliveryPointID(IDType value) {
        return new JAXBElement<IDType>(_DeliveryPointID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "PlotID")
    public JAXBElement<IDType> createPlotID(IDType value) {
        return new JAXBElement<IDType>(_PlotID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "CityName")
    public JAXBElement<NameType> createCityName(NameType value) {
        return new JAXBElement<NameType>(_CityName_QNAME, NameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "CitySubDivisionName")
    public JAXBElement<OpenNameType> createCitySubDivisionName(OpenNameType value) {
        return new JAXBElement<OpenNameType>(_CitySubDivisionName_QNAME, OpenNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountrySubDivisionCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "CountrySubDivisionCode")
    public JAXBElement<CountrySubDivisionCodeType> createCountrySubDivisionCode(CountrySubDivisionCodeType value) {
        return new JAXBElement<CountrySubDivisionCodeType>(_CountrySubDivisionCode_QNAME, CountrySubDivisionCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "CountryCode")
    public JAXBElement<CountryCodeType> createCountryCode(CountryCodeType value) {
        return new JAXBElement<CountryCodeType>(_CountryCode_QNAME, CountryCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "PostalCode")
    public JAXBElement<CodeType> createPostalCode(CodeType value) {
        return new JAXBElement<CodeType>(_PostalCode_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoordinateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "GeographicalCoordinate")
    public JAXBElement<CoordinateType> createGeographicalCoordinate(CoordinateType value) {
        return new JAXBElement<CoordinateType>(_GeographicalCoordinate_QNAME, CoordinateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "ReferenceSystemID")
    public JAXBElement<OpenIDType> createReferenceSystemID(OpenIDType value) {
        return new JAXBElement<OpenIDType>(_ReferenceSystemID_QNAME, OpenIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "VerticalReferenceSystemID")
    public JAXBElement<OpenIDType> createVerticalReferenceSystemID(OpenIDType value) {
        return new JAXBElement<OpenIDType>(_VerticalReferenceSystemID_QNAME, OpenIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "VerticalMeasure")
    public JAXBElement<MeasureType> createVerticalMeasure(MeasureType value) {
        return new JAXBElement<MeasureType>(_VerticalMeasure_QNAME, MeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "LatitudeMeasure")
    public JAXBElement<MeasureType> createLatitudeMeasure(MeasureType value) {
        return new JAXBElement<MeasureType>(_LatitudeMeasure_QNAME, MeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "LongitudeMeasure")
    public JAXBElement<MeasureType> createLongitudeMeasure(MeasureType value) {
        return new JAXBElement<MeasureType>(_LongitudeMeasure_QNAME, MeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "VerticalAccuracyMeasure")
    public JAXBElement<MeasureType> createVerticalAccuracyMeasure(MeasureType value) {
        return new JAXBElement<MeasureType>(_VerticalAccuracyMeasure_QNAME, MeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "HorizontalAccuracyMeasure")
    public JAXBElement<MeasureType> createHorizontalAccuracyMeasure(MeasureType value) {
        return new JAXBElement<MeasureType>(_HorizontalAccuracyMeasure_QNAME, MeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "HTMLPreferredIndicator")
    public JAXBElement<Boolean> createHTMLPreferredIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_HTMLPreferredIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Text")
    public JAXBElement<OpenTextType> createText(OpenTextType value) {
        return new JAXBElement<OpenTextType>(_Text_QNAME, OpenTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelephoneCommunicationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "TelephoneCommunication")
    public JAXBElement<TelephoneCommunicationType> createTelephoneCommunication(TelephoneCommunicationType value) {
        return new JAXBElement<TelephoneCommunicationType>(_TelephoneCommunication_QNAME, TelephoneCommunicationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "FormattedNumber")
    public JAXBElement<OpenTextType> createFormattedNumber(OpenTextType value) {
        return new JAXBElement<OpenTextType>(_FormattedNumber_QNAME, OpenTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EMailAddressCommunicationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "EMailAddressCommunication")
    public JAXBElement<EMailAddressCommunicationType> createEMailAddressCommunication(EMailAddressCommunicationType value) {
        return new JAXBElement<EMailAddressCommunicationType>(_EMailAddressCommunication_QNAME, EMailAddressCommunicationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "EMailAddressID")
    public JAXBElement<IDType> createEMailAddressID(IDType value) {
        return new JAXBElement<IDType>(_EMailAddressID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectronicCommunicationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "InternetAddressCommunication")
    public JAXBElement<ElectronicCommunicationType> createInternetAddressCommunication(ElectronicCommunicationType value) {
        return new JAXBElement<ElectronicCommunicationType>(_InternetAddressCommunication_QNAME, ElectronicCommunicationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Party")
    public JAXBElement<PartyType> createParty(PartyType value) {
        return new JAXBElement<PartyType>(_Party_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "PartyIDSet")
    public JAXBElement<IDSetType> createPartyIDSet(IDSetType value) {
        return new JAXBElement<IDSetType>(_PartyIDSet_QNAME, IDSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "TaxIDSet")
    public JAXBElement<IDSetType> createTaxIDSet(IDSetType value) {
        return new JAXBElement<IDSetType>(_TaxIDSet_QNAME, IDSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "TaxID")
    public JAXBElement<IDType> createTaxID(IDType value) {
        return new JAXBElement<IDType>(_TaxID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "DUNSID")
    public JAXBElement<IDType> createDUNSID(IDType value) {
        return new JAXBElement<IDType>(_DUNSID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "CAGEID")
    public JAXBElement<IDType> createCAGEID(IDType value) {
        return new JAXBElement<IDType>(_CAGEID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "DODAACID")
    public JAXBElement<IDType> createDODAACID(IDType value) {
        return new JAXBElement<IDType>(_DODAACID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "BICID")
    public JAXBElement<IDType> createBICID(IDType value) {
        return new JAXBElement<IDType>(_BICID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "SCACID")
    public JAXBElement<IDType> createSCACID(IDType value) {
        return new JAXBElement<IDType>(_SCACID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "CCRID")
    public JAXBElement<IDType> createCCRID(IDType value) {
        return new JAXBElement<IDType>(_CCRID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "AccountID")
    public JAXBElement<IDType> createAccountID(IDType value) {
        return new JAXBElement<IDType>(_AccountID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Location")
    public JAXBElement<LocationType> createLocation(LocationType value) {
        return new JAXBElement<LocationType>(_Location_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Directions")
    public JAXBElement<TextType> createDirections(TextType value) {
        return new JAXBElement<TextType>(_Directions_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoordinateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Coordinate")
    public JAXBElement<CoordinateType> createCoordinate(CoordinateType value) {
        return new JAXBElement<CoordinateType>(_Coordinate_QNAME, CoordinateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Contact")
    public JAXBElement<ContactType> createContact(ContactType value) {
        return new JAXBElement<ContactType>(_Contact_QNAME, ContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "PostalAddress")
    public JAXBElement<AddressType> createPostalAddress(AddressType value) {
        return new JAXBElement<AddressType>(_PostalAddress_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "PhysicalAddress")
    public JAXBElement<AddressType> createPhysicalAddress(AddressType value) {
        return new JAXBElement<AddressType>(_PhysicalAddress_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Clm6TimeZoneCode1TimeZoneCodeContentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "TimeZoneCode")
    public JAXBElement<Clm6TimeZoneCode1TimeZoneCodeContentType> createTimeZoneCode(Clm6TimeZoneCode1TimeZoneCodeContentType value) {
        return new JAXBElement<Clm6TimeZoneCode1TimeZoneCodeContentType>(_TimeZoneCode_QNAME, Clm6TimeZoneCode1TimeZoneCodeContentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "LocationEquipmentSpecification")
    public JAXBElement<SpecificationType> createLocationEquipmentSpecification(SpecificationType value) {
        return new JAXBElement<SpecificationType>(_LocationEquipmentSpecification_QNAME, SpecificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StorageLocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "StorageLocation")
    public JAXBElement<StorageLocationType> createStorageLocation(StorageLocationType value) {
        return new JAXBElement<StorageLocationType>(_StorageLocation_QNAME, StorageLocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "MajorDivisionID")
    public JAXBElement<IDType> createMajorDivisionID(IDType value) {
        return new JAXBElement<IDType>(_MajorDivisionID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "MinorDivisionID")
    public JAXBElement<IDType> createMinorDivisionID(IDType value) {
        return new JAXBElement<IDType>(_MinorDivisionID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "AisleID")
    public JAXBElement<IDType> createAisleID(IDType value) {
        return new JAXBElement<IDType>(_AisleID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "RackID")
    public JAXBElement<IDType> createRackID(IDType value) {
        return new JAXBElement<IDType>(_RackID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "RackLevelID")
    public JAXBElement<IDType> createRackLevelID(IDType value) {
        return new JAXBElement<IDType>(_RackLevelID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "SubStorageLocationID")
    public JAXBElement<IDType> createSubStorageLocationID(IDType value) {
        return new JAXBElement<IDType>(_SubStorageLocationID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "ContainerID")
    public JAXBElement<IDType> createContainerID(IDType value) {
        return new JAXBElement<IDType>(_ContainerID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "RFID")
    public JAXBElement<IDType> createRFID(IDType value) {
        return new JAXBElement<IDType>(_RFID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "SealID")
    public JAXBElement<IDType> createSealID(IDType value) {
        return new JAXBElement<IDType>(_SealID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "InventoryPolicyCode")
    public JAXBElement<CodeType> createInventoryPolicyCode(CodeType value) {
        return new JAXBElement<CodeType>(_InventoryPolicyCode_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UOMCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "UOMCode")
    public JAXBElement<UOMCodeType> createUOMCode(UOMCodeType value) {
        return new JAXBElement<UOMCodeType>(_UOMCode_QNAME, UOMCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "HazardousClass")
    public JAXBElement<TextType> createHazardousClass(TextType value) {
        return new JAXBElement<TextType>(_HazardousClass_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "PackingGroup")
    public JAXBElement<TextType> createPackingGroup(TextType value) {
        return new JAXBElement<TextType>(_PackingGroup_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackagingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Packaging")
    public JAXBElement<PackagingType> createPackaging(PackagingType value) {
        return new JAXBElement<PackagingType>(_Packaging_QNAME, PackagingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DimensionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Dimensions")
    public JAXBElement<DimensionsType> createDimensions(DimensionsType value) {
        return new JAXBElement<DimensionsType>(_Dimensions_QNAME, DimensionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "WidthMeasure")
    public JAXBElement<MeasureType> createWidthMeasure(MeasureType value) {
        return new JAXBElement<MeasureType>(_WidthMeasure_QNAME, MeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "LengthMeasure")
    public JAXBElement<MeasureType> createLengthMeasure(MeasureType value) {
        return new JAXBElement<MeasureType>(_LengthMeasure_QNAME, MeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "HeightMeasure")
    public JAXBElement<MeasureType> createHeightMeasure(MeasureType value) {
        return new JAXBElement<MeasureType>(_HeightMeasure_QNAME, MeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenMeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Measure")
    public JAXBElement<OpenMeasureType> createMeasure(OpenMeasureType value) {
        return new JAXBElement<OpenMeasureType>(_Measure_QNAME, OpenMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "VolumeMeasure")
    public JAXBElement<MeasureType> createVolumeMeasure(MeasureType value) {
        return new JAXBElement<MeasureType>(_VolumeMeasure_QNAME, MeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "NetVolumeMeasure")
    public JAXBElement<MeasureType> createNetVolumeMeasure(MeasureType value) {
        return new JAXBElement<MeasureType>(_NetVolumeMeasure_QNAME, MeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "GrossVolumeMeasure")
    public JAXBElement<MeasureType> createGrossVolumeMeasure(MeasureType value) {
        return new JAXBElement<MeasureType>(_GrossVolumeMeasure_QNAME, MeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "DimensionRandomSizeIndicator")
    public JAXBElement<Boolean> createDimensionRandomSizeIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_DimensionRandomSizeIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SizeLimitRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "SizeLimitRange")
    public JAXBElement<SizeLimitRangeType> createSizeLimitRange(SizeLimitRangeType value) {
        return new JAXBElement<SizeLimitRangeType>(_SizeLimitRange_QNAME, SizeLimitRangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "UnderSizeMeasure")
    public JAXBElement<MeasureType> createUnderSizeMeasure(MeasureType value) {
        return new JAXBElement<MeasureType>(_UnderSizeMeasure_QNAME, MeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "OverSizeMeasure")
    public JAXBElement<MeasureType> createOverSizeMeasure(MeasureType value) {
        return new JAXBElement<MeasureType>(_OverSizeMeasure_QNAME, MeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WeightRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "WeightRange")
    public JAXBElement<WeightRangeType> createWeightRange(WeightRangeType value) {
        return new JAXBElement<WeightRangeType>(_WeightRange_QNAME, WeightRangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "MinimumWeightMeasure")
    public JAXBElement<MeasureType> createMinimumWeightMeasure(MeasureType value) {
        return new JAXBElement<MeasureType>(_MinimumWeightMeasure_QNAME, MeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "MaximumWeightMeasure")
    public JAXBElement<MeasureType> createMaximumWeightMeasure(MeasureType value) {
        return new JAXBElement<MeasureType>(_MaximumWeightMeasure_QNAME, MeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "NetWeightMeasure")
    public JAXBElement<MeasureType> createNetWeightMeasure(MeasureType value) {
        return new JAXBElement<MeasureType>(_NetWeightMeasure_QNAME, MeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "TareWeightMeasure")
    public JAXBElement<MeasureType> createTareWeightMeasure(MeasureType value) {
        return new JAXBElement<MeasureType>(_TareWeightMeasure_QNAME, MeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "GrossWeightMeasure")
    public JAXBElement<MeasureType> createGrossWeightMeasure(MeasureType value) {
        return new JAXBElement<MeasureType>(_GrossWeightMeasure_QNAME, MeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "UPCPackagingLevelCode")
    public JAXBElement<CodeType> createUPCPackagingLevelCode(CodeType value) {
        return new JAXBElement<CodeType>(_UPCPackagingLevelCode_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuantityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "PerPackageQuantity")
    public JAXBElement<QuantityType> createPerPackageQuantity(QuantityType value) {
        return new JAXBElement<QuantityType>(_PerPackageQuantity_QNAME, QuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuantityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "CapacityPerPackageQuantity")
    public JAXBElement<QuantityType> createCapacityPerPackageQuantity(QuantityType value) {
        return new JAXBElement<QuantityType>(_CapacityPerPackageQuantity_QNAME, QuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "OuterPackID")
    public JAXBElement<OpenIDType> createOuterPackID(OpenIDType value) {
        return new JAXBElement<OpenIDType>(_OuterPackID_QNAME, OpenIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "InnerPackID")
    public JAXBElement<OpenIDType> createInnerPackID(OpenIDType value) {
        return new JAXBElement<OpenIDType>(_InnerPackID_QNAME, OpenIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenQuantityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Quantity")
    public JAXBElement<OpenQuantityType> createQuantity(OpenQuantityType value) {
        return new JAXBElement<OpenQuantityType>(_Quantity_QNAME, OpenQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportControlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "ExportControl")
    public JAXBElement<ExportControlType> createExportControl(ExportControlType value) {
        return new JAXBElement<ExportControlType>(_ExportControl_QNAME, ExportControlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "RegionCode")
    public JAXBElement<CodeType> createRegionCode(CodeType value) {
        return new JAXBElement<CodeType>(_RegionCode_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "EncryptionStatusCode")
    public JAXBElement<CodeType> createEncryptionStatusCode(CodeType value) {
        return new JAXBElement<CodeType>(_EncryptionStatusCode_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HarmonizedTariffType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "HarmonizedTariff")
    public JAXBElement<HarmonizedTariffType> createHarmonizedTariff(HarmonizedTariffType value) {
        return new JAXBElement<HarmonizedTariffType>(_HarmonizedTariff_QNAME, HarmonizedTariffType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrademarkType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Trademark")
    public JAXBElement<TrademarkType> createTrademark(TrademarkType value) {
        return new JAXBElement<TrademarkType>(_Trademark_QNAME, TrademarkType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttachmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "MarkAttachment")
    public JAXBElement<AttachmentType> createMarkAttachment(AttachmentType value) {
        return new JAXBElement<AttachmentType>(_MarkAttachment_QNAME, AttachmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "MarkOwnerParty")
    public JAXBElement<PartyType> createMarkOwnerParty(PartyType value) {
        return new JAXBElement<PartyType>(_MarkOwnerParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EffectivityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "MarkEffectivity")
    public JAXBElement<EffectivityType> createMarkEffectivity(EffectivityType value) {
        return new JAXBElement<EffectivityType>(_MarkEffectivity_QNAME, EffectivityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "CountryOfOriginCode")
    public JAXBElement<CountryCodeType> createCountryOfOriginCode(CountryCodeType value) {
        return new JAXBElement<CountryCodeType>(_CountryOfOriginCode_QNAME, CountryCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "SerialNumberID")
    public JAXBElement<IDType> createSerialNumberID(IDType value) {
        return new JAXBElement<IDType>(_SerialNumberID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LotType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Lot")
    public JAXBElement<LotType> createLot(LotType value) {
        return new JAXBElement<LotType>(_Lot_QNAME, LotType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SequencedIDsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "LotIDs")
    public JAXBElement<SequencedIDsType> createLotIDs(SequencedIDsType value) {
        return new JAXBElement<SequencedIDsType>(_LotIDs_QNAME, SequencedIDsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Disposition")
    public JAXBElement<StatusType> createDisposition(StatusType value) {
        return new JAXBElement<StatusType>(_Disposition_QNAME, StatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "ManufacturingParty")
    public JAXBElement<PartyType> createManufacturingParty(PartyType value) {
        return new JAXBElement<PartyType>(_ManufacturingParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BOMReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "ParentBOMReference")
    public JAXBElement<BOMReferenceType> createParentBOMReference(BOMReferenceType value) {
        return new JAXBElement<BOMReferenceType>(_ParentBOMReference_QNAME, BOMReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BOMReferenceBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "ChildBOMReference")
    public JAXBElement<BOMReferenceBaseType> createChildBOMReference(BOMReferenceBaseType value) {
        return new JAXBElement<BOMReferenceBaseType>(_ChildBOMReference_QNAME, BOMReferenceBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "RouteReference")
    public JAXBElement<RouteReferenceType> createRouteReference(RouteReferenceType value) {
        return new JAXBElement<RouteReferenceType>(_RouteReference_QNAME, RouteReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductionOrderReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "ProductionOrderReference")
    public JAXBElement<ProductionOrderReferenceType> createProductionOrderReference(ProductionOrderReferenceType value) {
        return new JAXBElement<ProductionOrderReferenceType>(_ProductionOrderReference_QNAME, ProductionOrderReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemIdentificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "ItemIdentification")
    public JAXBElement<ItemIdentificationType> createItemIdentification(ItemIdentificationType value) {
        return new JAXBElement<ItemIdentificationType>(_ItemIdentification_QNAME, ItemIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "Facility")
    public JAXBElement<FacilityType> createFacility(FacilityType value) {
        return new JAXBElement<FacilityType>(_Facility_QNAME, FacilityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SerialLotType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "SerialLot")
    public JAXBElement<SerialLotType> createSerialLot(SerialLotType value) {
        return new JAXBElement<SerialLotType>(_SerialLot_QNAME, SerialLotType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuantityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "ItemQuantity")
    public JAXBElement<QuantityType> createItemQuantity(QuantityType value) {
        return new JAXBElement<QuantityType>(_ItemQuantity_QNAME, QuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "ParentSerialNumberID")
    public JAXBElement<IDType> createParentSerialNumberID(IDType value) {
        return new JAXBElement<IDType>(_ParentSerialNumberID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "OperationReference")
    public JAXBElement<OperationReferenceType> createOperationReference(OperationReferenceType value) {
        return new JAXBElement<OperationReferenceType>(_OperationReference_QNAME, OperationReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "GroupName")
    public JAXBElement<NameType> createGroupName(NameType value) {
        return new JAXBElement<NameType>(_GroupName_QNAME, NameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "SequenceCode")
    public JAXBElement<CodeType> createSequenceCode(CodeType value) {
        return new JAXBElement<CodeType>(_SequenceCode_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "StepID")
    public JAXBElement<IDType> createStepID(IDType value) {
        return new JAXBElement<IDType>(_StepID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "StepTypeCode")
    public JAXBElement<CodeType> createStepTypeCode(CodeType value) {
        return new JAXBElement<CodeType>(_StepTypeCode_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescriptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "UsageDescription")
    public JAXBElement<DescriptionType> createUsageDescription(DescriptionType value) {
        return new JAXBElement<DescriptionType>(_UsageDescription_QNAME, DescriptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "TrackingIndicator")
    public JAXBElement<Boolean> createTrackingIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_TrackingIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuantityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "BatchSizeQuantity")
    public JAXBElement<QuantityType> createBatchSizeQuantity(QuantityType value) {
        return new JAXBElement<QuantityType>(_BatchSizeQuantity_QNAME, QuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BOMItemDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "BOMItemData")
    public JAXBElement<BOMItemDataType> createBOMItemData(BOMItemDataType value) {
        return new JAXBElement<BOMItemDataType>(_BOMItemData_QNAME, BOMItemDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "UID")
    public JAXBElement<IDType> createUID(IDType value) {
        return new JAXBElement<IDType>(_UID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SequencedIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "ReferenceDesignatorID")
    public JAXBElement<SequencedIDType> createReferenceDesignatorID(SequencedIDType value) {
        return new JAXBElement<SequencedIDType>(_ReferenceDesignatorID_QNAME, SequencedIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "FindNumberID")
    public JAXBElement<IDType> createFindNumberID(IDType value) {
        return new JAXBElement<IDType>(_FindNumberID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimePeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "ExecutionTimePeriod")
    public JAXBElement<TimePeriodType> createExecutionTimePeriod(TimePeriodType value) {
        return new JAXBElement<TimePeriodType>(_ExecutionTimePeriod_QNAME, TimePeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "FixedQuantityIndicator")
    public JAXBElement<Boolean> createFixedQuantityIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_FixedQuantityIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuantityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "MaximumLotSizeQuantity")
    public JAXBElement<QuantityType> createMaximumLotSizeQuantity(QuantityType value) {
        return new JAXBElement<QuantityType>(_MaximumLotSizeQuantity_QNAME, QuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuantityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "MinimumLotSizeQuantity")
    public JAXBElement<QuantityType> createMinimumLotSizeQuantity(QuantityType value) {
        return new JAXBElement<QuantityType>(_MinimumLotSizeQuantity_QNAME, QuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "LotSizeMultiplerNumber")
    public JAXBElement<BigDecimal> createLotSizeMultiplerNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LotSizeMultiplerNumber_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "LeadTimeDuration")
    public JAXBElement<String> createLeadTimeDuration(String value) {
        return new JAXBElement<String>(_LeadTimeDuration_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "RequiredPercent")
    public JAXBElement<BigDecimal> createRequiredPercent(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RequiredPercent_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "BackFlushedIndicator")
    public JAXBElement<Boolean> createBackFlushedIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_BackFlushedIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "ActualIndicator")
    public JAXBElement<Boolean> createActualIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_ActualIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "ScrapIndicator")
    public JAXBElement<Boolean> createScrapIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_ScrapIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemInstanceIdentificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "ParentItemInstanceIdentification")
    public JAXBElement<ItemInstanceIdentificationType> createParentItemInstanceIdentification(ItemInstanceIdentificationType value) {
        return new JAXBElement<ItemInstanceIdentificationType>(_ParentItemInstanceIdentification_QNAME, ItemInstanceIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemInstanceIdentificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "ChildItemInstanceIdentification")
    public JAXBElement<ItemInstanceIdentificationType> createChildItemInstanceIdentification(ItemInstanceIdentificationType value) {
        return new JAXBElement<ItemInstanceIdentificationType>(_ChildItemInstanceIdentification_QNAME, ItemInstanceIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BOMOptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "BOMOption")
    public JAXBElement<BOMOptionType> createBOMOption(BOMOptionType value) {
        return new JAXBElement<BOMOptionType>(_BOMOption_QNAME, BOMOptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "DefaultIndicator")
    public JAXBElement<Boolean> createDefaultIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_DefaultIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "ExclusiveIndicator")
    public JAXBElement<Boolean> createExclusiveIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_ExclusiveIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BOMOptionClassType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "BOMOptionClass")
    public JAXBElement<BOMOptionClassType> createBOMOptionClass(BOMOptionClassType value) {
        return new JAXBElement<BOMOptionClassType>(_BOMOptionClass_QNAME, BOMOptionClassType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openapplications.org/oagis/10", name = "MandatoryIndicator")
    public JAXBElement<Boolean> createMandatoryIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_MandatoryIndicator_QNAME, Boolean.class, null, value);
    }

}
