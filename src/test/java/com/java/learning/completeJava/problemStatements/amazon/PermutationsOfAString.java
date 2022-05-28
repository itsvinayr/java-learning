package com.java.learning.completeJava.problemStatements.amazon;

public class PermutationsOfAString {
    public static void main(String[] args) {
        String input = "ABC";
        int n = input.length();
        permute(input, 0, n-1);
    }

    private static void permute(String input, int l, int r) {
        if(l==r){
            System.out.println(input);
        }else{
            for(int i=l; i<=r; i++){
                input = swap(input, l, i);
                permute(input, l+1, r);
                input = swap(input, l, i);
            }
        }
    }

    private static String swap(String input, int i, int j) {
        char temp;
        char[] tempArray = input.toCharArray();
        temp = tempArray[i];
        tempArray[i] = tempArray[j];
        tempArray[j] = temp;
        return String.valueOf(tempArray);
    }
}
