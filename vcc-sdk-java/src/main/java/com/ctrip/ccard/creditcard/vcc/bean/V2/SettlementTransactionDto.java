package com.ctrip.ccard.creditcard.vcc.bean.V2;

import java.math.BigDecimal;

public class SettlementTransactionDto {
    /**
     * 唯一流水号
     */
    private String serialNo;
    /**
     * 交易关联ID
     */
    private String transactionId;
    /**
     * 交易发生时间 格式yyyy-MM-dd HH:mm:ss
     */
    private String occurDateTime;
    /**
     * 入账处理时间 格式yyyy-MM-dd HH:mm:ss
     */
    private String postingDateTime;
    /**
     * 入账系统时间 格式yyyy-MM-dd
     */
    private String postingSysTime;
    /**
     * 交易类型
     */
    private String transactionCode;
    /**
     * 交易类型描述
     */
    private String transactionType;
    /**
     * 授权码
     */
    private String approvalCode;
    /**
     * 借贷记	DEBT：借记，CRED：贷记
     */
    private String isCredit;
    /**
     * 交易币种
     */
    private String originalTransactionCurrency;
    /**
     * 交易金额
     */
    private BigDecimal originalTransactionAmount;
    /**
     * 卡币种
     */
    private String cardTransactionCurrency;
    /**
     * 卡交易金额
     */
    private BigDecimal cardTransactionAmount;
    /**
     * 清算币种
     */
    private String accountCurrency;
    /**
     * 清算金额
     */
    private BigDecimal billAccountAmount;
    /**
     * 商户ID
     */
    private String posMerchantID;
    /**
     * 商户名称
     */
    private String posMerchantName;
    /**
     * 商户MCC
     */
    private String posMerchantClassCode;
    /**
     * 商户所在国家
     */
    private String posMerchantCountry;
    /**
     * 商户所在国家
     */
    private String isoMerchantCountryCode;
    /**
     * 商户所在城市
     */
    private String posMerchantCity;
    /**
     * 收单行ID
     */
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
        return "SettlementTransactionDto{" +
                "serialNo='" + serialNo + '\'' +
                ", transactionId='" + transactionId + '\'' +
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
