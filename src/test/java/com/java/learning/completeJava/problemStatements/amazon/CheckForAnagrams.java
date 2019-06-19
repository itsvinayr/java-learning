package com.java.learning.completeJava.problemStatements.amazon;

import java.util.Arrays;

public class CheckForAnagrams {
    private static boolean isAnagram = true;
    private static int NO_OF_CHARS = 256;

    // Method 1: sort the array, and compare
    // Method 2: count each char occurances and compare
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "forgeeksgeeks";
        method1(s1, s2);
        method2(s1, s2);
    }

    private static void method2(String s1, String s2) {
        char[] s1array = s1.toCharArray();
        char[] s2array = s2.toCharArray();
        int[] count1 = new int[NO_OF_CHARS];
        int[] count2 = new int[NO_OF_CHARS];
        Arrays.fill(count1,0);
        Arrays.fill(count2, 0);
        if(s1array.length!=s2array.length){
            isAnagram=false;
        }

        if(isAnagram){
            for(int i=0; i<s1array.length && i<s2array.length; i++){
                count1[s1array[i]]++;
                count2[s2array[i]]++;
            }
            for(int i=0; i<NO_OF_CHARS; i++){
                if(count1[i]!=count2[i]){
                    isAnagram=false;
                    break;
                }
            }
            if(isAnagram){
                System.out.println("Its an anagram");
            }else{
                System.out.println("Not an anagram");
            }
        }
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
