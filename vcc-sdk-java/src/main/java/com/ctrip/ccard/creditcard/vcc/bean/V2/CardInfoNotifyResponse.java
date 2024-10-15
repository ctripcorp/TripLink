package com.ctrip.ccard.creditcard.vcc.bean.V2;

/**
 * @author wanyuwu
 * @date 2024-04-12
 */
public class CardInfoNotifyResponse {

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
        return "CardInfoNotifyResponse{" +
                "returnCode='" + returnCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
