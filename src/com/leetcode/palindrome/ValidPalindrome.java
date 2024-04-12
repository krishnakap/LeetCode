package com.leetcode.palindrome;

import java.util.Arrays;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {

        //s = "A man, a plan, a canal: Panama"

        String refinedStr = s.toLowerCase().replaceAll("[^a-z]+", "");
        System.out.println(refinedStr);

        for(int i=0; i< refinedStr.length();i++){
            if(refinedStr.charAt(i) != refinedStr.charAt(refinedStr.length()-1-i)){
                return false;
            }
        }

        return true;

    }
}
