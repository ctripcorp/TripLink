package com.ctrip.ccard.creditcard.vcc.bean.V2;

/**
 * bhgui
 * since: 2023/12/27
 */
public class ChargebackQueryResponse {

    private String requestResultCode;
    private String requestResultMessage;
    private String chargebackId;
    private String chargebackStatus;
    private String chargebackCurrency;
    private String chargebackAmount;
    private String chargebackTime;
    private String finishTime;
    private String returnCode;
    private String errorMessage;

    public String getRequestResultCode() {
        return requestResultCode;
    }

    public void setRequestResultCode(String requestResultCode) {
        this.requestResultCode = requestResultCode;
    }

    public String getRequestResultMessage() {
        return requestResultMessage;
    }

    public void setRequestResultMessage(String requestResultMessage) {
        this.requestResultMessage = requestResultMessage;
    }

    public String getChargebackId() {
        return chargebackId;
    }

    public void setChargebackId(String chargebackId) {
        this.chargebackId = chargebackId;
    }

    public String getChargebackStatus() {
        return chargebackStatus;
    }

    public void setChargebackStatus(String chargebackStatus) {
        this.chargebackStatus = chargebackStatus;
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

    public String getChargebackTime() {
        return chargebackTime;
    }

    public void setChargebackTime(String chargebackTime) {
        this.chargebackTime = chargebackTime;
    }

    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return "ChargebackQueryResponse{" +
                "requestResultCode='" + requestResultCode + '\'' +
                ", requestResultMessage='" + requestResultMessage + '\'' +
                ", chargebackId='" + chargebackId + '\'' +
                ", chargebackStatus='" + chargebackStatus + '\'' +
                ", chargebackCurrency='" + chargebackCurrency + '\'' +
                ", chargebackAmount='" + chargebackAmount + '\'' +
                ", chargebackTime='" + chargebackTime + '\'' +
                ", finishTime='" + finishTime + '\'' +
                ", returnCode='" + returnCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
