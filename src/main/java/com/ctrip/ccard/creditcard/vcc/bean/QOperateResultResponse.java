package com.ctrip.ccard.creditcard.vcc.bean;

/**
 * Description:
 */
public class QOperateResultResponse {

    /**
     * 查询状态
     * SUCCEED：成功
     * FAILURE：失败
     * EXCEPTION：异常
     */
    private String qResultStatus;

    /**
     * 查询结果码
     */
    private String qResultCode;

    /**
     * 查询结果描述
     */
    private String qResultMsg;

    /**
     * 结果状态
     * PROCESS：处理中
     * SUCCEED：成功
     * FAILURE：失败
     * EXCEPTION：异常
     */
    private String resultstatus;

    /**
     * 结果码
     */
    private String resultRespCode;

    /**
     * 结果码描述
     */
    private String resultRespMsg;

    /**
     * 发卡通道类型
     */
    private String channelType;

    /**
     * 本系统生成的唯一流水号
     */
    private String ccOpId;

    /**
     * 请求流水号
     */
    private String requestId;

    /**
     * 请求时间
     */
    private String requestTime;

    /**
     * 请求类型
     */
    private String requestType;

    /**
     * 请求子类型
     */
    private String subRequestType;

    /**
     * 请求商户名
     */
    private String merchantName;

    /**
     * 卡信息请求
     */
    private CardInfo cardInfo;

    /**
     * 响应扩展数据
     */
    private String respExtra;

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

    public String getResultstatus() {
        return resultstatus;
    }

    public void setResultstatus(String resultstatus) {
        this.resultstatus = resultstatus;
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

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getSubRequestType() {
        return subRequestType;
    }

    public void setSubRequestType(String subRequestType) {
        this.subRequestType = subRequestType;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public CardInfo getCardInfo() {
        return cardInfo;
    }

    public void setCardInfo(CardInfo cardInfo) {
        this.cardInfo = cardInfo;
    }

    public String getRespExtra() {
        return respExtra;
    }

    public void setRespExtra(String respExtra) {
        this.respExtra = respExtra;
    }
}
