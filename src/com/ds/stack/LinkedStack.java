package com.ds.stack;

import com.ds.com.ds.list.SinglyLinkedList;

/**
 * Created by sahuj6 on 6/29/17.
 */
public class LinkedStack<E> {
    private SinglyLinkedList<E> list = new SinglyLinkedList<E>();
    public LinkedStack() {

    }
    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void push(E element) {
        list.addFirst(element);
    }

    public E top() {
        return list.first();
    }

    public E pop() {
        return list.removeFirst();
    }
}
