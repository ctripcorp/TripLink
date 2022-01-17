package com.ctrip.ccard.creditcard.vcc.bean.V2;

/**
 * Description:
 */
public class ResponseResult {

    public String resultCode;

    public String message;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResponseResult{" +
                "resultCode='" + resultCode + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
