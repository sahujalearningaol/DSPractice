package com.ds.com.ds.list;

/**
 * Created by sahuj6 on 6/29/17.
 */
public class SinglyLinkedList<E> {
    private static class Node<E> {

        private E element;            // reference to the element stored at this node
        private Node<E> next;         // reference to the subsequent node in the list
        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }
        public E getElement() { return element; }
        public Node<E> getNext() { return next; }
        public void setNext(Node<E> n) { next = n; }
    }

    //The first node in the list. It is not a separate pointer node.
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public SinglyLinkedList() {

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public E first() {
        if (isEmpty()) return null; return head.getElement();
    }

    public void addFirst(E e) {
        Node<E> firstElement = new Node<E>(e, head);
        head = firstElement;
        if(size == 0) {
            tail = head;
        }
        size++;
    }

    public void addLast(E e){
        Node<E> lastElement = new Node<E>(e, null);
        tail.setNext(lastElement);
        tail = lastElement;
        size++;
    }

    public E removeFirst() {
        E removedElement = head.getElement();
        head = head.getNext();
        size--;
        if(size == 0){
            tail = null;
        }
        return removedElement;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        Node<E> walk = head;
        while (walk != null) {
            sb.append(walk.getElement());
            if (walk != tail)
                sb.append(", ");
            walk = walk.getNext();
        }
        sb.append(")");
        return sb.toString();
    }
}
