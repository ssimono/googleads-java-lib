
package com.google.api.ads.adwords.jaxws.v201502.mcm;

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
@WebServiceClient(name = "CustomerService", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201502", wsdlLocation = "https://adwords.google.com/api/adwords/mcm/v201502/CustomerService?wsdl")
public class CustomerService
    extends Service
{

    private final static URL CUSTOMERSERVICE_WSDL_LOCATION;
    private final static WebServiceException CUSTOMERSERVICE_EXCEPTION;
    private final static QName CUSTOMERSERVICE_QNAME = new QName("https://adwords.google.com/api/adwords/mcm/v201502", "CustomerService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://adwords.google.com/api/adwords/mcm/v201502/CustomerService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CUSTOMERSERVICE_WSDL_LOCATION = url;
        CUSTOMERSERVICE_EXCEPTION = e;
    }

    public CustomerService() {
        super(__getWsdlLocation(), CUSTOMERSERVICE_QNAME);
    }

    public CustomerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns CustomerServiceInterface
     */
    @WebEndpoint(name = "CustomerServiceInterfacePort")
    public CustomerServiceInterface getCustomerServiceInterfacePort() {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/mcm/v201502", "CustomerServiceInterfacePort"), CustomerServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CustomerServiceInterface
     */
    @WebEndpoint(name = "CustomerServiceInterfacePort")
    public CustomerServiceInterface getCustomerServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/mcm/v201502", "CustomerServiceInterfacePort"), CustomerServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CUSTOMERSERVICE_EXCEPTION!= null) {
            throw CUSTOMERSERVICE_EXCEPTION;
        }
        return CUSTOMERSERVICE_WSDL_LOCATION;
    }

}
