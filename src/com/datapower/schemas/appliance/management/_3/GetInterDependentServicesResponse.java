
package com.datapower.schemas.appliance.management._3;

import java.util.ArrayList;
import java.util.List;
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
 *       &lt;choice>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;sequence>
 *           &lt;element name="Services" type="{http://www.datapower.com/schemas/appliance/management/3.0}detailed-config-objects"/>
 *           &lt;element name="ObjectsToBeOverwritten" type="{http://www.datapower.com/schemas/appliance/management/3.0}detailed-config-objects"/>
 *           &lt;element name="FilesToBeOverwritten" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="File" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "status",
    "services",
    "objectsToBeOverwritten",
    "filesToBeOverwritten"
})
@XmlRootElement(name = "GetInterDependentServicesResponse")
public class GetInterDependentServicesResponse {

    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "Services")
    protected DetailedConfigObjects services;
    @XmlElement(name = "ObjectsToBeOverwritten")
    protected DetailedConfigObjects objectsToBeOverwritten;
    @XmlElement(name = "FilesToBeOverwritten")
    protected GetInterDependentServicesResponse.FilesToBeOverwritten filesToBeOverwritten;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedConfigObjects }
     *     
     */
    public DetailedConfigObjects getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedConfigObjects }
     *     
     */
    public void setServices(DetailedConfigObjects value) {
        this.services = value;
    }

    /**
     * Gets the value of the objectsToBeOverwritten property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedConfigObjects }
     *     
     */
    public DetailedConfigObjects getObjectsToBeOverwritten() {
        return objectsToBeOverwritten;
    }

    /**
     * Sets the value of the objectsToBeOverwritten property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedConfigObjects }
     *     
     */
    public void setObjectsToBeOverwritten(DetailedConfigObjects value) {
        this.objectsToBeOverwritten = value;
    }

    /**
     * Gets the value of the filesToBeOverwritten property.
     * 
     * @return
     *     possible object is
     *     {@link GetInterDependentServicesResponse.FilesToBeOverwritten }
     *     
     */
    public GetInterDependentServicesResponse.FilesToBeOverwritten getFilesToBeOverwritten() {
        return filesToBeOverwritten;
    }

    /**
     * Sets the value of the filesToBeOverwritten property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetInterDependentServicesResponse.FilesToBeOverwritten }
     *     
     */
    public void setFilesToBeOverwritten(GetInterDependentServicesResponse.FilesToBeOverwritten value) {
        this.filesToBeOverwritten = value;
    }


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
     *         &lt;element name="File" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "file"
    })
    public static class FilesToBeOverwritten {

        @XmlElement(name = "File")
        protected List<String> file;

        /**
         * Gets the value of the file property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the file property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFile().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getFile() {
            if (file == null) {
                file = new ArrayList<String>();
            }
            return this.file;
        }

    }

}
