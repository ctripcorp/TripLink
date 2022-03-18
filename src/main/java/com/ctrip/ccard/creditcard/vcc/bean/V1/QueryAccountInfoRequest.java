package com.ctrip.ccard.creditcard.vcc.bean.V1;

public class QueryAccountInfoRequest {
    /**
     * request number
     */
    private String requestId;
    /**
     * request time
     */
    private String requestTime;
    /**
     * merchant name, TripLink distribution
     */
    private String merchantName;
    /**
     * channel type, TripLink distribution
     */
    private String channelType;
    /**
     * operator
     */
    private String operator;

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

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "QueryAccountInfoRequest{" +
                "requestId='" + requestId + '\'' +
                ", requestTime='" + requestTime + '\'' +
                ", merchantName='" + merchantName + '\'' +
                ", channelType='" + channelType + '\'' +
                ", operator='" + operator + '\'' +
                '}';
    }
}
