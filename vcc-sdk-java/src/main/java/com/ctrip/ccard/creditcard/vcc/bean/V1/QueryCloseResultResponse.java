package com.ctrip.ccard.creditcard.vcc.bean.V1;

/**
 * Description:
 */
public class QueryCloseResultResponse {

    /**
     * query close result
     * SUCCEED：成功
     * FAILURE：失败
     * EXCEPTION：异常
     */
    private String qResultStatus;

    /**
     * query result code
     */
    private String qResultCode;

    /**
     * query result desc
     */
    private String qResultMsg;

    /**
     * close result
     * PROCESS：处理中
     * SUCCEED：成功
     * FAILURE：失败
     * EXCEPTION：异常
     */
    private String resultStatus;

    /**
     * close result code
     */
    private String resultRespCode;

    /**
     * close result desc
     */
    private String resultRespMsg;

    /**
     * channel type, TripLink distribution
     */
    private String channelType;

    /**
     * TripLink ccOpId
     */
    private String ccOpId;

    /**
     * close request number
     */
    private String requestId;

    /**
     * close request time
     */
    private String requestTime;

    /**
     * close merchant name
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

    public String getqResultStatus() {
        return qResultStatus;
    }

    public void setqResultStatus(String qResultStatus) {
        this.qResultStatus = qResultStatus;
    }

    public String getqResultCode() {
        return qResultCode;
    }

    public void setqResultCode(String qResultCode) {
        this.qResultCode = qResultCode;
    }

    public String getqResultMsg() {
        return qResultMsg;
    }

    public void setqResultMsg(String qResultMsg) {
        this.qResultMsg = qResultMsg;
    }

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
}
