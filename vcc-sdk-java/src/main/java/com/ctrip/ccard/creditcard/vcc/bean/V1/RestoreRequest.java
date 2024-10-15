package com.ctrip.ccard.creditcard.vcc.bean.V1;

import java.math.BigDecimal;

public class RestoreRequest {

    /**
     * request id
     */
    private String requestId;

    /**
     * request time yyyyMMddHHmmss
     */
    private String requestTime;

    /**
     * merchant name
     */
    private String merchantName;

    /**
     * channel type
     */
    private String channelType;

    /**
     * request source
     */
    private String requestSource;

    /**
     * operator
     */
    private String operator;

    /**
     * request extra info
     */
    private String reqExtra;

    /**
     * card log id
     */
    private String cardLogId;

    /**
     * settlement id
     */
    private String settlementId;

    /**
     * card currency
     */
    private String localCurrency;

    /**
     * card transaction amount
     */
    private BigDecimal localCurrencyAmt;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public String getRequestSource() {
        return requestSource;
    }

    public void setRequestSource(String requestSource) {
        this.requestSource = requestSource;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getReqExtra() {
        return reqExtra;
    }

    public void setReqExtra(String reqExtra) {
        this.reqExtra = reqExtra;
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

    public String getLocalCurrency() {
        return localCurrency;
    }

    public void setLocalCurrency(String localCurrency) {
        this.localCurrency = localCurrency;
    }

    public BigDecimal getLocalCurrencyAmt() {
        return localCurrencyAmt;
    }

    public void setLocalCurrencyAmt(BigDecimal localCurrencyAmt) {
        this.localCurrencyAmt = localCurrencyAmt;
    }

    @Override
    public String toString() {
        return "RestoreRequest{" +
                "requestId='" + requestId + '\'' +
                ", requestTime='" + requestTime + '\'' +
                ", merchantName='" + merchantName + '\'' +
                ", channelType='" + channelType + '\'' +
                ", requestSource='" + requestSource + '\'' +
                ", operator='" + operator + '\'' +
                ", reqExtra='" + reqExtra + '\'' +
                ", cardLogId='" + cardLogId + '\'' +
                ", settlementId='" + settlementId + '\'' +
                ", localCurrency='" + localCurrency + '\'' +
                ", localCurrencyAmt=" + localCurrencyAmt +
                '}';
    }
}
