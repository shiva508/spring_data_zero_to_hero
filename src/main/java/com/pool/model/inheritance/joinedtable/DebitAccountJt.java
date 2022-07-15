package com.pool.model.inheritance.joinedtable;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity(name = "DebitAccountJt")
public class DebitAccountJt extends AccountJt {
    private BigDecimal overdraftFee;

    public DebitAccountJt() {
    }

    public BigDecimal getOverdraftFee() {
        return overdraftFee;
    }

    public void setOverdraftFee(BigDecimal overdraftFee) {
        this.overdraftFee = overdraftFee;
    }

}
