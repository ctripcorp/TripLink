package com.ctrip.ccard.creditcard.vcc.bean.V2;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: j.mao
 * Date: 2021-10-26
 * Time: 17:16
 */
public class QueryCustomerCreditAmountResponse {

    // 客户ID
    private String customerId;

    private List<QueryCreditAmountDetailEntity> list;

    private String returnCode;

    private String errorMessage;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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

    public List<QueryCreditAmountDetailEntity> getList() {
        return list;
    }

    public void setList(List<QueryCreditAmountDetailEntity> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "QueryCustomerCreditAmountResponse{" +
                "customerId='" + customerId + '\'' +
                ", list=" + list +
                ", returnCode='" + returnCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
