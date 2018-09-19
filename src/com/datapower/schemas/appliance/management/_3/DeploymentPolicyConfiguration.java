package com.datapower.schemas.appliance.management._3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for deployment-policy-configuration complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="deployment-policy-configuration">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
 *       &lt;attribute name="policy-domain-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="policy-object-name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deployment-policy-configuration", propOrder = {
        "value"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeploymentPolicyConfiguration {

    @XmlValue
    protected byte[] value;
    @XmlAttribute(name = "policy-domain-name")
    protected String policyDomainName;
    @XmlAttribute(name = "policy-object-name", required = true)
    protected String policyObjectName;
}
