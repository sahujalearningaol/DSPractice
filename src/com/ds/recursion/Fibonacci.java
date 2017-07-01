package com.ds.recursion;

/**
 * Created by sahuj6 on 6/28/17.
 */
public class Fibonacci {
    public static int fibonacci(int num) {
        if(num == 1) {
            return 0;
        } else if(num == 2) {
            return 1;
        } else {
            return fibonacci(num -2) + fibonacci(num - 1);
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.print(" "+fibonacci(i));
        }
    }
}
