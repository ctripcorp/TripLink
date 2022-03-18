package com.ctrip.ccard.creditcard.vcc.bean.V2;

import java.math.BigDecimal;

public class CardRechargeRequest {
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
     * 卡ID
     */
    private String cardLogId;
    /**
     * 充值金额
     */
    private BigDecimal rechargeAmount;

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

    public String getCardLogId() {
        return cardLogId;
    }

    public void setCardLogId(String cardLogId) {
        this.cardLogId = cardLogId;
    }

    public BigDecimal getRechargeAmount() {
        return rechargeAmount;
    }

    public void setRechargeAmount(BigDecimal rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }

    @Override
    public String toString() {
        return "CardRechargeRequest{" +
                "serviceVersion='" + serviceVersion + '\'' +
                ", requestId='" + requestId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", cardLogId='" + cardLogId + '\'' +
                ", rechargeAmount=" + rechargeAmount +
                '}';
    }
}
