package com.ctrip.ccard.creditcard.vcc.bean.V2;

import java.util.List;

public class QuerySettlementTransactionResponse {

    private String returnCode;

    private String errorMessage;

    private String cardLogId;

    private List<SettlementTransactionResponseEntity> list;

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

    public String getCardLogId() {
        return cardLogId;
    }

    public void setCardLogId(String cardLogId) {
        this.cardLogId = cardLogId;
    }

    public List<SettlementTransactionResponseEntity> getList() {
        return list;
    }

    public void setList(List<SettlementTransactionResponseEntity> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "QuerySettlementTransactionResponse{" +
                "returnCode='" + returnCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", cardLogId='" + cardLogId + '\'' +
                ", list=" + list +
                '}';
    }
}
