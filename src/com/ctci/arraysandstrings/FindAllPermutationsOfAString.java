package com.ctci.arraysandstrings;

/**
 * Created by Sourabh on 8/6/2017.
 */
public class FindAllPermutationsOfAString {
    public static void permutate(String permutation, String inputStr) {
        if(inputStr.length() == 0) {
            System.out.println(permutation + inputStr);
        } else {
            for (int i = 0; i < inputStr.length(); i++) {
                permutate(permutation + inputStr.charAt(i), inputStr.substring(0, i) +
                                                                inputStr.substring(i + 1, inputStr.length()));
            }
        }
    }

    public static void main(String[] args) {
        permutate("", "ABCD");
    }
}
