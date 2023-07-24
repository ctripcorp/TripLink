package com.ctrip.ccard.creditcard.vcc.bean.V2;

/**
 * 清算交易查询
 * @author j.mao
 * @since 2023-07-11
 **/
public class QuerySettlementTransactionByPageRequest {
    /**
     * API版本
     */
    private String serviceVersion;
    /**
     * 请求流水号
     */
    private String requestId;
    /**
     * 客户ID
     */
    private String customerId;

    /**
     * 卡索引ID
     */
    private String cardLogId;

    /**
     * 清算起始时间
     * 格式：yyyy-MM-dd HH:mm:ss
     */
    private String settlementStartTime;

    /**
     * 清算结束时间
     * 格式：yyyy-MM-dd HH:mm:ss
     */
    private String settlementEndTime;

    /**
     * 分页条数
     */
    private Integer pageSize = 5;

    /**
     * 分页页码
     */
    private Integer pageNo = 1;

    public String getServiceVersion() {
        return serviceVersion;
    }

    public void setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCardLogId() {
        return cardLogId;
    }

    public void setCardLogId(String cardLogId) {
        this.cardLogId = cardLogId;
    }

    public String getSettlementStartTime() {
        return settlementStartTime;
    }

    public void setSettlementStartTime(String settlementStartTime) {
        this.settlementStartTime = settlementStartTime;
    }

    public String getSettlementEndTime() {
        return settlementEndTime;
    }

    public void setSettlementEndTime(String settlementEndTime) {
        this.settlementEndTime = settlementEndTime;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    @Override
    public String toString() {
        return "QuerySettlementTransactionByPageRequest{" +
                "serviceVersion='" + serviceVersion + '\'' +
                ", requestId='" + requestId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", cardLogId='" + cardLogId + '\'' +
                ", settlementStartTime='" + settlementStartTime + '\'' +
                ", settlementEndTime='" + settlementEndTime + '\'' +
                ", pageSize=" + pageSize +
                ", pageNo=" + pageNo +
                '}';
    }
}
