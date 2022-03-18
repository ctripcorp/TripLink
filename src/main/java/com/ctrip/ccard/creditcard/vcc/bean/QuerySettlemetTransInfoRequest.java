package com.ctrip.ccard.creditcard.vcc.bean;

/**
 * Description:
 */
public class QuerySettlemetTransInfoRequest {
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
     * settlement trans start time
     */
    private String startDate;
    /**
     * settlement trans end time
     */
    private String endDate;
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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
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
