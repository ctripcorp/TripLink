package com.ctrip.ccard.creditcard.vcc.bean.V2;

import java.util.List;

/**
 * 清算交易查询
 * @author j.mao
 * @since 2023-07-11
 **/
public class QuerySettlementTransactionByPageResponse {

    // 卡ID
    private String cardLogId;

    // 返回授权数据数量
    private Integer count;

    // 是否还有更多的分页数据
    private boolean isMore;

    // data
    private List<SettlementTransactionDto> settlementData;

    /**
     * 结果码
     */
    private String returnCode;
    /**
     * 结果码描述
     */
    private String errorMessage;

    public String getCardLogId() {
        return cardLogId;
    }

    public void setCardLogId(String cardLogId) {
        this.cardLogId = cardLogId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public boolean isMore() {
        return isMore;
    }

    public void setMore(boolean more) {
        isMore = more;
    }

    public List<SettlementTransactionDto> getSettlementData() {
        return settlementData;
    }

    public void setSettlementData(List<SettlementTransactionDto> settlementData) {
        this.settlementData = settlementData;
    }

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

    @Override
    public String toString() {
        return "QueryAuthTransactionByPageResponse{" +
                "cardLogId='" + cardLogId + '\'' +
                ", count=" + count +
                ", isMore=" + isMore +
                ", settlementData=" + settlementData +
                ", returnCode='" + returnCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
