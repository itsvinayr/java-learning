package com.java.learning.completeJava.problemStatements.general;

import java.util.Scanner;

public class MaxCharCount {
    public static void main(String[] args) {
        System.out.println("Enter a String");
        String input = new Scanner(System.in).next();
        int[] count = new int[256];
        for(int i=0; i<input.length(); i++){
            count[input.charAt(i)]++;
        }

        int max = -1;
        char maxResult = ' ';

        for(int i=0; i<input.length(); i++){
            if(max<count[input.charAt(i)]){
                max = count[input.charAt(i)];
                maxResult = input.charAt(i);
            }
        }

        System.out.println("Maximum character count is "+max+" for character "+maxResult);
    }
}
