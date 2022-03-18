package com.ctrip.ccard.creditcard.vcc.bean;


public class QueryCloseResultRequest {
    /**
     * the request number of the original close request number
     */
    private String requestId;
    /**
     * the request time of the original close request time
     */
    private String requestTime;
    /**
     * the merchant name of the original close merchant name
     */
    private String merchantName;
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

    public String getReqExtra() {
        return reqExtra;
    }

    public void setReqExtra(String reqExtra) {
        this.reqExtra = reqExtra;
    }
}
