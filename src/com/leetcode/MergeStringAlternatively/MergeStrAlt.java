package com.leetcode.MergeStringAlternatively;

public class MergeStrAlt {

    public String merStrAltr(String s1, String s2){
        StringBuilder finalStr =  new StringBuilder();

        int minLen = Math.min(s1.length(),s2.length()),  i=0;

        for(i=0;i<minLen;i++){
            finalStr.append(s1.charAt(i));
            finalStr.append(s2.charAt(i));
        }

        if(s1.length()>s2.length()){
            finalStr.append(s1.substring(i));
        } else if (s2.length()>s1.length()) {
            finalStr.append(s2.substring(i));
        }

        return finalStr.toString();
    }
}
