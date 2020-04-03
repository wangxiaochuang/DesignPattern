package com.wxc.chapter012;

import java.math.BigDecimal;

public class VirtualWallet {
    private Long id;
    private Long createTime = System.currentTimeMillis();
    private BigDecimal balance = BigDecimal.ZERO;

    public VirtualWallet(Long preAllocatedId) {
        this.id = preAllocatedId;
    }
    public BigDecimal balance() {
        return this.balance;
    }
    public void debit(BigDecimal amount) throws Exception {
        if (this.balance.compareTo(amount) < 0) {
            throw new Exception("insufficient balance");
        }
        this.balance = this.balance.subtract(amount);
    }
    public void credit(BigDecimal amount) throws Exception {
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new Exception("invalid amount");
        }
        this.balance = this.balance.add(amount);
    }
}