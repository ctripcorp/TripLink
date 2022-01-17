package com.ctrip.ccard.creditcard.vcc.bean.V2;

public class CardCancelRequest{

    private String serviceVersion;

    private String customerId;

    private String requestId;

    private String requestType;

    private String cardLogId;

    private String requestUser;

    private String requestSource;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

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

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getCardLogId() {
        return cardLogId;
    }

    public void setCardLogId(String cardLogId) {
        this.cardLogId = cardLogId;
    }

    public String getRequestUser() {
        return requestUser;
    }

    public void setRequestUser(String requestUser) {
        this.requestUser = requestUser;
    }

    public String getRequestSource() {
        return requestSource;
    }

    public void setRequestSource(String requestSource) {
        this.requestSource = requestSource;
    }

    @Override
    public String toString() {
        return "CardCancelRequest{" +
                "serviceVersion='" + serviceVersion + '\'' +
                ", customerId='" + customerId + '\'' +
                ", requestId='" + requestId + '\'' +
                ", requestType='" + requestType + '\'' +
                ", cardLogId='" + cardLogId + '\'' +
                ", requestUser='" + requestUser + '\'' +
                ", requestSource='" + requestSource + '\'' +
                '}';
    }
}
