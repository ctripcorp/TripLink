package com.ctrip.ccard.creditcard.vcc.bean.V2;

import java.math.BigDecimal;

public class AuthTransactionResponseEntity {

    private String occurDateTime;			//交易发生时间
    private String cardTransactionCurrency;			//卡币种数字代码
    private BigDecimal cardTransactionAmount;			//卡交易金额
    private BigDecimal originalTransactionAmount;				//原始交易金额
    private String originalTransactionCurrency;//原始交易币种
    private String responseCode;			//交易响应码
    private String responseCodeDescription;			//交易响应码描述
    private String approvalCode;			//授权码
    private String declineReason;			//交易拒绝原因
    private String countryCode;			//交易地国家代码
    private String messageType;			//信息类型
    private String messageTypeDescription;			//信息类型描述
    private String reversalType;  //冲正类型
    private String posMerchantName;	//			商户名称
    private String posMerchantClassCode;//			商户MCC
    private String posMerchantCountry;//			商户所在国家
    private String posMerchantCity;//			商户所在国家城市
    private String posMerchantID;   // 商户ID
    private String posAcquirerID;   // 收单行ID
    private String txnId; // 交易唯一ID
    private String transactionID; //交易关联ID 消费授权和冲正为个ID

    /**
     * 交易发生本地时间 格式yyyy-MM-dd HH:mm:ss
     */
    private String transactionLocalTime;

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getOccurDateTime() {
        return occurDateTime;
    }

    public void setOccurDateTime(String occurDateTime) {
        this.occurDateTime = occurDateTime;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseCodeDescription() {
        return responseCodeDescription;
    }

    public void setResponseCodeDescription(String responseCodeDescription) {
        this.responseCodeDescription = responseCodeDescription;
    }

    public String getApprovalCode() {
        return approvalCode;
    }

    public void setApprovalCode(String approvalCode) {
        this.approvalCode = approvalCode;
    }

    public String getDeclineReason() {
        return declineReason;
    }

    public void setDeclineReason(String declineReason) {
        this.declineReason = declineReason;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getMessageTypeDescription() {
        return messageTypeDescription;
    }

    public void setMessageTypeDescription(String messageTypeDescription) {
        this.messageTypeDescription = messageTypeDescription;
    }

    public String getReversalType() {
        return reversalType;
    }

    public void setReversalType(String reversalType) {
        this.reversalType = reversalType;
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

    public String getPosMerchantCity() {
        return posMerchantCity;
    }

    public void setPosMerchantCity(String posMerchantCity) {
        this.posMerchantCity = posMerchantCity;
    }

    public String getPosMerchantID() {
        return posMerchantID;
    }

    public void setPosMerchantID(String posMerchantID) {
        this.posMerchantID = posMerchantID;
    }

    public String getPosAcquirerID() {
        return posAcquirerID;
    }

    public void setPosAcquirerID(String posAcquirerID) {
        this.posAcquirerID = posAcquirerID;
    }

    public String getTxnId() {
        return txnId;
    }

    public void setTxnId(String txnId) {
        this.txnId = txnId;
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

    public BigDecimal getOriginalTransactionAmount() {
        return originalTransactionAmount;
    }

    public void setOriginalTransactionAmount(BigDecimal originalTransactionAmount) {
        this.originalTransactionAmount = originalTransactionAmount;
    }

    public String getOriginalTransactionCurrency() {
        return originalTransactionCurrency;
    }

    public void setOriginalTransactionCurrency(String originalTransactionCurrency) {
        this.originalTransactionCurrency = originalTransactionCurrency;
    }

    public String getTransactionLocalTime() {
        return transactionLocalTime;
    }

    public void setTransactionLocalTime(String transactionLocalTime) {
        this.transactionLocalTime = transactionLocalTime;
    }

    @Override
    public String toString() {
        return "AuthTransactionResponseEntity{" +
                "occurDateTime='" + occurDateTime + '\'' +
                ", cardTransactionCurrency='" + cardTransactionCurrency + '\'' +
                ", cardTransactionAmount=" + cardTransactionAmount +
                ", originalTransactionAmount=" + originalTransactionAmount +
                ", originalTransactionCurrency='" + originalTransactionCurrency + '\'' +
                ", responseCode='" + responseCode + '\'' +
                ", responseCodeDescription='" + responseCodeDescription + '\'' +
                ", approvalCode='" + approvalCode + '\'' +
                ", declineReason='" + declineReason + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", messageType='" + messageType + '\'' +
                ", messageTypeDescription='" + messageTypeDescription + '\'' +
                ", reversalType='" + reversalType + '\'' +
                ", posMerchantName='" + posMerchantName + '\'' +
                ", posMerchantClassCode='" + posMerchantClassCode + '\'' +
                ", posMerchantCountry='" + posMerchantCountry + '\'' +
                ", posMerchantCity='" + posMerchantCity + '\'' +
                ", posMerchantID='" + posMerchantID + '\'' +
                ", posAcquirerID='" + posAcquirerID + '\'' +
                ", txnId='" + txnId + '\'' +
                ", transactionID='" + transactionID + '\'' +
                ", transactionLocalTime='" + transactionLocalTime + '\'' +
                '}';
    }
}
