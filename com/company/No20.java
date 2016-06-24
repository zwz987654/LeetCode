package com.company;

import java.util.Stack;

/**
 * Created by zouwenzhe on 2016-6-23.
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

 The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class No20 {

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(stack.empty()) stack.push(c);
            else{
                if (c==')' || c==']' || c=='}'){
                    Character pop = stack.pop();
                    if (c==')'&&pop=='(' || c==']'&&pop=='[' || c=='}'&&pop=='{'){
                    }else return false;
                }else stack.push(c);
            }
        }
        if (!stack.empty()) return false;
        return true;
    }

    public static void main(String[] args) {
        String s1 = "()[]{}";
        String s2 = "(]";
        String s3 = "([])";
        boolean valid = isValid(s2);
        System.out.println(valid);
    }
}
