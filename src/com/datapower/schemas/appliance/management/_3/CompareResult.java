
package com.datapower.schemas.appliance.management._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for compare-result.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="compare-result">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="identical"/>
 *     &lt;enumeration value="different"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "compare-result")
@XmlEnum
public enum CompareResult {

    @XmlEnumValue("identical")
    IDENTICAL("identical"),
    @XmlEnumValue("different")
    DIFFERENT("different");
    private final String value;

    CompareResult(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompareResult fromValue(String v) {
        for (CompareResult c: CompareResult.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
