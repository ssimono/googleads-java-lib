
package com.google.api.ads.adwords.jaxws.v201502.cm;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "AdGroupExtensionSettingService", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201502", wsdlLocation = "https://adwords.google.com/api/adwords/cm/v201502/AdGroupExtensionSettingService?wsdl")
public class AdGroupExtensionSettingService
    extends Service
{

    private final static URL ADGROUPEXTENSIONSETTINGSERVICE_WSDL_LOCATION;
    private final static WebServiceException ADGROUPEXTENSIONSETTINGSERVICE_EXCEPTION;
    private final static QName ADGROUPEXTENSIONSETTINGSERVICE_QNAME = new QName("https://adwords.google.com/api/adwords/cm/v201502", "AdGroupExtensionSettingService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://adwords.google.com/api/adwords/cm/v201502/AdGroupExtensionSettingService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ADGROUPEXTENSIONSETTINGSERVICE_WSDL_LOCATION = url;
        ADGROUPEXTENSIONSETTINGSERVICE_EXCEPTION = e;
    }

    public AdGroupExtensionSettingService() {
        super(__getWsdlLocation(), ADGROUPEXTENSIONSETTINGSERVICE_QNAME);
    }

    public AdGroupExtensionSettingService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns AdGroupExtensionSettingServiceInterface
     */
    @WebEndpoint(name = "AdGroupExtensionSettingServiceInterfacePort")
    public AdGroupExtensionSettingServiceInterface getAdGroupExtensionSettingServiceInterfacePort() {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201502", "AdGroupExtensionSettingServiceInterfacePort"), AdGroupExtensionSettingServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AdGroupExtensionSettingServiceInterface
     */
    @WebEndpoint(name = "AdGroupExtensionSettingServiceInterfacePort")
    public AdGroupExtensionSettingServiceInterface getAdGroupExtensionSettingServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201502", "AdGroupExtensionSettingServiceInterfacePort"), AdGroupExtensionSettingServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ADGROUPEXTENSIONSETTINGSERVICE_EXCEPTION!= null) {
            throw ADGROUPEXTENSIONSETTINGSERVICE_EXCEPTION;
        }
        return ADGROUPEXTENSIONSETTINGSERVICE_WSDL_LOCATION;
    }

}
