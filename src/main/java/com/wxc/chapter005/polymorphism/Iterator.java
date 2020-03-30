package com.wxc.chapter005.polymorphism;

public interface Iterator {
    boolean hasNext();
    String next();
    String remove();
}

class Array implements Iterator {
    private String[] data;

    @Override
    public boolean hasNext() { return false; }

    @Override
    public String next() { return null; }

    @Override
    public String remove() { return null; }
}

class LinkedList implements Iterator {
    public class LinkedListNode { }
    private LinkedListNode head;

    @Override
    public boolean hasNext() { return false; }

    @Override
    public String next() { return null; }

    @Override
    public String remove() { return null; }
}

class MyExample {
    private static void print(Iterator iter) {
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
    public static void main(String[] args) {
        Iterator iter = new Array();
        print(iter);

        iter = new LinkedList();
        print(iter);
    }
}