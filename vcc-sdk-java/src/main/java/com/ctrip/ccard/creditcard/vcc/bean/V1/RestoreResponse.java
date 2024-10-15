package com.ctrip.ccard.creditcard.vcc.bean.V1;

public class RestoreResponse {

    /**
     * close result
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
     * channel type
     */
    private String channelType;

    /**
     * ccOpId
     */
    private String ccOpId;

    /**
     * request id
     */
    private String requestId;

    /**
     * request time
     */
    private String requestTime;
    /**
     * merchant name
     */
    private String merchantName;

    /**
     * response extra info
     */
    private String respExtra;

    /**
     * card log id
     */
    private String cardLogId;

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

    @Override
    public String toString() {
        return "RestoreResponse{" +
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
                '}';
    }
}
