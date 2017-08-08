package com.ctci.linkedlist;

import com.ds.list.SinglyLinkedList;

/**
 * Created by Sourabh on 8/7/2017.
 */
public class FindKthToLastElement<E> extends SinglyLinkedList<E> {
    static int counter = 0;
    public static void find(Node node, int kthElement) {
        if(node.getNext() == null) {
            counter++;
            return;
        } else {
            find(node.getNext(), kthElement);
            counter++;
            if(counter == kthElement) {
                System.out.println("Node at kth place is: " + node.getElement());
            }
        }
    }

    public static void main(String[] args) {
        FindKthToLastElement<Integer> llist = new FindKthToLastElement<Integer>();

        /* The constructed linked list is:
            1->2->3->4->5->6->7 */
        llist.addFirst(7);
        llist.addLast(6);
        llist.addLast(5);
        llist.addLast(4);
        llist.addLast(3);
        llist.addLast(2);
        llist.addLast(1);

        find(llist.head, 4);

    }
}
