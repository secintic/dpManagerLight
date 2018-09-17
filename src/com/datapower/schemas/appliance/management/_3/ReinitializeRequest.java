
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
 *         &lt;element name="Firmware" type="{http://www.datapower.com/schemas/appliance/management/3.0}firmware"/>
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
    "firmware"
})
@XmlRootElement(name = "ReinitializeRequest")
public class ReinitializeRequest {

    @XmlElement(name = "Firmware", required = true)
    protected Firmware firmware;

    /**
     * Gets the value of the firmware property.
     * 
     * @return
     *     possible object is
     *     {@link Firmware }
     *     
     */
    public Firmware getFirmware() {
        return firmware;
    }

    /**
     * Sets the value of the firmware property.
     * 
     * @param value
     *     allowed object is
     *     {@link Firmware }
     *     
     */
    public void setFirmware(Firmware value) {
        this.firmware = value;
    }

}
