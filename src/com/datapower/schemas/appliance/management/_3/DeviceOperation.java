package com.datapower.schemas.appliance.management._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for device-operation.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="device-operation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Ping"/>
 *     &lt;enumeration value="GetToken"/>
 *     &lt;enumeration value="Reboot"/>
 *     &lt;enumeration value="SetFirmware"/>
 *     &lt;enumeration value="Reinitialize"/>
 *     &lt;enumeration value="SecureBackup"/>
 *     &lt;enumeration value="SecureRestore"/>
 *     &lt;enumeration value="WhenDeviceLastChanged"/>
 *     &lt;enumeration value="Quiesce"/>
 *     &lt;enumeration value="Unquiesce"/>
 *     &lt;enumeration value="GetDeviceInfo"/>
 *     &lt;enumeration value="GetDeviceSettings"/>
 *     &lt;enumeration value="SetDeviceSettings"/>
 *     &lt;enumeration value="GetErrorReport"/>
 *     &lt;enumeration value="Subscribe"/>
 *     &lt;enumeration value="Unsubscribe"/>
 *     &lt;enumeration value="GetDomainList"/>
 *     &lt;enumeration value="GetDomainStatus"/>
 *     &lt;enumeration value="GetDomainExport"/>
 *     &lt;enumeration value="SetDomainExport"/>
 *     &lt;enumeration value="GetDomainConfig"/>
 *     &lt;enumeration value="SetDomainConfig"/>
 *     &lt;enumeration value="DeleteDomain"/>
 *     &lt;enumeration value="StartDomain"/>
 *     &lt;enumeration value="StopDomain"/>
 *     &lt;enumeration value="RestartDomain"/>
 *     &lt;enumeration value="GetCryptoArtifacts"/>
 *     &lt;enumeration value="SetFile"/>
 *     &lt;enumeration value="CompareConfig"/>
 *     &lt;enumeration value="GetLog"/>
 *     &lt;enumeration value="WAXHNActivate"/>
 *     &lt;enumeration value="GetServiceListFromExport"/>
 *     &lt;enumeration value="GetInterDependentServices"/>
 *     &lt;enumeration value="GetServiceListFromDomain"/>
 *     &lt;enumeration value="StartService"/>
 *     &lt;enumeration value="StopService"/>
 *     &lt;enumeration value="GetReferencedObjects"/>
 *     &lt;enumeration value="DeleteService"/>
 *     &lt;enumeration value="DeleteFile"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "device-operation")
@XmlEnum
public enum DeviceOperation {

    @XmlEnumValue("Ping")
    PING("Ping"),
    @XmlEnumValue("GetToken")
    GET_TOKEN("GetToken"),
    @XmlEnumValue("Reboot")
    REBOOT("Reboot"),
    @XmlEnumValue("SetFirmware")
    SET_FIRMWARE("SetFirmware"),
    @XmlEnumValue("Reinitialize")
    REINITIALIZE("Reinitialize"),
    @XmlEnumValue("SecureBackup")
    SECURE_BACKUP("SecureBackup"),
    @XmlEnumValue("SecureRestore")
    SECURE_RESTORE("SecureRestore"),
    @XmlEnumValue("WhenDeviceLastChanged")
    WHEN_DEVICE_LAST_CHANGED("WhenDeviceLastChanged"),
    @XmlEnumValue("Quiesce")
    QUIESCE("Quiesce"),
    @XmlEnumValue("Unquiesce")
    UNQUIESCE("Unquiesce"),
    @XmlEnumValue("GetDeviceInfo")
    GET_DEVICE_INFO("GetDeviceInfo"),
    @XmlEnumValue("GetDeviceSettings")
    GET_DEVICE_SETTINGS("GetDeviceSettings"),
    @XmlEnumValue("SetDeviceSettings")
    SET_DEVICE_SETTINGS("SetDeviceSettings"),
    @XmlEnumValue("GetErrorReport")
    GET_ERROR_REPORT("GetErrorReport"),
    @XmlEnumValue("Subscribe")
    SUBSCRIBE("Subscribe"),
    @XmlEnumValue("Unsubscribe")
    UNSUBSCRIBE("Unsubscribe"),
    @XmlEnumValue("GetDomainList")
    GET_DOMAIN_LIST("GetDomainList"),
    @XmlEnumValue("GetDomainStatus")
    GET_DOMAIN_STATUS("GetDomainStatus"),
    @XmlEnumValue("GetDomainExport")
    GET_DOMAIN_EXPORT("GetDomainExport"),
    @XmlEnumValue("SetDomainExport")
    SET_DOMAIN_EXPORT("SetDomainExport"),
    @XmlEnumValue("GetDomainConfig")
    GET_DOMAIN_CONFIG("GetDomainConfig"),
    @XmlEnumValue("SetDomainConfig")
    SET_DOMAIN_CONFIG("SetDomainConfig"),
    @XmlEnumValue("DeleteDomain")
    DELETE_DOMAIN("DeleteDomain"),
    @XmlEnumValue("StartDomain")
    START_DOMAIN("StartDomain"),
    @XmlEnumValue("StopDomain")
    STOP_DOMAIN("StopDomain"),
    @XmlEnumValue("RestartDomain")
    RESTART_DOMAIN("RestartDomain"),
    @XmlEnumValue("GetCryptoArtifacts")
    GET_CRYPTO_ARTIFACTS("GetCryptoArtifacts"),
    @XmlEnumValue("SetFile")
    SET_FILE("SetFile"),
    @XmlEnumValue("CompareConfig")
    COMPARE_CONFIG("CompareConfig"),
    @XmlEnumValue("GetLog")
    GET_LOG("GetLog"),
    @XmlEnumValue("WAXHNActivate")
    WAXHN_ACTIVATE("WAXHNActivate"),
    @XmlEnumValue("GetServiceListFromExport")
    GET_SERVICE_LIST_FROM_EXPORT("GetServiceListFromExport"),
    @XmlEnumValue("GetInterDependentServices")
    GET_INTER_DEPENDENT_SERVICES("GetInterDependentServices"),
    @XmlEnumValue("GetServiceListFromDomain")
    GET_SERVICE_LIST_FROM_DOMAIN("GetServiceListFromDomain"),
    @XmlEnumValue("StartService")
    START_SERVICE("StartService"),
    @XmlEnumValue("StopService")
    STOP_SERVICE("StopService"),
    @XmlEnumValue("GetReferencedObjects")
    GET_REFERENCED_OBJECTS("GetReferencedObjects"),
    @XmlEnumValue("DeleteService")
    DELETE_SERVICE("DeleteService"),
    @XmlEnumValue("DeleteFile")
    DELETE_FILE("DeleteFile");
    private final String value;

    DeviceOperation(String v) {
        value = v;
    }

    public static DeviceOperation fromValue(String v) {
        for (DeviceOperation c : DeviceOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public String value() {
        return value;
    }

}
