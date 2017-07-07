package com.ds.list;

/**
 * Created by sahuj6 on 7/6/17.
 * http://www.geeksforgeeks.org/reverse-a-list-in-groups-of-given-size/
 */
public class ReverseInGroupsOfGivenSize<E> extends SinglyLinkedList<E> {
    public SinglyLinkedList reverse1(int size) {
        //create a new sublist first
        //remove the head or first element of existing list and add it tot he first position of the
        //new list. It will reverse till the count. Once the count is over then attach the head
        // of existing list to the last element of the new list. See that we are keeping a track of the last Node
        // of the first list as endOfNewList
        SinglyLinkedList newList = new SinglyLinkedList();
        Node endOfNewList = null;
        for(int i = 0; i < size; i++) {
            Node newNode = null;
            if(newList.size() == 0) {
                newNode = new Node(head.getElement(), null);
                endOfNewList = newNode;
            } else {
                newNode = new Node(head.getElement(), newList.head);
            }
            newList.head = newNode;
            newList.size = newList.size + 1;
            this.removeFirst();
        }

        endOfNewList.setNext(head);
        return newList;
    }

    public void reverse2(Node node, int k) {
        Node prevNode = null;
        Node currNode = node;
        Node nextNode = null;
        int count = 0;
        Node endOfSublist = null;

        while(currNode != null && count < k) {
            nextNode = currNode.getNext();
            currNode.setNext(prevNode);
            if(prevNode == null) {
                endOfSublist = currNode;
            }
            prevNode = currNode;
            currNode = nextNode;
            count++;
        }
        head = prevNode;
        endOfSublist.setNext(currNode);
    }


    public static void main(String[] args) {
        ReverseInGroupsOfGivenSize<Integer> reverseList = new ReverseInGroupsOfGivenSize<Integer>();
        reverseList.addFirst(1);
        reverseList.addLast(2);
        reverseList.addLast(3);
        reverseList.addLast(4);
        reverseList.addLast(5);
        reverseList.addLast(6);
        reverseList.addLast(7);
        reverseList.addLast(8);
        reverseList.addLast(9);
        reverseList.addLast(10);

        //System.out.println("New List is: " + reverseList.reverse1(5));

        reverseList.reverse2(reverseList.head, 5);

        System.out.println("New List is: " + reverseList);
    }
}
