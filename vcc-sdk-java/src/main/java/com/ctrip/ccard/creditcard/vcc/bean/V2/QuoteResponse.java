package com.ctrip.ccard.creditcard.vcc.bean.V2;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

public class QuoteResponse {

    private String returnCode;

    private String errorMessage;

    /**
     * 汇率id
     */
    private String quoteId;
    /**
     * 卖出币种
     */
    private String sellCurrency;
    /**
     * 买入币种
     */
    private String buyCurrency;
    /**
     * 卖出金额
     */
    private Long sellAmount;
    /**
     * 买入金额
     */
    private Long buyAmount;
    /**
     * 汇率
     */
    private BigDecimal rate;
    /**
     * 过期时间
     */
    private Date expireTime;



    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
    }

    public String getSellCurrency() {
        return sellCurrency;
    }

    public void setSellCurrency(String sellCurrency) {
        this.sellCurrency = sellCurrency;
    }

    public String getBuyCurrency() {
        return buyCurrency;
    }

    public void setBuyCurrency(String buyCurrency) {
        this.buyCurrency = buyCurrency;
    }

    public Long getSellAmount() {
        return sellAmount;
    }

    public void setSellAmount(Long sellAmount) {
        this.sellAmount = sellAmount;
    }

    public Long getBuyAmount() {
        return buyAmount;
    }

    public void setBuyAmount(Long buyAmount) {
        this.buyAmount = buyAmount;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }



    @Override
    public String toString() {
        return "QuoteResponse{" +
                "returnCode='" + returnCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", quoteId='" + quoteId + '\'' +
                ", sellCurrency='" + sellCurrency + '\'' +
                ", buyCurrency='" + buyCurrency + '\'' +
                ", sellAmount=" + sellAmount +
                ", buyAmount=" + buyAmount +
                ", rate=" + rate +
                ", expireTime=" + expireTime +
                '}';
    }
}
