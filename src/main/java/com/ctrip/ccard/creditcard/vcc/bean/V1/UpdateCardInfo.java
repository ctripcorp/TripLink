package com.ctrip.ccard.creditcard.vcc.bean.V1;

import java.math.BigDecimal;

/**
 * Description:
 */
public class UpdateCardInfo {

    /**
     * VCC发行卡片处唯一参考号
     */
    private String cardLogId;
    /**
     * 卡生效日期 <yyyy-MM-dd>
     */
    private String startActiveDate;
    /**
     * 最晚关卡日期 <yyyy-MM-dd>
     */
    private String endCloseDate;
    /**
     * 卡额度
     */
    private BigDecimal creditLimitAmt;
    /**
     * 卡最低可扣款金额
     */
    private BigDecimal minAuthAmt;
    /**
     * 卡最高可扣款金额
     */
    private BigDecimal maxAuthAmt;
    /**
     * 自动关卡百分数设定
     * 取值范围：[1-100]%
     */
    private Integer closePercentage;
    /**
     * 商户控制方式
     * 枚举：0:指定商户号/4:指定商户mcc组名;
     */
    private String merchantControlMethod;
    /**
     * MCC类别
     */
    private String merchantCategoryName;
    /**
     * 商户号
     */
    private String merchantCode;
    /**
     * 是否支持3ds验证  0：不支持；1:支持<默认>
     */
    private String enable3DS;
    /**
     * 是否启用CVV检验    0：不开启<默认>；1:开启验证
     */
    private String enaleCVVCheck;
    /**
     * 是否启用交易币种限制
     * 0：不做交易币种限制<默认>/1：只允许开卡币种作为交易币种
     */
    private String enableCurrencyCheck;
    /**
     * 用户自定义信息
     * 按照TripLink约定传送数据，一般在交易账单中体现：
     * 如："userDefineInfo": "{"BookingNumber":"可填客户的订单号，该数据会在交易账单中提现"}"
     */
    private String userDefineInfo;


    public String getCardLogId() {
        return cardLogId;
    }

    public void setCardLogId(String cardLogId) {
        this.cardLogId = cardLogId;
    }

    public String getStartActiveDate() {
        return startActiveDate;
    }

    public void setStartActiveDate(String startActiveDate) {
        this.startActiveDate = startActiveDate;
    }

    public String getEndCloseDate() {
        return endCloseDate;
    }

    public void setEndCloseDate(String endCloseDate) {
        this.endCloseDate = endCloseDate;
    }

    public BigDecimal getCreditLimitAmt() {
        return creditLimitAmt;
    }

    public void setCreditLimitAmt(BigDecimal creditLimitAmt) {
        this.creditLimitAmt = creditLimitAmt;
    }

    public BigDecimal getMinAuthAmt() {
        return minAuthAmt;
    }

    public void setMinAuthAmt(BigDecimal minAuthAmt) {
        this.minAuthAmt = minAuthAmt;
    }

    public BigDecimal getMaxAuthAmt() {
        return maxAuthAmt;
    }

    public void setMaxAuthAmt(BigDecimal maxAuthAmt) {
        this.maxAuthAmt = maxAuthAmt;
    }

    public Integer getClosePercentage() {
        return closePercentage;
    }

    public void setClosePercentage(Integer closePercentage) {
        this.closePercentage = closePercentage;
    }

    public String getMerchantControlMethod() {
        return merchantControlMethod;
    }

    public void setMerchantControlMethod(String merchantControlMethod) {
        this.merchantControlMethod = merchantControlMethod;
    }

    public String getMerchantCategoryName() {
        return merchantCategoryName;
    }

    public void setMerchantCategoryName(String merchantCategoryName) {
        this.merchantCategoryName = merchantCategoryName;
    }

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    public String getEnable3DS() {
        return enable3DS;
    }

    public void setEnable3DS(String enable3DS) {
        this.enable3DS = enable3DS;
    }

    public String getEnaleCVVCheck() {
        return enaleCVVCheck;
    }

    public void setEnaleCVVCheck(String enaleCVVCheck) {
        this.enaleCVVCheck = enaleCVVCheck;
    }

    public String getEnableCurrencyCheck() {
        return enableCurrencyCheck;
    }

    public void setEnableCurrencyCheck(String enableCurrencyCheck) {
        this.enableCurrencyCheck = enableCurrencyCheck;
    }

    public String getUserDefineInfo() {
        return userDefineInfo;
    }

    public void setUserDefineInfo(String userDefineInfo) {
        this.userDefineInfo = userDefineInfo;
    }
}
