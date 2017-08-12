package com.ctci.linkedlist;

import com.ds.list.SinglyLinkedList;

/**
 * Created by Sourabh on 8/7/2017.
 */
public class LoopDetection<E> extends SinglyLinkedList<E> {
    public boolean check() {
        Node slow = head;
        Node fast = head.getNext();
        while(fast != null && fast.getNext() != null && slow != null) {
            if(slow == fast) {
                return true;
            } else {
                slow = slow.getNext();
                fast = fast.getNext().getNext();
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LoopDetection<Integer> llist = new LoopDetection<Integer>();

        llist.addFirst(7);
        llist.addLast(6);
        llist.addLast(5);
        llist.addLast(4);
        llist.addLast(3);
        llist.addLast(2);
        llist.addLast(1);

        Node middleNode = llist.head;
        for (int i=0; i < 3; i++) {
            middleNode = middleNode.getNext();
        }

        llist.tail.setNext(middleNode);

        boolean isLoop = llist.check();
        System.out.println(isLoop);

    }
}
