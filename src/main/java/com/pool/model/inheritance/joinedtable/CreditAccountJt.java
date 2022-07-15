package com.pool.model.inheritance.joinedtable;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity(name = "CreditAccountJt")
public class CreditAccountJt extends AccountJt {
    private BigDecimal creditLimit;

    public CreditAccountJt() {
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

}
