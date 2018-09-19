package com.datapower.schemas.appliance.management._3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for file complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="file">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
 *       &lt;attribute name="domain" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="location" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "file", propOrder = {
        "value"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class File {

    @XmlValue
    protected byte[] value;
    @XmlAttribute(name = "domain", required = true)
    protected String domain;
    @XmlAttribute(name = "location", required = true)
    protected String location;
    @XmlAttribute(name = "name", required = true)
    protected String name;

}
