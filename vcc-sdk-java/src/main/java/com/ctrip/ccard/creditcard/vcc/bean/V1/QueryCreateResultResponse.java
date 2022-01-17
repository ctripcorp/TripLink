package com.ctrip.ccard.creditcard.vcc.bean.V1;

/**
 * Description:
 */
public class QueryCreateResultResponse {

    /**
     * query result
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
     * result of create
     * PROCESS：处理中
     * SUCCEED：成功
     * FAILURE：失败
     * EXCEPTION：异常
     */
    private String resultStatus;

    /**
     * create result code
     */
    private String resultRespCode;

    /**
     * create result desc
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
     * query request number
     */
    private String requestId;

    /**
     * query request time
     */
    private String requestTime;

    /**
     * query merchant name
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
}
