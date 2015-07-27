
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
@WebServiceClient(name = "LiveStreamEventService", targetNamespace = "https://www.google.com/apis/ads/publisher/v201405", wsdlLocation = "https://ads.google.com/apis/ads/publisher/v201405/LiveStreamEventService?wsdl")
public class LiveStreamEventService
    extends Service
{

    private final static URL LIVESTREAMEVENTSERVICE_WSDL_LOCATION;
    private final static WebServiceException LIVESTREAMEVENTSERVICE_EXCEPTION;
    private final static QName LIVESTREAMEVENTSERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v201405", "LiveStreamEventService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://ads.google.com/apis/ads/publisher/v201405/LiveStreamEventService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LIVESTREAMEVENTSERVICE_WSDL_LOCATION = url;
        LIVESTREAMEVENTSERVICE_EXCEPTION = e;
    }

    public LiveStreamEventService() {
        super(__getWsdlLocation(), LIVESTREAMEVENTSERVICE_QNAME);
    }

    public LiveStreamEventService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns LiveStreamEventServiceInterface
     */
    @WebEndpoint(name = "LiveStreamEventServiceInterfacePort")
    public LiveStreamEventServiceInterface getLiveStreamEventServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201405", "LiveStreamEventServiceInterfacePort"), LiveStreamEventServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LiveStreamEventServiceInterface
     */
    @WebEndpoint(name = "LiveStreamEventServiceInterfacePort")
    public LiveStreamEventServiceInterface getLiveStreamEventServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201405", "LiveStreamEventServiceInterfacePort"), LiveStreamEventServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LIVESTREAMEVENTSERVICE_EXCEPTION!= null) {
            throw LIVESTREAMEVENTSERVICE_EXCEPTION;
        }
        return LIVESTREAMEVENTSERVICE_WSDL_LOCATION;
    }

}
