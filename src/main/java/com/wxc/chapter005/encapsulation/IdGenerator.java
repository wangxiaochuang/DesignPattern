package com.wxc.chapter005.encapsulation;

public class IdGenerator {
    private static IdGenerator instance = null;
    public static IdGenerator getInstance() {
        if (instance == null) {
            instance = new IdGenerator();
        }
        return instance;
    }
    public String generate() {
        return "xxxxx";
    }
}
