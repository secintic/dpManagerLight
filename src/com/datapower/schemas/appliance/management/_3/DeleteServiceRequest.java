
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
 *         &lt;element name="Domain" type="{http://www.datapower.com/schemas/appliance/management/3.0}domain-name"/>
 *         &lt;element name="ServiceObjectClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ServiceObjectName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ObjectExclusionList" type="{http://www.datapower.com/schemas/appliance/management/3.0}config-objects" minOccurs="0"/>
 *         &lt;element name="DeleteReferencedFiles" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "domain",
    "serviceObjectClass",
    "serviceObjectName",
    "objectExclusionList",
    "deleteReferencedFiles"
})
@XmlRootElement(name = "DeleteServiceRequest")
public class DeleteServiceRequest {

    @XmlElement(name = "Domain", required = true)
    protected String domain;
    @XmlElement(name = "ServiceObjectClass", required = true)
    protected String serviceObjectClass;
    @XmlElement(name = "ServiceObjectName", required = true)
    protected String serviceObjectName;
    @XmlElement(name = "ObjectExclusionList")
    protected ConfigObjects objectExclusionList;
    @XmlElement(name = "DeleteReferencedFiles", defaultValue = "true")
    protected Boolean deleteReferencedFiles;

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
    }

    /**
     * Gets the value of the serviceObjectClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceObjectClass() {
        return serviceObjectClass;
    }

    /**
     * Sets the value of the serviceObjectClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceObjectClass(String value) {
        this.serviceObjectClass = value;
    }

    /**
     * Gets the value of the serviceObjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceObjectName() {
        return serviceObjectName;
    }

    /**
     * Sets the value of the serviceObjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceObjectName(String value) {
        this.serviceObjectName = value;
    }

    /**
     * Gets the value of the objectExclusionList property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigObjects }
     *     
     */
    public ConfigObjects getObjectExclusionList() {
        return objectExclusionList;
    }

    /**
     * Sets the value of the objectExclusionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigObjects }
     *     
     */
    public void setObjectExclusionList(ConfigObjects value) {
        this.objectExclusionList = value;
    }

    /**
     * Gets the value of the deleteReferencedFiles property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeleteReferencedFiles() {
        return deleteReferencedFiles;
    }

    /**
     * Sets the value of the deleteReferencedFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleteReferencedFiles(Boolean value) {
        this.deleteReferencedFiles = value;
    }

}
