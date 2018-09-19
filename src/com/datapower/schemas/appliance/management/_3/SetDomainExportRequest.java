package com.datapower.schemas.appliance.management._3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;


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
@Data
@AllArgsConstructor
@NoArgsConstructor
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

}
