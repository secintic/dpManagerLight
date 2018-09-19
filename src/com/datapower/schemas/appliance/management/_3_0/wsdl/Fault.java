package com.datapower.schemas.appliance.management._3_0.wsdl;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 */
@WebFault(name = "Fault", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0")
public class Fault
        extends Exception {

    /**
     * Java type that goes as soapenv:Fault detail element.
     */
    private com.datapower.schemas.appliance.management._3.Fault faultInfo;

    /**
     * @param faultInfo
     * @param message
     */
    public Fault(String message, com.datapower.schemas.appliance.management._3.Fault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * @param faultInfo
     * @param cause
     * @param message
     */
    public Fault(String message, com.datapower.schemas.appliance.management._3.Fault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * @return returns fault bean: com.datapower.schemas.appliance.management._3.Fault
     */
    public com.datapower.schemas.appliance.management._3.Fault getFaultInfo() {
        return faultInfo;
    }

}
