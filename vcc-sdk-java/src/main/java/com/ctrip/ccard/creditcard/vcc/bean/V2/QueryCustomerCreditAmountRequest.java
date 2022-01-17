package com.ctrip.ccard.creditcard.vcc.bean.V2;

/**
 * Description:
 */
public class QueryCustomerCreditAmountRequest {

    private String serviceVersion;

    private String customerId;

    private String requestId;

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

    @Override
    public String toString() {
        return "QueryCustomerCreditAmountRequest{" +
                "serviceVersion='" + serviceVersion + '\'' +
                ", customerId='" + customerId + '\'' +
                ", requestId='" + requestId + '\'' +
                '}';
    }
}
