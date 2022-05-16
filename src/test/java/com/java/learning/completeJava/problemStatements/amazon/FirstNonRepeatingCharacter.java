package com.java.learning.completeJava.problemStatements.amazon;

import org.testng.annotations.Test;

import java.util.HashMap;

/**
 * aaabccddeeeff -> b is the first non repeating character
 */
public class FirstNonRepeatingCharacter {

    @Test
    public void usingInbuiltFunctions(){
        String input = "aaabcccddeeff";
        for(int i=0; i<input.length(); i++){
            if(input.indexOf(input.charAt(i))==input.lastIndexOf(input.charAt(i))) {
                System.out.println("first non repeater character is : " + input.charAt(i));
                break;
            }
        }
    }

    @Test
    public void usingIntegerArray(){
        String input = "aaabcccddeeff";
        int[] cArray = new int[26];
        for(char c: input.toCharArray()){
            cArray[c-'a']++;
        }

        for(char c: input.toCharArray()){
            if(cArray[c-'a']==1) {
                System.out.println("First non repeating character is : " + c);
                break;
            }
        }
    }

    @Test
    public void usingHashMap(){
        String input = "aaabcccddeeff";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<input.length(); i++){
            if(map.containsKey(input.charAt(i))){
                map.put(input.charAt(i), map.get(input.charAt(i))+1);
            }else{
                map.put(input.charAt(i), 1);
            }
        }

        for(int i=0; i<input.length(); i++){
            if(map.containsKey(input.charAt(i))){
                if(map.get(input.charAt(i))==1){
                    System.out.println("First non repeating character : "+input.charAt(i));
                    break;
                }
            }
        }
    }

    @Test
    public void bruteForceApproach(){
        String input = "aaabcccddeeff";
        for(int i=0; i<input.length(); i++){
            boolean flag = false;
            for(int j=0; j<input.length(); j++){
                if((input.charAt(i)==input.charAt(j)) && (i!=j)){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println("Non repeating character is :"+input.charAt(i));
            }
        }
    }
}
