package com.java.learning.completeJava.problemStatements.amazon;

import org.testng.annotations.Test;

import java.util.HashMap;

public class NumberOccuringOddNumberTimes {
    @Test
    public void oddNumberOccurenceOfaNumber(){
        int[] arr = { 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };
        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[i]==arr[j])
                    count++;
            }
            if((count%2) !=0) {
                System.out.println("Number occuring for odd number of times is " + arr[i]);
                break;
            }
        }
    }

    @Test
    public void usingHashing(){
        int[] arr = { 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                int value = map.get(arr[i]);
                map.put(arr[i], (value+1));
            }else{
                map.put(arr[i], 1);
            }
        }

        for(int i: map.keySet()){
            if((map.get(i)%2)!=0){
                System.out.println("Element occuring for odd number of times is : "+i);
            }
        }
    }

    @Test
    public void usingXOR(){
        int[] arr = { 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };
        int res = 0;
        for(int i=0; i<arr.length; i++){
            res = res^arr[i];
        }
        System.out.println("Number occuring for odd number of times is "+res);
    }
}
