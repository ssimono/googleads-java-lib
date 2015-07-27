
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "ApiExceptionFault", targetNamespace = "https://www.google.com/apis/ads/publisher/v201505")
public class ApiException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ApiException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ApiException_Exception(String message, ApiException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public ApiException_Exception(String message, ApiException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.google.api.ads.dfp.jaxws.v201505.ApiException
     */
    public ApiException getFaultInfo() {
        return faultInfo;
    }

}
