
package com.google.api.ads.dfp.jaxws.v201405;

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
@WebServiceClient(name = "RateCardCustomizationService", targetNamespace = "https://www.google.com/apis/ads/publisher/v201405", wsdlLocation = "https://ads.google.com/apis/ads/publisher/v201405/RateCardCustomizationService?wsdl")
public class RateCardCustomizationService
    extends Service
{

    private final static URL RATECARDCUSTOMIZATIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException RATECARDCUSTOMIZATIONSERVICE_EXCEPTION;
    private final static QName RATECARDCUSTOMIZATIONSERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v201405", "RateCardCustomizationService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://ads.google.com/apis/ads/publisher/v201405/RateCardCustomizationService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RATECARDCUSTOMIZATIONSERVICE_WSDL_LOCATION = url;
        RATECARDCUSTOMIZATIONSERVICE_EXCEPTION = e;
    }

    public RateCardCustomizationService() {
        super(__getWsdlLocation(), RATECARDCUSTOMIZATIONSERVICE_QNAME);
    }

    public RateCardCustomizationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns RateCardCustomizationServiceInterface
     */
    @WebEndpoint(name = "RateCardCustomizationServiceInterfacePort")
    public RateCardCustomizationServiceInterface getRateCardCustomizationServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201405", "RateCardCustomizationServiceInterfacePort"), RateCardCustomizationServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RateCardCustomizationServiceInterface
     */
    @WebEndpoint(name = "RateCardCustomizationServiceInterfacePort")
    public RateCardCustomizationServiceInterface getRateCardCustomizationServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201405", "RateCardCustomizationServiceInterfacePort"), RateCardCustomizationServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RATECARDCUSTOMIZATIONSERVICE_EXCEPTION!= null) {
            throw RATECARDCUSTOMIZATIONSERVICE_EXCEPTION;
        }
        return RATECARDCUSTOMIZATIONSERVICE_WSDL_LOCATION;
    }

}
