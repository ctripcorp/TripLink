package com.ctrip.ccard.creditcard.vcc.bean.V2;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

public class CardCreateRequest {

    private String serviceVersion;
    private String requestId;
    private String customerId;
    private String cardCurrencyCode;
    private String settlementCurrencyCode;
    private String activeDate;
    private String inactiveDate;
    private BigDecimal cardLimit;
    private BigDecimal minAuthAmount;
    private BigDecimal maxAuthAmount;
    private Integer maxAuthTimes;
    private Integer cardCloseUsage;
    private String supportedMccGroup;
    private String supportedMid;
    private String supportedAcquirerId;
    private Boolean multipleCurrencyCard;
    private Boolean cvv2ForceCheck;
    private String cardBin;
    private String cardType;
    private String cardLabel;
    private String cardProductCode;
    private String quoteId;
    private String exchangeCurrencyCode;
    private String timeZone;
    private Boolean allow3ds;
    private String areaCode;
    private String mobilePhone;
    private String userEmail;
    private Boolean supportThreeDSChallenge;
    private Boolean threeDSPassesSilently;
    private Map<String, String> userReferenceMap = new LinkedHashMap<String, String>();
    private Map<String,String> riskInfo = new LinkedHashMap<String, String>();

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Boolean getSupportThreeDSChallenge() {
        return supportThreeDSChallenge;
    }

    public void setSupportThreeDSChallenge(Boolean supportThreeDSChallenge) {
        this.supportThreeDSChallenge = supportThreeDSChallenge;
    }

    public Boolean getThreeDSPassesSilently() {
        return threeDSPassesSilently;
    }

    public void setThreeDSPassesSilently(Boolean threeDSPassesSilently) {
        this.threeDSPassesSilently = threeDSPassesSilently;
    }

    public String getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
    }

    public String getExchangeCurrencyCode() {
        return exchangeCurrencyCode;
    }

    public void setExchangeCurrencyCode(String exchangeCurrencyCode) {
        this.exchangeCurrencyCode = exchangeCurrencyCode;
    }

    public String getCardProductCode() {
        return cardProductCode;
    }

    public void setCardProductCode(String cardProductCode) {
        this.cardProductCode = cardProductCode;
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

    public String getSettlementCurrencyCode() {
        return settlementCurrencyCode;
    }

    public void setSettlementCurrencyCode(String settlementCurrencyCode) {
        this.settlementCurrencyCode = settlementCurrencyCode;
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

    public String getCardBin() {
        return cardBin;
    }

    public void setCardBin(String cardBin) {
        this.cardBin = cardBin;
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

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public Boolean getAllow3ds() {
        return allow3ds;
    }

    public void setAllow3ds(Boolean allow3ds) {
        this.allow3ds = allow3ds;
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
        return "CardCreateRequest{" +
                "serviceVersion='" + serviceVersion + '\'' +
                ", requestId='" + requestId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", cardCurrencyCode='" + cardCurrencyCode + '\'' +
                ", settlementCurrencyCode='" + settlementCurrencyCode + '\'' +
                ", activeDate='" + activeDate + '\'' +
                ", inactiveDate='" + inactiveDate + '\'' +
                ", cardLimit=" + cardLimit +
                ", minAuthAmount=" + minAuthAmount +
                ", maxAuthAmount=" + maxAuthAmount +
                ", maxAuthTimes=" + maxAuthTimes +
                ", cardCloseUsage=" + cardCloseUsage +
                ", supportedMccGroup='" + supportedMccGroup + '\'' +
                ", supportedMid='" + supportedMid + '\'' +
                ", supportedAcquirerId='" + supportedAcquirerId + '\'' +
                ", multipleCurrencyCard=" + multipleCurrencyCard +
                ", cvv2ForceCheck=" + cvv2ForceCheck +
                ", cardBin='" + cardBin + '\'' +
                ", cardType='" + cardType + '\'' +
                ", cardLabel='" + cardLabel + '\'' +
                ", cardProductCode='" + cardProductCode + '\'' +
                ", quoteId='" + quoteId + '\'' +
                ", exchangeCurrencyCode='" + exchangeCurrencyCode + '\'' +
                ", timeZone='" + timeZone + '\'' +
                ", allow3ds=" + allow3ds +
                ", areaCode='" + areaCode + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", supportThreeDSChallenge=" + supportThreeDSChallenge +
                ", threeDSPassesSilently=" + threeDSPassesSilently +
                ", userReferenceMap=" + userReferenceMap +
                ", riskInfo=" + riskInfo +
                '}';
    }
}
