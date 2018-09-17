
package com.datapower.schemas.appliance.management._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reboot-mode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="reboot-mode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="reboot"/>
 *     &lt;enumeration value="reload"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "reboot-mode")
@XmlEnum
public enum RebootMode {

    @XmlEnumValue("reboot")
    REBOOT("reboot"),
    @XmlEnumValue("reload")
    RELOAD("reload");
    private final String value;

    RebootMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RebootMode fromValue(String v) {
        for (RebootMode c: RebootMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
