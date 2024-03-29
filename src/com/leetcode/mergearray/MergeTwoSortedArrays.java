package com.leetcode.mergearray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        Integer[] intArray1 = Arrays.stream(nums1).boxed().toArray(Integer[]::new);
        List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(Arrays.copyOfRange(intArray1,0,m)));

        Integer[] intArray2 = Arrays.stream(nums2).boxed().toArray(Integer[]::new);
        List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(Arrays.copyOfRange(intArray2,0,n)));

        System.out.println(l1);
        System.out.println(l2);

        Collections.sort(l1);
        Collections.sort(l2);

        System.out.println("after sorting: "+l1);
        System.out.println("after sorting: "+l2);

        l1.addAll(l2);

        Collections.sort(l1);

        System.out.println("merged ad sorted: "+l1);

        int i;
        for(i=0; i<l1.size(); i++){
            nums1[i] = l1.get(i);
        }

        System.out.println(Arrays.toString(nums1));

    }
}
