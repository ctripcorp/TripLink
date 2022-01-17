package com.ctrip.ccard.creditcard.vcc.bean.V1;

public class QInfoResponse {
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
     * 结果码详细描述
     */
    private String resultRespDetailMsg;

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
     * 发卡通道类型
     */
    private String channelType;

    /**
     * 卡信息请求
     */
    private CardInfo cardInfo;

    /**
     * 商户信息
     */
    private MerchantInfo merchantInfo;

    /**
     * 响应扩展数据
     */
    private String respExtra;

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

    public String getResultRespDetailMsg() {
        return resultRespDetailMsg;
    }

    public void setResultRespDetailMsg(String resultRespDetailMsg) {
        this.resultRespDetailMsg = resultRespDetailMsg;
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

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public CardInfo getCardInfo() {
        return cardInfo;
    }

    public void setCardInfo(CardInfo cardInfo) {
        this.cardInfo = cardInfo;
    }

    public MerchantInfo getMerchantInfo() {
        return merchantInfo;
    }

    public void setMerchantInfo(MerchantInfo merchantInfo) {
        this.merchantInfo = merchantInfo;
    }

    public String getRespExtra() {
        return respExtra;
    }

    public void setRespExtra(String respExtra) {
        this.respExtra = respExtra;
    }

    @Override
    public String toString() {
        return "QInfoResponse{" +
                "resultstatus='" + resultstatus + '\'' +
                ", resultRespCode='" + resultRespCode + '\'' +
                ", resultRespMsg='" + resultRespMsg + '\'' +
                ", resultRespDetailMsg='" + resultRespDetailMsg + '\'' +
                ", requestId='" + requestId + '\'' +
                ", requestTime='" + requestTime + '\'' +
                ", requestType='" + requestType + '\'' +
                ", subRequestType='" + subRequestType + '\'' +
                ", merchantName='" + merchantName + '\'' +
                ", channelType='" + channelType + '\'' +
                ", cardInfo=" + cardInfo +
                ", merchantInfo=" + merchantInfo +
                ", respExtra='" + respExtra + '\'' +
                '}';
    }
}
