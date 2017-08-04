package com.ctci.arraysandstrings;

/**
 * Created by sahuj6 on 8/2/17.
 */
public class CompressString {
    public static String compress(String origString) {
        char[] origChars = origString.toCharArray();
        int counter = 1;
        char prevChar = origChars[0];
        StringBuffer buffer = new StringBuffer();

        for(int i = 1; i < origChars.length; i++) {
            if(origChars[i] == prevChar) {
                counter++;
            } else {
                buffer.append(prevChar).append(counter);
                counter = 1;
            }
            prevChar = origChars[i];
        }
        buffer.append(prevChar).append(counter);

        return buffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(compress("abbbbbcccddeeef"));
    }
}
