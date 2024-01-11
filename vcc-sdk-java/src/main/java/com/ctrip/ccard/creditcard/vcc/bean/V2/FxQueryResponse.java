package com.ctrip.ccard.creditcard.vcc.bean.V2;

import java.math.BigDecimal;

public class FxQueryResponse {

    private String returnCode;

    private String errorMessage;

    /**
     * 交易订单号
     */
    private String orderId;
    /**
     * 状态
     * 0-创建中
     * 1-成功
     * 2-失败
     */
    private Integer status;
    /**
     * 受理时间
     */
    private String acceptTime;
    /**
     * 卖出币种
     */
    private String sellCurrency;
    /**
     * 卖出金额
     */
    private BigDecimal sellAmount;

    /**
     * 买入币种
     */
    private String buyCurrency;
    /**
     * 买入金额
     */
    private BigDecimal buyAmount;
    /**
     * 汇率
     */
    private BigDecimal rate;
    /**
     * 汇率id
     */
    private String quoteId;

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

    public String getAcceptTime() {
        return acceptTime;
    }

    public void setAcceptTime(String acceptTime) {
        this.acceptTime = acceptTime;
    }

    public String getSellCurrency() {
        return sellCurrency;
    }

    public void setSellCurrency(String sellCurrency) {
        this.sellCurrency = sellCurrency;
    }

    public BigDecimal getSellAmount() {
        return sellAmount;
    }

    public void setSellAmount(BigDecimal sellAmount) {
        this.sellAmount = sellAmount;
    }

    public String getBuyCurrency() {
        return buyCurrency;
    }

    public void setBuyCurrency(String buyCurrency) {
        this.buyCurrency = buyCurrency;
    }

    public BigDecimal getBuyAmount() {
        return buyAmount;
    }

    public void setBuyAmount(BigDecimal buyAmount) {
        this.buyAmount = buyAmount;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public String getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "FxQueryResponse{" +
                "returnCode='" + returnCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", orderId='" + orderId + '\'' +
                ", status=" + status +
                ", acceptTime='" + acceptTime + '\'' +
                ", sellCurrency='" + sellCurrency + '\'' +
                ", sellAmount=" + sellAmount +
                ", buyCurrency='" + buyCurrency + '\'' +
                ", buyAmount=" + buyAmount +
                ", rate=" + rate +
                ", quoteId='" + quoteId + '\'' +
                '}';
    }
}
