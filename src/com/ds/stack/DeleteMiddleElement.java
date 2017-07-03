package com.ds.stack;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created by Sourabh on 7/1/2017.
 */
public class DeleteMiddleElement {
    private static Stack<Integer> data = new Stack<Integer>();
    private static int count = 0;
    private static int midPoint = 0;

    public static void deleteMiddle() {
        if(count == midPoint) {
            return;
        } else {
            int i = data.pop();
            count++;
            deleteMiddle();
            if(count != midPoint) {
                data.push(i);
            }
            count--;
        }
    }

    public static void main(String[] args) {
        data.push(1);
        data.push(2);
        data.push(3);
        data.push(4);
        data.push(5);
        midPoint = (data.size()/2 + 1);
        System.out.println((data.size()/2 + 1));
        System.out.println(Arrays.toString(data.toArray()));
        deleteMiddle();
        System.out.println(Arrays.toString(data.toArray()));
    }

}
