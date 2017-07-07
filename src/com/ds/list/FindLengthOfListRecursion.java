package com.ds.list;


/**
 * Created by sahuj6 on 7/5/17.
 * http://www.geeksforgeeks.org/find-length-of-a-linked-list-iterative-and-recursive/
 */
public class FindLengthOfListRecursion<E> extends SinglyLinkedList {

    public int length(Node<E> node) {
        if(node == null) {
            return 0;
        } else {
            return 1 + length(node.getNext());
        }
    }


    public static void main(String[] args) {
        FindLengthOfListRecursion<Integer> findLength = new FindLengthOfListRecursion<Integer>();
        findLength.addFirst(1);
        findLength.addLast(2);
        findLength.addLast(3);
        findLength.addLast(4);
        findLength.addLast(5);
        int length = findLength.length(findLength.head);

        System.out.println("Length is: " + length);
    }
}
