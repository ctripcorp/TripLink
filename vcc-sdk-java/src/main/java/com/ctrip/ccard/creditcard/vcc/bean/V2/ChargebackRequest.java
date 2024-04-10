package com.ctrip.ccard.creditcard.vcc.bean.V2;

/**
 * bhgui
 * since: 2023/12/27
 */
public class ChargebackRequest {
    private String requestId;
    private String customerId;
    private String transId;
    private String chargebackCurrency;
    private String chargebackAmount;
    private String chargebackReason;
    private String fraudType;
    private String subType;
    private String chgbkIndicator;
    private String acctStatus;
    private String deviceType;
    private String cvcInvalidIndicator;
    private String reportDate;
    private String comment;
    private String fileReferenceId;
    private String serviceVersion;
    private String requestUser;


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

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }

    public String getChargebackCurrency() {
        return chargebackCurrency;
    }

    public void setChargebackCurrency(String chargebackCurrency) {
        this.chargebackCurrency = chargebackCurrency;
    }

    public String getChargebackAmount() {
        return chargebackAmount;
    }

    public void setChargebackAmount(String chargebackAmount) {
        this.chargebackAmount = chargebackAmount;
    }

    public String getChargebackReason() {
        return chargebackReason;
    }

    public void setChargebackReason(String chargebackReason) {
        this.chargebackReason = chargebackReason;
    }

    public String getFraudType() {
        return fraudType;
    }

    public void setFraudType(String fraudType) {
        this.fraudType = fraudType;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public String getChgbkIndicator() {
        return chgbkIndicator;
    }

    public void setChgbkIndicator(String chgbkIndicator) {
        this.chgbkIndicator = chgbkIndicator;
    }

    public String getAcctStatus() {
        return acctStatus;
    }

    public void setAcctStatus(String acctStatus) {
        this.acctStatus = acctStatus;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getCvcInvalidIndicator() {
        return cvcInvalidIndicator;
    }

    public void setCvcInvalidIndicator(String cvcInvalidIndicator) {
        this.cvcInvalidIndicator = cvcInvalidIndicator;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getFileReferenceId() {
        return fileReferenceId;
    }

    public void setFileReferenceId(String fileReferenceId) {
        this.fileReferenceId = fileReferenceId;
    }

    public String getServiceVersion() {
        return serviceVersion;
    }

    public void setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
    }

    public String getRequestUser() {
        return requestUser;
    }

    public void setRequestUser(String requestUser) {
        this.requestUser = requestUser;
    }

    @Override
    public String toString() {
        return "ChargebackRequest{" +
                "requestId='" + requestId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", transId='" + transId + '\'' +
                ", chargebackCurrency='" + chargebackCurrency + '\'' +
                ", chargebackAmount='" + chargebackAmount + '\'' +
                ", chargebackReason='" + chargebackReason + '\'' +
                ", fraudType='" + fraudType + '\'' +
                ", subType='" + subType + '\'' +
                ", chgbkIndicator='" + chgbkIndicator + '\'' +
                ", acctStatus='" + acctStatus + '\'' +
                ", deviceType='" + deviceType + '\'' +
                ", cvcInvalidIndicator='" + cvcInvalidIndicator + '\'' +
                ", reportDate='" + reportDate + '\'' +
                ", comment='" + comment + '\'' +
                ", fileReferenceId='" + fileReferenceId + '\'' +
                ", serviceVersion='" + serviceVersion + '\'' +
                ", requestUser='" + requestUser + '\'' +
                '}';
    }
}
