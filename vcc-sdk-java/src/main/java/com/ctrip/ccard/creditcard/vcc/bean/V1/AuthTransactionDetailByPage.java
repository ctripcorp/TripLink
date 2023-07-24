package com.ctrip.ccard.creditcard.vcc.bean.V1;

import java.math.BigDecimal;

public class AuthTransactionDetailByPage {
    private String cardLogId;
    private String requestId;
    private String transactionId;
    private String orderNo;
    private String transactionCurrencyCode;
    private BigDecimal transactionAmount;
    private String cardCurrencyCode;
    private BigDecimal cardTransactionAmount;
    private String responseCode;
    private String responseDescription;
    private String approvalCode;
    private String transactionCode;
    private String transactionDate;
    private String merchantName;
    private String mcc;
    private String merchantCountry;
    private String isoMerchantCountryCode;
    private String merchantCity;
    private String merchantId;
    private String acquiringBankId;
    private BigDecimal cardInitialBalance;
    private BigDecimal cardEndingBalance;
    private String creditTransactionSign;
    private String reversalType;

    public String getCardLogId() {
        return cardLogId;
    }

    public void setCardLogId(String cardLogId) {
        this.cardLogId = cardLogId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getTransactionCurrencyCode() {
        return transactionCurrencyCode;
    }

    public void setTransactionCurrencyCode(String transactionCurrencyCode) {
        this.transactionCurrencyCode = transactionCurrencyCode;
    }

    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(BigDecimal transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getCardCurrencyCode() {
        return cardCurrencyCode;
    }

    public void setCardCurrencyCode(String cardCurrencyCode) {
        this.cardCurrencyCode = cardCurrencyCode;
    }

    public BigDecimal getCardTransactionAmount() {
        return cardTransactionAmount;
    }

    public void setCardTransactionAmount(BigDecimal cardTransactionAmount) {
        this.cardTransactionAmount = cardTransactionAmount;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseDescription() {
        return responseDescription;
    }

    public void setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
    }

    public String getApprovalCode() {
        return approvalCode;
    }

    public void setApprovalCode(String approvalCode) {
        this.approvalCode = approvalCode;
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    public String getMerchantCountry() {
        return merchantCountry;
    }

    public void setMerchantCountry(String merchantCountry) {
        this.merchantCountry = merchantCountry;
    }

    public String getIsoMerchantCountryCode() {
        return isoMerchantCountryCode;
    }

    public void setIsoMerchantCountryCode(String isoMerchantCountryCode) {
        this.isoMerchantCountryCode = isoMerchantCountryCode;
    }

    public String getMerchantCity() {
        return merchantCity;
    }

    public void setMerchantCity(String merchantCity) {
        this.merchantCity = merchantCity;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getAcquiringBankId() {
        return acquiringBankId;
    }

    public void setAcquiringBankId(String acquiringBankId) {
        this.acquiringBankId = acquiringBankId;
    }

    public BigDecimal getCardInitialBalance() {
        return cardInitialBalance;
    }

    public void setCardInitialBalance(BigDecimal cardInitialBalance) {
        this.cardInitialBalance = cardInitialBalance;
    }

    public BigDecimal getCardEndingBalance() {
        return cardEndingBalance;
    }

    public void setCardEndingBalance(BigDecimal cardEndingBalance) {
        this.cardEndingBalance = cardEndingBalance;
    }

    public String getCreditTransactionSign() {
        return creditTransactionSign;
    }

    public void setCreditTransactionSign(String creditTransactionSign) {
        this.creditTransactionSign = creditTransactionSign;
    }

    public String getReversalType() {
        return reversalType;
    }

    public void setReversalType(String reversalType) {
        this.reversalType = reversalType;
    }

    @Override
    public String toString() {
        return "AuthTransactionDetailByPage{" +
                "cardLogId='" + cardLogId + '\'' +
                ", requestId='" + requestId + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", transactionCurrencyCode='" + transactionCurrencyCode + '\'' +
                ", transactionAmount=" + transactionAmount +
                ", cardCurrencyCode='" + cardCurrencyCode + '\'' +
                ", cardTransactionAmount=" + cardTransactionAmount +
                ", responseCode='" + responseCode + '\'' +
                ", responseDescription='" + responseDescription + '\'' +
                ", approvalCode='" + approvalCode + '\'' +
                ", transactionCode='" + transactionCode + '\'' +
                ", transactionDate='" + transactionDate + '\'' +
                ", merchantName='" + merchantName + '\'' +
                ", mcc='" + mcc + '\'' +
                ", merchantCountry='" + merchantCountry + '\'' +
                ", isoMerchantCountryCode='" + isoMerchantCountryCode + '\'' +
                ", merchantCity='" + merchantCity + '\'' +
                ", merchantId='" + merchantId + '\'' +
                ", acquiringBankId='" + acquiringBankId + '\'' +
                ", cardInitialBalance=" + cardInitialBalance +
                ", cardEndingBalance=" + cardEndingBalance +
                ", creditTransactionSign='" + creditTransactionSign + '\'' +
                ", reversalType='" + reversalType + '\'' +
                '}';
    }
}
