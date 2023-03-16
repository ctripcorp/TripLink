package com.ctrip.ccard.creditcard.vcc.bean.V2;

import java.math.BigDecimal;

public class PayoutQueryResponse {

    private String returnCode;

    private String errorMessage;

    /**
     * 汇率id
     */
    private String orderId;
    /**
     * 交易状态
     */
    private Integer status;
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
     * 收款人账户名称
     */
    private String beneficiaryAccountName;
    /**
     * 客户订单号
     */
    private String clientOrderId;
    /**
     * 受理时间
     */
    private String acceptTime;

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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public String getClientOrderId() {
        return clientOrderId;
    }

    public void setClientOrderId(String clientOrderId) {
        this.clientOrderId = clientOrderId;
    }

    public String getAcceptTime() {
        return acceptTime;
    }

    public void setAcceptTime(String acceptTime) {
        this.acceptTime = acceptTime;
    }

    @Override
    public String toString() {
        return "WithdrawQueryResponse{" +
                "returnCode='" + returnCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", orderId='" + orderId + '\'' +
                ", status=" + status +
                ", paymentCurrency='" + paymentCurrency + '\'' +
                ", paymentAmount=" + paymentAmount +
                ", beneficiaryAccountNo='" + beneficiaryAccountNo + '\'' +
                ", beneficiaryAccountName='" + beneficiaryAccountName + '\'' +
                ", clientOrderId='" + clientOrderId + '\'' +
                ", acceptTime='" + acceptTime + '\'' +
                '}';
    }
}
