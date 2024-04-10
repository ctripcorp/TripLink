package com.ctrip.ccard.creditcard.vcc.bean.V2;

/**
 * bhgui
 * since: 2023/12/27
 */
public class ChargebackQueryRequest {

    private String customerId;
    private String requestId;
    private String chargebackRequestId;
    private String serviceVersion;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getChargebackRequestId() {
        return chargebackRequestId;
    }

    public void setChargebackRequestId(String chargebackRequestId) {
        this.chargebackRequestId = chargebackRequestId;
    }

    public String getServiceVersion() {
        return serviceVersion;
    }

    public void setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
    }

    @Override
    public String toString() {
        return "ChargebackQueryRequest{" +
                "customerId='" + customerId + '\'' +
                ", requestId='" + requestId + '\'' +
                ", chargebackRequestId='" + chargebackRequestId + '\'' +
                ", serviceVersion='" + serviceVersion + '\'' +
                '}';
    }
}
