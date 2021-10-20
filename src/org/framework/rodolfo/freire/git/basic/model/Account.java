package org.framework.rodolfo.freire.git.basic.model;

import java.math.BigDecimal;
import java.util.List;

public class Account {

    private Long id;
    private String accountBankNumber;
    private String accountNumber;
    private String accountType;
    private String accountCreate;
    private String accountStatus;
    private BigDecimal accountCreditLimit;
    private BigDecimal accountOverdraftLimit;
    private boolean accountOnlinePay;
    private boolean accountMobilePay;
    private boolean accountCashBackPay;
    private boolean accountOverdraft;
    private AbstractModel accountUser;
    private List<Address> accountBankAddress;
    private List<Phone> accountBankPhones;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountBankNumber() {
        return accountBankNumber;
    }

    public void setAccountBankNumber(String accountBankNumber) {
        this.accountBankNumber = accountBankNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountCreate() {
        return accountCreate;
    }

    public void setAccountCreate(String accountCreate) {
        this.accountCreate = accountCreate;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public BigDecimal getAccountCreditLimit() {
        return accountCreditLimit;
    }

    public void setAccountCreditLimit(BigDecimal accountCreditLimit) {
        this.accountCreditLimit = accountCreditLimit;
    }

    public BigDecimal getAccountOverdraftLimit() {
        return accountOverdraftLimit;
    }

    public void setAccountOverdraftLimit(BigDecimal accountOverdraftLimit) {
        this.accountOverdraftLimit = accountOverdraftLimit;
    }

    public boolean isAccountOnlinePay() {
        return accountOnlinePay;
    }

    public void setAccountOnlinePay(boolean accountOnlinePay) {
        this.accountOnlinePay = accountOnlinePay;
    }

    public boolean isAccountMobilePay() {
        return accountMobilePay;
    }

    public void setAccountMobilePay(boolean accountMobilePay) {
        this.accountMobilePay = accountMobilePay;
    }

    public boolean isAccountCashBackPay() {
        return accountCashBackPay;
    }

    public void setAccountCashBackPay(boolean accountCashBackPay) {
        this.accountCashBackPay = accountCashBackPay;
    }

    public boolean isAccountOverdraft() {
        return accountOverdraft;
    }

    public void setAccountOverdraft(boolean accountOverdraft) {
        this.accountOverdraft = accountOverdraft;
    }

    public AbstractModel getAccountUser() {
        return accountUser;
    }

    public void setAccountUser(AbstractModel accountUser) {
        this.accountUser = accountUser;
    }

    public List<Address> getAccountBankAddress() {
        return accountBankAddress;
    }

    public void setAccountBankAddress(List<Address> accountBankAddress) {
        this.accountBankAddress = accountBankAddress;
    }

    public List<Phone> getAccountBankPhones() {
        return accountBankPhones;
    }

    public void setAccountBankPhones(List<Phone> accountBankPhones) {
        this.accountBankPhones = accountBankPhones;
    }
}
