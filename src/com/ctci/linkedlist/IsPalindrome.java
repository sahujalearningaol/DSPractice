package com.ctci.linkedlist;

import com.ds.list.SinglyLinkedList;

/**
 * Created by Sourabh on 8/7/2017.
 */
public class IsPalindrome<E> extends SinglyLinkedList<E>{
    boolean isPalindrome = true;

    //My Way
    public Node check(Node recNode) {
        if(recNode == null) {
            return head;
        } else {
            Node node = check(recNode.getNext());
            if(node.getElement() != recNode.getElement()) {
                isPalindrome = false;
            }
            return node.getNext();
        }
    }

    public static void main(String[] args) {
        IsPalindrome<String> llist = new IsPalindrome<String>();

        /* The constructed linked list is:
            1->2->3->4->5->6->7 */
        llist.addFirst("A");
        llist.addLast("B");
        llist.addLast("C");
        llist.addLast("D");
        llist.addLast("C");
        llist.addLast("B");
        llist.addLast("A");

        llist.check(llist.head);
        System.out.println(llist.isPalindrome);

    }
}
