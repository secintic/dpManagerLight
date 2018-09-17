
package com.datapower.schemas.appliance.management._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for subscription-state.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="subscription-state">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="duplicate"/>
 *     &lt;enumeration value="fault"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "subscription-state")
@XmlEnum
public enum SubscriptionState {

    @XmlEnumValue("active")
    ACTIVE("active"),
    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("duplicate")
    DUPLICATE("duplicate"),
    @XmlEnumValue("fault")
    FAULT("fault");
    private final String value;

    SubscriptionState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubscriptionState fromValue(String v) {
        for (SubscriptionState c: SubscriptionState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
