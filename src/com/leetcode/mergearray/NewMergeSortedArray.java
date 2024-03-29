package com.leetcode.mergearray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NewMergeSortedArray {

    public void merge1(int[] nums1, int m, int[] nums2, int n) {

        for(int j=0, i=m;j<n;j++){
            nums1[i] = nums2[j];
            i++;
        }

        Arrays.sort(nums1);

        System.out.println("new sorted array: "+Arrays.toString(nums1));
    }
}
