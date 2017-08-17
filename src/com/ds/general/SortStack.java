package com.ds.general;

import java.util.Stack;

/**
 * Created by sahuj6 on 8/16/17.
 */
public class SortStack {
    public void sort(Stack<Integer> inStack) {
        Stack<Integer> tempStack = new Stack<Integer>();
        while(!inStack.isEmpty()) {
            int data = inStack.pop();
            while(!tempStack.isEmpty() && tempStack.peek() > data) {
                inStack.push(tempStack.pop());
            }
            tempStack.push(data);
        }

        while(!tempStack.isEmpty()) {
            inStack.push(tempStack.pop());
        }
    }

    public static void main(String[] args) {
        SortStack sortStack = new SortStack();
        Stack<Integer> inStack = new Stack<Integer>();
        inStack.push(7);
        inStack.push(3);
        inStack.push(4);
        inStack.push(1);
        inStack.push(9);
        inStack.push(2);
        inStack.push(10);
        inStack.push(5);
        inStack.push(11);
        sortStack.sort(inStack);
        System.out.println(inStack);


    }
}
