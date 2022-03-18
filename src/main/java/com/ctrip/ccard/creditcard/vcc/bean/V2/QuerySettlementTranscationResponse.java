package com.ctrip.ccard.creditcard.vcc.bean.V2;

import java.math.BigDecimal;
import java.util.List;

/**
 * Description:
 */
public class QuerySettlementTranscationResponse {
    private String cardLogId;

    private BigDecimal availableBalance;

    private String cardCurrencyCode;

    private String cardLabel;

    private String returnCode;

    private String errorMessage;

    private List<SettlementTranscationResponseEntity> list;

    public String getCardLogId() {
        return cardLogId;
    }

    public void setCardLogId(String cardLogId) {
        this.cardLogId = cardLogId;
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

    public List<SettlementTranscationResponseEntity> getList() {
        return list;
    }

    public void setList(List<SettlementTranscationResponseEntity> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "QuerySettlementTranscationResponse{" +
                "cardLogId='" + cardLogId + '\'' +
                ", availableBalance='" + availableBalance + '\'' +
                ", cardCurrencyCode='" + cardCurrencyCode + '\'' +
                ", cardLabel='" + cardLabel + '\'' +
                ", returnCode='" + returnCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", list=" + list +
                '}';
    }
}
