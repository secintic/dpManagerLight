package com.datapower.schemas.appliance.management._3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import java.util.List;


/**
 * <p>Java class for detailed-config-object complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="detailed-config-object">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/appliance/management/3.0}config-object">
 *       &lt;sequence>
 *         &lt;element name="ReferencedObject" type="{http://www.datapower.com/schemas/appliance/management/3.0}config-object" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UserComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdminState" type="{http://www.datapower.com/schemas/appliance/management/3.0}admin-state" minOccurs="0"/>
 *         &lt;element name="OpState" type="{http://www.datapower.com/schemas/appliance/management/3.0}op-state" minOccurs="0"/>
 *         &lt;element name="ConfigState" type="{http://www.datapower.com/schemas/appliance/management/3.0}config-state" minOccurs="0"/>
 *         &lt;element name="QuiesceState" type="{http://www.datapower.com/schemas/appliance/management/3.0}quiesce-state" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="referencedExternally" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="deleted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="excluded" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detailed-config-object", propOrder = {
        "referencedObject",
        "userComments",
        "errorMessage",
        "adminState",
        "opState",
        "configState",
        "quiesceState"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetailedConfigObject
        extends ConfigObject {

    @XmlElement(name = "ReferencedObject")
    protected List<ConfigObject> referencedObject;
    @XmlElement(name = "UserComments")
    protected String userComments;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    @XmlElement(name = "AdminState")
    @XmlSchemaType(name = "string")
    protected AdminState adminState;
    @XmlElement(name = "OpState")
    @XmlSchemaType(name = "string")
    protected OpState opState;
    @XmlElement(name = "ConfigState")
    @XmlSchemaType(name = "string")
    protected ConfigState configState;
    @XmlElement(name = "QuiesceState")
    protected String quiesceState;
    @XmlAttribute(name = "referencedExternally")
    protected Boolean referencedExternally;
    @XmlAttribute(name = "deleted")
    protected Boolean deleted;
    @XmlAttribute(name = "excluded")
    protected Boolean excluded;

}
