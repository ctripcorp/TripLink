package com.ctrip.ccard.creditcard.vcc.bean.V2;

import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

public class CardUpdateRequest{

    private String serviceVersion;
    private String customerId;
    private String requestId;
    private String requestType;
    private String cardLogId;
    private Date activeDate;
    private Date inactiveDate;
    private BigDecimal cardLimit;
    private BigDecimal minAuthAmount;
    private BigDecimal maxAuthAmount;
    private Integer cardCloseUsage;
    private Boolean isCvv2ForceCheck;
    private Boolean isMultipleCurrencyCard;
    private String supportedMccGroup;
    private String supportedMcc;
    private String supportedMid;
    private String supportedAccquirerId;
    private String requestUser;
    private String requestSource;
    private String cardStatus;
    private Map<String, String> userReferenceMap = new LinkedHashMap<String, String>();

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

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

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getCardLogId() {
        return cardLogId;
    }

    public void setCardLogId(String cardLogId) {
        this.cardLogId = cardLogId;
    }

    public Date getActiveDate() {
        return activeDate;
    }

    public void setActiveDate(Date activeDate) {
        this.activeDate = activeDate;
    }

    public Date getInactiveDate() {
        return inactiveDate;
    }

    public void setInactiveDate(Date inactiveDate) {
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

    public Boolean getCvv2ForceCheck() {
        return isCvv2ForceCheck;
    }

    public void setCvv2ForceCheck(Boolean cvv2ForceCheck) {
        isCvv2ForceCheck = cvv2ForceCheck;
    }

    public Boolean getMultipleCurrencyCard() {
        return isMultipleCurrencyCard;
    }

    public void setMultipleCurrencyCard(Boolean multipleCurrencyCard) {
        isMultipleCurrencyCard = multipleCurrencyCard;
    }

    public String getSupportedMccGroup() {
        return supportedMccGroup;
    }

    public void setSupportedMccGroup(String supportedMccGroup) {
        this.supportedMccGroup = supportedMccGroup;
    }

    public String getSupportedMcc() {
        return supportedMcc;
    }

    public void setSupportedMcc(String supportedMcc) {
        this.supportedMcc = supportedMcc;
    }

    public String getSupportedMid() {
        return supportedMid;
    }

    public void setSupportedMid(String supportedMid) {
        this.supportedMid = supportedMid;
    }

    public String getSupportedAccquirerId() {
        return supportedAccquirerId;
    }

    public void setSupportedAccquirerId(String supportedAccquirerId) {
        this.supportedAccquirerId = supportedAccquirerId;
    }

    public String getRequestUser() {
        return requestUser;
    }

    public void setRequestUser(String requestUser) {
        this.requestUser = requestUser;
    }

    public String getRequestSource() {
        return requestSource;
    }

    public void setRequestSource(String requestSource) {
        this.requestSource = requestSource;
    }

    public String getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(String cardStatus) {
        this.cardStatus = cardStatus;
    }

    public Map<String, String> getUserReferenceMap() {
        return userReferenceMap;
    }

    public void setUserReferenceMap(Map<String, String> userReferenceMap) {
        this.userReferenceMap = userReferenceMap;
    }

    @Override
    public String toString() {
        return "CardUpdateRequest{" +
                "serviceVersion='" + serviceVersion + '\'' +
                ", customerId='" + customerId + '\'' +
                ", requestId='" + requestId + '\'' +
                ", requestType='" + requestType + '\'' +
                ", cardLogId='" + cardLogId + '\'' +
                ", activeDate=" + activeDate +
                ", inactiveDate=" + inactiveDate +
                ", cardLimit=" + cardLimit +
                ", minAuthAmount=" + minAuthAmount +
                ", maxAuthAmount=" + maxAuthAmount +
                ", cardCloseUsage=" + cardCloseUsage +
                ", isCvv2ForceCheck=" + isCvv2ForceCheck +
                ", isMultipleCurrencyCard=" + isMultipleCurrencyCard +
                ", supportedMccGroup='" + supportedMccGroup + '\'' +
                ", supportedMcc='" + supportedMcc + '\'' +
                ", supportedMid='" + supportedMid + '\'' +
                ", supportedAccquirerId='" + supportedAccquirerId + '\'' +
                ", requestUser='" + requestUser + '\'' +
                ", requestSource='" + requestSource + '\'' +
                ", cardStatus='" + cardStatus + '\'' +
                ", userReferenceMap=" + userReferenceMap +
                '}';
    }
}
