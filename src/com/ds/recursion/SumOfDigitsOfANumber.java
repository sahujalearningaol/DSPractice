package com.ds.recursion;

/**
 * Created by sahuj6 on 6/28/17.
 */
public class SumOfDigitsOfANumber {
    public static int findSum(int num) {
        if(num == 0) {
            return 0;
        } else {
            return (num % 10) + findSum(num/10);
        }
    }

    public static void main(String[] args) {
        System.out.println(findSum(1234567));
    }
}
