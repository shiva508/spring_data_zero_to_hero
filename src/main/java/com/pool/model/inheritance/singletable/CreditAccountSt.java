package com.pool.model.inheritance.singletable;

import java.math.BigDecimal;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "CreditAccountSt")
@DiscriminatorValue(value = "Credit")
public class CreditAccountSt extends AccountSt {
    private BigDecimal creditLimit;

    public CreditAccountSt() {
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

}
