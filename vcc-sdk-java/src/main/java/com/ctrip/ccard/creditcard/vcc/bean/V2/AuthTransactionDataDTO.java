package com.ctrip.ccard.creditcard.vcc.bean.V2;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @since 2022-07-29
 **/
public class AuthTransactionDataDTO implements Serializable {
    private static final long serialVersionUID = -8410962393294745215L;

    private String cardLogId;

    private String requestId;
    private String transactionId;
    private String orderNo;

    // 交易币种
    private String transactionCurrencyCode;
    // 交易金额
    private BigDecimal transactionAmount;
    // 卡币种
    private String cardCurrencyCode;
    // 卡片交易金额
    private BigDecimal cardTransactionAmount;

    // 授权返回码
    private String responseCode;
    // 授权返回码描述
    private String responseDescription;
    // 授权码
    private String approvalCode;
    // 交易类型
    private String transactionCode;
    // 交易时间
    private String transactionDate;

    // 商户名称
    private String merchantName;
    // mcc
    private String mcc;
    private String merchantCountry;
    private String merchantCity;
    private String merchantId;
    private String acquiringBankId;

    // 此交易卡片层期初金额
    private BigDecimal cardInitialBalance;
    // 此交易卡片层期末金额
    private BigDecimal cardEndingBalance;

    // 是否为借记交易
    private String creditTransactionSign;

    // 是否是授权释放 1-授权释放交易 0-非授权释放交易
    private String authorizationReleaseCode;

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

    public String getAuthorizationReleaseCode() {
        return authorizationReleaseCode;
    }

    public void setAuthorizationReleaseCode(String authorizationReleaseCode) {
        this.authorizationReleaseCode = authorizationReleaseCode;
    }

    @Override
    public String toString() {
        return "AuthTransactionDataDTO{" +
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
                ", merchantCity='" + merchantCity + '\'' +
                ", merchantId='" + merchantId + '\'' +
                ", acquiringBankId='" + acquiringBankId + '\'' +
                ", cardInitialBalance=" + cardInitialBalance +
                ", cardEndingBalance=" + cardEndingBalance +
                ", creditTransactionSign='" + creditTransactionSign + '\'' +
                ", authorizationReleaseCode='" + authorizationReleaseCode + '\'' +
                '}';
    }
}
