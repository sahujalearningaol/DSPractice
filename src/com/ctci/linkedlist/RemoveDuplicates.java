package com.ctci.linkedlist;

import com.ds.list.SinglyLinkedList;

import java.util.HashMap;

/**
 * Created by Sourabh on 8/7/2017.
 */
public class RemoveDuplicates<E> extends SinglyLinkedList<E>{
    public void remove1() {
        HashMap<Object, Boolean> map = new HashMap<Object, Boolean>();
        Node node = head;
        Node nextNode = node.getNext();
        while(nextNode != null) {
            if(map.get(nextNode.getElement()) != null) {
                node.setNext(nextNode.getNext());
                nextNode = nextNode.getNext();
            } else {
                map.put(nextNode.getElement(), true);
            }

            if(nextNode != null)
                nextNode = nextNode.getNext();
            node = node.getNext();
        }
    }

    public void remove2() {
        Node node = head;
        while(node != null) {
            Node nextRunner = node.getNext();
            Node prevRunnerNode = node;
            while(nextRunner != null) {
                if(nextRunner.getElement() == node.getElement()) {
                    prevRunnerNode.setNext(nextRunner.getNext());
                    nextRunner = nextRunner.getNext();
                } else {
                    prevRunnerNode = nextRunner;
                    nextRunner = nextRunner.getNext();
                }
            }
            node = node.getNext();
        }
    }

    public static void main(String[] args) {
        RemoveDuplicates<Integer> llist = new RemoveDuplicates<Integer>();

        /* The constructed linked list is:
            1->2->3->4->5->6->7 */
        llist.addFirst(7);
        llist.addLast(6);
        llist.addLast(6);
        llist.addLast(5);
        llist.addLast(4);
        llist.addLast(3);
        llist.addLast(2);
        llist.addLast(1);
        llist.addLast(1);

        llist.remove2();
        System.out.println(llist.toString());

    }
}
