
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
@WebServiceClient(name = "FeedMappingService", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201502", wsdlLocation = "https://adwords.google.com/api/adwords/cm/v201502/FeedMappingService?wsdl")
public class FeedMappingService
    extends Service
{

    private final static URL FEEDMAPPINGSERVICE_WSDL_LOCATION;
    private final static WebServiceException FEEDMAPPINGSERVICE_EXCEPTION;
    private final static QName FEEDMAPPINGSERVICE_QNAME = new QName("https://adwords.google.com/api/adwords/cm/v201502", "FeedMappingService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://adwords.google.com/api/adwords/cm/v201502/FeedMappingService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        FEEDMAPPINGSERVICE_WSDL_LOCATION = url;
        FEEDMAPPINGSERVICE_EXCEPTION = e;
    }

    public FeedMappingService() {
        super(__getWsdlLocation(), FEEDMAPPINGSERVICE_QNAME);
    }

    public FeedMappingService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns FeedMappingServiceInterface
     */
    @WebEndpoint(name = "FeedMappingServiceInterfacePort")
    public FeedMappingServiceInterface getFeedMappingServiceInterfacePort() {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201502", "FeedMappingServiceInterfacePort"), FeedMappingServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FeedMappingServiceInterface
     */
    @WebEndpoint(name = "FeedMappingServiceInterfacePort")
    public FeedMappingServiceInterface getFeedMappingServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201502", "FeedMappingServiceInterfacePort"), FeedMappingServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (FEEDMAPPINGSERVICE_EXCEPTION!= null) {
            throw FEEDMAPPINGSERVICE_EXCEPTION;
        }
        return FEEDMAPPINGSERVICE_WSDL_LOCATION;
    }

}
