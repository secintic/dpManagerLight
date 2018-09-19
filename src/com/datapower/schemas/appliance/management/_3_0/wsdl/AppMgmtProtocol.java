package com.datapower.schemas.appliance.management._3_0.wsdl;

import com.datapower.schemas.appliance.management._3.*;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


@WebService(name = "app-mgmt-protocol", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0/wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
        ObjectFactory.class
})
public interface AppMgmtProtocol {

    /**
     * @param body
     * @return returns com.datapower.schemas.appliance.management._3.SecureBackupResponse
     * @throws Fault
     */
    @WebMethod(operationName = "SecureBackup")
    @WebResult(name = "SecureBackupResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public SecureBackupResponse secureBackup(
            @WebParam(name = "SecureBackupRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
                    SecureBackupRequest body)
            throws Fault
    ;

    /**
     * @param body
     * @return returns com.datapower.schemas.appliance.management._3.SecureRestoreResponse
     * @throws Fault
     */
    @WebMethod(operationName = "SecureRestore")
    @WebResult(name = "SecureRestoreResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public SecureRestoreResponse secureRestore(
            @WebParam(name = "SecureRestoreRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
                    SecureRestoreRequest body)
            throws Fault
    ;

    /**
     * @param body
     * @return returns com.datapower.schemas.appliance.management._3.QuiesceResponse
     * @throws Fault
     */
    @WebMethod(operationName = "Quiesce")
    @WebResult(name = "QuiesceResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public QuiesceResponse quiesce(
            @WebParam(name = "QuiesceRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
                    QuiesceRequest body)
            throws Fault
    ;

    /**
     * @param body
     * @return returns com.datapower.schemas.appliance.management._3.UnquiesceResponse
     * @throws Fault
     */
    @WebMethod(operationName = "Unquiesce")
    @WebResult(name = "UnquiesceResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public UnquiesceResponse unquiesce(
            @WebParam(name = "UnquiesceRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
                    UnquiesceRequest body)
            throws Fault
    ;

    /**
     * @param body
     * @return returns com.datapower.schemas.appliance.management._3.GetDeviceInfoResponse
     * @throws Fault
     */
    @WebMethod(operationName = "GetDeviceInfo")
    @WebResult(name = "GetDeviceInfoResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public GetDeviceInfoResponse getDeviceInfo(
            @WebParam(name = "GetDeviceInfoRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
                    GetDeviceInfoRequest body)
            throws Fault
    ;

    /**
     * @param body
     * @return returns com.datapower.schemas.appliance.management._3.GetDomainListResponse
     * @throws Fault
     */
    @WebMethod(operationName = "GetDomainList")
    @WebResult(name = "GetDomainListResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public GetDomainListResponse getDomainList(
            @WebParam(name = "GetDomainListRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
                    GetDomainListRequest body)
            throws Fault
    ;

    /**
     * @param body
     * @return returns com.datapower.schemas.appliance.management._3.GetDomainExportResponse
     * @throws Fault
     */
    @WebMethod(operationName = "GetDomainExport")
    @WebResult(name = "GetDomainExportResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public GetDomainExportResponse getDomainExport(
            @WebParam(name = "GetDomainExportRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
                    GetDomainExportRequest body)
            throws Fault
    ;

    /**
     * @param body
     * @return returns com.datapower.schemas.appliance.management._3.SetDomainExportResponse
     * @throws Fault
     */
    @WebMethod(operationName = "SetDomainExport")
    @WebResult(name = "SetDomainExportResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public SetDomainExportResponse setDomainExport(
            @WebParam(name = "SetDomainExportRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
                    SetDomainExportRequest body)
            throws Fault
    ;

    /**
     * @param body
     * @return returns com.datapower.schemas.appliance.management._3.StartDomainResponse
     * @throws Fault
     */
    @WebMethod(operationName = "StartDomain")
    @WebResult(name = "StartDomainResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public StartDomainResponse startDomain(
            @WebParam(name = "StartDomainRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
                    StartDomainRequest body)
            throws Fault
    ;

    /**
     * @param body
     * @return returns com.datapower.schemas.appliance.management._3.StopDomainResponse
     * @throws Fault
     */
    @WebMethod(operationName = "StopDomain")
    @WebResult(name = "StopDomainResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public StopDomainResponse stopDomain(
            @WebParam(name = "StopDomainRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
                    StopDomainRequest body)
            throws Fault
    ;

    /**
     * @param body
     * @return returns com.datapower.schemas.appliance.management._3.RestartDomainResponse
     * @throws Fault
     */
    @WebMethod(operationName = "RestartDomain")
    @WebResult(name = "RestartDomainResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public RestartDomainResponse restartDomain(
            @WebParam(name = "RestartDomainRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
                    RestartDomainRequest body)
            throws Fault
    ;

    /**
     * @param body
     * @return returns com.datapower.schemas.appliance.management._3.GetLogResponse
     * @throws Fault
     */
    @WebMethod(operationName = "GetLog")
    @WebResult(name = "GetLogResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public GetLogResponse getLog(
            @WebParam(name = "GetLogRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
                    GetLogRequest body)
            throws Fault
    ;

}
