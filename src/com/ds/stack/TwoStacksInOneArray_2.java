package com.ds.stack;

/**
 * Created by Sourabh on 7/1/2017.
 */
public class TwoStacksInOneArray_2<E> {
    private int CAPACITY = 100;
    private int index1;
    private int index2;
    private E[] data;

    public TwoStacksInOneArray_2() {
        data = (E[])new Object[CAPACITY];
        index1 = -1;
        index2 = CAPACITY;
    }

    public boolean isFull() {
        return index2 - index1 == 1;
    }
    public int size1() {
        return index1 + 1;
    }

    public int size2() {
        return CAPACITY - index2;
    }

    public boolean isEmpty1() {
        return index1 == -1;
    }

    public boolean isEmpty2() {
        return index2 == CAPACITY;
    }

    public void push1(E e) {
        if(isFull()) {
            throw new IllegalStateException();
        }
        data[++index1] = e;
    }

    public void push2(E e) {
        if(isFull()) {
            throw new IllegalStateException();
        }
        data[--index2] = e;
    }

    public E pop1() {
        if(isEmpty1()) {
            throw new IllegalStateException();
        }
        E retElement = data[index1];
        data[index1] = null;
        index1--;
        return retElement;
    }

    public E pop2() {
        if(isEmpty2()) {
            throw new IllegalStateException();
        }
        E retElement = data[index2];
        data[index2] = null;
        index1++;
        return retElement;

    }

    public E top1() {
        if(isEmpty1()) {
            throw null;
        }
        return data[index1];
    }

    public E top2() {
        if(isEmpty2()) {
            throw null;
        }
        return data[index2];
    }

    public static void main(String args[])
    {
        TwoStacksInOneArray_2<Integer> ts = new TwoStacksInOneArray_2<Integer>();
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("Popped element from" +
                " stack1 is " + ts.pop1());
        ts.push2(40);
        System.out.println("Popped element from" +
                " stack2 is " + ts.pop2());
    }
}
