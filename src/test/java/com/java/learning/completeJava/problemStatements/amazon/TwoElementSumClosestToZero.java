package com.java.learning.completeJava.problemStatements.amazon;

import org.testng.annotations.Test;

public class TwoElementSumClosestToZero {
    @Test
    public void bruteForceApproach() {
        int[] arr = {1,60,-10,70, -80, 85};
        int sum, finalSum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                sum = arr[i]+arr[j];
                if(i==0) finalSum=sum;
                if(sum<finalSum && sum>=0) finalSum=sum;
            }
        }
        System.out.println("final sum is "+finalSum);
    }
}
