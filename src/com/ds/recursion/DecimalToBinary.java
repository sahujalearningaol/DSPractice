package com.ds.recursion;

/**
 * Created by sahuj6 on 6/28/17.
 */
public class DecimalToBinary {
    public static void decToBin(int num, StringBuffer buffer) {
        if(num > 0) {
            buffer.append(num%2);
            decToBin(num/2, buffer);
        }
    }

    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        decToBin(156, buffer);
        System.out.println(buffer.reverse().toString());
    }
}
