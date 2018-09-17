
package com.datapower.schemas.appliance.management._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Config" type="{http://www.datapower.com/schemas/appliance/management/3.0}backup"/>
 *         &lt;element name="Policy" type="{http://www.datapower.com/schemas/appliance/management/3.0}deployment-policy" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "config",
    "policy"
})
@XmlRootElement(name = "SetDomainConfigRequest")
public class SetDomainConfigRequest {

    @XmlElement(name = "Config", required = true)
    protected Backup config;
    @XmlElement(name = "Policy")
    protected DeploymentPolicy policy;

    /**
     * Gets the value of the config property.
     * 
     * @return
     *     possible object is
     *     {@link Backup }
     *     
     */
    public Backup getConfig() {
        return config;
    }

    /**
     * Sets the value of the config property.
     * 
     * @param value
     *     allowed object is
     *     {@link Backup }
     *     
     */
    public void setConfig(Backup value) {
        this.config = value;
    }

    /**
     * Gets the value of the policy property.
     * 
     * @return
     *     possible object is
     *     {@link DeploymentPolicy }
     *     
     */
    public DeploymentPolicy getPolicy() {
        return policy;
    }

    /**
     * Sets the value of the policy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeploymentPolicy }
     *     
     */
    public void setPolicy(DeploymentPolicy value) {
        this.policy = value;
    }

}
