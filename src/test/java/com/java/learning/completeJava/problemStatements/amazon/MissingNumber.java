package com.java.learning.completeJava.problemStatements.amazon;

import org.testng.annotations.Test;

public class MissingNumber {
    @Test
    public void findMissingNumber(){
        int actualSum = 0;
        int naturalSum = 0;
        int[] array = {1,3,2,5,7,6,8};
        for(int i=0; i<array.length; i++) actualSum = actualSum+array[i];
        for(int i=1; i<=array.length+1; i++) naturalSum = naturalSum+i;
        System.out.println("Missing number is : "+(naturalSum-actualSum));
    }

    @Test
    public void usingXOR(){
        int[] array = {1,3,2,5,7,6,8};
        int x1 = array[0]; // xor all the elements in array
        for(int i=1; i<array.length; i++) x1=x1^array[i];
        int x2 = 1; // xor all the natural elements
        for(int i=2; i<=array.length+1; i++) x2=x2^i;
        System.out.println("Missing number is : "+(x2^x1));
    }
}
