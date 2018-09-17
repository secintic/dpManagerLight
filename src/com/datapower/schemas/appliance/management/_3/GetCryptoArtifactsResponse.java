
package com.datapower.schemas.appliance.management._3;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="CryptoArtifacts">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="CryptoFileName" type="{http://www.datapower.com/schemas/appliance/management/3.0}crypto-file-name" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/choice>
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
    "status",
    "cryptoArtifacts"
})
@XmlRootElement(name = "GetCryptoArtifactsResponse")
public class GetCryptoArtifactsResponse {

    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected Status status;
    @XmlElement(name = "CryptoArtifacts")
    protected GetCryptoArtifactsResponse.CryptoArtifacts cryptoArtifacts;

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
     * Gets the value of the cryptoArtifacts property.
     * 
     * @return
     *     possible object is
     *     {@link GetCryptoArtifactsResponse.CryptoArtifacts }
     *     
     */
    public GetCryptoArtifactsResponse.CryptoArtifacts getCryptoArtifacts() {
        return cryptoArtifacts;
    }

    /**
     * Sets the value of the cryptoArtifacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCryptoArtifactsResponse.CryptoArtifacts }
     *     
     */
    public void setCryptoArtifacts(GetCryptoArtifactsResponse.CryptoArtifacts value) {
        this.cryptoArtifacts = value;
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
     *       &lt;choice>
     *         &lt;element name="CryptoFileName" type="{http://www.datapower.com/schemas/appliance/management/3.0}crypto-file-name" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/choice>
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
        "cryptoFileName"
    })
    public static class CryptoArtifacts {

        @XmlElement(name = "CryptoFileName")
        protected List<CryptoFileName> cryptoFileName;
        @XmlAttribute(name = "domain", required = true)
        protected String domain;

        /**
         * Gets the value of the cryptoFileName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cryptoFileName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCryptoFileName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CryptoFileName }
         * 
         * 
         */
        public List<CryptoFileName> getCryptoFileName() {
            if (cryptoFileName == null) {
                cryptoFileName = new ArrayList<CryptoFileName>();
            }
            return this.cryptoFileName;
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
