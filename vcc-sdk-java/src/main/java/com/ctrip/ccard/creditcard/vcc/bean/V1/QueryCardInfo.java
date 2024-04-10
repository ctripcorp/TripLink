package com.ctrip.ccard.creditcard.vcc.bean.V1;

import java.math.BigDecimal;

/**
 * Description:
 */
public class QueryCardInfo {
    /**
     * VCC发行卡片处唯一参考号
     */
    private String cardLogId;
    /**
     * 卡号
     * 数据<DES>加解密处理
     */
    private String cardNo;
    /**
     * 卡安全验证码CVV（3位）
     * 数据<DES>加解密处理
     */
    private String cardVerifyNo;
    /**
     * 卡有效期 <yyyyMM>
     * 数据<DES>加解密处理
     */
    private String cardExpiryDate;
    /**
     * 卡具体失效日期 <yyyy-MM-dd>
     */
    private String cardFullExpiryDate;
    /**
     * 卡类型
     * 枚举：GWTTP/GWTTP-MBA/GWTTP-MBG/GWTTP-MBH/GWTTP-MBI/GWTTP-MBJ/MCO
     */
    private String cardType;
    /**
     * 卡组 枚举:MasterCard/VISA
     */
    private String cardLabel;
    /**
     * 卡本币种 开卡币种
     */
    private String localCurrency;
    /**
     * 卡入账币种 结算币种
     */
    private String billCurrency;
    /**
     * 卡入账币种对应的金额
     */
    private BigDecimal billCurrencyAmt;
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
     * 卡余额
     */
    private BigDecimal balanceAmt;
    /**
     * 卡总授权金额
     */
    private BigDecimal totalAuthAmt;
    /**
     * 卡总清算金额
     */
    private BigDecimal totalSettleAmt;
    /**
     * 卡总退款金额
     */
    private BigDecimal totalRefundAmt;
    /**
     * 减去退款金额后的实际结算金额
     */
    private BigDecimal netSettleAmt;
    /**
     * 未结算的授权金额
     */
    private BigDecimal outStandingAuthAmt;
    /**
     * 是否可多次使用
     *枚举： 1：多次使用/0:单次使用
     */
    private String enableMutilUse;
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
    /*
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
     * 卡状态
     * 枚举：CLOP（预销卡）、CLOS（销卡）、NORM（正常）
     */
    private String cardStatus;
    /**
     * 用户自定义信息
     * 按照TripLink约定传送数据，一般在交易账单中体现：
     * 如："userDefineInfo": "{"BookingNumber":"可填客户的订单号，该数据会在交易账单中提现"}"
     */
    private String userDefineInfo;
    /**
     * 卡时区
     */
    private String timeZone;
    /**
     * 是否接受3ds验证
     */
    private Boolean allow3ds;

    private String areaCode;
    private String mobilePhone;
    private String userEmail;
    private Boolean supportThreeDSChallenge;
    private Boolean threeDSPassesSilently;

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Boolean getSupportThreeDSChallenge() {
        return supportThreeDSChallenge;
    }

    public void setSupportThreeDSChallenge(Boolean supportThreeDSChallenge) {
        this.supportThreeDSChallenge = supportThreeDSChallenge;
    }

    public Boolean getThreeDSPassesSilently() {
        return threeDSPassesSilently;
    }

    public void setThreeDSPassesSilently(Boolean threeDSPassesSilently) {
        this.threeDSPassesSilently = threeDSPassesSilently;
    }

    public String getCardLabel() {
        return cardLabel;
    }

    public void setCardLabel(String cardLabel) {
        this.cardLabel = cardLabel;
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

    public String getCardFullExpiryDate() {
        return cardFullExpiryDate;
    }

    public void setCardFullExpiryDate(String cardFullExpiryDate) {
        this.cardFullExpiryDate = cardFullExpiryDate;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getLocalCurrency() {
        return localCurrency;
    }

    public void setLocalCurrency(String localCurrency) {
        this.localCurrency = localCurrency;
    }

    public String getBillCurrency() {
        return billCurrency;
    }

    public void setBillCurrency(String billCurrency) {
        this.billCurrency = billCurrency;
    }

    public BigDecimal getBillCurrencyAmt() {
        return billCurrencyAmt;
    }

    public void setBillCurrencyAmt(BigDecimal billCurrencyAmt) {
        this.billCurrencyAmt = billCurrencyAmt;
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

    public BigDecimal getBalanceAmt() {
        return balanceAmt;
    }

    public void setBalanceAmt(BigDecimal balanceAmt) {
        this.balanceAmt = balanceAmt;
    }

    public BigDecimal getTotalAuthAmt() {
        return totalAuthAmt;
    }

    public void setTotalAuthAmt(BigDecimal totalAuthAmt) {
        this.totalAuthAmt = totalAuthAmt;
    }

    public BigDecimal getTotalSettleAmt() {
        return totalSettleAmt;
    }

    public void setTotalSettleAmt(BigDecimal totalSettleAmt) {
        this.totalSettleAmt = totalSettleAmt;
    }

    public BigDecimal getTotalRefundAmt() {
        return totalRefundAmt;
    }

    public void setTotalRefundAmt(BigDecimal totalRefundAmt) {
        this.totalRefundAmt = totalRefundAmt;
    }

    public BigDecimal getNetSettleAmt() {
        return netSettleAmt;
    }

    public void setNetSettleAmt(BigDecimal netSettleAmt) {
        this.netSettleAmt = netSettleAmt;
    }

    public BigDecimal getOutStandingAuthAmt() {
        return outStandingAuthAmt;
    }

    public void setOutStandingAuthAmt(BigDecimal outStandingAuthAmt) {
        this.outStandingAuthAmt = outStandingAuthAmt;
    }

    public String getEnableMutilUse() {
        return enableMutilUse;
    }

    public void setEnableMutilUse(String enableMutilUse) {
        this.enableMutilUse = enableMutilUse;
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

    public String getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(String cardStatus) {
        this.cardStatus = cardStatus;
    }

    public String getUserDefineInfo() {
        return userDefineInfo;
    }

    public void setUserDefineInfo(String userDefineInfo) {
        this.userDefineInfo = userDefineInfo;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public Boolean getAllow3ds() {
        return allow3ds;
    }

    public void setAllow3ds(Boolean allow3ds) {
        this.allow3ds = allow3ds;
    }
}
