
package com.datapower.schemas.appliance.management._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *       &lt;sequence>
 *         &lt;element name="MaxCacheSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
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
    "maxCacheSize"
})
@XmlRootElement(name = "WAXHNActivateRequest")
public class WAXHNActivateRequest {

    @XmlElement(name = "MaxCacheSize")
    @XmlSchemaType(name = "unsignedInt")
    protected long maxCacheSize;

    /**
     * Gets the value of the maxCacheSize property.
     * 
     */
    public long getMaxCacheSize() {
        return maxCacheSize;
    }

    /**
     * Sets the value of the maxCacheSize property.
     * 
     */
    public void setMaxCacheSize(long value) {
        this.maxCacheSize = value;
    }

}
