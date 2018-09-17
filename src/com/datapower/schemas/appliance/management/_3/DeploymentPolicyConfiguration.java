
package com.datapower.schemas.appliance.management._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


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
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deployment-policy-configuration", propOrder = {
    "value"
})
public class DeploymentPolicyConfiguration {

    @XmlValue
    protected byte[] value;
    @XmlAttribute(name = "policy-domain-name")
    protected String policyDomainName;
    @XmlAttribute(name = "policy-object-name", required = true)
    protected String policyObjectName;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setValue(byte[] value) {
        this.value = value;
    }

    /**
     * Gets the value of the policyDomainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyDomainName() {
        return policyDomainName;
    }

    /**
     * Sets the value of the policyDomainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyDomainName(String value) {
        this.policyDomainName = value;
    }

    /**
     * Gets the value of the policyObjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyObjectName() {
        return policyObjectName;
    }

    /**
     * Sets the value of the policyObjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyObjectName(String value) {
        this.policyObjectName = value;
    }

}
