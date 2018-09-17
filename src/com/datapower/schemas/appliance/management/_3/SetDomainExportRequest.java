
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
 *         &lt;element name="Reset-Domain" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="Config" type="{http://www.datapower.com/schemas/appliance/management/3.0}backup"/>
 *           &lt;element name="ConfigFile" type="{http://www.datapower.com/schemas/appliance/management/3.0}backup-file"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="Policy" type="{http://www.datapower.com/schemas/appliance/management/3.0}deployment-policy" minOccurs="0"/>
 *           &lt;element name="Policy-Object-Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="Policy-Configuration" type="{http://www.datapower.com/schemas/appliance/management/3.0}deployment-policy-configuration" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="Services" type="{http://www.datapower.com/schemas/appliance/management/3.0}config-objects" minOccurs="0"/>
 *         &lt;element name="ImportAllFiles" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "resetDomain",
    "config",
    "configFile",
    "policy",
    "policyObjectName",
    "policyConfiguration",
    "services",
    "importAllFiles"
})
@XmlRootElement(name = "SetDomainExportRequest")
public class SetDomainExportRequest {

    @XmlElement(name = "Reset-Domain")
    protected Boolean resetDomain;
    @XmlElement(name = "Config")
    protected Backup config;
    @XmlElement(name = "ConfigFile")
    protected BackupFile configFile;
    @XmlElement(name = "Policy")
    protected DeploymentPolicy policy;
    @XmlElement(name = "Policy-Object-Name")
    protected String policyObjectName;
    @XmlElement(name = "Policy-Configuration")
    protected DeploymentPolicyConfiguration policyConfiguration;
    @XmlElement(name = "Services")
    protected ConfigObjects services;
    @XmlElement(name = "ImportAllFiles", defaultValue = "false")
    protected Boolean importAllFiles;

    /**
     * Gets the value of the resetDomain property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResetDomain() {
        return resetDomain;
    }

    /**
     * Sets the value of the resetDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResetDomain(Boolean value) {
        this.resetDomain = value;
    }

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
     * Gets the value of the configFile property.
     * 
     * @return
     *     possible object is
     *     {@link BackupFile }
     *     
     */
    public BackupFile getConfigFile() {
        return configFile;
    }

    /**
     * Sets the value of the configFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link BackupFile }
     *     
     */
    public void setConfigFile(BackupFile value) {
        this.configFile = value;
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

    /**
     * Gets the value of the policyConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link DeploymentPolicyConfiguration }
     *     
     */
    public DeploymentPolicyConfiguration getPolicyConfiguration() {
        return policyConfiguration;
    }

    /**
     * Sets the value of the policyConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeploymentPolicyConfiguration }
     *     
     */
    public void setPolicyConfiguration(DeploymentPolicyConfiguration value) {
        this.policyConfiguration = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigObjects }
     *     
     */
    public ConfigObjects getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigObjects }
     *     
     */
    public void setServices(ConfigObjects value) {
        this.services = value;
    }

    /**
     * Gets the value of the importAllFiles property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImportAllFiles() {
        return importAllFiles;
    }

    /**
     * Sets the value of the importAllFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImportAllFiles(Boolean value) {
        this.importAllFiles = value;
    }

}
