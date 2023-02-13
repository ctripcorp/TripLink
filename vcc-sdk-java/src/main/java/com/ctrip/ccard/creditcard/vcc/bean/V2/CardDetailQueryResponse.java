package com.ctrip.ccard.creditcard.vcc.bean.V2;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class CardDetailQueryResponse {

    private String returnCode;

    private String errorMessage;

    private String customerId;

    private String cardLogId;

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

    private String applyTime;

    private String status;

    private String cardNum;

    private String cardExpirationDate;

    private String cvv2;

    private BigDecimal availableBalance;

    private BigDecimal authorizeAmount;

    private BigDecimal settlementAmount;

    private BigDecimal refundAmount;

    private String cardType;

    private String cardLabel;

    private String productCode;

    private String cardSid;

    private String timeZone;

    private Boolean allow3ds;

    private Map<String, String> userReferenceMap = new HashMap<String, String>();

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getCardSid() {
        return cardSid;
    }

    public void setCardSid(String cardSid) {
        this.cardSid = cardSid;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
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

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getCardExpirationDate() {
        return cardExpirationDate;
    }

    public void setCardExpirationDate(String cardExpirationDate) {
        this.cardExpirationDate = cardExpirationDate;
    }

    public String getCvv2() {
        return cvv2;
    }

    public void setCvv2(String cvv2) {
        this.cvv2 = cvv2;
    }

    public BigDecimal getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
    }

    public BigDecimal getAuthorizeAmount() {
        return authorizeAmount;
    }

    public void setAuthorizeAmount(BigDecimal authorizeAmount) {
        this.authorizeAmount = authorizeAmount;
    }

    public BigDecimal getSettlementAmount() {
        return settlementAmount;
    }

    public void setSettlementAmount(BigDecimal settlementAmount) {
        this.settlementAmount = settlementAmount;
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

    @Override
    public String toString() {
        return "CardDetailQueryResponse{" +
                "returnCode='" + returnCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", customerId='" + customerId + '\'' +
                ", cardLogId='" + cardLogId + '\'' +
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
                ", applyTime='" + applyTime + '\'' +
                ", status='" + status + '\'' +
                ", cardNum='" + cardNum + '\'' +
                ", cardExpirationDate='" + cardExpirationDate + '\'' +
                ", cvv2='" + cvv2 + '\'' +
                ", availableBalance=" + availableBalance +
                ", authorizeAmount=" + authorizeAmount +
                ", settlementAmount=" + settlementAmount +
                ", refundAmount=" + refundAmount +
                ", cardType='" + cardType + '\'' +
                ", cardLabel='" + cardLabel + '\'' +
                ", productCode='" + productCode + '\'' +
                ", cardSid='" + cardSid + '\'' +
                ", timeZone='" + timeZone + '\'' +
                ", allow3ds=" + allow3ds +
                ", userReferenceMap=" + userReferenceMap +
                '}';
    }
}
