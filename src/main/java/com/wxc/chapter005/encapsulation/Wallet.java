package com.wxc.chapter005.encapsulation;

import java.math.BigDecimal;

import com.wxc.chapter005.encapsulation.exceptions.InsufficientAmountException;
import com.wxc.chapter005.encapsulation.exceptions.InvalidAmountException;

public class Wallet {
    private String id;
    private long createTime;
    private BigDecimal balance;
    private long balanceLastModifiedTime;

    public Wallet() {
        this.id = IdGenerator.getInstance().generate();
        this.createTime = System.currentTimeMillis();
        this.balance = BigDecimal.ZERO;
        this.balanceLastModifiedTime = System.currentTimeMillis();
    }

    public String getId() { return this.id; }
    public long getCreateTime() { return this.createTime; }
    public BigDecimal getBalance() { return this.balance; }
    public long getBalanceLastModifiedTime() { return this.balanceLastModifiedTime; }

    public void increaseBalance(BigDecimal increasedAmount) throws Exception {
        if (increasedAmount.compareTo(BigDecimal.ZERO) < 0) {
            throw new InvalidAmountException("...");
        }
        this.balance = this.balance.add(increasedAmount);
        this.balanceLastModifiedTime = System.currentTimeMillis();
    }

    public void decreasedBalance(BigDecimal decreasedAmount) throws Exception {
        if (decreasedAmount.compareTo(BigDecimal.ZERO) < 0) {
            throw new InvalidAmountException("...");
        }
        if (this.balance.compareTo(decreasedAmount) < 0) {
            throw new InsufficientAmountException("...");
        }
        this.balance = this.balance.subtract(decreasedAmount);
        this.balanceLastModifiedTime = System.currentTimeMillis();
    }
}