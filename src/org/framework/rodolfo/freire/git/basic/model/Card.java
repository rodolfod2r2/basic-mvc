package org.framework.rodolfo.freire.git.basic.model;

import java.math.BigDecimal;

public class Card {

    private Long id;
    private AbstractModel user;
    private Account account;
    private String cardNumber;
    private String cardPassword;
    private String cardType;
    private String cardCreate;
    private String cardStatus;
    private BigDecimal cardCreditLimit;
    private BigDecimal cardOverdraftLimit;
    private boolean cardOnlinePay;
    private boolean cardMobilePay;
    private boolean cardCashBackPay;
    private boolean cardOverdraft;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AbstractModel getUser() {
        return user;
    }

    public void setUser(AbstractModel user) {
        this.user = user;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardPassword() {
        return cardPassword;
    }

    public void setCardPassword(String cardPassword) {
        this.cardPassword = cardPassword;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardCreate() {
        return cardCreate;
    }

    public void setCardCreate(String cardCreate) {
        this.cardCreate = cardCreate;
    }

    public String getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(String cardStatus) {
        this.cardStatus = cardStatus;
    }

    public BigDecimal getCardCreditLimit() {
        return cardCreditLimit;
    }

    public void setCardCreditLimit(BigDecimal cardCreditLimit) {
        this.cardCreditLimit = cardCreditLimit;
    }

    public BigDecimal getCardOverdraftLimit() {
        return cardOverdraftLimit;
    }

    public void setCardOverdraftLimit(BigDecimal cardOverdraftLimit) {
        this.cardOverdraftLimit = cardOverdraftLimit;
    }

    public boolean isCardOnlinePay() {
        return cardOnlinePay;
    }

    public void setCardOnlinePay(boolean cardOnlinePay) {
        this.cardOnlinePay = cardOnlinePay;
    }

    public boolean isCardMobilePay() {
        return cardMobilePay;
    }

    public void setCardMobilePay(boolean cardMobilePay) {
        this.cardMobilePay = cardMobilePay;
    }

    public boolean isCardCashBackPay() {
        return cardCashBackPay;
    }

    public void setCardCashBackPay(boolean cardCashBackPay) {
        this.cardCashBackPay = cardCashBackPay;
    }

    public boolean isCardOverdraft() {
        return cardOverdraft;
    }

    public void setCardOverdraft(boolean cardOverdraft) {
        this.cardOverdraft = cardOverdraft;
    }
}
