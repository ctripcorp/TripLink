package com.ctrip.ccard.creditcard.vcc.bean;

import java.util.List;

/**
 * Description:
 */
public class AuthInfoResp {
    /**
     * 返回总条数
     */
    private Integer totalCount;
    /**
     * 可用余额
     */
    private String balanceAmt;
    /**
     * 授权交易记录
     */
    private List<AuthInfo> authInfos;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public String getBalanceAmt() {
        return balanceAmt;
    }

    public void setBalanceAmt(String balanceAmt) {
        this.balanceAmt = balanceAmt;
    }

    public List<AuthInfo> getAuthInfos() {
        return authInfos;
    }

    public void setAuthInfos(List<AuthInfo> authInfos) {
        this.authInfos = authInfos;
    }
}
