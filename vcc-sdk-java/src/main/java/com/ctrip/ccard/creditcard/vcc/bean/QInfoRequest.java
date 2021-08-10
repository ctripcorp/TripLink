package com.ctrip.ccard.creditcard.vcc.bean;

/**
 * Description:
 */
public class QInfoRequest {
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
     * 签名信息
     */
    private String sign;
    /**
     * 请求扩展字段
     */
    private String reqExtra;
    /**
     * 操作人
     */
    private String operator;

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
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

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getReqExtra() {
        return reqExtra;
    }

    public void setReqExtra(String reqExtra) {
        this.reqExtra = reqExtra;
    }
}
