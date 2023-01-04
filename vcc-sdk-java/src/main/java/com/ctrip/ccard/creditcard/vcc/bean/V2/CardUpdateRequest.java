package com.ctrip.ccard.creditcard.vcc.bean.V2;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

public class CardUpdateRequest{

    private String serviceVersion;
    private String requestId;
    private String customerId;
    private String cardLogId;
    private String activeDate;
    private String inactiveDate;
    private BigDecimal cardLimit;
    private BigDecimal minAuthAmount;
    private BigDecimal maxAuthAmount;
    private Integer cardCloseUsage;
    private String supportedMccGroup;
    private String supportedMid;
    private String supportedAcquirerId;
    private Boolean multipleCurrencyCard;
    private Boolean cvv2ForceCheck;
    private String timeZone;
    private Map<String, String> userReferenceMap = new LinkedHashMap<String, String>();
    private Map<String,String> riskInfo = new LinkedHashMap<String, String>();

    public String getServiceVersion() {
        return serviceVersion;
    }

    public void setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCardLogId() {
        return cardLogId;
    }

    public void setCardLogId(String cardLogId) {
        this.cardLogId = cardLogId;
    }

    public String getActiveDate() {
        return activeDate;
    }

    public void setActiveDate(String activeDate) {
        this.activeDate = activeDate;
    }

    public String getInactiveDate() {
        return inactiveDate;
    }

    public void setInactiveDate(String inactiveDate) {
        this.inactiveDate = inactiveDate;
    }

    public BigDecimal getCardLimit() {
        return cardLimit;
    }

    public void setCardLimit(BigDecimal cardLimit) {
        this.cardLimit = cardLimit;
    }

    public BigDecimal getMinAuthAmount() {
        return minAuthAmount;
    }

    public void setMinAuthAmount(BigDecimal minAuthAmount) {
        this.minAuthAmount = minAuthAmount;
    }

    public BigDecimal getMaxAuthAmount() {
        return maxAuthAmount;
    }

    public void setMaxAuthAmount(BigDecimal maxAuthAmount) {
        this.maxAuthAmount = maxAuthAmount;
    }

    public Integer getCardCloseUsage() {
        return cardCloseUsage;
    }

    public void setCardCloseUsage(Integer cardCloseUsage) {
        this.cardCloseUsage = cardCloseUsage;
    }

    public String getSupportedMccGroup() {
        return supportedMccGroup;
    }

    public void setSupportedMccGroup(String supportedMccGroup) {
        this.supportedMccGroup = supportedMccGroup;
    }

    public String getSupportedMid() {
        return supportedMid;
    }

    public void setSupportedMid(String supportedMid) {
        this.supportedMid = supportedMid;
    }

    public String getSupportedAcquirerId() {
        return supportedAcquirerId;
    }

    public void setSupportedAcquirerId(String supportedAcquirerId) {
        this.supportedAcquirerId = supportedAcquirerId;
    }

    public Boolean getMultipleCurrencyCard() {
        return multipleCurrencyCard;
    }

    public void setMultipleCurrencyCard(Boolean multipleCurrencyCard) {
        this.multipleCurrencyCard = multipleCurrencyCard;
    }

    public Boolean getCvv2ForceCheck() {
        return cvv2ForceCheck;
    }

    public void setCvv2ForceCheck(Boolean cvv2ForceCheck) {
        this.cvv2ForceCheck = cvv2ForceCheck;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public Map<String, String> getUserReferenceMap() {
        return userReferenceMap;
    }

    public void setUserReferenceMap(Map<String, String> userReferenceMap) {
        this.userReferenceMap = userReferenceMap;
    }

    public Map<String, String> getRiskInfo() {
        return riskInfo;
    }

    public void setRiskInfo(Map<String, String> riskInfo) {
        this.riskInfo = riskInfo;
    }

    @Override
    public String toString() {
        return "CardUpdateRequest{" +
                "serviceVersion='" + serviceVersion + '\'' +
                ", requestId='" + requestId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", cardLogId='" + cardLogId + '\'' +
                ", activeDate='" + activeDate + '\'' +
                ", inactiveDate='" + inactiveDate + '\'' +
                ", cardLimit=" + cardLimit +
                ", minAuthAmount=" + minAuthAmount +
                ", maxAuthAmount=" + maxAuthAmount +
                ", cardCloseUsage=" + cardCloseUsage +
                ", supportedMccGroup='" + supportedMccGroup + '\'' +
                ", supportedMid='" + supportedMid + '\'' +
                ", supportedAcquirerId='" + supportedAcquirerId + '\'' +
                ", multipleCurrencyCard=" + multipleCurrencyCard +
                ", cvv2ForceCheck=" + cvv2ForceCheck +
                ", timeZone='" + timeZone + '\'' +
                ", userReferenceMap=" + userReferenceMap +
                ", riskInfo=" + riskInfo +
                '}';
    }
}
