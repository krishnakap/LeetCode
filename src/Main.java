import com.leetcode.MergeStringAlternatively.MergeStrAlt;
import com.leetcode.MergeStringAlternatively.MergeStringAlternatively;
import com.leetcode.mergearray.MergeTwoSortedArrays;
import com.leetcode.mergearray.NewMergeSortedArray;
import com.leetcode.stackprg.StackSolution;

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

        int[] num1 = {1,2,4,6,7,0,0,0};
        int m = 3;
        int[] num2 = {1,2,3,0,0,0,0};
        int n = 3;

        MergeTwoSortedArrays mer = new MergeTwoSortedArrays();
        mer.merge(num1,m,num2,n);
        NewMergeSortedArray mer2 = new NewMergeSortedArray();
        mer2.merge1(num1,m,num2,n);

        StackSolution sts = new StackSolution();

        sts.checkValidString("()");

        MergeStringAlternatively merstr = new MergeStringAlternatively();
        String retStr  = merstr.MergeAlternate("abcd","qwer");
        System.out.println(retStr);

        MergeStrAlt merstr1 = new MergeStrAlt();
        String newString = merstr1.merStrAltr("qwerty","asdf");
        System.out.println(newString);


 
    }
}