
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
@WebServiceClient(name = "ManagedCustomerService", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201502", wsdlLocation = "https://adwords.google.com/api/adwords/mcm/v201502/ManagedCustomerService?wsdl")
public class ManagedCustomerService
    extends Service
{

    private final static URL MANAGEDCUSTOMERSERVICE_WSDL_LOCATION;
    private final static WebServiceException MANAGEDCUSTOMERSERVICE_EXCEPTION;
    private final static QName MANAGEDCUSTOMERSERVICE_QNAME = new QName("https://adwords.google.com/api/adwords/mcm/v201502", "ManagedCustomerService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://adwords.google.com/api/adwords/mcm/v201502/ManagedCustomerService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MANAGEDCUSTOMERSERVICE_WSDL_LOCATION = url;
        MANAGEDCUSTOMERSERVICE_EXCEPTION = e;
    }

    public ManagedCustomerService() {
        super(__getWsdlLocation(), MANAGEDCUSTOMERSERVICE_QNAME);
    }

    public ManagedCustomerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns ManagedCustomerServiceInterface
     */
    @WebEndpoint(name = "ManagedCustomerServiceInterfacePort")
    public ManagedCustomerServiceInterface getManagedCustomerServiceInterfacePort() {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/mcm/v201502", "ManagedCustomerServiceInterfacePort"), ManagedCustomerServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ManagedCustomerServiceInterface
     */
    @WebEndpoint(name = "ManagedCustomerServiceInterfacePort")
    public ManagedCustomerServiceInterface getManagedCustomerServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/mcm/v201502", "ManagedCustomerServiceInterfacePort"), ManagedCustomerServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MANAGEDCUSTOMERSERVICE_EXCEPTION!= null) {
            throw MANAGEDCUSTOMERSERVICE_EXCEPTION;
        }
        return MANAGEDCUSTOMERSERVICE_WSDL_LOCATION;
    }

}
