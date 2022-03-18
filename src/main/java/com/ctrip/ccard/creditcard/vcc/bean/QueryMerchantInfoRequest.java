package com.ctrip.ccard.creditcard.vcc.bean;

/**
 * Description:
 */
public class QueryMerchantInfoRequest {
    /**
     * the request number of the original close request number
     */
    private String requestId;
    /**
     * request time
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
     * request extra info
     * json type
     * eg: {"BinFlagDcre":"12345"}
     */
    private String reqExtra;
    /**
     * operator
     */
    private String operator;

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

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

    public String getReqExtra() {
        return reqExtra;
    }

    public void setReqExtra(String reqExtra) {
        this.reqExtra = reqExtra;
    }
}
