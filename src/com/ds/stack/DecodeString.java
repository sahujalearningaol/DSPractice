package com.ds.stack;

import java.util.Stack;

/**
 * Created by Sourabh on 7/3/2017.
 * http://www.geeksforgeeks.org/decode-string-recursively-encoded-count-followed-substring/
 */
public class DecodeString {
    private static Stack<Character> strStack = new Stack<Character>();
    private static char OPENNING_BRACKET = '[';
    private static char CLOSING_BRACKET = ']';

    public static void decode(String encodedStr) {
        char[] chars = encodedStr.toCharArray();
        for(char c : chars) {
            if(c == CLOSING_BRACKET) {
                if(!strStack.isEmpty()) {
                    String decodedString = "";
                    char poppedChar = strStack.pop();
                    while(poppedChar != OPENNING_BRACKET) {
                        decodedString = poppedChar + decodedString;
                        poppedChar = strStack.pop();
                    }
                    int number = Integer.parseInt(""+strStack.pop());
                    String initDecodedStr = decodedString; // Store teh value in temp var otherwise decodedString will double everytime.
                    decodedString = ""; //reset the old value as we have stored that value in initDecodedStr
                    for(int i = 0; i < number; i++) {
                        decodedString = decodedString + initDecodedStr;
                    }

                    char[] subDecodedArray = decodedString.toCharArray();
                    for(char dc : subDecodedArray) {
                        strStack.push(dc);
                    }
                }
            } else {
                strStack.push(c);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Running...");
        decode("3[b2[ca]]");
        System.out.println(strStack.toString());
    }
}
