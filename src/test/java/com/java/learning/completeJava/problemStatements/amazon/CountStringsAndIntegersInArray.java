package com.java.learning.completeJava.problemStatements.amazon;

import java.util.Arrays;

public class CountStringsAndIntegersInArray {
    public static void main(String[] args){
        String[] inputArray = {"Raj", "77", "101", "99", "Jio"};
        int ic=0, sc=0;
        System.out.print(Arrays.toString(inputArray));
        for(int i=0; i<inputArray.length; i++){
            try {
                Integer.parseInt(inputArray[i]);
                ic++;
            }catch(NumberFormatException e){
                sc++;
            }
        }

        System.out.println("\nNumber of String count : "+sc
        +"\nNumber of Integer count : "+ic);
    }
}
