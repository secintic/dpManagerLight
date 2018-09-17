
package com.datapower.schemas.appliance.management._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for device-type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="device-type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="XA35"/>
 *     &lt;enumeration value="XS40"/>
 *     &lt;enumeration value="XG45"/>
 *     &lt;enumeration value="XI50"/>
 *     &lt;enumeration value="XI52"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "device-type")
@XmlEnum
public enum DeviceType {

    @XmlEnumValue("XA35")
    XA_35("XA35"),
    @XmlEnumValue("XS40")
    XS_40("XS40"),
    @XmlEnumValue("XG45")
    XG_45("XG45"),
    @XmlEnumValue("XI50")
    XI_50("XI50"),
    @XmlEnumValue("XI52")
    XI_52("XI52");
    private final String value;

    DeviceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeviceType fromValue(String v) {
        for (DeviceType c: DeviceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
