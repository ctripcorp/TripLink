package com.ctrip.ccard.creditcard.vcc.bean.V2;

import java.math.BigDecimal;

/**
 * Description:
 */
public class QueryCreditAmountDetailEntity {
    /**
     * 账户额度 贷记账户才有
     */
    private BigDecimal accountAmount;
    /**
     * 剩余账户额度
     */
    private BigDecimal remainAccountAmount;
    /**
     * 账户类型
     * CREDIT：贷记账户
     * DEBIT：借记账户
     */
    private String accountType;
    /**
     * 账户币种
     */
    private String accountCurrency;

    public String getAccountCurrency() {
        return accountCurrency;
    }

    public void setAccountCurrency(String accountCurrency) {
        this.accountCurrency = accountCurrency;
    }

    public BigDecimal getAccountAmount() {
        return accountAmount;
    }

    public void setAccountAmount(BigDecimal accountAmount) {
        this.accountAmount = accountAmount;
    }

    public BigDecimal getRemainAccountAmount() {
        return remainAccountAmount;
    }

    public void setRemainAccountAmount(BigDecimal remainAccountAmount) {
        this.remainAccountAmount = remainAccountAmount;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "QueryCreditAmountDetailEntity{" +
                "accountAmount=" + accountAmount +
                ", remainAccountAmount=" + remainAccountAmount +
                ", accountType='" + accountType + '\'' +
                ", accountCurrency='" + accountCurrency + '\'' +
                '}';
    }
}
