package com.ctci.linkedlist;

import com.ds.list.SinglyLinkedList;

/**
 * Created by Sourabh on 8/7/2017.
 */
public class SumList<E> extends SinglyLinkedList<E> {

    public static void add(SumList<Integer> num1List, SumList<Integer> num2List) {
        SumList<Integer> resultsList = new SumList<Integer>();
        resultsList.addFirst(0);

        if(num1List.size() == num2List.size()) {
            int carryOverNum = 0;
            while(!num1List.isEmpty()) {
                int num1 = num1List.removeFirst();
                int num2 = num2List.removeFirst();
                int resultNum = num1 + num2 + carryOverNum;
                carryOverNum = 0;// Number has been used so re-init now.
                if(resultNum > 10) {
                    resultsList.addFirst(resultNum % 10);
                    while(resultNum / 10 > 0) {
                        resultNum = resultNum / 10;
                        carryOverNum++;
                    }
                } else {
                    resultsList.addFirst(resultNum%10);
                }
            }

            if(carryOverNum > 0) {
                resultsList.addFirst(carryOverNum);
            }
        }
        System.out.println(resultsList.toString());
    }

    public static void main(String[] args) {
        SumList<Integer> num1List = new SumList<Integer>();
        SumList<Integer> num2List = new SumList<Integer>();


        num1List.addFirst(7);
        num1List.addLast(1);
        num1List.addLast(9);


        num2List.addFirst(5);
        num2List.addLast(9);
        num2List.addLast(2);

        add(num1List, num2List);
    }

}
