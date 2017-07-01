package com.ds.recursion;

/**
 * Created by sahuj6 on 6/28/17.
 */
public class Power {
    public static int power(int num, int power) {
        if(power == 0) {
            return 1;
        } else {
            return num * power(num, power - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(power(2,6));
    }
}
