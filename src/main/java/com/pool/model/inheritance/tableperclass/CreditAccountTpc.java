package com.pool.model.inheritance.tableperclass;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity(name = "CreditAccountTpc")
public class CreditAccountTpc extends AccountTpc {
    private BigDecimal creditLimit;

    public CreditAccountTpc() {
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

}
