package com.java.learning.completeJava.problemStatements.general;

import java.util.Scanner;

public class MaxMinCharCount {
    public static void main(String[] args) {
        System.out.println("Enter a String");
        String input = new Scanner(System.in).next();
        int[] count = new int[256];
        for(int i=0; i<input.length(); i++){
            count[input.charAt(i)]++;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        char maxResult = ' ';
        char minResult = ' ';

        for(int i=0; i<input.length(); i++){
            if(max<count[input.charAt(i)]){
                max = count[input.charAt(i)];
                maxResult = input.charAt(i);
            }
            if(min>count[input.charAt(i)]){
                min = count[input.charAt(i)];
                minResult = input.charAt(i);
            }
        }

        System.out.println("Maximum character count is "+max+" for character "+maxResult);
        System.out.println("Maximum character count is "+min+" for character "+minResult);
    }
}
