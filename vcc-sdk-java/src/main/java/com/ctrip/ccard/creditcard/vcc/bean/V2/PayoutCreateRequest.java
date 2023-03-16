package com.ctrip.ccard.creditcard.vcc.bean.V2;

import java.math.BigDecimal;

public class PayoutCreateRequest {
    /**
     * API版本
     */
    private String serviceVersion;
    /**
     * 请求流水号
     */
    private String requestId;
    /**
     * 客户ID
     */
    private String customerId;
    /**
     * 提现币种
     */
    private String paymentCurrency;
    /**
     * 提现金额
     */
    private BigDecimal paymentAmount;
    /**
     * 收款人账号
     */
    private String beneficiaryAccountNo;
    /**
     * 收款人账号
     */
    private String beneficiaryAccountName;
    /**
     * 收款银行名称
     */
    private String beneficiaryBankName;
    /**
     * 收款人银行所在国家/地区代码
     */
    private String beneficiaryBankCountryCode;
    /**
     * 附言
     */
    private String reference;
    /**
     * 订单号
     */
    private String clientOrderId;

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

    public String getPaymentCurrency() {
        return paymentCurrency;
    }

    public void setPaymentCurrency(String paymentCurrency) {
        this.paymentCurrency = paymentCurrency;
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getBeneficiaryAccountNo() {
        return beneficiaryAccountNo;
    }

    public void setBeneficiaryAccountNo(String beneficiaryAccountNo) {
        this.beneficiaryAccountNo = beneficiaryAccountNo;
    }

    public String getBeneficiaryAccountName() {
        return beneficiaryAccountName;
    }

    public void setBeneficiaryAccountName(String beneficiaryAccountName) {
        this.beneficiaryAccountName = beneficiaryAccountName;
    }

    public String getBeneficiaryBankName() {
        return beneficiaryBankName;
    }

    public void setBeneficiaryBankName(String beneficiaryBankName) {
        this.beneficiaryBankName = beneficiaryBankName;
    }

    public String getBeneficiaryBankCountryCode() {
        return beneficiaryBankCountryCode;
    }

    public void setBeneficiaryBankCountryCode(String beneficiaryBankCountryCode) {
        this.beneficiaryBankCountryCode = beneficiaryBankCountryCode;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getClientOrderId() {
        return clientOrderId;
    }

    public void setClientOrderId(String clientOrderId) {
        this.clientOrderId = clientOrderId;
    }

    @Override
    public String toString() {
        return "WithdrawRequest{" +
                "serviceVersion='" + serviceVersion + '\'' +
                ", requestId='" + requestId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", paymentCurrency='" + paymentCurrency + '\'' +
                ", paymentAmount=" + paymentAmount +
                ", beneficiaryAccountNo='" + beneficiaryAccountNo + '\'' +
                ", beneficiaryAccountName='" + beneficiaryAccountName + '\'' +
                ", beneficiaryBankName='" + beneficiaryBankName + '\'' +
                ", beneficiaryBankCountryCode='" + beneficiaryBankCountryCode + '\'' +
                ", reference='" + reference + '\'' +
                ", clientOrderId='" + clientOrderId + '\'' +
                '}';
    }
}
