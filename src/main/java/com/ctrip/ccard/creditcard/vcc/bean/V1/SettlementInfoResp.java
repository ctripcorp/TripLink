package com.ctrip.ccard.creditcard.vcc.bean.V1;

import java.util.List;

/**
 * Description:
 */
public class SettlementInfoResp {
    /**
     * 返回总条数
     */
    private Integer totalCount;

    /**
     * 可用余额
     */
    private String balanceAmt;

    /**
     * 清算交易记录
     */
    private List<SettlementInfo> settlementInfos;

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

    public List<SettlementInfo> getSettlementInfos() {
        return settlementInfos;
    }

    public void setSettlementInfos(List<SettlementInfo> settlementInfos) {
        this.settlementInfos = settlementInfos;
    }
}
