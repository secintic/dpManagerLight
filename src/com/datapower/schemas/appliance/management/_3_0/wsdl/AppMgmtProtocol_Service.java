package com.datapower.schemas.appliance.management._3_0.wsdl;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import java.net.MalformedURLException;
import java.net.URL;

@WebServiceClient(name = "app-mgmt-protocol", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0/wsdl", wsdlLocation = "file:/C:/Users/CIHANSECINTIMr/Desktop/dpManager/app-mgmt-protocol-v3.wsdl")
public class AppMgmtProtocol_Service
        extends Service {

    private final static URL APPMGMTPROTOCOL_WSDL_LOCATION;
    private final static WebServiceException APPMGMTPROTOCOL_EXCEPTION;
    private final static QName APPMGMTPROTOCOL_QNAME = new QName("http://www.datapower.com/schemas/appliance/management/3.0/wsdl", "app-mgmt-protocol");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/CIHANSECINTIMr/IdeaProjects/dpManager/app-mgmt-protocol-v3.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        APPMGMTPROTOCOL_WSDL_LOCATION = url;
        APPMGMTPROTOCOL_EXCEPTION = e;
    }

    public AppMgmtProtocol_Service() {
        super(__getWsdlLocation(), APPMGMTPROTOCOL_QNAME);
    }

    private static URL __getWsdlLocation() {
        if (APPMGMTPROTOCOL_EXCEPTION != null) {
            throw APPMGMTPROTOCOL_EXCEPTION;
        }
        return APPMGMTPROTOCOL_WSDL_LOCATION;
    }

    @WebEndpoint(name = "app-mgmt-protocol")
    public AppMgmtProtocol getAppMgmtProtocol() {
        return super.getPort(new QName("http://www.datapower.com/schemas/appliance/management/3.0/wsdl", "app-mgmt-protocol"), AppMgmtProtocol.class);
    }

}
