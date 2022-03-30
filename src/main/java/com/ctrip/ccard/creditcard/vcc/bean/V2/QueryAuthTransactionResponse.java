package com.ctrip.ccard.creditcard.vcc.bean.V2;

import java.math.BigDecimal;
import java.util.List;

public class QueryAuthTransactionResponse {

    private String returnCode;

    private String errorMessage;

    private String cardLogId;

    private List<AuthTransactionResponseEntity> list;

    @Deprecated
    private BigDecimal availableBalance;

    @Deprecated
    private String cardCurrencyCode;

    @Deprecated
    private String cardLabel;

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

    public List<AuthTransactionResponseEntity> getList() {
        return list;
    }

    public void setList(List<AuthTransactionResponseEntity> list) {
        this.list = list;
    }

    public BigDecimal getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
    }

    public String getCardCurrencyCode() {
        return cardCurrencyCode;
    }

    public void setCardCurrencyCode(String cardCurrencyCode) {
        this.cardCurrencyCode = cardCurrencyCode;
    }

    public String getCardLabel() {
        return cardLabel;
    }

    public void setCardLabel(String cardLabel) {
        this.cardLabel = cardLabel;
    }

    @Override
    public String toString() {
        return "QueryAuthTransactionResponse{" +
                "returnCode='" + returnCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", cardLogId='" + cardLogId + '\'' +
                ", list=" + list +
                '}';
    }
}
