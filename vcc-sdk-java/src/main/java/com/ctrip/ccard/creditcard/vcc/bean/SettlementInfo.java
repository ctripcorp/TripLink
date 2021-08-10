package com.ctrip.ccard.creditcard.vcc.bean;

/**
 * Description:
 */
public class SettlementInfo {
    /**
     * 交易发生时间
     */
    private String occurTime;

    /**
     * 入账日期
     */
    private String postDate;

    /**
     * 出账日期
     */
    private String settleDate;

    /**
     * 交易币种
     */
    private String transCurrency;

    /**
     * 交易金额
     */
    private String transAmt;

    /**
     * 卡币种
     */
    private String localCurrency;

    /**
     * 卡本币种交易金额
     */
    private String localCurrencyAmt;

    /**
     * 入账币种
     */
    private String billCurrency;

    /**
     * 入账币种对应金额
     */
    private String billCurrencyAmt;

    /**
     * 入账原金额
     */
    private String originalBillCurrencyAmt;

    /**
     * 交易类型
     */
    private String transType;

    /**
     * 交易类型码
     */
    private String transCode;

    /**
     * 授权码
     */
    private String authNo;

    /**
     * 交易流水号
     */
    private String transNo;

    /**
     * 是否是收或付标识
     */
    private String isCredit;

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

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public String getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate;
    }

    public String getTransCurrency() {
        return transCurrency;
    }

    public void setTransCurrency(String transCurrency) {
        this.transCurrency = transCurrency;
    }

    public String getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(String transAmt) {
        this.transAmt = transAmt;
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

    public String getBillCurrency() {
        return billCurrency;
    }

    public void setBillCurrency(String billCurrency) {
        this.billCurrency = billCurrency;
    }

    public String getBillCurrencyAmt() {
        return billCurrencyAmt;
    }

    public void setBillCurrencyAmt(String billCurrencyAmt) {
        this.billCurrencyAmt = billCurrencyAmt;
    }

    public String getOriginalBillCurrencyAmt() {
        return originalBillCurrencyAmt;
    }

    public void setOriginalBillCurrencyAmt(String originalBillCurrencyAmt) {
        this.originalBillCurrencyAmt = originalBillCurrencyAmt;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public String getTransCode() {
        return transCode;
    }

    public void setTransCode(String transCode) {
        this.transCode = transCode;
    }

    public String getAuthNo() {
        return authNo;
    }

    public void setAuthNo(String authNo) {
        this.authNo = authNo;
    }

    public String getTransNo() {
        return transNo;
    }

    public void setTransNo(String transNo) {
        this.transNo = transNo;
    }

    public String getIsCredit() {
        return isCredit;
    }

    public void setIsCredit(String isCredit) {
        this.isCredit = isCredit;
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
