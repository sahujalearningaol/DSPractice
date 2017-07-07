package com.ds.list;

/**
 * Created by sahuj6 on 7/5/17.
 * http://www.geeksforgeeks.org/swap-nodes-in-a-linked-list-without-swapping-data/
 */
public class SwapNodesInLinkedList<E> extends SinglyLinkedList<E>{
    public void swap(E element1, E element2) {
        Node linkToE1 = null;
        Node linkToE2 = null;
        Node e1Node = null;
        Node e2Node = null;


        if(this.size() < 2) {
            return;
        }
        Node node = head;
        while(node != null) {
            if(node.getNext().getElement() == element1) {
                linkToE1 = node;
                e1Node = node.getNext();
            }
            if(node.getNext().getElement() == element2) {
                linkToE2 = node;
                e2Node = node.getNext();
                break;
            }
            node = node.getNext();
        }
        linkToE1.setNext(e2Node);
        Node tempNode = e2Node.getNext();
        e2Node.setNext(e1Node.getNext());
        linkToE2.setNext(e1Node);
        e1Node.setNext(tempNode);

    }

    public static void main(String[] args) {
        SwapNodesInLinkedList<Integer> llist = new SwapNodesInLinkedList<Integer>();

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
        llist.swap(5,1);
        System.out.println(llist.toString());
    }
}
