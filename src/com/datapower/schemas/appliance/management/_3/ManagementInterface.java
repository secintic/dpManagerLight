package com.datapower.schemas.appliance.management._3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for management-interface complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="management-interface">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="type" use="required" type="{http://www.datapower.com/schemas/appliance/management/3.0}management-type" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "management-interface", propOrder = {
        "value"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ManagementInterface {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "type", required = true)
    protected ManagementType type;

}
