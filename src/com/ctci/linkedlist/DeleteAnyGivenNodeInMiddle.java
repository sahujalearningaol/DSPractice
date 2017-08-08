package com.ctci.linkedlist;

import com.ds.list.SinglyLinkedList;

/**
 * Created by Sourabh on 8/7/2017.
 */
public class DeleteAnyGivenNodeInMiddle<E> extends SinglyLinkedList<E>{
    public void delete(SinglyLinkedList<Integer> list, int valueToDelete) {
        Node node = head;
        while(node.getNext() != null) {
            if(((Integer)node.getElement()).intValue() == valueToDelete) {
                node.setElement(node.getNext().getElement());
                node.setNext(node.getNext().getNext());
                break;
            } else {
                node = node.getNext();
            }
        }
    }

    public static void main(String[] args) {
        DeleteAnyGivenNodeInMiddle<Integer> llist = new DeleteAnyGivenNodeInMiddle<Integer>();

        /* The constructed linked list is:
            1->2->3->4->5->6->7 */
        llist.addFirst(7);
        llist.addLast(6);
        llist.addLast(5);
        llist.addLast(4);
        llist.addLast(3);
        llist.addLast(2);
        llist.addLast(1);

        llist.delete(llist, 4);
        System.out.println(llist.toString());
    }

}
