
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
 *       Use this service to manage campaigns. A {@linkplain Campaign campaign}
 *       organizes one or more ad groups together and has its own budget, bidding
 *       strategy, serving date range, and targeting settings (managed using
 *       {@link CampaignCriterionService}). You can also set campaign-wide ad
 *       extensions using {@link CampaignExtensionSettingService}.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "CampaignServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201502")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CampaignServiceInterface {


    /**
     * 
     *         Returns the list of campaigns that meet the selector criteria.
     *         
     *         @param serviceSelector the selector specifying the {@link Campaign}s to return.
     *         @return A list of campaigns.
     *         @throws ApiException if problems occurred while fetching campaign information.
     *       
     * 
     * @param serviceSelector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201502.cm.CampaignPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201502")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201502", className = "com.google.api.ads.adwords.jaxws.v201502.cm.CampaignServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201502", className = "com.google.api.ads.adwords.jaxws.v201502.cm.CampaignServiceInterfacegetResponse")
    public CampaignPage get(
        @WebParam(name = "serviceSelector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201502")
        Selector serviceSelector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Adds, updates, or removes campaigns.
     *         <p class="note"><b>Note:</b> {@link CampaignOperation} does not support the
     *         <code>REMOVE</code> operator. To remove a campaign, set its
     *         {@link Campaign#status status} to {@code REMOVED}.</p>
     *         @param operations A list of unique operations.
     *         The same campaign cannot be specified in more than one operation.
     *         @return The list of updated campaigns, returned in the same order as the
     *         <code>operations</code> array.
     *         @throws ApiException if problems occurred while updating campaign information.
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201502.cm.CampaignReturnValue
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201502")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201502", className = "com.google.api.ads.adwords.jaxws.v201502.cm.CampaignServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201502", className = "com.google.api.ads.adwords.jaxws.v201502.cm.CampaignServiceInterfacemutateResponse")
    public CampaignReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201502")
        List<CampaignOperation> operations)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Adds labels to the {@linkplain Campaign campaign} or removes
     *         {@linkplain com.google.ads.api.services.campaignmgmt.label.Label label}s from the
     *         {@linkplain Campaign campaign}.
     *         <p>Add - Apply an existing label to an existing
     *         {@linkplain Campaign campaign}. The {@code campaignId} must reference an existing
     *         {@linkplain Campaign}. The {@code labelId} must reference an existing
     *         {@linkplain com.google.ads.api.services.campaignmgmt.label.Label label}.</p>
     *         <p>Remove - Removes the link between the specified
     *         {@linkplain Campaign campaign} and
     *         {@linkplain com.google.ads.api.services.campaignmgmt.label.Label label}.</p>
     *         @param operations the operations to apply.
     *         @return a list of {@linkplain CampaignLabel}s where each entry in the list is the result of
     *         applying the operation in the input list with the same index. For an
     *         add operation, the returned CampaignLabel contains the CampaignId and the LabelId.
     *         In the case of a remove operation, the returned CampaignLabel will only have CampaignId.
     *         @throws ApiException when there are one or more errors with the request.
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201502.cm.CampaignLabelReturnValue
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201502")
    @RequestWrapper(localName = "mutateLabel", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201502", className = "com.google.api.ads.adwords.jaxws.v201502.cm.CampaignServiceInterfacemutateLabel")
    @ResponseWrapper(localName = "mutateLabelResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201502", className = "com.google.api.ads.adwords.jaxws.v201502.cm.CampaignServiceInterfacemutateLabelResponse")
    public CampaignLabelReturnValue mutateLabel(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201502")
        List<CampaignLabelOperation> operations)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns the list of campaigns that match the query.
     *         
     *         @param query The SQL-like AWQL query string.
     *         @return A list of campaigns.
     *         @throws ApiException if problems occur while parsing the query or fetching campaign
     *         information.
     *       
     * 
     * @param query
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201502.cm.CampaignPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201502")
    @RequestWrapper(localName = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201502", className = "com.google.api.ads.adwords.jaxws.v201502.cm.CampaignServiceInterfacequery")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201502", className = "com.google.api.ads.adwords.jaxws.v201502.cm.CampaignServiceInterfacequeryResponse")
    public CampaignPage query(
        @WebParam(name = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201502")
        String query)
        throws ApiException_Exception
    ;

}
