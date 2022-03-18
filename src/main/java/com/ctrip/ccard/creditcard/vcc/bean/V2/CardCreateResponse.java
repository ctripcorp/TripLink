package com.ctrip.ccard.creditcard.vcc.bean.V2;

public class CardCreateResponse {

    private String returnCode;

    private String errorMessage;
    // 卡号别名长号
    private String cardLogId;
    // 卡号
    private String cardNum;
    // 卡片有效期
    private String cardExpirationDate;
    // 卡片vcc2
    private String cvv2;

    private String cardType;

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

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getCardExpirationDate() {
        return cardExpirationDate;
    }

    public void setCardExpirationDate(String cardExpirationDate) {
        this.cardExpirationDate = cardExpirationDate;
    }

    public String getCvv2() {
        return cvv2;
    }

    public void setCvv2(String cvv2) {
        this.cvv2 = cvv2;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardLabel() {
        return cardLabel;
    }

    public void setCardLabel(String cardLabel) {
        this.cardLabel = cardLabel;
    }

    @Override
    public String toString() {
        return "CardCreateResponse{" +
                "returnCode='" + returnCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", cardLogId='" + cardLogId + '\'' +
                ", cardNum='" + cardNum + '\'' +
                ", cardExpirationDate='" + cardExpirationDate + '\'' +
                ", cvv2='" + cvv2 + '\'' +
                ", cardType='" + cardType + '\'' +
                ", cardLabel='" + cardLabel + '\'' +
                '}';
    }
}
