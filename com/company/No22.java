package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zouwenzhe on 2016-6-29.
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 For example, given n = 3, a solution set is:

 [
 "((()))",
 "(()())",
 "(())()",
 "()(())",
 "()()()"
 ]

 类似于DFS深度优先算法
 */
public class No22 {
    public static List<String> generateParenthesis(int n) {
        ArrayList<String> res = new ArrayList<String>();
        String item = new String();

        if (n<=0)
            return res;

        dfs(res,item,n,n);
        return res;
    }


    public static void dfs(ArrayList<String> res, String item, int left, int right){
        if(left > right)//deal wiith ")("
            return;

        if (left == 0 && right == 0){
            res.add(new String(item));
            return;
        }

        if (left>0)
            dfs(res,item+'(',left-1,right);
        if (right>0)
            dfs(res,item+')',left,right-1);
    }

    public static void main(String[] args) {
        List<String> s = generateParenthesis(2);
    }
}
