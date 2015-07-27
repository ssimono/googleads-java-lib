
package com.google.api.ads.adwords.jaxws.v201502.cm;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Use this service to manage ad parameters, which let you quickly update
 *       parameterized values (such as prices or inventory levels) in a text ad.
 *       Whereas updates to regular ad text can take hours to go live, updates to
 *       parameterized values go live in minutes.
 *       
 *       <p>To define where parameterized values appear in an ad, you insert
 *       <code>{param#:<var>default-value</var>}</code> tags in your ad text. You
 *       can use these tags in any line of display text, and also in the
 *       destination URL. When the text ad is displayed, values in these tags are
 *       replaced by the ad parameter's {@linkplain AdParam#insertionText
 *       insertion text}. <code>default-value</code> specifies the string to display
 *       if one of the following conditions is true:</p>
 *       <ul>
 *       <li>The parameter has not been set.</li>
 *       <li>The parameter's insertion text is too long for the display line.</li>
 *       <li>The ad is being shown on the
 *       {@linkplain NetworkTarget#networkCoverageType Google Display Network}.</li>
 *       </ul>
 *       <span class="constraint AdxEnabled">This is disabled for AdX.</span>
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "AdParamServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201502")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AdParamServiceInterface {


    /**
     * 
     *         Returns the ad parameters that match the criteria specified in the
     *         selector.
     *         
     *         @param serviceSelector Specifies which ad parameters to return.
     *         @return A list of ad parameters.
     *       
     * 
     * @param serviceSelector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201502.cm.AdParamPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201502")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201502", className = "com.google.api.ads.adwords.jaxws.v201502.cm.AdParamServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201502", className = "com.google.api.ads.adwords.jaxws.v201502.cm.AdParamServiceInterfacegetResponse")
    public AdParamPage get(
        @WebParam(name = "serviceSelector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201502")
        Selector serviceSelector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Sets and removes ad parameters.
     *         <p class="note"><b>Note:</b> {@code ADD} is not supported. Use {@code SET}
     *         for new ad parameters.</p>
     *         
     *         <ul class="nolist">
     *         <li>{@code SET}: Creates or updates an ad parameter, setting the new
     *         parameterized value for the given ad group / keyword pair.
     *         <li>{@code REMOVE}: Removes an ad parameter. The <code><var>default-value</var>
     *         </code> specified in the ad text will be used.</li>
     *         </ul>
     *         
     *         @param operations The operations to perform.
     *         @return A list of ad parameters, where each entry in the list is the
     *         result of applying the operation in the input list with the same index.
     *         For a {@code SET} operation, the returned ad parameter will contain the
     *         updated values. For a {@code REMOVE} operation, the returned ad parameter
     *         will simply be the ad parameter that was removed.
     *       
     * 
     * @param operations
     * @return
     *     returns java.util.List<com.google.api.ads.adwords.jaxws.v201502.cm.AdParam>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201502")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201502", className = "com.google.api.ads.adwords.jaxws.v201502.cm.AdParamServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201502", className = "com.google.api.ads.adwords.jaxws.v201502.cm.AdParamServiceInterfacemutateResponse")
    public List<AdParam> mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201502")
        List<AdParamOperation> operations)
        throws ApiException_Exception
    ;

}
