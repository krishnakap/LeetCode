package com.leetcode.reverse;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StrReverse {

    public String reverseWords(String s) {

        String str = s.trim();
        System.out.println(str);
        String[] strArr = str.split("\\s+");
        StringBuilder revstr = new StringBuilder();

        for(int i= strArr.length-1;i>=0;i--){

            revstr.append(strArr[i]+" ");
        }

        System.out.println(revstr.toString());

        return revstr.toString();
    }
}
