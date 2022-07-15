package com.pool.model.inheritance.mappedsuperclass;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity(name = "CreditAccountMsc")
public class CreditAccountMsc extends AccountMsc {
    private BigDecimal creditLimit;

    public CreditAccountMsc() {
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

}
