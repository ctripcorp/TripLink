package com.ctrip.ccard.creditcard.vcc.bean.V1;

import java.util.List;

public class SettlementTransactionByPage {

    private int count;

    private Boolean isMore;

    private String returnCode;

    private String errorMessage;

    private List<SettlementTransactionDetailByPage> settlementData;

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

    public List<SettlementTransactionDetailByPage> getSettlementData() {
        return settlementData;
    }

    public void setSettlementData(List<SettlementTransactionDetailByPage> settlementData) {
        this.settlementData = settlementData;
    }

    @Override
    public String toString() {
        return "SettlementTransactionByPage{" +
                "count=" + count +
                ", isMore=" + isMore +
                ", returnCode='" + returnCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", settlementData=" + settlementData +
                '}';
    }
}
