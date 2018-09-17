
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
 *         &lt;element name="Validate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="CryptoCredentialName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;choice>
 *           &lt;element name="SecureBackupSource" type="{http://www.datapower.com/schemas/appliance/management/3.0}resource-uri"/>
 *           &lt;element name="SecureBackup" type="{http://www.datapower.com/schemas/appliance/management/3.0}SecureBackup"/>
 *         &lt;/choice>
 *         &lt;element name="BackupMachineType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "validate",
    "cryptoCredentialName",
    "secureBackupSource",
    "secureBackup",
    "backupMachineType"
})
@XmlRootElement(name = "SecureRestoreRequest")
public class SecureRestoreRequest {

    @XmlElement(name = "Validate")
    protected Object validate;
    @XmlElement(name = "CryptoCredentialName", required = true)
    protected String cryptoCredentialName;
    @XmlElement(name = "SecureBackupSource")
    protected String secureBackupSource;
    @XmlElement(name = "SecureBackup")
    protected SecureBackup secureBackup;
    @XmlElement(name = "BackupMachineType")
    protected String backupMachineType;

    /**
     * Gets the value of the validate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getValidate() {
        return validate;
    }

    /**
     * Sets the value of the validate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setValidate(Object value) {
        this.validate = value;
    }

    /**
     * Gets the value of the cryptoCredentialName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCryptoCredentialName() {
        return cryptoCredentialName;
    }

    /**
     * Sets the value of the cryptoCredentialName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCryptoCredentialName(String value) {
        this.cryptoCredentialName = value;
    }

    /**
     * Gets the value of the secureBackupSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureBackupSource() {
        return secureBackupSource;
    }

    /**
     * Sets the value of the secureBackupSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureBackupSource(String value) {
        this.secureBackupSource = value;
    }

    /**
     * Gets the value of the secureBackup property.
     * 
     * @return
     *     possible object is
     *     {@link SecureBackup }
     *     
     */
    public SecureBackup getSecureBackup() {
        return secureBackup;
    }

    /**
     * Sets the value of the secureBackup property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecureBackup }
     *     
     */
    public void setSecureBackup(SecureBackup value) {
        this.secureBackup = value;
    }

    /**
     * Gets the value of the backupMachineType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackupMachineType() {
        return backupMachineType;
    }

    /**
     * Sets the value of the backupMachineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackupMachineType(String value) {
        this.backupMachineType = value;
    }

}
