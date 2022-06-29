package com.java.learning.completeJava.problemStatements.amazon;

import org.testng.annotations.Test;

import java.util.HashMap;

public class TargetSum {
    @Test
    public void bruteForce(){
        int[] arr = {5, 7, 1, 2, 8, 4, 3};
        int target = 10;
        for(int i = 0;i<arr.length;i++)
        {
            int num1 = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (num1 + arr[j] == target)
                    System.out.println("(" + arr[i] + "," + arr[j] + ")");
            }
        }
    }

    @Test
    public void bestSolution(){
        int[] arr = {5, 7, 1, 2, 8, 4, 3};
        int target = 10;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int compliment = target-arr[i];
            if(map.containsKey(compliment)){
                System.out.println("("+arr[i]+","+compliment+")");
            }else{
                map.put(arr[i], i);
            }
        }
    }
}
