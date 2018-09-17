
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
 *         &lt;element name="DoNotIncludeiSCSI" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="DoNotIncludeRAID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="CryptoCertificateName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="CryptoCertificate" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;/choice>
 *         &lt;element name="SecureBackupDestination" type="{http://www.datapower.com/schemas/appliance/management/3.0}resource-uri" minOccurs="0"/>
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
    "doNotIncludeiSCSI",
    "doNotIncludeRAID",
    "cryptoCertificateName",
    "cryptoCertificate",
    "secureBackupDestination"
})
@XmlRootElement(name = "SecureBackupRequest")
public class SecureBackupRequest {

    @XmlElement(name = "DoNotIncludeiSCSI")
    protected Object doNotIncludeiSCSI;
    @XmlElement(name = "DoNotIncludeRAID")
    protected Object doNotIncludeRAID;
    @XmlElement(name = "CryptoCertificateName")
    protected String cryptoCertificateName;
    @XmlElement(name = "CryptoCertificate")
    protected byte[] cryptoCertificate;
    @XmlElement(name = "SecureBackupDestination")
    protected String secureBackupDestination;

    /**
     * Gets the value of the doNotIncludeiSCSI property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDoNotIncludeiSCSI() {
        return doNotIncludeiSCSI;
    }

    /**
     * Sets the value of the doNotIncludeiSCSI property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDoNotIncludeiSCSI(Object value) {
        this.doNotIncludeiSCSI = value;
    }

    /**
     * Gets the value of the doNotIncludeRAID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDoNotIncludeRAID() {
        return doNotIncludeRAID;
    }

    /**
     * Sets the value of the doNotIncludeRAID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDoNotIncludeRAID(Object value) {
        this.doNotIncludeRAID = value;
    }

    /**
     * Gets the value of the cryptoCertificateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCryptoCertificateName() {
        return cryptoCertificateName;
    }

    /**
     * Sets the value of the cryptoCertificateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCryptoCertificateName(String value) {
        this.cryptoCertificateName = value;
    }

    /**
     * Gets the value of the cryptoCertificate property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCryptoCertificate() {
        return cryptoCertificate;
    }

    /**
     * Sets the value of the cryptoCertificate property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCryptoCertificate(byte[] value) {
        this.cryptoCertificate = value;
    }

    /**
     * Gets the value of the secureBackupDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureBackupDestination() {
        return secureBackupDestination;
    }

    /**
     * Sets the value of the secureBackupDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureBackupDestination(String value) {
        this.secureBackupDestination = value;
    }

}
