package com.wxc.chapter005;

import java.math.BigDecimal;

import com.wxc.chapter005.encapsulation.Wallet;

public class App {
    public static void main(String[] args) throws Exception {
        Wallet wallet = new Wallet();
        wallet.increaseBalance(BigDecimal.valueOf(333333));
        System.out.println(wallet.getBalance());
    }
}