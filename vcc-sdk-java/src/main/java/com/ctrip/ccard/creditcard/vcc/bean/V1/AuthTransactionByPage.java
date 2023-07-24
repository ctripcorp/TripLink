package com.ctrip.ccard.creditcard.vcc.bean.V1;

import java.util.List;

public class AuthTransactionByPage {
    private int count;
    private Boolean isMore;
    private String returnCode;
    private String errorMessage;
    private List<AuthTransactionDetailByPage> transactionData;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Boolean getMore() {
        return isMore;
    }

    public void setMore(Boolean more) {
        isMore = more;
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

    public List<AuthTransactionDetailByPage> getTransactionData() {
        return transactionData;
    }

    public void setTransactionData(List<AuthTransactionDetailByPage> transactionData) {
        this.transactionData = transactionData;
    }

    @Override
    public String toString() {
        return "AuthTransactionByPage{" +
                "count=" + count +
                ", isMore=" + isMore +
                ", returnCode='" + returnCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", transactionData=" + transactionData +
                '}';
    }
}
