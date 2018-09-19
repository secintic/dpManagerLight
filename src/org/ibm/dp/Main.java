package org.ibm.dp;


import com.datapower.schemas.appliance.management._3.*;
import com.datapower.schemas.appliance.management._3_0.wsdl.AppMgmtProtocol;
import com.datapower.schemas.appliance.management._3_0.wsdl.AppMgmtProtocol_Service;
import com.datapower.schemas.appliance.management._3_0.wsdl.Fault;

import javax.net.ssl.*;
import javax.xml.ws.BindingProvider;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;

public class Main {

    public static void main(String[] args) throws Exception {
        DatapowerCredentials datapowerCredentials = getServerInformationFromUser();
        configureSSL();
        AppMgmtProtocol appMgmtProtocol = configureBindingProvider(datapowerCredentials);
        String operation = "domainBackup";
        try {
            switch (operation) {
                case "secureBackup":
                    SecureBackupResponse secureBackupResponse = appMgmtProtocol.secureBackup(new SecureBackupRequest());
                    break;
                case "secureRestore":
                    SecureRestoreResponse secureRestoreResponse = appMgmtProtocol.secureRestore(new SecureRestoreRequest());
                case "domainBackup":
                    getDomainBackup(appMgmtProtocol);
                    break;
                case "domainRestore":
                    SetDomainExportResponse setDomainExportResponse = appMgmtProtocol.setDomainExport(new SetDomainExportRequest());
                    break;

            }
        } catch (Fault fault) {
            fault.printStackTrace();
        }
    }

    private static void getDomainBackup(AppMgmtProtocol appMgmtProtocol) throws Fault, IOException {
        GetDomainListResponse getDomainListResponse = appMgmtProtocol.getDomainList(new GetDomainListRequest());
        for (String domainName : getDomainListResponse.getDomain()) {
            GetDomainExportResponse getDomainExportResponse = appMgmtProtocol.getDomainExport(new GetDomainExportRequest(domainName));
            writeResponseToFile(getDomainExportResponse, "export" + domainName + ".zip");
        }
    }

    private static void writeResponseToFile(GetDomainExportResponse getDomainExportResponse, String fileName) throws IOException {
        byte bytes[] = getDomainExportResponse.getConfig().getValue();
        File file = new File(fileName);
        BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(file));
        writer.write(bytes);
        writer.flush();
        writer.close();
    }

    private static DatapowerCredentials getServerInformationFromUser() {
        DatapowerCredentials datapowerCredentials = new DatapowerCredentials();
        datapowerCredentials.setHost("192.168.68.2");
        datapowerCredentials.setPort(5550);
        datapowerCredentials.setUsername("admin");
        datapowerCredentials.setPassword("passw0rd");

        return datapowerCredentials;
    }

    private static AppMgmtProtocol configureBindingProvider(DatapowerCredentials datapowerCredentials) {
        AppMgmtProtocol_Service appMgmtProtocol_service = new AppMgmtProtocol_Service();
        AppMgmtProtocol appMgmtProtocol = appMgmtProtocol_service.getAppMgmtProtocol();
        BindingProvider bindingProvider = (BindingProvider) appMgmtProtocol;
        bindingProvider.getRequestContext().put(
                BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                "https://" + datapowerCredentials.getHost() + ":" + datapowerCredentials.getPort() + "/service/mgmt/amp/3.0");
        bindingProvider.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, datapowerCredentials.getUsername());
        bindingProvider.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, datapowerCredentials.getPassword());
        return appMgmtProtocol;
    }

    private static void configureSSL() throws NoSuchAlgorithmException, KeyManagementException {
        TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager() {
            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }

            public void checkClientTrusted(X509Certificate[] certs, String authType) {
            }

            public void checkServerTrusted(X509Certificate[] certs, String authType) {
            }
        }};
        SSLContext sc = SSLContext.getInstance("SSL");
        HostnameVerifier hv = (arg0, arg1) -> true;
        sc.init(null, trustAllCerts, new java.security.SecureRandom());
        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        HttpsURLConnection.setDefaultHostnameVerifier(hv);
    }
}