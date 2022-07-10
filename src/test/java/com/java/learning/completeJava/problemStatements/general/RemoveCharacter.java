package com.java.learning.completeJava.problemStatements.general;

import org.testng.annotations.Test;

public class RemoveCharacter {
    @Test
    public void removeCharacter() {
        String s = "vinay";
        char remove = 'i';
        String output = "";
        for(int i=0; i<s.length(); i++){
            if(remove != s.charAt(i)){
                output += s.charAt(i);
            }
        }
        System.out.println("Resultant string is "+output);
    }

    @Test
    public void removeDuplicateCharacters(){
        String s = "indian";
        char[] arr = s.toCharArray();
        String output = "";
        for(int i=0; i<arr.length; i++){
            char c = arr[i];
            for(int j=i+1; j<arr.length; j++){
                if(c==arr[j] && arr[j]!=0){
                    arr[j]=0;
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
            }else{
                output = output+arr[i];
            }
        }

        System.out.println(output);
    }
}
