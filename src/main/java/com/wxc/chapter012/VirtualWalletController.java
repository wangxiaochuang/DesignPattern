package com.wxc.chapter012;

import java.math.BigDecimal;

public class VirtualWalletController {
    private VirtualWalletService VirtualWalletService = new VirtualWalletService();

    public BigDecimal getBalance(Long walletId) {
        return BigDecimal.valueOf(0);
    }
    public void debit(Long walletId, BigDecimal amount) {

    }
    public void credit(Long walletId, BigDecimal amount) {

    }
    public void transfer(Long fromWalletId, Long toWalletId, BigDecimal amount) {
        
    }
}