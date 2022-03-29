package com.ctrip.ccard.creditcard.vcc.bean.V2;

public class CardSuspendResponse {

    /**
     * 结果码
     */
    private String returnCode;
    /**
     * 结果码描述
     */
    private String errorMessage;

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
        return "CardSuspendResponse{" +
                "returnCode='" + returnCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
