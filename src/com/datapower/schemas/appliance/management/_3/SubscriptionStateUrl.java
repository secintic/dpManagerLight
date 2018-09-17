
package com.datapower.schemas.appliance.management._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for subscription-state-url complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subscription-state-url">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.datapower.com/schemas/appliance/management/3.0>subscription-state">
 *       &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subscription-state-url", propOrder = {
    "value"
})
public class SubscriptionStateUrl {

    @XmlValue
    protected SubscriptionState value;
    @XmlAttribute(name = "URL")
    protected String url;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionState }
     *     
     */
    public SubscriptionState getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionState }
     *     
     */
    public void setValue(SubscriptionState value) {
        this.value = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

}
