package com.ctrip.ccard.creditcard.vcc.bean.V2;

public class CardCreateResponse{

    // 卡号别名长号
    private String cardLogId;
    // 卡号别名短号
    private String cardSId;
    // 卡片vcc2
    private String cvv2;
    // 卡片有效期
    private String cardExpridate;
    // 卡号
    private String cardNum;

    private String cardType;

    private String cardLabel;

    private String returnCode;

    private String errorMessage;

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

    public String getCardLogId() {
        return cardLogId;
    }

    public void setCardLogId(String cardLogId) {
        this.cardLogId = cardLogId;
    }

    public String getCardSId() {
        return cardSId;
    }

    public void setCardSId(String cardSId) {
        this.cardSId = cardSId;
    }

    public String getCvv2() {
        return cvv2;
    }

    public void setCvv2(String cvv2) {
        this.cvv2 = cvv2;
    }

    public String getCardExpridate() {
        return cardExpridate;
    }

    public void setCardExpridate(String cardExpridate) {
        this.cardExpridate = cardExpridate;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
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

    @Override
    public String toString() {
        return "CardCreateResponse{" +
                "cardLogId='" + cardLogId + '\'' +
                ", cardSId='" + cardSId + '\'' +
                ", cvv2='" + cvv2 + '\'' +
                ", cardExpridate='" + cardExpridate + '\'' +
                ", cardNum='" + cardNum + '\'' +
                ", cardType='" + cardType + '\'' +
                ", cardLabel='" + cardLabel + '\'' +
                ", returnCode='" + returnCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
