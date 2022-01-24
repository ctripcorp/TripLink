package com.ctrip.ccard.creditcard.vcc.bean.V1;

import java.util.List;

public class MerchantInfo {
    /**
     * 商户名称
     */
    private String merchantName;
    /**
     * 支持的通道信息列表
     */
    public List<ChannelInfo> channelInfos;
    /**
     * 账户信息列表
     */
    public List<AccountInfo> accountInfos;

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public List<ChannelInfo> getChannelInfos() {
        return channelInfos;
    }

    public void setChannelInfos(List<ChannelInfo> channelInfos) {
        this.channelInfos = channelInfos;
    }

    public List<AccountInfo> getAccountInfos() {
        return accountInfos;
    }

    public void setAccountInfos(List<AccountInfo> accountInfos) {
        this.accountInfos = accountInfos;
    }

    @Override
    public String toString() {
        return "MerchantInfo{" +
                "merchantName='" + merchantName + '\'' +
                ", channelInfos=" + channelInfos +
                ", accountInfos=" + accountInfos +
                '}';
    }
}
