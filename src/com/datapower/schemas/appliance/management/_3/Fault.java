package com.datapower.schemas.appliance.management._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fault.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="fault">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Authentication failure"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "fault")
@XmlEnum
public enum Fault {

    @XmlEnumValue("Authentication failure")
    AUTHENTICATION_FAILURE("Authentication failure");
    private final String value;

    Fault(String v) {
        value = v;
    }

    public static Fault fromValue(String v) {
        for (Fault c : Fault.values()) {
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
