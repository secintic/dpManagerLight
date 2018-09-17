
package com.datapower.schemas.appliance.management._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for crypto-location.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="crypto-location">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="cert:"/>
 *     &lt;enumeration value="sharedcert:"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "crypto-location")
@XmlEnum
public enum CryptoLocation {

    @XmlEnumValue("cert:")
    CERT("cert:"),
    @XmlEnumValue("sharedcert:")
    SHAREDCERT("sharedcert:");
    private final String value;

    CryptoLocation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CryptoLocation fromValue(String v) {
        for (CryptoLocation c: CryptoLocation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
