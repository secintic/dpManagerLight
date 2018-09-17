
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
 *         &lt;element name="CompareConfig">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CompareResult" type="{http://www.datapower.com/schemas/appliance/management/3.0}compare-result"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="domain" use="required" type="{http://www.datapower.com/schemas/appliance/management/3.0}domain-name" />
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
    "compareConfig"
})
@XmlRootElement(name = "CompareConfigResponse")
public class CompareConfigResponse {

    @XmlElement(name = "CompareConfig")
    protected CompareConfigResponse.CompareConfig compareConfig;

    /**
     * Gets the value of the compareConfig property.
     * 
     * @return
     *     possible object is
     *     {@link CompareConfigResponse.CompareConfig }
     *     
     */
    public CompareConfigResponse.CompareConfig getCompareConfig() {
        return compareConfig;
    }

    /**
     * Sets the value of the compareConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareConfigResponse.CompareConfig }
     *     
     */
    public void setCompareConfig(CompareConfigResponse.CompareConfig value) {
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
     *         &lt;element name="CompareResult" type="{http://www.datapower.com/schemas/appliance/management/3.0}compare-result"/>
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
        "compareResult"
    })
    public static class CompareConfig {

        @XmlElement(name = "CompareResult", required = true)
        @XmlSchemaType(name = "string")
        protected CompareResult compareResult;
        @XmlAttribute(name = "domain", required = true)
        protected String domain;

        /**
         * Gets the value of the compareResult property.
         * 
         * @return
         *     possible object is
         *     {@link CompareResult }
         *     
         */
        public CompareResult getCompareResult() {
            return compareResult;
        }

        /**
         * Sets the value of the compareResult property.
         * 
         * @param value
         *     allowed object is
         *     {@link CompareResult }
         *     
         */
        public void setCompareResult(CompareResult value) {
            this.compareResult = value;
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

    }

}
