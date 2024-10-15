package com.ctrip.ccard.creditcard.vcc.bean.V2;

import java.util.List;

/**
 * @author wanyuwu
 * @date 2024-04-12
 */
public class CardInfoNotifyRequest {
    /**
     * API版本
     */
    private String serviceVersion;
    /**
     * 客户ID
     */
    protected String customerId;
    /**
     * 请求流水号
     */
    protected String requestId;
    /**
     * 卡ID
     */
    private String cardLogId;
    /**
     * 接收者
     */
    private List<String> recipient;

    /**
     * 接收者姓名
     */
    private String recipientName;

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

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getCardLogId() {
        return cardLogId;
    }

    public void setCardLogId(String cardLogId) {
        this.cardLogId = cardLogId;
    }

    public List<String> getRecipient() {
        return recipient;
    }

    public void setRecipient(List<String> recipient) {
        this.recipient = recipient;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    @Override
    public String toString() {
        return "CardInfoNotifyRequest{" +
                "serviceVersion='" + serviceVersion + '\'' +
                ", customerId='" + customerId + '\'' +
                ", requestId='" + requestId + '\'' +
                ", cardLogId='" + cardLogId + '\'' +
                ", recipient=" + recipient +
                // ", recipientName='" + recipientName + '\'' +
                '}';
    }
}
