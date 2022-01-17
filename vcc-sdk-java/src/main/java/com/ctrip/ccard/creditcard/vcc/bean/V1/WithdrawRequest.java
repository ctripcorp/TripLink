package com.ctrip.ccard.creditcard.vcc.bean.V1;

import java.math.BigDecimal;

public class WithdrawRequest {
    /**
     * need new request number on each request
     */
    private String requestId;
    /**
     * request time
     * format ：yyyyMMddHHmmss
     */
    private String requestTime;
    /**
     * merchant name , TripLink distribution
     */
    private String merchantName;
    /**
     * channel type, TripLink distribution
     */
    private String channelType;
    /**
     * TripLink unique reference number
     */
    private String cardLogId;

    /**
     * card withdraw amount
     */
    private BigDecimal willChangeAmt;
    /**
     * user defined
     */
    private String requestSource;
    /**
     * operator
     */
    private String operator;
    /**
     * request extra info
     * json type
     * eg: {"BinFlagDcre":"12345"}
     */
    private String reqExtra;

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

    public String getCardLogId() {
        return cardLogId;
    }

    public void setCardLogId(String cardLogId) {
        this.cardLogId = cardLogId;
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

    public BigDecimal getWillChangeAmt() {
        return willChangeAmt;
    }

    public void setWillChangeAmt(BigDecimal willChangeAmt) {
        this.willChangeAmt = willChangeAmt;
    }
}
