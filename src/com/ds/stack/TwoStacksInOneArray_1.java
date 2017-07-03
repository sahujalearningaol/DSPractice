package com.ds.stack;

/**
 * Created by Sourabh on 6/30/2017. Implement 2 Stack using single Array. Divide the Array into 2 equal parts and assign
 * half array to each Stack. Not an efficient way of managing space.
 */
public class TwoStacksInOneArray_1<E> {
    private int CAPACITY = 100;
    private int index1;
    private int index2;
    private E[] data;

    public TwoStacksInOneArray_1() {
        data = (E[])new Object[CAPACITY];
        index1 = -1;
        index2 = CAPACITY/2;
    }
    public int size1() {
        return index1 + 1;
    }

    public int size2() {
        return index2 - (CAPACITY/2);
    }

    public boolean isEmpty1() {
        return index1 == -1 ? true : false;
    }

    public boolean isEmpty2() {
        return index2 == CAPACITY/2;
    }

    public void push1(E e) {
        if(size1() == CAPACITY/2) {
            throw new IllegalStateException();
        }
        data[++index1] = e;
    }

    public void push2(E e) {
        if(size2() == CAPACITY/2) {
            throw new IllegalStateException();
        }
        data[++index2] = e;
    }

    public E pop1() {
        if(isEmpty1()) {
            return null;
        }
        E retElement = data[index1];
        data[index1] = null;
        index1--;
        return retElement;
    }

    public E pop2() {
        if(isEmpty2()) {
            return null;
        }
        E retElement = data[index2];
        data[index2] = null;
        index2--;
        return retElement;
    }

    public E top1() {
        if(isEmpty1()) {
            return null;
        }
        return data[index1];
    }

    public E top2() {
        if(isEmpty2()) {
            return null;
        }
        return data[index2];
    }

}
