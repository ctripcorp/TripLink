package com.ctrip.ccard.creditcard.vcc.bean.V2;

/**
 * 授权交易查询
 *
 * @author ji_hao
 * @since 2022-08-03
 **/
public class QueryAuthTransactionByPageRequest {
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
    private String cardLid;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 交易状态 枚举值：1-交易成功 2-交易失败
     */
    private String transactionStatus;

    /**
     * 枚举值：6810-消费授权 6820-授权查询 6510-退款授权 6930-消费授权冲正 6940-退款授权冲正
     */
    private String transactionCode;

    /**
     * 交易起始时间
     * 格式：yyyy-MM-dd HH:mm:ss
     */
    private String transactionStartTime;

    /**
     * 交易结束时间
     * 格式：yyyy-MM-dd HH:mm:ss
     */
    private String transactionEndTime;

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

    public String getCardLid() {
        return cardLid;
    }

    public void setCardLid(String cardLid) {
        this.cardLid = cardLid;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public String getTransactionStartTime() {
        return transactionStartTime;
    }

    public void setTransactionStartTime(String transactionStartTime) {
        this.transactionStartTime = transactionStartTime;
    }

    public String getTransactionEndTime() {
        return transactionEndTime;
    }

    public void setTransactionEndTime(String transactionEndTime) {
        this.transactionEndTime = transactionEndTime;
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
        return "QueryAuthTransactionByPageRequest{" +
                "serviceVersion='" + serviceVersion + '\'' +
                ", requestId='" + requestId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", cardLid='" + cardLid + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", transactionStatus='" + transactionStatus + '\'' +
                ", transactionCode='" + transactionCode + '\'' +
                ", transactionStartTime='" + transactionStartTime + '\'' +
                ", transactionEndTime='" + transactionEndTime + '\'' +
                ", pageSize=" + pageSize +
                ", pageNo=" + pageNo +
                '}';
    }
}
