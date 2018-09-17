package org.ibm.dp;


import com.datapower.schemas.appliance.management._3.GetDeviceInfoRequest;
import com.datapower.schemas.appliance.management._3.GetDeviceInfoResponse;
import com.datapower.schemas.appliance.management._3_0.wsdl.AppMgmtProtocol;
import com.datapower.schemas.appliance.management._3_0.wsdl.AppMgmtProtocol_Service;
import com.datapower.schemas.appliance.management._3_0.wsdl.Fault;

import javax.net.ssl.*;
import javax.xml.ws.BindingProvider;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        DatapowerCredentials datapowerCredentials = getServerInformationFromUser();
        configureSSL();
        AppMgmtProtocol appMgmtProtocol = configureBindingProvider(datapowerCredentials);
        try {
            GetDeviceInfoResponse getDeviceInfoResponse = appMgmtProtocol.getDeviceInfo(new GetDeviceInfoRequest());
            System.out.println(getDeviceInfoResponse.toString());
        } catch (Fault fault) {
            fault.printStackTrace();
        }
    }

    private static DatapowerCredentials getServerInformationFromUser() {
        Scanner scanner = new Scanner(System.in);
        DatapowerCredentials datapowerCredentials = new DatapowerCredentials();
        System.out.print("Please Enter Datapower IP or Hostname: ");
        datapowerCredentials.setHost(scanner.next());
        System.out.print("Please Enter Datapower Port Number: ");
        datapowerCredentials.setPort(scanner.nextInt());
        System.out.print("Please Enter Datapower Username: ");
        datapowerCredentials.setUsername(scanner.next());
        System.out.print("Please Enter Datapower Password: ");
        datapowerCredentials.setPassword(scanner.next());
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