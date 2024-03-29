package com.ctrip.ccard.creditcard.vcc.bean.V1;

public class CreateResponse {
    /**
     * create result
     * PROCESS：处理中
     * SUCCEED：成功
     * FAILURE：失败
     * EXCEPTION：异常
     */
    private String resultStatus;
    /**
     * result code
     */
    private String resultRespCode;
    /**
     * result desc
     */
    private String resultRespMsg;
    /**
     * result detail desc
     */
    private String resultRespDetailMsg;
    /**
     * channel type, TripLink distribution
     */
    private String channelType;
    /**
     * TripLink ccOpId
     */
    private String ccOpId;
    /**
     * create request number
     */
    private String requestId;
    /**
     * create request time
     */
    private String requestTime;
    /**
     *create merchant name
     */
    private String merchantName;
    /**
     * response extra info
     * json type
     * eg: {"BinFlagDcre":"12345"}
     */
    private String respExtra;
    /**
     * TripLink unique reference number
     */
    private String cardLogId;
    /**
     * card no
     * encrypt by des
     */
    private String cardNo;
    /**
     * cvv
     * encrypt by des
     */
    private String cardVerifyNo;
    /**
     * expiration date of the card
     * encrypt by des
     */
    private String cardExpiryDate;
    /**
     * card association
     */
    private String cardLabel;

    private String cardType;

    public String getResultStatus() {
        return resultStatus;
    }

    public void setResultStatus(String resultStatus) {
        this.resultStatus = resultStatus;
    }

    public String getResultRespCode() {
        return resultRespCode;
    }

    public void setResultRespCode(String resultRespCode) {
        this.resultRespCode = resultRespCode;
    }

    public String getResultRespMsg() {
        return resultRespMsg;
    }

    public void setResultRespMsg(String resultRespMsg) {
        this.resultRespMsg = resultRespMsg;
    }

    public String getResultRespDetailMsg() {
        return resultRespDetailMsg;
    }

    public void setResultRespDetailMsg(String resultRespDetailMsg) {
        this.resultRespDetailMsg = resultRespDetailMsg;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public String getCcOpId() {
        return ccOpId;
    }

    public void setCcOpId(String ccOpId) {
        this.ccOpId = ccOpId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getRespExtra() {
        return respExtra;
    }

    public void setRespExtra(String respExtra) {
        this.respExtra = respExtra;
    }

    public String getCardLogId() {
        return cardLogId;
    }

    public void setCardLogId(String cardLogId) {
        this.cardLogId = cardLogId;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardVerifyNo() {
        return cardVerifyNo;
    }

    public void setCardVerifyNo(String cardVerifyNo) {
        this.cardVerifyNo = cardVerifyNo;
    }

    public String getCardExpiryDate() {
        return cardExpiryDate;
    }

    public void setCardExpiryDate(String cardExpiryDate) {
        this.cardExpiryDate = cardExpiryDate;
    }

    public String getCardLabel() {
        return cardLabel;
    }

    public void setCardLabel(String cardLabel) {
        this.cardLabel = cardLabel;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return "CreateResponse{" +
                "resultStatus='" + resultStatus + '\'' +
                ", resultRespCode='" + resultRespCode + '\'' +
                ", resultRespMsg='" + resultRespMsg + '\'' +
                ", resultRespDetailMsg='" + resultRespDetailMsg + '\'' +
                ", channelType='" + channelType + '\'' +
                ", ccOpId='" + ccOpId + '\'' +
                ", requestId='" + requestId + '\'' +
                ", requestTime='" + requestTime + '\'' +
                ", merchantName='" + merchantName + '\'' +
                ", respExtra='" + respExtra + '\'' +
                ", cardLogId='" + cardLogId + '\'' +
                ", cardNo='" + cardNo + '\'' +
                ", cardVerifyNo='" + cardVerifyNo + '\'' +
                ", cardExpiryDate='" + cardExpiryDate + '\'' +
                ", cardLabel='" + cardLabel + '\'' +
                ", cardType='" + cardType + '\'' +
                '}';
    }
}
