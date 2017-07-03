package com.ds.stack;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created by Sourabh on 7/1/2017. http://www.geeksforgeeks.org/?p=6921
 */
public class ReverseAStackUsingRecursion {
    private static Stack<Integer> data = new Stack<Integer>();

    public static void reverse() {
        if(data.isEmpty()) {
            return ;
        } else {
            int i = data.pop();
            reverse();
            pushAtBottom(i);
        }
    }

    private static void pushAtBottom(int item) {
        if(data.isEmpty()) {
            data.push(item);
        } else {
            int i = data.pop();
            pushAtBottom(item);
            data.push(i);
        }
    }

    public static void main(String[] args) {
        data.push(1);
        data.push(2);
        data.push(3);
        data.push(4);
        data.push(5);
        System.out.println(Arrays.toString(data.toArray()));
        reverse();
        System.out.println(Arrays.toString(data.toArray()));
    }
}
