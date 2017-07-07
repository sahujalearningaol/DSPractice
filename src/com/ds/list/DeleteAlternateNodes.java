package com.ds.list;

/**
 * Created by sahuj6 on 7/6/17.
 * http://www.geeksforgeeks.org/delete-alternate-nodes-of-a-linked-list/
 */
public class DeleteAlternateNodes<E> extends SinglyLinkedList<E>{
    public void delete() {
        Node startNode = head;
        while(startNode != null) {
            if(startNode.getNext() != null && startNode.getNext().getNext() != null) {
                startNode.setNext(startNode.getNext().getNext());
                startNode = startNode.getNext();
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        DeleteAlternateNodes<Integer> delNodes = new DeleteAlternateNodes<Integer>();
        delNodes.addFirst(1);
        delNodes.addLast(2);
        delNodes.addLast(3);
        delNodes.addLast(4);
        delNodes.addLast(5);
        delNodes.delete();;

        System.out.println("Length is: " + delNodes.toString());
    }
}
