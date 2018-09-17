
package com.datapower.schemas.appliance.management._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *       &lt;choice>
 *         &lt;element name="Status" type="{http://www.datapower.com/schemas/appliance/management/3.0}status"/>
 *         &lt;element name="Domain">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AdminState" type="{http://www.datapower.com/schemas/appliance/management/3.0}admin-state"/>
 *                   &lt;element name="OpState" type="{http://www.datapower.com/schemas/appliance/management/3.0}op-state"/>
 *                   &lt;element name="ConfigState" type="{http://www.datapower.com/schemas/appliance/management/3.0}config-state"/>
 *                   &lt;element name="DebugState" type="{http://www.datapower.com/schemas/appliance/management/3.0}debug-state"/>
 *                   &lt;element name="CurrentCommand" type="{http://www.datapower.com/schemas/appliance/management/3.0}cur-cmd"/>
 *                   &lt;element name="QuiesceState" type="{http://www.datapower.com/schemas/appliance/management/3.0}quiesce-state"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="name" use="required" type="{http://www.datapower.com/schemas/appliance/management/3.0}domain-name" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "status",
    "domain"
})
@XmlRootElement(name = "GetDomainStatusResponse")
public class GetDomainStatusResponse {

    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected Status status;
    @XmlElement(name = "Domain")
    protected GetDomainStatusResponse.Domain domain;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link GetDomainStatusResponse.Domain }
     *     
     */
    public GetDomainStatusResponse.Domain getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDomainStatusResponse.Domain }
     *     
     */
    public void setDomain(GetDomainStatusResponse.Domain value) {
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
     *         &lt;element name="AdminState" type="{http://www.datapower.com/schemas/appliance/management/3.0}admin-state"/>
     *         &lt;element name="OpState" type="{http://www.datapower.com/schemas/appliance/management/3.0}op-state"/>
     *         &lt;element name="ConfigState" type="{http://www.datapower.com/schemas/appliance/management/3.0}config-state"/>
     *         &lt;element name="DebugState" type="{http://www.datapower.com/schemas/appliance/management/3.0}debug-state"/>
     *         &lt;element name="CurrentCommand" type="{http://www.datapower.com/schemas/appliance/management/3.0}cur-cmd"/>
     *         &lt;element name="QuiesceState" type="{http://www.datapower.com/schemas/appliance/management/3.0}quiesce-state"/>
     *       &lt;/sequence>
     *       &lt;attribute name="name" use="required" type="{http://www.datapower.com/schemas/appliance/management/3.0}domain-name" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "adminState",
        "opState",
        "configState",
        "debugState",
        "currentCommand",
        "quiesceState"
    })
    public static class Domain {

        @XmlElement(name = "AdminState", required = true)
        @XmlSchemaType(name = "string")
        protected AdminState adminState;
        @XmlElement(name = "OpState", required = true)
        @XmlSchemaType(name = "string")
        protected OpState opState;
        @XmlElement(name = "ConfigState", required = true)
        @XmlSchemaType(name = "string")
        protected ConfigState configState;
        @XmlElement(name = "DebugState")
        protected boolean debugState;
        @XmlElement(name = "CurrentCommand", required = true)
        protected String currentCommand;
        @XmlElement(name = "QuiesceState", required = true)
        protected String quiesceState;
        @XmlAttribute(name = "name", required = true)
        protected String name;

        /**
         * Gets the value of the adminState property.
         * 
         * @return
         *     possible object is
         *     {@link AdminState }
         *     
         */
        public AdminState getAdminState() {
            return adminState;
        }

        /**
         * Sets the value of the adminState property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdminState }
         *     
         */
        public void setAdminState(AdminState value) {
            this.adminState = value;
        }

        /**
         * Gets the value of the opState property.
         * 
         * @return
         *     possible object is
         *     {@link OpState }
         *     
         */
        public OpState getOpState() {
            return opState;
        }

        /**
         * Sets the value of the opState property.
         * 
         * @param value
         *     allowed object is
         *     {@link OpState }
         *     
         */
        public void setOpState(OpState value) {
            this.opState = value;
        }

        /**
         * Gets the value of the configState property.
         * 
         * @return
         *     possible object is
         *     {@link ConfigState }
         *     
         */
        public ConfigState getConfigState() {
            return configState;
        }

        /**
         * Sets the value of the configState property.
         * 
         * @param value
         *     allowed object is
         *     {@link ConfigState }
         *     
         */
        public void setConfigState(ConfigState value) {
            this.configState = value;
        }

        /**
         * Gets the value of the debugState property.
         * 
         */
        public boolean isDebugState() {
            return debugState;
        }

        /**
         * Sets the value of the debugState property.
         * 
         */
        public void setDebugState(boolean value) {
            this.debugState = value;
        }

        /**
         * Gets the value of the currentCommand property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrentCommand() {
            return currentCommand;
        }

        /**
         * Sets the value of the currentCommand property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrentCommand(String value) {
            this.currentCommand = value;
        }

        /**
         * Gets the value of the quiesceState property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQuiesceState() {
            return quiesceState;
        }

        /**
         * Sets the value of the quiesceState property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQuiesceState(String value) {
            this.quiesceState = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

    }

}
