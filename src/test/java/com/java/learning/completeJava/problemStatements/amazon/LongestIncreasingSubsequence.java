package com.java.learning.completeJava.problemStatements.amazon;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60};
        System.out.println("Given array");
        for(int i:arr) System.out.print(i+" ");
        System.out.println();
        int length = arr.length;
        System.out.println("Length of LIS is " + lis(arr, length));
    }

    private static int lis(int[] arr, int n) {
        int[] lis = new int[n];
        lis[0] = 1;
        for (int i = 1; i < n; i++) {
            lis[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }
            }
        }

        int max = Arrays.stream(lis).max().getAsInt();

        int temp = max;
        for(int i=0; i<max; i++) {
            if(i==0){
                System.out.println(arr[returnIndex(lis, temp)]);
            }else{
                temp = temp-1;
                System.out.println(arr[returnIndex(lis, temp)]);
            }
        }
        return max;
    }

    private static int returnIndex(int[] lis, int max) {
        int index = 0;
        for(int i = 0; i< lis.length; i++){
            if(lis[i]==max){
                index = i;
                break;
            }
        }
        return index;
    }
}
