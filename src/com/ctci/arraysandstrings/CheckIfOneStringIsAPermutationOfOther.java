package com.ctci.arraysandstrings;

/**
 * Created by sahuj6 on 8/2/17.
 */
public class CheckIfOneStringIsAPermutationOfOther {
    public static boolean check(String inputStr1, String inputStr2) {
        boolean isPermutation = false;

        char[] chars1 = inputStr1.toCharArray();
        char[] chars2 = inputStr2.toCharArray();
        int[] charFrequency = new int[256];

        for(int i = 0; i < chars1.length; i++) {
            charFrequency[chars1[i]]++;
        }

        for(int i = 0; i < chars2.length; i++) {
            if(charFrequency[chars2[i]] > 0)
                charFrequency[chars2[i]]--;
        }

        int sum = 0;

        for(int i = 0; i < charFrequency.length; i++) {
            sum = sum + charFrequency[i];
        }
        return sum == 0;
    }

    public static void main(String[] args) {
        System.out.println(check("abcde","abced"));
    }
}
