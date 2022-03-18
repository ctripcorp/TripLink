package com.ctrip.ccard.creditcard.vcc.bean;

public class UpdateRequest {
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
     * update card info
     */
    private UpdateCardInfo cardInfo;
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
    /**
     * risk info
     */
    private RiskVerifyInfo riskInfo;

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

    public UpdateCardInfo getCardInfo() {
        return cardInfo;
    }

    public void setCardInfo(UpdateCardInfo cardInfo) {
        this.cardInfo = cardInfo;
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

    public RiskVerifyInfo getRiskInfo() {
        return riskInfo;
    }

    public void setRiskInfo(RiskVerifyInfo riskInfo) {
        this.riskInfo = riskInfo;
    }
}
