package com.ctrip.ccard.creditcard.vcc.bean.V2;

import java.math.BigDecimal;

public class CardRestoreRequest {

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
     * 清算ID
     */
    private String settlementId;

    /**
     * 卡币种
     */
    private String cardCurrencyCode;

    /**
     * 卡交易金额
     */
    private BigDecimal cardTransactionAmount;

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

    public String getSettlementId() {
        return settlementId;
    }

    public void setSettlementId(String settlementId) {
        this.settlementId = settlementId;
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

    @Override
    public String toString() {
        return "CardRestoreRequest{" +
                "serviceVersion='" + serviceVersion + '\'' +
                ", requestId='" + requestId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", cardLogId='" + cardLogId + '\'' +
                ", settlementId='" + settlementId + '\'' +
                ", cardCurrencyCode='" + cardCurrencyCode + '\'' +
                ", cardTransactionAmount=" + cardTransactionAmount +
                '}';
    }
}
