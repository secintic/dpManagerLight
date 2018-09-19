package com.datapower.schemas.appliance.management._3;

import lombok.Data;
import lombok.ToString;

import javax.xml.bind.annotation.*;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="DeviceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="DeviceSerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="DeviceID" type="{http://www.datapower.com/schemas/appliance/management/3.0}device-id"/>
 *           &lt;element name="DeviceType" type="{http://www.datapower.com/schemas/appliance/management/3.0}device-type"/>
 *           &lt;element name="FirmwareVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="FailureDetected" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="CurrentAMPVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="ManagementInterface" type="{http://www.datapower.com/schemas/appliance/management/3.0}management-interface" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="SecureBackup" type="{http://www.datapower.com/schemas/appliance/management/3.0}secure-backup-state" minOccurs="0"/>
 *           &lt;element name="DeviceFeature" type="{http://www.datapower.com/schemas/appliance/management/3.0}device-feature" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="DeviceOperation" type="{http://www.datapower.com/schemas/appliance/management/3.0}device-operation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "deviceName",
        "deviceSerialNo",
        "deviceID",
        "deviceType",
        "firmwareVersion",
        "failureDetected",
        "currentAMPVersion",
        "managementInterface",
        "secureBackup",
        "deviceFeature",
        "deviceOperation"
})
@Data
@ToString
@XmlRootElement(name = "GetDeviceInfoResponse")
public class GetDeviceInfoResponse {

    @XmlElement(name = "DeviceName")
    protected String deviceName;
    @XmlElement(name = "DeviceSerialNo")
    protected String deviceSerialNo;
    @XmlElement(name = "DeviceID")
    protected String deviceID;
    @XmlElement(name = "DeviceType")
    @XmlSchemaType(name = "string")
    protected DeviceType deviceType;
    @XmlElement(name = "FirmwareVersion")
    protected String firmwareVersion;
    @XmlElement(name = "FailureDetected")
    protected Boolean failureDetected;
    @XmlElement(name = "CurrentAMPVersion")
    protected String currentAMPVersion;
    @XmlElement(name = "ManagementInterface")
    protected List<ManagementInterface> managementInterface;
    @XmlElement(name = "SecureBackup")
    @XmlSchemaType(name = "string")
    protected SecureBackupState secureBackup;
    @XmlElement(name = "DeviceFeature")
    @XmlSchemaType(name = "string")
    protected List<DeviceFeature> deviceFeature;
    @XmlElement(name = "DeviceOperation")
    @XmlSchemaType(name = "string")
    protected List<DeviceOperation> deviceOperation;
}
