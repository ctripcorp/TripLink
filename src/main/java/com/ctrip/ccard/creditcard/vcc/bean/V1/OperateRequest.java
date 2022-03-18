package com.ctrip.ccard.creditcard.vcc.bean.V1;

/**
 * operate接口 入参实体类
 */
public class OperateRequest {

    /**
     * 请求流水号
     */
    private String requestId;
    /**
     * 请求时间
     * 格式 ：yyyyMMddHHmmss
     */
    private String requestTime;
    /**
     * 请求类型
     * CREATE 创建卡，UPDATE 更新卡，CLOSE 关闭卡
     */
    private String requestType;
    /**
     * 请求子类型
     * CARD_EXTERNAL 虚拟卡
     */
    private String subRequestType;
    /**
     * 请求商户名 服务方预先分配
     */
    private String merchantName;
    /**
     * 发卡通道类型 服务方预先分配
     */
    private String channelType;
    /**
     * 卡信息
     */
    private CardInfo cardInfo;
    /**
     * 风控信息
     */
    private RiskVerifyInfo riskInfo;
    /**
     * 请求来源标注  请求方自定义区分
     */
    private String requestSource;
    /**
     * 调用端操作人
     */
    private String operator;
    /**
     * 签名信息
     */
    private String sign;
    /**
     * 请求扩展字段
     * 若涉及扩展域使用，请参考“请求扩展域-字段说明”
     * json格式  示例 {"BinFlagDcre":"12345"}
     */
    private String reqExtra;

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

    public RiskVerifyInfo getRiskInfo() {
        return riskInfo;
    }

    public void setRiskInfo(RiskVerifyInfo riskInfo) {
        this.riskInfo = riskInfo;
    }

    public String getRequestSource() {
        return requestSource;
    }

    public void setRequestSource(String requestSource) {
        this.requestSource = requestSource;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
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
