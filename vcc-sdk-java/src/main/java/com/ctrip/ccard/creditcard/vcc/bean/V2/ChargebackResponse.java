package com.ctrip.ccard.creditcard.vcc.bean.V2;

/**
 * bhgui
 * since: 2023/12/27
 */
public class ChargebackResponse {
    private String returnCode;
    private String errorMessage;
    private String chargebackId;

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

    public String getChargebackId() {
        return chargebackId;
    }

    public void setChargebackId(String chargebackId) {
        this.chargebackId = chargebackId;
    }

    @Override
    public String toString() {
        return "ChargebackQueryResponse{" +
                "returnCode='" + returnCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", chargebackId='" + chargebackId + '\'' +
                '}';
    }
}
