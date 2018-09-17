
package com.datapower.schemas.appliance.management._3_0.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import com.datapower.schemas.appliance.management._3.CompareConfigRequest;
import com.datapower.schemas.appliance.management._3.CompareConfigResponse;
import com.datapower.schemas.appliance.management._3.DeleteDomainRequest;
import com.datapower.schemas.appliance.management._3.DeleteDomainResponse;
import com.datapower.schemas.appliance.management._3.DeleteFileRequest;
import com.datapower.schemas.appliance.management._3.DeleteFileResponse;
import com.datapower.schemas.appliance.management._3.DeleteServiceRequest;
import com.datapower.schemas.appliance.management._3.DeleteServiceResponse;
import com.datapower.schemas.appliance.management._3.GetCryptoArtifactsRequest;
import com.datapower.schemas.appliance.management._3.GetCryptoArtifactsResponse;
import com.datapower.schemas.appliance.management._3.GetDeviceInfoRequest;
import com.datapower.schemas.appliance.management._3.GetDeviceInfoResponse;
import com.datapower.schemas.appliance.management._3.GetDeviceSettingsRequest;
import com.datapower.schemas.appliance.management._3.GetDeviceSettingsResponse;
import com.datapower.schemas.appliance.management._3.GetDomainConfigRequest;
import com.datapower.schemas.appliance.management._3.GetDomainConfigResponse;
import com.datapower.schemas.appliance.management._3.GetDomainExportRequest;
import com.datapower.schemas.appliance.management._3.GetDomainExportResponse;
import com.datapower.schemas.appliance.management._3.GetDomainListRequest;
import com.datapower.schemas.appliance.management._3.GetDomainListResponse;
import com.datapower.schemas.appliance.management._3.GetDomainStatusRequest;
import com.datapower.schemas.appliance.management._3.GetDomainStatusResponse;
import com.datapower.schemas.appliance.management._3.GetErrorReportRequest;
import com.datapower.schemas.appliance.management._3.GetErrorReportResponse;
import com.datapower.schemas.appliance.management._3.GetInterDependentServicesRequest;
import com.datapower.schemas.appliance.management._3.GetInterDependentServicesResponse;
import com.datapower.schemas.appliance.management._3.GetLogRequest;
import com.datapower.schemas.appliance.management._3.GetLogResponse;
import com.datapower.schemas.appliance.management._3.GetReferencedObjectsRequest;
import com.datapower.schemas.appliance.management._3.GetReferencedObjectsResponse;
import com.datapower.schemas.appliance.management._3.GetServiceListFromDomainRequest;
import com.datapower.schemas.appliance.management._3.GetServiceListFromDomainResponse;
import com.datapower.schemas.appliance.management._3.GetServiceListFromExportRequest;
import com.datapower.schemas.appliance.management._3.GetServiceListFromExportResponse;
import com.datapower.schemas.appliance.management._3.GetTokenRequest;
import com.datapower.schemas.appliance.management._3.GetTokenResponse;
import com.datapower.schemas.appliance.management._3.ObjectFactory;
import com.datapower.schemas.appliance.management._3.PingRequest;
import com.datapower.schemas.appliance.management._3.PingResponse;
import com.datapower.schemas.appliance.management._3.QuiesceRequest;
import com.datapower.schemas.appliance.management._3.QuiesceResponse;
import com.datapower.schemas.appliance.management._3.RebootRequest;
import com.datapower.schemas.appliance.management._3.RebootResponse;
import com.datapower.schemas.appliance.management._3.ReinitializeRequest;
import com.datapower.schemas.appliance.management._3.ReinitializeResponse;
import com.datapower.schemas.appliance.management._3.RestartDomainRequest;
import com.datapower.schemas.appliance.management._3.RestartDomainResponse;
import com.datapower.schemas.appliance.management._3.SecureBackupRequest;
import com.datapower.schemas.appliance.management._3.SecureBackupResponse;
import com.datapower.schemas.appliance.management._3.SecureRestoreRequest;
import com.datapower.schemas.appliance.management._3.SecureRestoreResponse;
import com.datapower.schemas.appliance.management._3.SetDeviceSettingsRequest;
import com.datapower.schemas.appliance.management._3.SetDeviceSettingsResponse;
import com.datapower.schemas.appliance.management._3.SetDomainConfigRequest;
import com.datapower.schemas.appliance.management._3.SetDomainConfigResponse;
import com.datapower.schemas.appliance.management._3.SetDomainExportRequest;
import com.datapower.schemas.appliance.management._3.SetDomainExportResponse;
import com.datapower.schemas.appliance.management._3.SetFileRequest;
import com.datapower.schemas.appliance.management._3.SetFileResponse;
import com.datapower.schemas.appliance.management._3.SetFirmwareRequest;
import com.datapower.schemas.appliance.management._3.SetFirmwareResponse;
import com.datapower.schemas.appliance.management._3.StartDomainRequest;
import com.datapower.schemas.appliance.management._3.StartDomainResponse;
import com.datapower.schemas.appliance.management._3.StartServiceRequest;
import com.datapower.schemas.appliance.management._3.StartServiceResponse;
import com.datapower.schemas.appliance.management._3.StopDomainRequest;
import com.datapower.schemas.appliance.management._3.StopDomainResponse;
import com.datapower.schemas.appliance.management._3.StopServiceRequest;
import com.datapower.schemas.appliance.management._3.StopServiceResponse;
import com.datapower.schemas.appliance.management._3.SubscribeRequest;
import com.datapower.schemas.appliance.management._3.SubscribeResponse;
import com.datapower.schemas.appliance.management._3.UnquiesceRequest;
import com.datapower.schemas.appliance.management._3.UnquiesceResponse;
import com.datapower.schemas.appliance.management._3.UnsubscribeRequest;
import com.datapower.schemas.appliance.management._3.UnsubscribeResponse;
import com.datapower.schemas.appliance.management._3.WAXHNActivateRequest;
import com.datapower.schemas.appliance.management._3.WAXHNActivateResponse;
import com.datapower.schemas.appliance.management._3.WhenDeviceLastChangedRequest;
import com.datapower.schemas.appliance.management._3.WhenDeviceLastChangedResponse;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "app-mgmt-protocol", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0/wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AppMgmtProtocol {


    /**
     * 
     * @param body
     * @return
     *     returns com.datapower.schemas.appliance.management._3.PingResponse
     * @throws Fault
     */
    @WebMethod(operationName = "Ping")
    @WebResult(name = "PingResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public PingResponse ping(
        @WebParam(name = "PingRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
        PingRequest body)
        throws Fault
    ;

    /**
     * 
     * @param body
     * @return
     *     returns com.datapower.schemas.appliance.management._3.GetTokenResponse
     * @throws Fault
     */
    @WebMethod(operationName = "GetToken")
    @WebResult(name = "GetTokenResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public GetTokenResponse getToken(
        @WebParam(name = "GetTokenRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
        GetTokenRequest body)
        throws Fault
    ;

    /**
     * 
     * @param body
     * @return
     *     returns com.datapower.schemas.appliance.management._3.RebootResponse
     * @throws Fault
     */
    @WebMethod(operationName = "Reboot")
    @WebResult(name = "RebootResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public RebootResponse reboot(
        @WebParam(name = "RebootRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
        RebootRequest body)
        throws Fault
    ;

    /**
     * 
     * @param body
     * @return
     *     returns com.datapower.schemas.appliance.management._3.SetFirmwareResponse
     * @throws Fault
     */
    @WebMethod(operationName = "SetFirmware")
    @WebResult(name = "SetFirmwareResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public SetFirmwareResponse setFirmware(
        @WebParam(name = "SetFirmwareRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
        SetFirmwareRequest body)
        throws Fault
    ;

    /**
     * 
     * @param body
     * @return
     *     returns com.datapower.schemas.appliance.management._3.ReinitializeResponse
     * @throws Fault
     */
    @WebMethod(operationName = "Reinitialize")
    @WebResult(name = "ReinitializeResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public ReinitializeResponse reinitialize(
        @WebParam(name = "ReinitializeRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
        ReinitializeRequest body)
        throws Fault
    ;

    /**
     * 
     * @param body
     * @return
     *     returns com.datapower.schemas.appliance.management._3.SecureBackupResponse
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
     * 
     * @param body
     * @return
     *     returns com.datapower.schemas.appliance.management._3.SecureRestoreResponse
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
     * 
     * @param body
     * @return
     *     returns com.datapower.schemas.appliance.management._3.WhenDeviceLastChangedResponse
     * @throws Fault
     */
    @WebMethod(operationName = "WhenDeviceLastChanged")
    @WebResult(name = "WhenDeviceLastChangedResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public WhenDeviceLastChangedResponse whenDeviceLastChanged(
        @WebParam(name = "WhenDeviceLastChangedRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
        WhenDeviceLastChangedRequest body)
        throws Fault
    ;

    /**
     * 
     * @param body
     * @return
     *     returns com.datapower.schemas.appliance.management._3.QuiesceResponse
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
     * 
     * @param body
     * @return
     *     returns com.datapower.schemas.appliance.management._3.UnquiesceResponse
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
     * 
     * @param body
     * @return
     *     returns com.datapower.schemas.appliance.management._3.GetDeviceInfoResponse
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
     * 
     * @param body
     * @return
     *     returns com.datapower.schemas.appliance.management._3.GetDeviceSettingsResponse
     * @throws Fault
     */
    @WebMethod(operationName = "GetDeviceSettings")
    @WebResult(name = "GetDeviceSettingsResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public GetDeviceSettingsResponse getDeviceSettings(
        @WebParam(name = "GetDeviceSettingsRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
        GetDeviceSettingsRequest body)
        throws Fault
    ;

    /**
     * 
     * @param body
     * @return
     *     returns com.datapower.schemas.appliance.management._3.SetDeviceSettingsResponse
     * @throws Fault
     */
    @WebMethod(operationName = "SetDeviceSettings")
    @WebResult(name = "SetDeviceSettingsResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public SetDeviceSettingsResponse setDeviceSettings(
        @WebParam(name = "SetDeviceSettingsRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
        SetDeviceSettingsRequest body)
        throws Fault
    ;

    /**
     * 
     * @param body
     * @return
     *     returns com.datapower.schemas.appliance.management._3.GetErrorReportResponse
     * @throws Fault
     */
    @WebMethod(operationName = "GetErrorReport")
    @WebResult(name = "GetErrorReportResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public GetErrorReportResponse getErrorReport(
        @WebParam(name = "GetErrorReportRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
        GetErrorReportRequest body)
        throws Fault
    ;

    /**
     * 
     * @param body
     * @return
     *     returns com.datapower.schemas.appliance.management._3.SubscribeResponse
     * @throws Fault
     */
    @WebMethod(operationName = "Subscribe")
    @WebResult(name = "SubscribeResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public SubscribeResponse subscribe(
        @WebParam(name = "SubscribeRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
        SubscribeRequest body)
        throws Fault
    ;

    /**
     * 
     * @param body
     * @return
     *     returns com.datapower.schemas.appliance.management._3.UnsubscribeResponse
     * @throws Fault
     */
    @WebMethod(operationName = "Unsubscribe")
    @WebResult(name = "UnsubscribeResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public UnsubscribeResponse unsubscribe(
        @WebParam(name = "UnsubscribeRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
        UnsubscribeRequest body)
        throws Fault
    ;

    /**
     * 
     * @param body
     * @return
     *     returns com.datapower.schemas.appliance.management._3.GetDomainListResponse
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
     * 
     * @param body
     * @return
     *     returns com.datapower.schemas.appliance.management._3.GetDomainStatusResponse
     * @throws Fault
     */
    @WebMethod(operationName = "GetDomainStatus")
    @WebResult(name = "GetDomainStatusResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public GetDomainStatusResponse getDomainStatus(
        @WebParam(name = "GetDomainStatusRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
        GetDomainStatusRequest body)
        throws Fault
    ;

    /**
     * 
     * @param body
     * @return
     *     returns com.datapower.schemas.appliance.management._3.GetDomainExportResponse
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
     * 
     * @param body
     * @return
     *     returns com.datapower.schemas.appliance.management._3.SetDomainExportResponse
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
     * 
     * @param body
     * @return
     *     returns com.datapower.schemas.appliance.management._3.GetDomainConfigResponse
     * @throws Fault
     */
    @WebMethod(operationName = "GetDomainConfig")
    @WebResult(name = "GetDomainConfigResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public GetDomainConfigResponse getDomainConfig(
        @WebParam(name = "GetDomainConfigRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
        GetDomainConfigRequest body)
        throws Fault
    ;

    /**
     * 
     * @param body
     * @return
     *     returns com.datapower.schemas.appliance.management._3.SetDomainConfigResponse
     * @throws Fault
     */
    @WebMethod(operationName = "SetDomainConfig")
    @WebResult(name = "SetDomainConfigResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public SetDomainConfigResponse setDomainConfig(
        @WebParam(name = "SetDomainConfigRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
        SetDomainConfigRequest body)
        throws Fault
    ;

    /**
     * 
     * @param body
     * @return
     *     returns com.datapower.schemas.appliance.management._3.DeleteDomainResponse
     * @throws Fault
     */
    @WebMethod(operationName = "DeleteDomain")
    @WebResult(name = "DeleteDomainResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public DeleteDomainResponse deleteDomain(
        @WebParam(name = "DeleteDomainRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
        DeleteDomainRequest body)
        throws Fault
    ;

    /**
     * 
     * @param body
     * @return
     *     returns com.datapower.schemas.appliance.management._3.StartDomainResponse
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
     * 
     * @param body
     * @return
     *     returns com.datapower.schemas.appliance.management._3.StopDomainResponse
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
     * 
     * @param body
     * @return
     *     returns com.datapower.schemas.appliance.management._3.RestartDomainResponse
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
     * 
     * @param body
     * @return
     *     returns com.datapower.schemas.appliance.management._3.GetCryptoArtifactsResponse
     * @throws Fault
     */
    @WebMethod(operationName = "GetCryptoArtifacts")
    @WebResult(name = "GetCryptoArtifactsResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public GetCryptoArtifactsResponse getCryptoArtifacts(
        @WebParam(name = "GetCryptoArtifactsRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
        GetCryptoArtifactsRequest body)
        throws Fault
    ;

    /**
     * 
     * @param body
     * @return
     *     returns com.datapower.schemas.appliance.management._3.SetFileResponse
     * @throws Fault
     */
    @WebMethod(operationName = "SetFile")
    @WebResult(name = "SetFileResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public SetFileResponse setFile(
        @WebParam(name = "SetFileRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
        SetFileRequest body)
        throws Fault
    ;

    /**
     * 
     * @param body
     * @return
     *     returns com.datapower.schemas.appliance.management._3.CompareConfigResponse
     * @throws Fault
     */
    @WebMethod(operationName = "CompareConfig")
    @WebResult(name = "CompareConfigResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public CompareConfigResponse compareConfig(
        @WebParam(name = "CompareConfigRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
        CompareConfigRequest body)
        throws Fault
    ;

    /**
     * 
     * @param body
     * @return
     *     returns com.datapower.schemas.appliance.management._3.GetLogResponse
     * @throws Fault
     */
    @WebMethod(operationName = "GetLog")
    @WebResult(name = "GetLogResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public GetLogResponse getLog(
        @WebParam(name = "GetLogRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
        GetLogRequest body)
        throws Fault
    ;

    /**
     * 
     * @param body
     * @return
     *     returns com.datapower.schemas.appliance.management._3.WAXHNActivateResponse
     * @throws Fault
     */
    @WebMethod(operationName = "WAXHNActivate")
    @WebResult(name = "WAXHNActivateResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public WAXHNActivateResponse waxhnActivate(
        @WebParam(name = "WAXHNActivateRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
        WAXHNActivateRequest body)
        throws Fault
    ;

    /**
     * 
     * @param body
     * @return
     *     returns com.datapower.schemas.appliance.management._3.GetServiceListFromExportResponse
     * @throws Fault
     */
    @WebMethod(operationName = "GetServiceListFromExport")
    @WebResult(name = "GetServiceListFromExportResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public GetServiceListFromExportResponse getServiceListFromExport(
        @WebParam(name = "GetServiceListFromExportRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
        GetServiceListFromExportRequest body)
        throws Fault
    ;

    /**
     * 
     * @param body
     * @return
     *     returns com.datapower.schemas.appliance.management._3.GetInterDependentServicesResponse
     * @throws Fault
     */
    @WebMethod(operationName = "GetInterDependentServices")
    @WebResult(name = "GetInterDependentServicesResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public GetInterDependentServicesResponse getInterDependentServices(
        @WebParam(name = "GetInterDependentServicesRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
        GetInterDependentServicesRequest body)
        throws Fault
    ;

    /**
     * 
     * @param body
     * @return
     *     returns com.datapower.schemas.appliance.management._3.GetServiceListFromDomainResponse
     * @throws Fault
     */
    @WebMethod(operationName = "GetServiceListFromDomain")
    @WebResult(name = "GetServiceListFromDomainResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public GetServiceListFromDomainResponse getServiceListFromDomain(
        @WebParam(name = "GetServiceListFromDomainRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
        GetServiceListFromDomainRequest body)
        throws Fault
    ;

    /**
     * 
     * @param body
     * @return
     *     returns com.datapower.schemas.appliance.management._3.StartServiceResponse
     * @throws Fault
     */
    @WebMethod(operationName = "StartService")
    @WebResult(name = "StartServiceResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public StartServiceResponse startService(
        @WebParam(name = "StartServiceRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
        StartServiceRequest body)
        throws Fault
    ;

    /**
     * 
     * @param body
     * @return
     *     returns com.datapower.schemas.appliance.management._3.StopServiceResponse
     * @throws Fault
     */
    @WebMethod(operationName = "StopService")
    @WebResult(name = "StopServiceResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public StopServiceResponse stopService(
        @WebParam(name = "StopServiceRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
        StopServiceRequest body)
        throws Fault
    ;

    /**
     * 
     * @param body
     * @return
     *     returns com.datapower.schemas.appliance.management._3.GetReferencedObjectsResponse
     * @throws Fault
     */
    @WebMethod(operationName = "GetReferencedObjects")
    @WebResult(name = "GetReferencedObjectsResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public GetReferencedObjectsResponse getReferencedObjects(
        @WebParam(name = "GetReferencedObjectsRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
        GetReferencedObjectsRequest body)
        throws Fault
    ;

    /**
     * 
     * @param body
     * @return
     *     returns com.datapower.schemas.appliance.management._3.DeleteServiceResponse
     * @throws Fault
     */
    @WebMethod(operationName = "DeleteService")
    @WebResult(name = "DeleteServiceResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public DeleteServiceResponse deleteService(
        @WebParam(name = "DeleteServiceRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
        DeleteServiceRequest body)
        throws Fault
    ;

    /**
     * 
     * @param body
     * @return
     *     returns com.datapower.schemas.appliance.management._3.DeleteFileResponse
     * @throws Fault
     */
    @WebMethod(operationName = "DeleteFile")
    @WebResult(name = "DeleteFileResponse", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
    public DeleteFileResponse deleteFile(
        @WebParam(name = "DeleteFileRequest", targetNamespace = "http://www.datapower.com/schemas/appliance/management/3.0", partName = "body")
        DeleteFileRequest body)
        throws Fault
    ;

}
