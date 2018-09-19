package com.datapower.schemas.appliance.management._3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for config-object complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="config-object">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="class-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="class-display-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "config-object")
@XmlSeeAlso({
        DetailedConfigObject.class
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConfigObject {

    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "class-name")
    protected String className;
    @XmlAttribute(name = "class-display-name")
    protected String classDisplayName;

}
