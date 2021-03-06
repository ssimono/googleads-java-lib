// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.adwords.jaxws.v201809.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Contains offline validation, policy findings, and approval results for a FeedItem in the context
 *             of a FeedMapping.
 *           
 * 
 * <p>Java class for FeedItemPolicySummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeedItemPolicySummary">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201809}PolicySummaryInfo">
 *       &lt;sequence>
 *         &lt;element name="feedMappingId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="validationStatus" type="{https://adwords.google.com/api/adwords/cm/v201809}FeedItemValidationStatus" minOccurs="0"/>
 *         &lt;element name="validationErrors" type="{https://adwords.google.com/api/adwords/cm/v201809}FeedItemAttributeError" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="qualityApprovalStatus" type="{https://adwords.google.com/api/adwords/cm/v201809}FeedItemQualityApprovalStatus" minOccurs="0"/>
 *         &lt;element name="qualityDisapprovalReasons" type="{https://adwords.google.com/api/adwords/cm/v201809}FeedItemQualityDisapprovalReasons" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeedItemPolicySummary", propOrder = {
    "feedMappingId",
    "validationStatus",
    "validationErrors",
    "qualityApprovalStatus",
    "qualityDisapprovalReasons"
})
public class FeedItemPolicySummary
    extends PolicySummaryInfo
{

    protected Long feedMappingId;
    @XmlSchemaType(name = "string")
    protected FeedItemValidationStatus validationStatus;
    protected List<FeedItemAttributeError> validationErrors;
    @XmlSchemaType(name = "string")
    protected FeedItemQualityApprovalStatus qualityApprovalStatus;
    @XmlSchemaType(name = "string")
    protected List<FeedItemQualityDisapprovalReasons> qualityDisapprovalReasons;

    /**
     * Gets the value of the feedMappingId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFeedMappingId() {
        return feedMappingId;
    }

    /**
     * Sets the value of the feedMappingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFeedMappingId(Long value) {
        this.feedMappingId = value;
    }

    /**
     * Gets the value of the validationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link FeedItemValidationStatus }
     *     
     */
    public FeedItemValidationStatus getValidationStatus() {
        return validationStatus;
    }

    /**
     * Sets the value of the validationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedItemValidationStatus }
     *     
     */
    public void setValidationStatus(FeedItemValidationStatus value) {
        this.validationStatus = value;
    }

    /**
     * Gets the value of the validationErrors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validationErrors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidationErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeedItemAttributeError }
     * 
     * 
     */
    public List<FeedItemAttributeError> getValidationErrors() {
        if (validationErrors == null) {
            validationErrors = new ArrayList<FeedItemAttributeError>();
        }
        return this.validationErrors;
    }

    /**
     * Gets the value of the qualityApprovalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link FeedItemQualityApprovalStatus }
     *     
     */
    public FeedItemQualityApprovalStatus getQualityApprovalStatus() {
        return qualityApprovalStatus;
    }

    /**
     * Sets the value of the qualityApprovalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedItemQualityApprovalStatus }
     *     
     */
    public void setQualityApprovalStatus(FeedItemQualityApprovalStatus value) {
        this.qualityApprovalStatus = value;
    }

    /**
     * Gets the value of the qualityDisapprovalReasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualityDisapprovalReasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualityDisapprovalReasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeedItemQualityDisapprovalReasons }
     * 
     * 
     */
    public List<FeedItemQualityDisapprovalReasons> getQualityDisapprovalReasons() {
        if (qualityDisapprovalReasons == null) {
            qualityDisapprovalReasons = new ArrayList<FeedItemQualityDisapprovalReasons>();
        }
        return this.qualityDisapprovalReasons;
    }

}
