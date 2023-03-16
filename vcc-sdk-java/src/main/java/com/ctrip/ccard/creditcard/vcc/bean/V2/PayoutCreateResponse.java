package com.ctrip.ccard.creditcard.vcc.bean.V2;

import java.math.BigDecimal;

public class PayoutCreateResponse {

    private String returnCode;

    private String errorMessage;

    /**
     * 交易订单号
     */
    private String orderId;
    /**
     * 提现币种
     */
    private String paymentCurrency;
    /**
     * 提现金额
     */
    private BigDecimal paymentAmount;
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

    public String getAcceptTime() {
        return acceptTime;
    }

    public void setAcceptTime(String acceptTime) {
        this.acceptTime = acceptTime;
    }

    @Override
    public String toString() {
        return "WithdrawResponse{" +
                "returnCode='" + returnCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", orderId='" + orderId + '\'' +
                ", paymentCurrency='" + paymentCurrency + '\'' +
                ", paymentAmount=" + paymentAmount +
                ", acceptTime='" + acceptTime + '\'' +
                '}';
    }
}
