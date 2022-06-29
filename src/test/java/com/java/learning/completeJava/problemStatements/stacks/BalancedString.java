package com.java.learning.completeJava.problemStatements.stacks;

import org.testng.annotations.Test;

import java.util.Stack;

public class BalancedString {
    @Test
    public void test(){
        String input = "({[]})";
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i)=='(' || input.charAt(i) == '{' || input.charAt(i) == '['){
                stack.push(input.charAt(i));
            }else{
                if(stack.empty()) {
                    System.out.println("Not balanced");
                } else if (input.charAt(i) == ')' && stack.pop()!='(') {
                    System.out.println("Not balanced");
                } else if (input.charAt(i) == '}' && stack.pop()!='{') {
                    System.out.println("Not balanced");
                } else if (input.charAt(i) == ']' && stack.pop()!='[') {
                    System.out.println("Not balanced");
                }
            }
        }
    }
}
