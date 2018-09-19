package com.datapower.schemas.appliance.management._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for management-type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="management-type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="web-mgmt"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "management-type")
@XmlEnum
public enum ManagementType {

    @XmlEnumValue("web-mgmt")
    WEB_MGMT("web-mgmt");
    private final String value;

    ManagementType(String v) {
        value = v;
    }

    public static ManagementType fromValue(String v) {
        for (ManagementType c : ManagementType.values()) {
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
