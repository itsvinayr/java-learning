package com.java.learning.completeJava.problemStatements.amazon;

public class MoveAllZeroesToEndOfArray {
    public static void main(String[] args) {
        int[] arr = {1,9,8,4,0,0,2,7,0,6,0};
        int[] arr2 = new int[arr.length];
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                arr2[count++]=arr[i];
            }
        }
        while(count<arr.length){
            arr2[count++]=0;
        }
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
