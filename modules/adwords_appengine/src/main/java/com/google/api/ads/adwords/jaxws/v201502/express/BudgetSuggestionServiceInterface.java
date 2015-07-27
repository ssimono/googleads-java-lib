
package com.google.api.ads.adwords.jaxws.v201502.express;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       A service for budget suggestion.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "BudgetSuggestionServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/express/v201502")
@XmlSeeAlso({
    com.google.api.ads.adwords.jaxws.v201502.cm.ObjectFactory.class,
    com.google.api.ads.adwords.jaxws.v201502.express.ObjectFactory.class
})
public interface BudgetSuggestionServiceInterface {


    /**
     * 
     *         Retrieves the budget suggestion for the specified criteria in the given selector based on
     *         co-trigger data.
     *         @param selector the selector specifying the budget suggestion to return
     *         @return budget suggestion identified by the selector
     *       
     * 
     * @param selector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201502.express.BudgetSuggestion
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/express/v201502")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/express/v201502", className = "com.google.api.ads.adwords.jaxws.v201502.express.BudgetSuggestionServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/express/v201502", className = "com.google.api.ads.adwords.jaxws.v201502.express.BudgetSuggestionServiceInterfacegetResponse")
    public BudgetSuggestion get(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/express/v201502")
        BudgetSuggestionSelector selector)
        throws ApiException
    ;

}
