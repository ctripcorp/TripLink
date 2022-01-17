package com.ctrip.ccard.creditcard.vcc.bean.V2;

public class CardDetailQueryRequest{

    private String requestId;

    private String serviceVersion;

    private String customerId;

    private String cardLogId;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getServiceVersion() {
        return serviceVersion;
    }

    public void setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
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

    @Override
    public String toString() {
        return "CardDetailQueryRequest{" +
                "serviceVersion='" + serviceVersion + '\'' +
                ", customerId='" + customerId + '\'' +
                ", cardLogId='" + cardLogId + '\'' +
                ", requestId='" + requestId + '\'' +
                '}';
    }
}
