package com.ds.list;

/**
 * Created by sahuj6 on 7/5/17.
 * http://www.geeksforgeeks.org/write-a-function-to-reverse-the-nodes-of-a-linked-list/
 */
public class ReverseLinkedListRecursion<E> extends SinglyLinkedList<E> {
    public void reverse(Node prevNode, Node currNode) {
        if( currNode == null) {
            head = prevNode;
            return;
        } else {
            reverse(currNode, currNode.getNext());
            currNode.setNext(prevNode);
        }
    }

    public static void main(String[] args) {
        ReverseLinkedListIterative<Integer> llist = new ReverseLinkedListIterative<Integer>();

        /* The constructed linked list is:
            1->2->3->4->5->6->7 */
        llist.addFirst(7);
        llist.addLast(6);
        llist.addLast(5);
        llist.addLast(4);
        llist.addLast(3);
        llist.addLast(2);
        llist.addLast(1);

        System.out.println(llist.toString());
        llist.reverse();
        System.out.println(llist.toString());
    }
}
