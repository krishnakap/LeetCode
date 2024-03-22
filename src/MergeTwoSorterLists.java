import java.util.Collections;
import java.util.List;

public class MergeTwoSorterLists {

    public List<Integer> mergeTwoLists(List<Integer> list1, List<Integer> list2) {

        for(int i=0;i<=list2.size()-1;i++){
            list1.add(list2.get(i));
        }

       //list1.addAll(list2);
        Collections.sort(list1);

        return list1;

    }
}
