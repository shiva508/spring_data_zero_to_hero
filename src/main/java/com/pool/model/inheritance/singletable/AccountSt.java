package com.pool.model.inheritance.singletable;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.hibernate.annotations.DiscriminatorFormula;

@Entity(name = "AccountSt")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorFormula("case when debitKey is not null " +
        "then 'Debit' " +
        "else (" +
        "   case when creditKey is not null " +
        "   then 'Credit' " +
        "   else 'Unknown' " +
        "   end) " +
        "end ")
public class AccountSt {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long accountId;

    private String owner;

    private BigDecimal balance;

    private BigDecimal interestRate;

    public AccountSt() {
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

}
