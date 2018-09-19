package com.datapower.schemas.appliance.management._3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for backup-file complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="backup-file">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="File" type="{http://www.datapower.com/schemas/appliance/management/3.0}file-location"/>
 *       &lt;/sequence>
 *       &lt;attribute name="domain" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "backup-file", propOrder = {
        "file"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BackupFile {

    @XmlElement(name = "File", required = true)
    protected FileLocation file;
    @XmlAttribute(name = "domain", required = true)
    protected String domain;

}
