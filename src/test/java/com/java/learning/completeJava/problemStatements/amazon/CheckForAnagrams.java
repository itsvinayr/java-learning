package com.java.learning.completeJava.problemStatements.amazon;

import java.util.Arrays;

public class CheckForAnagrams {
    private static boolean isAnagram = true;

    // Method 1: sort the array, and compare
    // Method 2: count each char occurances and compare
    public static void main(String[] args) {
        String s1 = "test";
        String s2 = "mone";
        method1(s1, s2);
    }

    private static void method1(String s1, String s2) {
        char[] s1array = s1.toCharArray();
        char[] s2array = s2.toCharArray();
        Arrays.sort(s1array);
        Arrays.sort(s2array);

        // compare each char
        for(int i=0; i<s1array.length; i++){
            if(s1array[i]!=s2array[i]){
                isAnagram = false;
                break;
            }
        }

        if(isAnagram){
            System.out.println("Its an anagram");
        }else {
            System.out.println("Not an anagram");
        }

        // print arrays
        System.out.println(Arrays.toString(s1array));
        System.out.println(Arrays.toString(s2array));
    }
}
