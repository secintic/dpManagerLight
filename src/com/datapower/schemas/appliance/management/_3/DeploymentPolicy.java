package com.datapower.schemas.appliance.management._3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import java.util.List;


/**
 * <p>Java class for deployment-policy complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="deployment-policy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcceptedConfig" type="{http://www.datapower.com/schemas/appliance/management/3.0}resource-uri" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FilteredConfig" type="{http://www.datapower.com/schemas/appliance/management/3.0}resource-uri" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ModifiedConfig" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Match" type="{http://www.datapower.com/schemas/appliance/management/3.0}resource-uri"/>
 *                   &lt;element name="Type" type="{http://www.datapower.com/schemas/appliance/management/3.0}policy-type"/>
 *                   &lt;element name="Property" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deployment-policy", propOrder = {
        "acceptedConfig",
        "filteredConfig",
        "modifiedConfig"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeploymentPolicy {

    @XmlElement(name = "AcceptedConfig")
    protected List<String> acceptedConfig;
    @XmlElement(name = "FilteredConfig")
    protected List<String> filteredConfig;
    @XmlElement(name = "ModifiedConfig")
    protected List<DeploymentPolicy.ModifiedConfig> modifiedConfig;

    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Match" type="{http://www.datapower.com/schemas/appliance/management/3.0}resource-uri"/>
     *         &lt;element name="Type" type="{http://www.datapower.com/schemas/appliance/management/3.0}policy-type"/>
     *         &lt;element name="Property" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "match",
            "type",
            "property",
            "value"
    })
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ModifiedConfig {

        @XmlElement(name = "Match", required = true)
        protected String match;
        @XmlElement(name = "Type", required = true)
        @XmlSchemaType(name = "string")
        protected PolicyType type;
        @XmlElement(name = "Property")
        protected String property;
        @XmlElement(name = "Value")
        protected String value;
    }

}
