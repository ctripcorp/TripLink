package com.ctrip.ccard.creditcard.vcc.bean.V2;

import java.util.List;

/**
 * @since 2022-08-03
 **/
public class QueryAuthTransactionByPageResponse {

    // 卡ID
    private String cardLid;

    // 返回授权数据数量
    private Integer count;

    // 是否还有更多的分页数据
    private boolean isMore;

    // data
    private List<AuthTransactionDataDTO> transactionData;

    /**
     * 结果码
     */
    private String returnCode;
    /**
     * 结果码描述
     */
    private String errorMessage;

    public String getCardLid() {
        return cardLid;
    }

    public void setCardLid(String cardLid) {
        this.cardLid = cardLid;
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

    public List<AuthTransactionDataDTO> getTransactionData() {
        return transactionData;
    }

    public void setTransactionData(List<AuthTransactionDataDTO> transactionData) {
        this.transactionData = transactionData;
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
                "cardLid='" + cardLid + '\'' +
                ", count=" + count +
                ", isMore=" + isMore +
                ", transactionData=" + transactionData +
                ", returnCode='" + returnCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
