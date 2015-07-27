
package com.google.api.ads.adwords.jaxws.v201506.mcm;

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
@WebServiceClient(name = "AccountLabelService", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201506", wsdlLocation = "https://adwords.google.com/api/adwords/mcm/v201506/AccountLabelService?wsdl")
public class AccountLabelService
    extends Service
{

    private final static URL ACCOUNTLABELSERVICE_WSDL_LOCATION;
    private final static WebServiceException ACCOUNTLABELSERVICE_EXCEPTION;
    private final static QName ACCOUNTLABELSERVICE_QNAME = new QName("https://adwords.google.com/api/adwords/mcm/v201506", "AccountLabelService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://adwords.google.com/api/adwords/mcm/v201506/AccountLabelService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ACCOUNTLABELSERVICE_WSDL_LOCATION = url;
        ACCOUNTLABELSERVICE_EXCEPTION = e;
    }

    public AccountLabelService() {
        super(__getWsdlLocation(), ACCOUNTLABELSERVICE_QNAME);
    }

    public AccountLabelService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns AccountLabelServiceInterface
     */
    @WebEndpoint(name = "AccountLabelServiceInterfacePort")
    public AccountLabelServiceInterface getAccountLabelServiceInterfacePort() {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/mcm/v201506", "AccountLabelServiceInterfacePort"), AccountLabelServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AccountLabelServiceInterface
     */
    @WebEndpoint(name = "AccountLabelServiceInterfacePort")
    public AccountLabelServiceInterface getAccountLabelServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/mcm/v201506", "AccountLabelServiceInterfacePort"), AccountLabelServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ACCOUNTLABELSERVICE_EXCEPTION!= null) {
            throw ACCOUNTLABELSERVICE_EXCEPTION;
        }
        return ACCOUNTLABELSERVICE_WSDL_LOCATION;
    }

}
