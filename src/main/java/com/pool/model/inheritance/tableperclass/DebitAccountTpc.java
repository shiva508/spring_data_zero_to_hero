package com.pool.model.inheritance.tableperclass;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity(name = "DebitAccountTpc")
public class DebitAccountTpc extends AccountTpc {
    private BigDecimal overdraftFee;

    public DebitAccountTpc() {
    }

    public BigDecimal getOverdraftFee() {
        return overdraftFee;
    }

    public void setOverdraftFee(BigDecimal overdraftFee) {
        this.overdraftFee = overdraftFee;
    }

}
