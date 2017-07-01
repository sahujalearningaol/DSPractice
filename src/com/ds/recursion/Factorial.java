package com.ds.recursion;

/**
 * Created by sahuj6 on 6/28/17.
 */
public class Factorial {
    public int factorial(int num) {
        if(num < 0) {
            throw new IllegalArgumentException();
        }
        if(num == 0) {
            return 1;
        } else {
            return factorial(num - 1) * num;
        }
    }


    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println(f.factorial(5));
    }
}
