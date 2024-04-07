package com.leetcode.stackprg;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackSolution {

    public boolean checkValidString(String s){

        char[] charArr = s.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();

        if(s.length()%2 != 0){
            return false;
        }
        else{

            for(char c : charArr){
                stack.push(c);
            }
            System.out.println(stack.getFirst());
            System.out.println(stack.getLast());

            if(stack.getFirst() == '(' && stack.getLast() == ')'){

                stack.pollFirst();
                stack.pollLast() ;
            }

            System.out.println(stack);

        }

        return false;
    }
}
