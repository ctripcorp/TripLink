package com.ctrip.ccard.creditcard.vcc.bean;

/**
 * Description:
 */
public class ChannelInfo {
    /**
     * 卡通道类型
     */
    private String channelType;

    /**
     * 卡通道总限额
     */
    private String channelCardCreditLimitAmt;

    /**
     * 卡通道总限额剩余额度
     */
    private String channelRemainCardCreditLimitAmt;

    /**
     * 卡通道总授信额度
     */
    private String channelAuthLimitAmt;

    /**
     * 卡通道总授信额度剩余额度
     */
    private String channelRemainAuthLimitAmt;

    /**
     * 卡通道限额币种
     */
    private String channelCurrencyCodeOfLimitAmt;

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public String getChannelCardCreditLimitAmt() {
        return channelCardCreditLimitAmt;
    }

    public void setChannelCardCreditLimitAmt(String channelCardCreditLimitAmt) {
        this.channelCardCreditLimitAmt = channelCardCreditLimitAmt;
    }

    public String getChannelRemainCardCreditLimitAmt() {
        return channelRemainCardCreditLimitAmt;
    }

    public void setChannelRemainCardCreditLimitAmt(String channelRemainCardCreditLimitAmt) {
        this.channelRemainCardCreditLimitAmt = channelRemainCardCreditLimitAmt;
    }

    public String getChannelAuthLimitAmt() {
        return channelAuthLimitAmt;
    }

    public void setChannelAuthLimitAmt(String channelAuthLimitAmt) {
        this.channelAuthLimitAmt = channelAuthLimitAmt;
    }

    public String getChannelRemainAuthLimitAmt() {
        return channelRemainAuthLimitAmt;
    }

    public void setChannelRemainAuthLimitAmt(String channelRemainAuthLimitAmt) {
        this.channelRemainAuthLimitAmt = channelRemainAuthLimitAmt;
    }

    public String getChannelCurrencyCodeOfLimitAmt() {
        return channelCurrencyCodeOfLimitAmt;
    }

    public void setChannelCurrencyCodeOfLimitAmt(String channelCurrencyCodeOfLimitAmt) {
        this.channelCurrencyCodeOfLimitAmt = channelCurrencyCodeOfLimitAmt;
    }
}
