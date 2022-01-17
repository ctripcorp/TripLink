package com.ctrip.ccard.creditcard.vcc.bean.V2;

import java.math.BigDecimal;

public class SettlementTransactionResponseEntity {
    private String occurDateTime;	//			交易发生时间
    private String postingDateTime;	//			入账时间
    private String postingSysTime;
    private String originalTransactionCurrency;	//			发生POS交易币种
    private BigDecimal originalTransactionAmount;	//			发生POS交易金额
    private String accountCurrency;	//			结算币种
    private BigDecimal billAccountAmount;	//			结算金额
    private String cardTransactionCurrency;//开卡时入账币种
    private BigDecimal cardTrasnactionAmount;//开卡时入账金额
    private String transactionType;	//			交易类型
    private String transactionCode;	//			交易类型码
    private String approvalCode;	//			授权码
    private String referenceNumber;	//			交易流水号
    private String isCredit;	//			是否是收或付标识
    private String posMerchantName;	//			商户名称
    private String posMerchantClassCode;	//			商户MCC
    private String posMerchantCountry;	//			商户所在国家
    private String posMerchantCity;	//			商户所在国家城市
    private String posMerchantState;	//			商户所在国家城市区域和国家置有一个
    private String posMerchantID;   // 商户ID
    private String posAcquirerID;   // 收单行ID
    private String txnId;// 入账的流水号

    public String getTxnId() {
        return txnId;
    }

    public void setTxnId(String txnId) {
        this.txnId = txnId;
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

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public String getApprovalCode() {
        return approvalCode;
    }

    public void setApprovalCode(String approvalCode) {
        this.approvalCode = approvalCode;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getIsCredit() {
        return isCredit;
    }

    public void setIsCredit(String isCredit) {
        this.isCredit = isCredit;
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

    public String getPosMerchantState() {
        return posMerchantState;
    }

    public void setPosMerchantState(String posMerchantState) {
        this.posMerchantState = posMerchantState;
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

    public String getCardTransactionCurrency() {
        return cardTransactionCurrency;
    }

    public void setCardTransactionCurrency(String cardTransactionCurrency) {
        this.cardTransactionCurrency = cardTransactionCurrency;
    }

    public BigDecimal getCardTrasnactionAmount() {
        return cardTrasnactionAmount;
    }

    public void setCardTrasnactionAmount(BigDecimal cardTrasnactionAmount) {
        this.cardTrasnactionAmount = cardTrasnactionAmount;
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

    @Override
    public String toString() {
        return "SettlementTransactionResponseEntity{" +
                "occurDateTime='" + occurDateTime + '\'' +
                ", postingDateTime='" + postingDateTime + '\'' +
                ", postingSysTime='" + postingSysTime + '\'' +
                ", originalTransactionCurrency='" + originalTransactionCurrency + '\'' +
                ", originalTransactionAmount=" + originalTransactionAmount +
                ", accountCurrency='" + accountCurrency + '\'' +
                ", billAccountAmount=" + billAccountAmount +
                ", cardTransactionCurrency='" + cardTransactionCurrency + '\'' +
                ", cardTrasnactionAmount=" + cardTrasnactionAmount +
                ", transactionType='" + transactionType + '\'' +
                ", transactionCode='" + transactionCode + '\'' +
                ", approvalCode='" + approvalCode + '\'' +
                ", referenceNumber='" + referenceNumber + '\'' +
                ", isCredit='" + isCredit + '\'' +
                ", posMerchantName='" + posMerchantName + '\'' +
                ", posMerchantClassCode='" + posMerchantClassCode + '\'' +
                ", posMerchantCountry='" + posMerchantCountry + '\'' +
                ", posMerchantCity='" + posMerchantCity + '\'' +
                ", posMerchantState='" + posMerchantState + '\'' +
                ", posMerchantID='" + posMerchantID + '\'' +
                ", posAcquirerID='" + posAcquirerID + '\'' +
                ", txnId='" + txnId + '\'' +
                '}';
    }
}
