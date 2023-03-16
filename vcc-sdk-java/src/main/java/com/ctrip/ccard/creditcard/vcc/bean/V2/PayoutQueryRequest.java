package com.ctrip.ccard.creditcard.vcc.bean.V2;

public class PayoutQueryRequest {
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
     * 原始请求流水号
     */
    private String oriRequestId;

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

    public String getOriRequestId() {
        return oriRequestId;
    }

    public void setOriRequestId(String oriRequestId) {
        this.oriRequestId = oriRequestId;
    }

    @Override
    public String toString() {
        return "WithdrawQueryRequest{" +
                "serviceVersion='" + serviceVersion + '\'' +
                ", requestId='" + requestId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", oriRequestId='" + oriRequestId + '\'' +
                '}';
    }
}
