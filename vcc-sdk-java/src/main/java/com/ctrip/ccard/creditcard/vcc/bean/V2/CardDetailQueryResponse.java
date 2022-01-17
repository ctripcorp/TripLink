package com.ctrip.ccard.creditcard.vcc.bean.V2;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class CardDetailQueryResponse {

    private String cardLogId;

    private String cardSid;

    private String productCode;

    private String maskedCardNo;

    private String customerId;

    private String cardCurrencyCode;

    private BigDecimal cardLimit;

    private String activeDate;

    private String inactiveDate;

    private BigDecimal minAuthAmount;

    private BigDecimal maxAuthAmount;

    private Integer maxAuthTimes;

    private Integer cardCloseUsage;

    private Boolean isMultipleCurrencyCard;

    private String supportedMccGroup;

    private String supportedMcc;

    private String supportedMid;

    private String supportedAccquirerId;

    private Boolean isCvv2ForceCheck;

    private String applyTime;

    private String status;

    private String cardNum;

    private String cardExpiredate;

    private String cvv2;

    private boolean multipleTimesUseStatus;

    private BigDecimal authorizeAmount;

    private BigDecimal refundAmount;

    private BigDecimal availableBalance;

    private BigDecimal settlementAmount;

    private String settlementCurrencyCode;

    private Map<String, String> userReferenceMap = new HashMap<String, String>();

    private String returnCode;

    private String errorMessage;

    private String cardType;

    private String cardLabel;

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

    public String getCardLogId() {
        return cardLogId;
    }

    public void setCardLogId(String cardLogId) {
        this.cardLogId = cardLogId;
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

    public String getMaskedCardNo() {
        return maskedCardNo;
    }

    public void setMaskedCardNo(String maskedCardNo) {
        this.maskedCardNo = maskedCardNo;
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

    public Boolean getCvv2ForceCheck() {
        return isCvv2ForceCheck;
    }

    public void setCvv2ForceCheck(Boolean cvv2ForceCheck) {
        isCvv2ForceCheck = cvv2ForceCheck;
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

    public String getCardExpiredate() {
        return cardExpiredate;
    }

    public void setCardExpiredate(String cardExpiredate) {
        this.cardExpiredate = cardExpiredate;
    }

    public String getCvv2() {
        return cvv2;
    }

    public void setCvv2(String cvv2) {
        this.cvv2 = cvv2;
    }

    public boolean isMultipleTimesUseStatus() {
        return multipleTimesUseStatus;
    }

    public void setMultipleTimesUseStatus(boolean multipleTimesUseStatus) {
        this.multipleTimesUseStatus = multipleTimesUseStatus;
    }

    public String getSettlementCurrencyCode() {
        return settlementCurrencyCode;
    }

    public void setSettlementCurrencyCode(String settlementCurrencyCode) {
        this.settlementCurrencyCode = settlementCurrencyCode;
    }

    public Map<String, String> getUserReferenceMap() {
        return userReferenceMap;
    }

    public void setUserReferenceMap(Map<String, String> userReferenceMap) {
        this.userReferenceMap = userReferenceMap;
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

    public BigDecimal getAuthorizeAmount() {
        return authorizeAmount;
    }

    public void setAuthorizeAmount(BigDecimal authorizeAmount) {
        this.authorizeAmount = authorizeAmount;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public BigDecimal getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
    }

    public BigDecimal getSettlementAmount() {
        return settlementAmount;
    }

    public void setSettlementAmount(BigDecimal settlementAmount) {
        this.settlementAmount = settlementAmount;
    }

    @Override
    public String toString() {
        return "CardDetailQueryResponse{" +
                "cardLogId='" + cardLogId + '\'' +
                ", cardSid='" + cardSid + '\'' +
                ", productCode='" + productCode + '\'' +
                ", maskedCardNo='" + maskedCardNo + '\'' +
                ", customerId='" + customerId + '\'' +
                ", cardCurrencyCode='" + cardCurrencyCode + '\'' +
                ", cardLimit=" + cardLimit +
                ", activeDate=" + activeDate +
                ", inactiveDate=" + inactiveDate +
                ", minAuthAmount=" + minAuthAmount +
                ", maxAuthAmount=" + maxAuthAmount +
                ", maxAuthTimes=" + maxAuthTimes +
                ", cardCloseUsage=" + cardCloseUsage +
                ", isMultipleCurrencyCard=" + isMultipleCurrencyCard +
                ", supportedMccGroup='" + supportedMccGroup + '\'' +
                ", supportedMcc='" + supportedMcc + '\'' +
                ", supportedMid='" + supportedMid + '\'' +
                ", supportedAccquirerId='" + supportedAccquirerId + '\'' +
                ", isCvv2ForceCheck=" + isCvv2ForceCheck +
                ", applyTime='" + applyTime + '\'' +
                ", status='" + status + '\'' +
                ", cardNum='" + cardNum + '\'' +
                ", cardExpiredate='" + cardExpiredate + '\'' +
                ", cvv2='" + cvv2 + '\'' +
                ", multipleTimesUseStatus=" + multipleTimesUseStatus +
                ", authorizeAmount=" + authorizeAmount +
                ", refundAmount=" + refundAmount +
                ", availableBalance=" + availableBalance +
                ", settlementAmount=" + settlementAmount +
                ", settlementCurrencyCode='" + settlementCurrencyCode + '\'' +
                ", userReferenceMap=" + userReferenceMap +
                ", returnCode='" + returnCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", cardType='" + cardType + '\'' +
                ", cardLabel='" + cardLabel + '\'' +
                '}';
    }
}
