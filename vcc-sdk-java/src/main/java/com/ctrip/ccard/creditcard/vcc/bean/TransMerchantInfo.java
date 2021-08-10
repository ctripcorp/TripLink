package com.ctrip.ccard.creditcard.vcc.bean;

/**
 * Description:
 */
public class TransMerchantInfo {
    /**
     * 商户名称
     */
    private String merchantName;

    /**
     * 商户MCC
     */
    private String merchantCategoryCode;

    /**
     * 商户所在国家码
     */
    private String merchantCountryCode;

    /**
     * 商户所在国家城市
     */
    private String merchantCity;

    /**
     * 商户所在国家城市区域
     */
    private String merchantState;

    /**
     * 商户所在国家邮编
     */
    private String merchantZipCode;

    /**
     * 商户描述
     */
    private String merchantDesc;

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantCategoryCode() {
        return merchantCategoryCode;
    }

    public void setMerchantCategoryCode(String merchantCategoryCode) {
        this.merchantCategoryCode = merchantCategoryCode;
    }

    public String getMerchantCountryCode() {
        return merchantCountryCode;
    }

    public void setMerchantCountryCode(String merchantCountryCode) {
        this.merchantCountryCode = merchantCountryCode;
    }

    public String getMerchantCity() {
        return merchantCity;
    }

    public void setMerchantCity(String merchantCity) {
        this.merchantCity = merchantCity;
    }

    public String getMerchantState() {
        return merchantState;
    }

    public void setMerchantState(String merchantState) {
        this.merchantState = merchantState;
    }

    public String getMerchantZipCode() {
        return merchantZipCode;
    }

    public void setMerchantZipCode(String merchantZipCode) {
        this.merchantZipCode = merchantZipCode;
    }

    public String getMerchantDesc() {
        return merchantDesc;
    }

    public void setMerchantDesc(String merchantDesc) {
        this.merchantDesc = merchantDesc;
    }

}
