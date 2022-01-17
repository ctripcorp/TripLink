package com.ctrip.ccard.creditcard.vcc.bean.V1;

/**
 * Description:
 */
public class AuthInfo {
    /**
     * 发生时间
     */
    private String occurTime;

    /**
     * 交易唯一号
     */
    private String transId;

    /**
     * 交易币种
     */
    private String transCurrency;

    /**
     * 交易币种金额
     */
    private String transCurrencyAmt;

    /**
     * 卡币种
     */
    private String localCurrency;

    /**
     * 卡本币种交易金额
     */
    private String localCurrencyAmt;

    /**
     * 交易响应码
     */
    private String respCode;

    /**
     * 交易响应码描述
     */
    private String respCodeDesc;

    /**
     * 授权码
     */
    private String approveCode;

    /**
     * 交易拒绝原因
     */
    private String declineReason;

    /**
     * 卡交易状态
     */
    private String status;

    /**
     * 交易地国家代码
     */
    private String countryCode;

    /**
     * 信息类型
     */
    private String messageType;

    /**
     * 信息类型描述
     */
    private String messageTypeDesc;

    /**
     * 扣款商户信息
     */
    private TransMerchantInfo transMerchantInfo;

    /**
     * 用于今后的扩展
     */
    private String transExtra;

    public String getOccurTime() {
        return occurTime;
    }

    public void setOccurTime(String occurTime) {
        this.occurTime = occurTime;
    }

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }

    public String getTransCurrency() {
        return transCurrency;
    }

    public void setTransCurrency(String transCurrency) {
        this.transCurrency = transCurrency;
    }

    public String getTransCurrencyAmt() {
        return transCurrencyAmt;
    }

    public void setTransCurrencyAmt(String transCurrencyAmt) {
        this.transCurrencyAmt = transCurrencyAmt;
    }

    public String getLocalCurrency() {
        return localCurrency;
    }

    public void setLocalCurrency(String localCurrency) {
        this.localCurrency = localCurrency;
    }

    public String getLocalCurrencyAmt() {
        return localCurrencyAmt;
    }

    public void setLocalCurrencyAmt(String localCurrencyAmt) {
        this.localCurrencyAmt = localCurrencyAmt;
    }

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespCodeDesc() {
        return respCodeDesc;
    }

    public void setRespCodeDesc(String respCodeDesc) {
        this.respCodeDesc = respCodeDesc;
    }

    public String getApproveCode() {
        return approveCode;
    }

    public void setApproveCode(String approveCode) {
        this.approveCode = approveCode;
    }

    public String getDeclineReason() {
        return declineReason;
    }

    public void setDeclineReason(String declineReason) {
        this.declineReason = declineReason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getMessageTypeDesc() {
        return messageTypeDesc;
    }

    public void setMessageTypeDesc(String messageTypeDesc) {
        this.messageTypeDesc = messageTypeDesc;
    }

    public TransMerchantInfo getTransMerchantInfo() {
        return transMerchantInfo;
    }

    public void setTransMerchantInfo(TransMerchantInfo transMerchantInfo) {
        this.transMerchantInfo = transMerchantInfo;
    }

    public String getTransExtra() {
        return transExtra;
    }

    public void setTransExtra(String transExtra) {
        this.transExtra = transExtra;
    }
}
