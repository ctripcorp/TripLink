package com.ctrip.ccard.creditcard.vcc.bean.V2;

import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

public class CardCreateRequest {

    private String serviceVersion;
    private String requestId;
    private String requestType;
    private String customerId;
    private String cardCurrencyCode;
    private Date activeDate;
    private Date inactiveDate;
    private BigDecimal cardLimit;
    private BigDecimal minAuthAmount;
    private BigDecimal maxAuthAmount;
    private Integer maxAuthTimes;
    private Integer cardCloseUsage;
    private String settlementCurrencyCode;
    private String supportedMccGroup;
    private String supportedMcc;
    private String supportedMid;
    private String supportedAccquirerId;
    private Boolean isMultipleCurrencyCard;
    private Boolean isCvv2ForceCheck;
    private String requestUser;
    private String requestSource;
    private String cardBin;
    private String productCode;
    private String cardType;
    private String cardLabel;
    private Map<String, String> userReferenceMap = new LinkedHashMap<String, String>();

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

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCardCurrencyCode() {
        return cardCurrencyCode;
    }

    public void setCardCurrencyCode(String cardCurrencyCode) {
        this.cardCurrencyCode = cardCurrencyCode;
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

    public Integer getMaxAuthTimes() {
        return maxAuthTimes;
    }

    public void setMaxAuthTimes(Integer maxAuthTimes) {
        this.maxAuthTimes = maxAuthTimes;
    }

    public Integer getCardCloseUsage() {
        return cardCloseUsage;
    }

    public void setCardCloseUsage(Integer cardCloseUsage) {
        this.cardCloseUsage = cardCloseUsage;
    }

    public String getSettlementCurrencyCode() {
        return settlementCurrencyCode;
    }

    public void setSettlementCurrencyCode(String settlementCurrencyCode) {
        this.settlementCurrencyCode = settlementCurrencyCode;
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

    public Boolean getMultipleCurrencyCard() {
        return isMultipleCurrencyCard;
    }

    public void setMultipleCurrencyCard(Boolean multipleCurrencyCard) {
        isMultipleCurrencyCard = multipleCurrencyCard;
    }

    public Boolean getCvv2ForceCheck() {
        return isCvv2ForceCheck;
    }

    public void setCvv2ForceCheck(Boolean cvv2ForceCheck) {
        isCvv2ForceCheck = cvv2ForceCheck;
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

    public String getCardBin() {
        return cardBin;
    }

    public void setCardBin(String cardBin) {
        this.cardBin = cardBin;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardLabel() {
        return cardLabel;
    }

    public void setCardLabel(String cardLabel) {
        this.cardLabel = cardLabel;
    }

    public Map<String, String> getUserReferenceMap() {
        return userReferenceMap;
    }

    public void setUserReferenceMap(Map<String, String> userReferenceMap) {
        this.userReferenceMap = userReferenceMap;
    }

    @Override
    public String toString() {
        return "CardCreateRequest{" +
                "serviceVersion='" + serviceVersion + '\'' +
                ", requestId='" + requestId + '\'' +
                ", requestType='" + requestType + '\'' +
                ", customerId='" + customerId + '\'' +
                ", cardCurrencyCode='" + cardCurrencyCode + '\'' +
                ", activeDate=" + activeDate +
                ", inactiveDate=" + inactiveDate +
                ", cardLimit=" + cardLimit +
                ", minAuthAmount=" + minAuthAmount +
                ", maxAuthAmount=" + maxAuthAmount +
                ", maxAuthTimes=" + maxAuthTimes +
                ", cardCloseUsage=" + cardCloseUsage +
                ", settlementCurrencyCode='" + settlementCurrencyCode + '\'' +
                ", supportedMccGroup='" + supportedMccGroup + '\'' +
                ", supportedMcc='" + supportedMcc + '\'' +
                ", supportedMid='" + supportedMid + '\'' +
                ", supportedAccquirerId='" + supportedAccquirerId + '\'' +
                ", isMultipleCurrencyCard=" + isMultipleCurrencyCard +
                ", isCvv2ForceCheck=" + isCvv2ForceCheck +
                ", requestUser='" + requestUser + '\'' +
                ", requestSource='" + requestSource + '\'' +
                ", cardBin='" + cardBin + '\'' +
                ", productCode='" + productCode + '\'' +
                ", cardType='" + cardType + '\'' +
                ", cardLabel='" + cardLabel + '\'' +
                ", userReferenceMap=" + userReferenceMap +
                '}';
    }
}
