package com.java.learning.completeJava.problemStatements.amazon;

public class FrequencyOfCharactersInAString {
    public static void main(String[] args){
        String s = "phuket phuket";
        char[] chrArray = s.toCharArray();
        int[] freq = new int[s.length()];
        for (int i=0; i<s.length(); i++){
            freq[i]=1;
            for(int j=i+1; j<s.length(); j++){
                if(chrArray[i]==chrArray[j]){
                    freq[i]++; // freq[i]=freq[i]+1;
                    chrArray[j]='0';
                }
            }
        }

        for(int i=0;i<s.length(); i++){
            if(chrArray[i]!='0')
            System.out.println(chrArray[i]+"---"+freq[i]);
        }

    }
}
