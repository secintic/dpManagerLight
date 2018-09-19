package com.datapower.schemas.appliance.management._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for secure-backup-state.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="secure-backup-state">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="enabled"/>
 *     &lt;enumeration value="disabled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "secure-backup-state")
@XmlEnum
public enum SecureBackupState {

    @XmlEnumValue("enabled")
    ENABLED("enabled"),
    @XmlEnumValue("disabled")
    DISABLED("disabled");
    private final String value;

    SecureBackupState(String v) {
        value = v;
    }

    public static SecureBackupState fromValue(String v) {
        for (SecureBackupState c : SecureBackupState.values()) {
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
