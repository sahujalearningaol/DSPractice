package com.ctci.stacksandqueues;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Sourabh on 8/15/2017.
 */
public class StackOfPlates {
    int sizeOfStack = 0;
    private ArrayList<Stack<Integer>> stackOfPlates = new ArrayList<Stack<Integer>>();
    int size = 0;

    public StackOfPlates(int sizeOfStack) {
        this.sizeOfStack = sizeOfStack;
    }

    public void push(int data) {
        int stackIndex = size / sizeOfStack;
        int dataIndex = size % sizeOfStack;
        if(dataIndex == 0) {
            Stack dataStack = new Stack();
            dataStack.push(data);
            stackOfPlates.add(dataStack);
        } else {
            Stack dataStack = (Stack)stackOfPlates.get(stackIndex);
            dataStack.push(data);
        }
        size++;
    }

    public void pop() {
        int retValue = 0;
        int stackIndex = (size % sizeOfStack) == 0 ? (size / sizeOfStack) - 1 : (size / sizeOfStack);

        Stack<Integer> dataStack = (Stack)stackOfPlates.get(stackIndex);
        retValue = dataStack.pop();
        size--;
        int dataIndex = size % sizeOfStack;
        if(dataIndex == 0) {
            stackOfPlates.remove(stackIndex);
        }
    }

    public static void main(String[] args) {
        StackOfPlates stackOfPlates = new StackOfPlates(5);
        stackOfPlates.push(1);
        stackOfPlates.push(2);
        stackOfPlates.push(3);
        stackOfPlates.push(4);
        stackOfPlates.push(5);
        stackOfPlates.push(6);
        stackOfPlates.push(7);

        stackOfPlates.pop();
        stackOfPlates.pop();
        stackOfPlates.pop();

        System.out.println(stackOfPlates.toString());
    }
}
