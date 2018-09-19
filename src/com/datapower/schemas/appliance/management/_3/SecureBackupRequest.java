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
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "doNotIncludeiSCSI",
        "doNotIncludeRAID",
        "cryptoCertificateName",
        "cryptoCertificate",
        "secureBackupDestination"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
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

}
