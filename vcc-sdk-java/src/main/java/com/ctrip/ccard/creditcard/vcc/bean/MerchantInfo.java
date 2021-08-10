package com.ctrip.ccard.creditcard.vcc.bean;

import java.util.List;

/**
 * Description:
 */
public class MerchantInfo {

    /**
     * 商户名称
     */
    private String merchantName;

    /**
     * 支持的通道信息列表
     */
    public List<ChannelInfo> channelInfos;

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
}
