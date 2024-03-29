package com.ctrip.ccard.creditcard.vcc.bean.V1;

public class QueryAuthTransInfoByPageResponse {
    /**
     * auth trans result
     * PROCESS：处理中
     * SUCCEED：成功
     * FAILURE：失败
     * EXCEPTION：异常
     */
    private String resultStatus;
    /**
     * result code
     */
    private String resultRespCode;
    /**
     * result desc
     */
    private String resultRespMsg;
    /**
     * result detail desc
     */
    private String resultRespDetailMsg;
    /**
     * query request number
     */
    private String requestId;
    /**
     * query request time
     */
    private String requestTime;
    /**
     * query merchant name
     */
    private String merchantName;
    /**
     * channel type, TripLink distribution
     */
    private String channelType;
    /**
     * result of auth
     */
    private AuthTransactionByPage authInfoByPage;

    public String getResultStatus() {
        return resultStatus;
    }

    public void setResultStatus(String resultStatus) {
        this.resultStatus = resultStatus;
    }

    public String getResultRespCode() {
        return resultRespCode;
    }

    public void setResultRespCode(String resultRespCode) {
        this.resultRespCode = resultRespCode;
    }

    public String getResultRespMsg() {
        return resultRespMsg;
    }

    public void setResultRespMsg(String resultRespMsg) {
        this.resultRespMsg = resultRespMsg;
    }

    public String getResultRespDetailMsg() {
        return resultRespDetailMsg;
    }

    public void setResultRespDetailMsg(String resultRespDetailMsg) {
        this.resultRespDetailMsg = resultRespDetailMsg;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public AuthTransactionByPage getAuthInfoByPage() {
        return authInfoByPage;
    }

    public void setAuthInfoByPage(AuthTransactionByPage authInfoByPage) {
        this.authInfoByPage = authInfoByPage;
    }

    @Override
    public String toString() {
        return "QueryAuthTransInfoResponse{" +
                "resultStatus='" + resultStatus + '\'' +
                ", resultRespCode='" + resultRespCode + '\'' +
                ", resultRespMsg='" + resultRespMsg + '\'' +
                ", resultRespDetailMsg='" + resultRespDetailMsg + '\'' +
                ", requestId='" + requestId + '\'' +
                ", requestTime='" + requestTime + '\'' +
                ", merchantName='" + merchantName + '\'' +
                ", channelType='" + channelType + '\'' +
                ", authInfoByPage=" + authInfoByPage +
                '}';
    }
}
