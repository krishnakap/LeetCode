import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public void merge1(int[] nums1, int m, int[] nums2, int n){

        Integer[] integerArray1 = Arrays.stream(nums1).boxed().toArray(Integer[]::new);
        List<Integer> list1 = new ArrayList<>(Arrays.asList(Arrays.copyOfRange(integerArray1,0,m)));

        Integer[] integerArray2 = Arrays.stream(nums2).boxed().toArray(Integer[]::new);
        List<Integer> list2 = new ArrayList<>(Arrays.asList(Arrays.copyOfRange(integerArray2,0,n)));

        list1.addAll(list2);

        int combLength = m+n;

        nums1 = new int[combLength];

        for(int i=0; i<combLength;i++){
            nums1[i] = list1.get(i);
        }

        System.out.println(Arrays.toString(nums1));

    }
}
