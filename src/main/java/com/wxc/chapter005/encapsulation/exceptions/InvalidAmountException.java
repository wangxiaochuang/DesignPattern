package com.wxc.chapter005.encapsulation.exceptions;

public class InvalidAmountException extends Exception {
    public InvalidAmountException(String msg) {
        super(msg);
    }
}
