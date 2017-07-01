package com.ds.stack;

/**
 * Created by sahuj6 on 6/29/17.
 */
public class MatchParentheses {
    private String closingBrackets = ")}]";
    private String openningBrackets = "({[";
    StackArray<Character> stack = new StackArray<Character>();

    public boolean isMatch(String expression) {
        for(char bracket : expression.toCharArray()) {
            if(openningBrackets.indexOf(bracket) != -1) {
                stack.push(bracket);
            } else if(closingBrackets.indexOf(bracket) != -1) {
                if(stack.isEmpty()) {
                    return false;
                }
                if(!stack.pop().equals(bracket)) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        MatchParentheses match = new MatchParentheses();
        System.out.println(match.isMatch("()(()){([()])}"));
    }
}
