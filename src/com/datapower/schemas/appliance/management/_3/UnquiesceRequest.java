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
 *         &lt;element name="Device" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="Domain" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{http://www.datapower.com/schemas/appliance/management/3.0}domain-name"/>
 *                   &lt;element name="Services" type="{http://www.datapower.com/schemas/appliance/management/3.0}config-objects" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "device",
        "domain"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "UnquiesceRequest")
public class UnquiesceRequest {

    @XmlElement(name = "Device")
    protected Object device;
    @XmlElement(name = "Domain")
    protected UnquiesceRequest.Domain domain;

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
     *         &lt;element name="Name" type="{http://www.datapower.com/schemas/appliance/management/3.0}domain-name"/>
     *         &lt;element name="Services" type="{http://www.datapower.com/schemas/appliance/management/3.0}config-objects" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "name",
            "services"
    })
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Domain {

        @XmlElement(name = "Name", required = true)
        protected String name;
        @XmlElement(name = "Services")
        protected ConfigObjects services;
    }

}
