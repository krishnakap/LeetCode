import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.*/

        Solution sol = new Solution();
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {3,5,6,8,9};

        sol.merge1(arr1,3,arr2,3);

        MergeTwoSorterLists mer = new MergeTwoSorterLists();

        int[] arr11 = {1,2,3};
        int[] arr22 = {3,5,6};

        Integer[] listInt1 = Arrays.stream(arr11).boxed().toArray(Integer[]::new);
        Integer[] listInt2 = Arrays.stream(arr22).boxed().toArray(Integer[]::new);

        List<Integer> list1 = Arrays.asList(listInt1);
        List<Integer> list2 = Arrays.asList(listInt2);

        List<Integer> retList = mer.mergeTwoLists(list1,list2);

        System.out.println(retList);

    }
}