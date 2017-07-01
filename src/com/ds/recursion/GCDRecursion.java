package com.ds.recursion;

/**
 * Created by sahuj6 on 6/28/17.
 * http://www.math-only-math.com/to-find-highest-common-factor-by-using-division-method.html
 */
public class GCDRecursion {
    public static int gcd(int num1, int num2) {
        if(num2 == 0) {
            return num1;
        } else {
            return gcd(num2, num1%num2);
        }

    }

    public static void main(String[] args) {
        System.out.println(gcd(30,18));
    }
}
