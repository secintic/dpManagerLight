
package com.datapower.schemas.appliance.management._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for detailed-config-object complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="detailed-config-object">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/appliance/management/3.0}config-object">
 *       &lt;sequence>
 *         &lt;element name="ReferencedObject" type="{http://www.datapower.com/schemas/appliance/management/3.0}config-object" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UserComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdminState" type="{http://www.datapower.com/schemas/appliance/management/3.0}admin-state" minOccurs="0"/>
 *         &lt;element name="OpState" type="{http://www.datapower.com/schemas/appliance/management/3.0}op-state" minOccurs="0"/>
 *         &lt;element name="ConfigState" type="{http://www.datapower.com/schemas/appliance/management/3.0}config-state" minOccurs="0"/>
 *         &lt;element name="QuiesceState" type="{http://www.datapower.com/schemas/appliance/management/3.0}quiesce-state" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="referencedExternally" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="deleted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="excluded" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detailed-config-object", propOrder = {
    "referencedObject",
    "userComments",
    "errorMessage",
    "adminState",
    "opState",
    "configState",
    "quiesceState"
})
public class DetailedConfigObject
    extends ConfigObject
{

    @XmlElement(name = "ReferencedObject")
    protected List<ConfigObject> referencedObject;
    @XmlElement(name = "UserComments")
    protected String userComments;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    @XmlElement(name = "AdminState")
    @XmlSchemaType(name = "string")
    protected AdminState adminState;
    @XmlElement(name = "OpState")
    @XmlSchemaType(name = "string")
    protected OpState opState;
    @XmlElement(name = "ConfigState")
    @XmlSchemaType(name = "string")
    protected ConfigState configState;
    @XmlElement(name = "QuiesceState")
    protected String quiesceState;
    @XmlAttribute(name = "referencedExternally")
    protected Boolean referencedExternally;
    @XmlAttribute(name = "deleted")
    protected Boolean deleted;
    @XmlAttribute(name = "excluded")
    protected Boolean excluded;

    /**
     * Gets the value of the referencedObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referencedObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferencedObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfigObject }
     * 
     * 
     */
    public List<ConfigObject> getReferencedObject() {
        if (referencedObject == null) {
            referencedObject = new ArrayList<ConfigObject>();
        }
        return this.referencedObject;
    }

    /**
     * Gets the value of the userComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserComments() {
        return userComments;
    }

    /**
     * Sets the value of the userComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserComments(String value) {
        this.userComments = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the adminState property.
     * 
     * @return
     *     possible object is
     *     {@link AdminState }
     *     
     */
    public AdminState getAdminState() {
        return adminState;
    }

    /**
     * Sets the value of the adminState property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdminState }
     *     
     */
    public void setAdminState(AdminState value) {
        this.adminState = value;
    }

    /**
     * Gets the value of the opState property.
     * 
     * @return
     *     possible object is
     *     {@link OpState }
     *     
     */
    public OpState getOpState() {
        return opState;
    }

    /**
     * Sets the value of the opState property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpState }
     *     
     */
    public void setOpState(OpState value) {
        this.opState = value;
    }

    /**
     * Gets the value of the configState property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigState }
     *     
     */
    public ConfigState getConfigState() {
        return configState;
    }

    /**
     * Sets the value of the configState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigState }
     *     
     */
    public void setConfigState(ConfigState value) {
        this.configState = value;
    }

    /**
     * Gets the value of the quiesceState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuiesceState() {
        return quiesceState;
    }

    /**
     * Sets the value of the quiesceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuiesceState(String value) {
        this.quiesceState = value;
    }

    /**
     * Gets the value of the referencedExternally property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReferencedExternally() {
        return referencedExternally;
    }

    /**
     * Sets the value of the referencedExternally property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReferencedExternally(Boolean value) {
        this.referencedExternally = value;
    }

    /**
     * Gets the value of the deleted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeleted() {
        return deleted;
    }

    /**
     * Sets the value of the deleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleted(Boolean value) {
        this.deleted = value;
    }

    /**
     * Gets the value of the excluded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcluded() {
        return excluded;
    }

    /**
     * Sets the value of the excluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcluded(Boolean value) {
        this.excluded = value;
    }

}
