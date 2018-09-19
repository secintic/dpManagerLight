package com.datapower.schemas.appliance.management._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for config-state.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="config-state">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="saved"/>
 *     &lt;enumeration value="modified"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "config-state")
@XmlEnum
public enum ConfigState {

    @XmlEnumValue("saved")
    SAVED("saved"),
    @XmlEnumValue("modified")
    MODIFIED("modified");
    private final String value;

    ConfigState(String v) {
        value = v;
    }

    public static ConfigState fromValue(String v) {
        for (ConfigState c : ConfigState.values()) {
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
