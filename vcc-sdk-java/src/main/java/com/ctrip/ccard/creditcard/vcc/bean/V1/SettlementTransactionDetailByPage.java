package com.ctrip.ccard.creditcard.vcc.bean.V1;

import java.math.BigDecimal;

public class SettlementTransactionDetailByPage {
    private String serialNo;
    private String transactionId;
    private String referenceNumber;
    private String occurDateTime;
    private String postingDateTime;
    private String postingSysTime;
    private String transactionCode;
    private String transactionType;
    private String approvalCode;
    private String isCredit;
    private String originalTransactionCurrency;
    private BigDecimal originalTransactionAmount;
    private String cardTransactionCurrency;
    private BigDecimal cardTransactionAmount;
    private String accountCurrency;
    private BigDecimal billAccountAmount;
    private String posMerchantID;
    private String posMerchantName;
    private String posMerchantClassCode;
    private String posMerchantCountry;
    private String isoMerchantCountryCode;
    private String posMerchantCity;
    private String posAcquirerID;

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getOccurDateTime() {
        return occurDateTime;
    }

    public void setOccurDateTime(String occurDateTime) {
        this.occurDateTime = occurDateTime;
    }

    public String getPostingDateTime() {
        return postingDateTime;
    }

    public void setPostingDateTime(String postingDateTime) {
        this.postingDateTime = postingDateTime;
    }

    public String getPostingSysTime() {
        return postingSysTime;
    }

    public void setPostingSysTime(String postingSysTime) {
        this.postingSysTime = postingSysTime;
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getApprovalCode() {
        return approvalCode;
    }

    public void setApprovalCode(String approvalCode) {
        this.approvalCode = approvalCode;
    }

    public String getIsCredit() {
        return isCredit;
    }

    public void setIsCredit(String isCredit) {
        this.isCredit = isCredit;
    }

    public String getOriginalTransactionCurrency() {
        return originalTransactionCurrency;
    }

    public void setOriginalTransactionCurrency(String originalTransactionCurrency) {
        this.originalTransactionCurrency = originalTransactionCurrency;
    }

    public BigDecimal getOriginalTransactionAmount() {
        return originalTransactionAmount;
    }

    public void setOriginalTransactionAmount(BigDecimal originalTransactionAmount) {
        this.originalTransactionAmount = originalTransactionAmount;
    }

    public String getCardTransactionCurrency() {
        return cardTransactionCurrency;
    }

    public void setCardTransactionCurrency(String cardTransactionCurrency) {
        this.cardTransactionCurrency = cardTransactionCurrency;
    }

    public BigDecimal getCardTransactionAmount() {
        return cardTransactionAmount;
    }

    public void setCardTransactionAmount(BigDecimal cardTransactionAmount) {
        this.cardTransactionAmount = cardTransactionAmount;
    }

    public String getAccountCurrency() {
        return accountCurrency;
    }

    public void setAccountCurrency(String accountCurrency) {
        this.accountCurrency = accountCurrency;
    }

    public BigDecimal getBillAccountAmount() {
        return billAccountAmount;
    }

    public void setBillAccountAmount(BigDecimal billAccountAmount) {
        this.billAccountAmount = billAccountAmount;
    }

    public String getPosMerchantID() {
        return posMerchantID;
    }

    public void setPosMerchantID(String posMerchantID) {
        this.posMerchantID = posMerchantID;
    }

    public String getPosMerchantName() {
        return posMerchantName;
    }

    public void setPosMerchantName(String posMerchantName) {
        this.posMerchantName = posMerchantName;
    }

    public String getPosMerchantClassCode() {
        return posMerchantClassCode;
    }

    public void setPosMerchantClassCode(String posMerchantClassCode) {
        this.posMerchantClassCode = posMerchantClassCode;
    }

    public String getPosMerchantCountry() {
        return posMerchantCountry;
    }

    public void setPosMerchantCountry(String posMerchantCountry) {
        this.posMerchantCountry = posMerchantCountry;
    }

    public String getIsoMerchantCountryCode() {
        return isoMerchantCountryCode;
    }

    public void setIsoMerchantCountryCode(String isoMerchantCountryCode) {
        this.isoMerchantCountryCode = isoMerchantCountryCode;
    }

    public String getPosMerchantCity() {
        return posMerchantCity;
    }

    public void setPosMerchantCity(String posMerchantCity) {
        this.posMerchantCity = posMerchantCity;
    }

    public String getPosAcquirerID() {
        return posAcquirerID;
    }

    public void setPosAcquirerID(String posAcquirerID) {
        this.posAcquirerID = posAcquirerID;
    }

    @Override
    public String toString() {
        return "SettlementTransactionDetailByPage{" +
                "serialNo='" + serialNo + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", referenceNumber='" + referenceNumber + '\'' +
                ", occurDateTime='" + occurDateTime + '\'' +
                ", postingDateTime='" + postingDateTime + '\'' +
                ", postingSysTime='" + postingSysTime + '\'' +
                ", transactionCode='" + transactionCode + '\'' +
                ", transactionType='" + transactionType + '\'' +
                ", approvalCode='" + approvalCode + '\'' +
                ", isCredit='" + isCredit + '\'' +
                ", originalTransactionCurrency='" + originalTransactionCurrency + '\'' +
                ", originalTransactionAmount=" + originalTransactionAmount +
                ", cardTransactionCurrency='" + cardTransactionCurrency + '\'' +
                ", cardTransactionAmount=" + cardTransactionAmount +
                ", accountCurrency='" + accountCurrency + '\'' +
                ", billAccountAmount=" + billAccountAmount +
                ", posMerchantID='" + posMerchantID + '\'' +
                ", posMerchantName='" + posMerchantName + '\'' +
                ", posMerchantClassCode='" + posMerchantClassCode + '\'' +
                ", posMerchantCountry='" + posMerchantCountry + '\'' +
                ", isoMerchantCountryCode='" + isoMerchantCountryCode + '\'' +
                ", posMerchantCity='" + posMerchantCity + '\'' +
                ", posAcquirerID='" + posAcquirerID + '\'' +
                '}';
    }
}
