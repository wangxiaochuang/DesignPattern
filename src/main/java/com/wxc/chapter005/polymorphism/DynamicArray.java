package com.wxc.chapter005.polymorphism;

public class DynamicArray {
    private static final int DEFAULT_CAPACITY = 10;
    protected int size = 0;
    protected int capacity = DEFAULT_CAPACITY;
    protected Integer[] elements = new Integer[DEFAULT_CAPACITY];

    public int size() { return this.size; }
    public Integer get(int index) { return elements[index]; }
    public void add(Integer e) {
        ensureCapacity();
        elements[size++] = e;
    }

    protected void ensureCapacity() { }
}

class SortedDynamicArray extends DynamicArray {
    @Override
    public void add(Integer e) {
        ensureCapacity();
        int i;
        for (i = size - 1; i >= 0; --i) {
            if (elements[i] > e) {
                elements[i + 1] = elements[i];
            } else {
                break;
            }
        }
        elements[i + 1] = e;
        ++size;
    }
}

class Example {
    public static void test(DynamicArray arr) {
        arr.add(5);
        arr.add(1);
        arr.add(3);
        for (int i = 0; i < arr.size(); ++i) {
            System.out.println(arr.get(i));
        }
    }
    public static void main(String[] args) {
        DynamicArray arr = new SortedDynamicArray();
        test(arr);
    }
}