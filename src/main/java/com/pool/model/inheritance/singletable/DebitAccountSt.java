package com.pool.model.inheritance.singletable;

import java.math.BigDecimal;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "DebitAccountSt")
@DiscriminatorValue(value = "Debit")
public class DebitAccountSt extends AccountSt {
    private BigDecimal overdraftFee;

    public DebitAccountSt() {
    }

    public BigDecimal getOverdraftFee() {
        return overdraftFee;
    }

    public void setOverdraftFee(BigDecimal overdraftFee) {
        this.overdraftFee = overdraftFee;
    }

}
