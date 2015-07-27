
package com.google.api.ads.dfp.jaxws.v201405;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A customization of a {@link RateCard} which could be applied to the line item
 *             and charges extra premiums.
 *             
 *             <p>Rate card customizations are referred to as premiums in the UI.
 *           
 * 
 * <p>Java class for RateCardCustomization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateCardCustomization">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rateCardCustomizationGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rateCardFeature" type="{https://www.google.com/apis/ads/publisher/v201405}RateCardFeature" minOccurs="0"/>
 *         &lt;element name="adjustmentType" type="{https://www.google.com/apis/ads/publisher/v201405}RateCardCustomizationAdjustmentType" minOccurs="0"/>
 *         &lt;element name="adjustmentSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rateType" type="{https://www.google.com/apis/ads/publisher/v201405}RateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateCardCustomization", propOrder = {
    "rateCardCustomizationGroupId",
    "id",
    "rateCardFeature",
    "adjustmentType",
    "adjustmentSize",
    "rateType"
})
public class RateCardCustomization {

    protected Long rateCardCustomizationGroupId;
    protected Long id;
    protected RateCardFeature rateCardFeature;
    @XmlSchemaType(name = "string")
    protected RateCardCustomizationAdjustmentType adjustmentType;
    protected Long adjustmentSize;
    @XmlSchemaType(name = "string")
    protected RateType rateType;

    /**
     * Gets the value of the rateCardCustomizationGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRateCardCustomizationGroupId() {
        return rateCardCustomizationGroupId;
    }

    /**
     * Sets the value of the rateCardCustomizationGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRateCardCustomizationGroupId(Long value) {
        this.rateCardCustomizationGroupId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the rateCardFeature property.
     * 
     * @return
     *     possible object is
     *     {@link RateCardFeature }
     *     
     */
    public RateCardFeature getRateCardFeature() {
        return rateCardFeature;
    }

    /**
     * Sets the value of the rateCardFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateCardFeature }
     *     
     */
    public void setRateCardFeature(RateCardFeature value) {
        this.rateCardFeature = value;
    }

    /**
     * Gets the value of the adjustmentType property.
     * 
     * @return
     *     possible object is
     *     {@link RateCardCustomizationAdjustmentType }
     *     
     */
    public RateCardCustomizationAdjustmentType getAdjustmentType() {
        return adjustmentType;
    }

    /**
     * Sets the value of the adjustmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateCardCustomizationAdjustmentType }
     *     
     */
    public void setAdjustmentType(RateCardCustomizationAdjustmentType value) {
        this.adjustmentType = value;
    }

    /**
     * Gets the value of the adjustmentSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdjustmentSize() {
        return adjustmentSize;
    }

    /**
     * Sets the value of the adjustmentSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdjustmentSize(Long value) {
        this.adjustmentSize = value;
    }

    /**
     * Gets the value of the rateType property.
     * 
     * @return
     *     possible object is
     *     {@link RateType }
     *     
     */
    public RateType getRateType() {
        return rateType;
    }

    /**
     * Sets the value of the rateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType }
     *     
     */
    public void setRateType(RateType value) {
        this.rateType = value;
    }

}
