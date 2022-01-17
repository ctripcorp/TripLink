package com.ctrip.ccard.creditcard.vcc.bean.V2;

import java.util.Map;

public class CardUpdateResponse {

    // 卡号别名长号
    private String cardLogId;
    // 卡片vcc2
    private String cvv2;
    // 卡片有效期
    private String cardExpridate;
    // 卡号
    private String cardNum;

    private Map<String, String> userReferenceMap;

    private String returnCode;

    private String errorMessage;

    public String getCardLogId() {
        return cardLogId;
    }

    public void setCardLogId(String cardLogId) {
        this.cardLogId = cardLogId;
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

    public Map<String, String> getUserReferenceMap() {
        return userReferenceMap;
    }

    public void setUserReferenceMap(Map<String, String> userReferenceMap) {
        this.userReferenceMap = userReferenceMap;
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
        return "CardUpdateResponse{" +
                "cardLogId='" + cardLogId + '\'' +
                ", cvv2='" + cvv2 + '\'' +
                ", cardExpridate='" + cardExpridate + '\'' +
                ", cardNum='" + cardNum + '\'' +
                ", userReferenceMap=" + userReferenceMap +
                ", returnCode='" + returnCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
