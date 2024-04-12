package com.leetcode.reversevowels;

public class ReverseVowels {

    //Input: s = "hello"
    //Output: "holle"

    public String reverseVowels(String s) {

        StringBuilder vowelStr = new StringBuilder();
        StringBuilder newStr = new StringBuilder(s);
        String vowels = "aeiouAEIOU";

        for(int i=0; i<s.length();i++){
            if(vowels.indexOf(s.charAt(i)) != -1){
                vowelStr.append(s.charAt(i));
            }
        }

        int j = vowelStr.length()-1; //eo

        for(int i=0; i<s.length();i++){
            if(vowels.indexOf(s.charAt(i)) != -1){
                newStr.setCharAt(i,vowelStr.charAt(j));
                j--;
            }
        }

        System.out.println(vowelStr.toString());
        System.out.println(newStr.toString());

        return " ";

    }
}
