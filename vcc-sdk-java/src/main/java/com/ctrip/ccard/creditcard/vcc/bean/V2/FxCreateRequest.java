package com.ctrip.ccard.creditcard.vcc.bean.V2;

import java.math.BigDecimal;

public class FxCreateRequest {
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
     * 卖出币种
     */
    private String sellCurrency;
    /**
     * 买入币种
     */
    private String buyCurrency;
    /**
     * 换汇方向
     * 0-指定卖出
     * 1-指定买入
     */
    private Integer fxDirection;
    /**
     * 交易金额
     */
    private BigDecimal fxAmount;
    /**
     * 汇率ID
     */
    private String quoteId;


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

    public String getSellCurrency() {
        return sellCurrency;
    }

    public void setSellCurrency(String sellCurrency) {
        this.sellCurrency = sellCurrency;
    }

    public String getBuyCurrency() {
        return buyCurrency;
    }

    public void setBuyCurrency(String buyCurrency) {
        this.buyCurrency = buyCurrency;
    }

    public Integer getFxDirection() {
        return fxDirection;
    }

    public void setFxDirection(Integer fxDirection) {
        this.fxDirection = fxDirection;
    }

    public BigDecimal getFxAmount() {
        return fxAmount;
    }

    public void setFxAmount(BigDecimal fxAmount) {
        this.fxAmount = fxAmount;
    }

    public String getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
    }

    @Override
    public String toString() {
        return "FxCreateRequest{" +
                "serviceVersion='" + serviceVersion + '\'' +
                ", requestId='" + requestId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", sellCurrency='" + sellCurrency + '\'' +
                ", buyCurrency='" + buyCurrency + '\'' +
                ", fxDirection=" + fxDirection +
                ", fxAmount=" + fxAmount +
                ", quoteId='" + quoteId + '\'' +
                '}';
    }
}
