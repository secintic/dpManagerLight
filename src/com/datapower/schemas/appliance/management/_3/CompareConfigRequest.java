
package com.datapower.schemas.appliance.management._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="CompareConfig">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="From">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="Running" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                               &lt;choice>
 *                                 &lt;element name="Persistable" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                               &lt;/choice>
 *                               &lt;element name="Persisted" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                               &lt;element name="Settings" type="{http://www.datapower.com/schemas/appliance/management/3.0}export"/>
 *                               &lt;element name="Config" type="{http://www.datapower.com/schemas/appliance/management/3.0}backup"/>
 *                             &lt;/choice>
 *                             &lt;element name="Policy" type="{http://www.datapower.com/schemas/appliance/management/3.0}deployment-policy" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="To">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="Running" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                               &lt;choice>
 *                                 &lt;element name="Persistable" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                               &lt;/choice>
 *                               &lt;element name="Persisted" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                               &lt;element name="Settings" type="{http://www.datapower.com/schemas/appliance/management/3.0}export"/>
 *                               &lt;element name="Config" type="{http://www.datapower.com/schemas/appliance/management/3.0}backup"/>
 *                             &lt;/choice>
 *                             &lt;element name="Policy" type="{http://www.datapower.com/schemas/appliance/management/3.0}deployment-policy" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="domain" use="required" type="{http://www.datapower.com/schemas/appliance/management/3.0}domain-name" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "compareConfig"
})
@XmlRootElement(name = "CompareConfigRequest")
public class CompareConfigRequest {

    @XmlElement(name = "CompareConfig", required = true)
    protected CompareConfigRequest.CompareConfig compareConfig;

    /**
     * Gets the value of the compareConfig property.
     * 
     * @return
     *     possible object is
     *     {@link CompareConfigRequest.CompareConfig }
     *     
     */
    public CompareConfigRequest.CompareConfig getCompareConfig() {
        return compareConfig;
    }

    /**
     * Sets the value of the compareConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareConfigRequest.CompareConfig }
     *     
     */
    public void setCompareConfig(CompareConfigRequest.CompareConfig value) {
        this.compareConfig = value;
    }


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
     *         &lt;element name="From">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="Running" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                     &lt;choice>
     *                       &lt;element name="Persistable" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                     &lt;/choice>
     *                     &lt;element name="Persisted" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                     &lt;element name="Settings" type="{http://www.datapower.com/schemas/appliance/management/3.0}export"/>
     *                     &lt;element name="Config" type="{http://www.datapower.com/schemas/appliance/management/3.0}backup"/>
     *                   &lt;/choice>
     *                   &lt;element name="Policy" type="{http://www.datapower.com/schemas/appliance/management/3.0}deployment-policy" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="To">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="Running" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                     &lt;choice>
     *                       &lt;element name="Persistable" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                     &lt;/choice>
     *                     &lt;element name="Persisted" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                     &lt;element name="Settings" type="{http://www.datapower.com/schemas/appliance/management/3.0}export"/>
     *                     &lt;element name="Config" type="{http://www.datapower.com/schemas/appliance/management/3.0}backup"/>
     *                   &lt;/choice>
     *                   &lt;element name="Policy" type="{http://www.datapower.com/schemas/appliance/management/3.0}deployment-policy" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="domain" use="required" type="{http://www.datapower.com/schemas/appliance/management/3.0}domain-name" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "from",
        "to"
    })
    public static class CompareConfig {

        @XmlElement(name = "From", required = true)
        protected CompareConfigRequest.CompareConfig.From from;
        @XmlElement(name = "To", required = true)
        protected CompareConfigRequest.CompareConfig.To to;
        @XmlAttribute(name = "domain", required = true)
        protected String domain;

        /**
         * Gets the value of the from property.
         * 
         * @return
         *     possible object is
         *     {@link CompareConfigRequest.CompareConfig.From }
         *     
         */
        public CompareConfigRequest.CompareConfig.From getFrom() {
            return from;
        }

        /**
         * Sets the value of the from property.
         * 
         * @param value
         *     allowed object is
         *     {@link CompareConfigRequest.CompareConfig.From }
         *     
         */
        public void setFrom(CompareConfigRequest.CompareConfig.From value) {
            this.from = value;
        }

        /**
         * Gets the value of the to property.
         * 
         * @return
         *     possible object is
         *     {@link CompareConfigRequest.CompareConfig.To }
         *     
         */
        public CompareConfigRequest.CompareConfig.To getTo() {
            return to;
        }

        /**
         * Sets the value of the to property.
         * 
         * @param value
         *     allowed object is
         *     {@link CompareConfigRequest.CompareConfig.To }
         *     
         */
        public void setTo(CompareConfigRequest.CompareConfig.To value) {
            this.to = value;
        }

        /**
         * Gets the value of the domain property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDomain() {
            return domain;
        }

        /**
         * Sets the value of the domain property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDomain(String value) {
            this.domain = value;
        }


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
         *           &lt;element name="Running" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *           &lt;choice>
         *             &lt;element name="Persistable" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *           &lt;/choice>
         *           &lt;element name="Persisted" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *           &lt;element name="Settings" type="{http://www.datapower.com/schemas/appliance/management/3.0}export"/>
         *           &lt;element name="Config" type="{http://www.datapower.com/schemas/appliance/management/3.0}backup"/>
         *         &lt;/choice>
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
            "running",
            "persistable",
            "persisted",
            "settings",
            "config",
            "policy"
        })
        public static class From {

            @XmlElement(name = "Running")
            protected Object running;
            @XmlElement(name = "Persistable")
            protected Object persistable;
            @XmlElement(name = "Persisted")
            protected Object persisted;
            @XmlElement(name = "Settings")
            protected Export settings;
            @XmlElement(name = "Config")
            protected Backup config;
            @XmlElement(name = "Policy")
            protected DeploymentPolicy policy;

            /**
             * Gets the value of the running property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getRunning() {
                return running;
            }

            /**
             * Sets the value of the running property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setRunning(Object value) {
                this.running = value;
            }

            /**
             * Gets the value of the persistable property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getPersistable() {
                return persistable;
            }

            /**
             * Sets the value of the persistable property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setPersistable(Object value) {
                this.persistable = value;
            }

            /**
             * Gets the value of the persisted property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getPersisted() {
                return persisted;
            }

            /**
             * Sets the value of the persisted property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setPersisted(Object value) {
                this.persisted = value;
            }

            /**
             * Gets the value of the settings property.
             * 
             * @return
             *     possible object is
             *     {@link Export }
             *     
             */
            public Export getSettings() {
                return settings;
            }

            /**
             * Sets the value of the settings property.
             * 
             * @param value
             *     allowed object is
             *     {@link Export }
             *     
             */
            public void setSettings(Export value) {
                this.settings = value;
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
         *           &lt;element name="Running" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *           &lt;choice>
         *             &lt;element name="Persistable" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *           &lt;/choice>
         *           &lt;element name="Persisted" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *           &lt;element name="Settings" type="{http://www.datapower.com/schemas/appliance/management/3.0}export"/>
         *           &lt;element name="Config" type="{http://www.datapower.com/schemas/appliance/management/3.0}backup"/>
         *         &lt;/choice>
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
            "running",
            "persistable",
            "persisted",
            "settings",
            "config",
            "policy"
        })
        public static class To {

            @XmlElement(name = "Running")
            protected Object running;
            @XmlElement(name = "Persistable")
            protected Object persistable;
            @XmlElement(name = "Persisted")
            protected Object persisted;
            @XmlElement(name = "Settings")
            protected Export settings;
            @XmlElement(name = "Config")
            protected Backup config;
            @XmlElement(name = "Policy")
            protected DeploymentPolicy policy;

            /**
             * Gets the value of the running property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getRunning() {
                return running;
            }

            /**
             * Sets the value of the running property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setRunning(Object value) {
                this.running = value;
            }

            /**
             * Gets the value of the persistable property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getPersistable() {
                return persistable;
            }

            /**
             * Sets the value of the persistable property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setPersistable(Object value) {
                this.persistable = value;
            }

            /**
             * Gets the value of the persisted property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getPersisted() {
                return persisted;
            }

            /**
             * Sets the value of the persisted property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setPersisted(Object value) {
                this.persisted = value;
            }

            /**
             * Gets the value of the settings property.
             * 
             * @return
             *     possible object is
             *     {@link Export }
             *     
             */
            public Export getSettings() {
                return settings;
            }

            /**
             * Sets the value of the settings property.
             * 
             * @param value
             *     allowed object is
             *     {@link Export }
             *     
             */
            public void setSettings(Export value) {
                this.settings = value;
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

    }

}
