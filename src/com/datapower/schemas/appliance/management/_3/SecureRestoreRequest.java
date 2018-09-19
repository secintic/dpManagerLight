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
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "validate",
        "cryptoCredentialName",
        "secureBackupSource",
        "secureBackup",
        "backupMachineType"
})
@Data
@NoArgsConstructor
@AllArgsConstructor
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

}
