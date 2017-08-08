package com.ctci.arraysandstrings;

/**
 * Created by sahuj6 on 8/2/17.
 */
public class CheckIfStringHasAllUniqueChars {
    public static boolean check(String inputStr) {
        char[] chars = inputStr.toCharArray();
        int[] charFrequency = new int[256];

        for(int i = 0; i < chars.length; i++) {
            if(charFrequency[chars[i]] == 0) {
                charFrequency[chars[i]]++;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(check("abcde"));
        System.out.println(check("abcdeee"));
    }

}
