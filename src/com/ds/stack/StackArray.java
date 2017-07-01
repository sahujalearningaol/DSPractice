package com.ds.stack;

/**
 * Created by sahuj6 on 6/29/17. Implement Stack using an ArrayList
 */
public class StackArray<E> {
    private int CAPACITY = 100;
    private int index = -1;
    private E[] data;

    public StackArray() {
        data = (E[])new Object[CAPACITY];
    }

    public int size() {
        return index + 1;
    }

    public boolean isEmpty() {
        return index == -1 ? true : false;
    }

    public void push(E e) {
        if(size() == CAPACITY) {
            throw new IllegalStateException();
        }
        data[++index] = e;
    }

    public E pop() {
        if(isEmpty()) {
            return null;
        }
        E retElement = data[index];
        data[index] = null;
        index--;
        return retElement;
    }

    public E top() {
        if(isEmpty()) {
            return null;
        }
        return data[index];
    }
}
