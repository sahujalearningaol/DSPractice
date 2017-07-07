package com.ds.list;

/**
 * Created by sahuj6 on 7/5/17.
 * http://www.geeksforgeeks.org/search-an-element-in-a-linked-list-iterative-and-recursive/
 */
public class SearchElementInListRecursion<E> extends SinglyLinkedList {

    public int position(Node<E> node, int element) {
        if((Integer)node.getElement() == element) {
            return 1;
        } else {
            return 1 + position(node.getNext(), element);
        }
    }

    public boolean search(Node<E> node, int element) {
        if(node == null) {
            return false;
        }

        if((Integer)node.getElement() == element) {
            return true;
        } else {
            return search(node.getNext(), element);
        }

    }

    public static void main(String[] args) {
        SearchElementInListRecursion<Integer> searchElement = new SearchElementInListRecursion<Integer>();
        searchElement.addFirst(1);
        searchElement.addLast(2);
        searchElement.addLast(3);
        searchElement.addLast(4);
        searchElement.addLast(5);
        int position = searchElement.position(searchElement.head, 4);

        System.out.println("Position is: " + position);

        System.out.println("Element is present: " + searchElement.search(searchElement.head, 10));
        System.out.println("Element is present: " + searchElement.search(searchElement.head, 3));
    }
}
