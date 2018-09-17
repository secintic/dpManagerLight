
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
    "doNotIncludeRAID"
})
@XmlRootElement(name = "WhenDeviceLastChangedRequest")
public class WhenDeviceLastChangedRequest {

    @XmlElement(name = "DoNotIncludeiSCSI")
    protected Object doNotIncludeiSCSI;
    @XmlElement(name = "DoNotIncludeRAID")
    protected Object doNotIncludeRAID;

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

}
