package com.pool.model.inheritance.mappedsuperclass;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity(name = "DebitAccountMsc")
public class DebitAccountMsc extends AccountMsc {
    private BigDecimal overdraftFee;

    public DebitAccountMsc() {
    }

    public BigDecimal getOverdraftFee() {
        return overdraftFee;
    }

    public void setOverdraftFee(BigDecimal overdraftFee) {
        this.overdraftFee = overdraftFee;
    }

}
