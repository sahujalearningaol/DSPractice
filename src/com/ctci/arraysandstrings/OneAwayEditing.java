package com.ctci.arraysandstrings;

/**
 * Created by Sourabh on 8/6/2017.
 */
public class OneAwayEditing {
    public static boolean check(String str1, String str2) {
        if(str1.length() == str2.length()) {
            return checkReplacement(str1, str2);
        } else if(str1.length() - 1 == str2.length()) {
            return checkAddition(str1, str2);
        } else if(str1.length() == str2.length() - 1) {
            return checkAddition(str2, str1);
        }

        return false;
    }

    public static boolean checkReplacement(String str1, String str2) {
        char[] str1Chars = str1.toCharArray();
        char[] str2Chars = str2.toCharArray();

        boolean diffFound = false;
        for(int i = 0; i < str1Chars.length; i++) {

            if(str1Chars[i] != str2Chars[i]) {
                if(diffFound) {
                    return false;// There are more than 1 differences.
                }
                diffFound = true;
            }
        }

        return diffFound;
    }

    public static boolean checkAddition(String str1, String str2) {
        int index1 = 0;
        int index2 = 0;
        char[] str1Chars = str1.toCharArray();
        char[] str2Chars = str2.toCharArray();

        boolean replacementFound = false;
        for(int i = 0; i < str1Chars.length; i++) {
            if(str1Chars[index1] != str2Chars[index2]) {
                if(replacementFound) {
                    return false;
                }
                index1++;
                replacementFound = true;
            } else {
                index1++;
                if(index2 < str2Chars.length - 1) {
                    index2++;
                }
            }
        }
        return replacementFound;
    }

    public static void main(String[] args) {
        System.out.println(check("peles","pale"));
    }
}
