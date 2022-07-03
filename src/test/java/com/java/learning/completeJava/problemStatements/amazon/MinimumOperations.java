package com.java.learning.completeJava.problemStatements.amazon;

import java.util.Scanner;

public class MinimumOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Input array elements");
        for(int i=0;i<n; i++) arr[i] = sc.nextInt();
        printArray(arr);

        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int i:arr){
            min = Math.min(min, i);
            sum+=i;
        }

        /*
            a[0]- smallest + a[1] - smallest + a[2] - smallest
            ==> a[0]+a[1]+a[2]+smallest+smallest+smallest
            ==> sum of array elements + (size of array) * smallest
         */

        System.out.println("No of moves are "+(sum-(n*min)));

    }

    private static void printArray(int[] arr) {
        for(int i = 0; i< arr.length; i++){
            if(i== arr.length-1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println();
    }
}
