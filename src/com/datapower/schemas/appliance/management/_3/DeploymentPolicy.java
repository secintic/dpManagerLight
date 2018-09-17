
package com.datapower.schemas.appliance.management._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deployment-policy", propOrder = {
    "acceptedConfig",
    "filteredConfig",
    "modifiedConfig"
})
public class DeploymentPolicy {

    @XmlElement(name = "AcceptedConfig")
    protected List<String> acceptedConfig;
    @XmlElement(name = "FilteredConfig")
    protected List<String> filteredConfig;
    @XmlElement(name = "ModifiedConfig")
    protected List<DeploymentPolicy.ModifiedConfig> modifiedConfig;

    /**
     * Gets the value of the acceptedConfig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acceptedConfig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcceptedConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAcceptedConfig() {
        if (acceptedConfig == null) {
            acceptedConfig = new ArrayList<String>();
        }
        return this.acceptedConfig;
    }

    /**
     * Gets the value of the filteredConfig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filteredConfig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilteredConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFilteredConfig() {
        if (filteredConfig == null) {
            filteredConfig = new ArrayList<String>();
        }
        return this.filteredConfig;
    }

    /**
     * Gets the value of the modifiedConfig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modifiedConfig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModifiedConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeploymentPolicy.ModifiedConfig }
     * 
     * 
     */
    public List<DeploymentPolicy.ModifiedConfig> getModifiedConfig() {
        if (modifiedConfig == null) {
            modifiedConfig = new ArrayList<DeploymentPolicy.ModifiedConfig>();
        }
        return this.modifiedConfig;
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
     *         &lt;element name="Match" type="{http://www.datapower.com/schemas/appliance/management/3.0}resource-uri"/>
     *         &lt;element name="Type" type="{http://www.datapower.com/schemas/appliance/management/3.0}policy-type"/>
     *         &lt;element name="Property" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "match",
        "type",
        "property",
        "value"
    })
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

        /**
         * Gets the value of the match property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMatch() {
            return match;
        }

        /**
         * Sets the value of the match property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMatch(String value) {
            this.match = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link PolicyType }
         *     
         */
        public PolicyType getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link PolicyType }
         *     
         */
        public void setType(PolicyType value) {
            this.type = value;
        }

        /**
         * Gets the value of the property property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProperty() {
            return property;
        }

        /**
         * Sets the value of the property property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProperty(String value) {
            this.property = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

    }

}
