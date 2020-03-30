package com.wxc.chapter005.encapsulation.exceptions;

public class InsufficientAmountException extends Exception {

    public InsufficientAmountException(String msg) {
        super(msg);
    }
}
