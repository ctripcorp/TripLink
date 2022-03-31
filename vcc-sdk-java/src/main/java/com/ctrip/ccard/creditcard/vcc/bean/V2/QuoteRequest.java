package com.ctrip.ccard.creditcard.vcc.bean.V2;

import java.math.BigDecimal;

public class QuoteRequest {
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
     * 交易金额
     */
    private BigDecimal fxAmount;
    /**
     * 交易方向
     * FxDirectionEnums
     */
    private Integer fxDirection;

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

    public BigDecimal getFxAmount() {
        return fxAmount;
    }

    public void setFxAmount(BigDecimal fxAmount) {
        this.fxAmount = fxAmount;
    }

    public Integer getFxDirection() {
        return fxDirection;
    }

    public void setFxDirection(Integer fxDirection) {
        this.fxDirection = fxDirection;
    }

    @Override
    public String toString() {
        return "QuoteRequest{" +
                "serviceVersion='" + serviceVersion + '\'' +
                ", requestId='" + requestId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", sellCurrency='" + sellCurrency + '\'' +
                ", buyCurrency='" + buyCurrency + '\'' +
                ", fxAmount=" + fxAmount +
                ", fxDirection=" + fxDirection +
                '}';
    }
}
