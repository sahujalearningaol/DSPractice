package com.ctci.arraysandstrings;

/**
 * Created by sahuj6 on 8/2/17.
 */
public class URLIfyString {
    public static char[] urilify(char[] inputChars, int trueLength) {
        int numOfSpaces = 0;
        for(int i=0; i < trueLength; i++) {
            if(inputChars[i] == ' '){
                numOfSpaces++;
            }
        }

        int index = trueLength + 2*numOfSpaces;

        for(int i = trueLength - 1; i >= 0; i--) {
            if(inputChars[i] == ' ') {
                inputChars[index - 1] = '0';
                inputChars[index - 2] = '2';
                inputChars[index - 3] = '%';
                index = index - 3;
            } else {
                inputChars[index-1] = inputChars[i];
                index--;
            }
        }

        return inputChars;
    }

    public static void main(String[] args) {
        String inputStr = "Mr John Smith                         ";
        System.out.println(new String(urilify(inputStr.toCharArray(), 13)));
    }
}
