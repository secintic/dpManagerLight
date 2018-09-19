package com.datapower.schemas.appliance.management._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for device-feature.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="device-feature">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MQ"/>
 *     &lt;enumeration value="TAM"/>
 *     &lt;enumeration value="HSM"/>
 *     &lt;enumeration value="DataGlue"/>
 *     &lt;enumeration value="JAXP-API"/>
 *     &lt;enumeration value="PKCS7-SMIME"/>
 *     &lt;enumeration value="SQL-ODBC"/>
 *     &lt;enumeration value="Tibco-EMS"/>
 *     &lt;enumeration value="Tibco-RV"/>
 *     &lt;enumeration value="WebSphere-JMS"/>
 *     &lt;enumeration value="XG4"/>
 *     &lt;enumeration value="LocateLED"/>
 *     &lt;enumeration value="AppOpt"/>
 *     &lt;enumeration value="IPMI"/>
 *     &lt;enumeration value="DCO"/>
 *     &lt;enumeration value="IPMI-LAN"/>
 *     &lt;enumeration value="zBX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "device-feature")
@XmlEnum
public enum DeviceFeature {

    MQ("MQ"),
    TAM("TAM"),
    HSM("HSM"),
    @XmlEnumValue("DataGlue")
    DATA_GLUE("DataGlue"),
    @XmlEnumValue("JAXP-API")
    JAXP_API("JAXP-API"),
    @XmlEnumValue("PKCS7-SMIME")
    PKCS_7_SMIME("PKCS7-SMIME"),
    @XmlEnumValue("SQL-ODBC")
    SQL_ODBC("SQL-ODBC"),
    @XmlEnumValue("Tibco-EMS")
    TIBCO_EMS("Tibco-EMS"),
    @XmlEnumValue("Tibco-RV")
    TIBCO_RV("Tibco-RV"),
    @XmlEnumValue("WebSphere-JMS")
    WEB_SPHERE_JMS("WebSphere-JMS"),
    @XmlEnumValue("XG4")
    XG_4("XG4"),
    @XmlEnumValue("LocateLED")
    LOCATE_LED("LocateLED"),
    @XmlEnumValue("AppOpt")
    APP_OPT("AppOpt"),
    IPMI("IPMI"),
    DCO("DCO"),
    @XmlEnumValue("IPMI-LAN")
    IPMI_LAN("IPMI-LAN"),
    @XmlEnumValue("zBX")
    Z_BX("zBX");
    private final String value;

    DeviceFeature(String v) {
        value = v;
    }

    public static DeviceFeature fromValue(String v) {
        for (DeviceFeature c : DeviceFeature.values()) {
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
