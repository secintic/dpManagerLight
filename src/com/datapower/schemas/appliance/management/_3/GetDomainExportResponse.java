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
 *       &lt;choice>
 *         &lt;element name="Status" type="{http://www.datapower.com/schemas/appliance/management/3.0}status"/>
 *         &lt;element name="Config" type="{http://www.datapower.com/schemas/appliance/management/3.0}backup"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "status",
        "config"
})
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name = "GetDomainExportResponse")
public class GetDomainExportResponse {

    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected Status status;
    @XmlElement(name = "Config")
    protected Backup config;

}
