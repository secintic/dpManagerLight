
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
 *         &lt;choice>
 *           &lt;element name="Config" type="{http://www.datapower.com/schemas/appliance/management/3.0}backup"/>
 *           &lt;element name="ConfigFile" type="{http://www.datapower.com/schemas/appliance/management/3.0}backup-file"/>
 *         &lt;/choice>
 *         &lt;element name="Services" type="{http://www.datapower.com/schemas/appliance/management/3.0}config-objects"/>
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
    "configFile",
    "services"
})
@XmlRootElement(name = "GetInterDependentServicesRequest")
public class GetInterDependentServicesRequest {

    @XmlElement(name = "Config")
    protected Backup config;
    @XmlElement(name = "ConfigFile")
    protected BackupFile configFile;
    @XmlElement(name = "Services", required = true)
    protected ConfigObjects services;

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

}
