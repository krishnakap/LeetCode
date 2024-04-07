package com.leetcode.MergeStringAlternatively;

import java.util.Arrays;

public class MergeStringAlternatively {

    public String MergeAlternate(String s1, String s2){

        int tot_size = s1.length()+s2.length();
        int minLen = Math.min(s1.length(),s2.length());
        //System.out.println(tot_size);

        char[] str_arr1 = s1.toCharArray();
        char[] str_arr2 = s2.toCharArray();
        char[] str_arr3 = new char[tot_size];

        String str_final = "";
        int i = 0;

//"abcd","qwer"

        while(i<minLen){
                str_final += str_arr1[i];
                //System.out.println(str_final);
                str_final += str_arr2[i];
                //System.out.println(str_final);
            i++;
            }
        if(s1.length() > s2.length()){
            str_final += s1.substring(i);
        } else if (s2.length() > s1.length()) {
            str_final += s2.substring(i);
        }

        return str_final;
    }
}
