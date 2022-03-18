package com.ctrip.ccard.creditcard.vcc.bean.V1;

public class AccountInfo {
    /**
     * 账户类型
     */
    public String accountType;
    /**
     * 账户币种
     */
    public String accountCurrency;
    /**
     * 账户额度
     */
    public String accountAmount;
    /**
     * 剩余账户额度
     */
    public String remainAccountAmount;

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountCurrency() {
        return accountCurrency;
    }

    public void setAccountCurrency(String accountCurrency) {
        this.accountCurrency = accountCurrency;
    }

    public String getAccountAmount() {
        return accountAmount;
    }

    public void setAccountAmount(String accountAmount) {
        this.accountAmount = accountAmount;
    }

    public String getRemainAccountAmount() {
        return remainAccountAmount;
    }

    public void setRemainAccountAmount(String remainAccountAmount) {
        this.remainAccountAmount = remainAccountAmount;
    }

    @Override
    public String toString() {
        return "AccountInfo{" +
                "accountType='" + accountType + '\'' +
                ", accountCurrency='" + accountCurrency + '\'' +
                ", accountAmount='" + accountAmount + '\'' +
                ", remainAccountAmount='" + remainAccountAmount + '\'' +
                '}';
    }
}
