package dsa.recursion.level_3_subset_subsequence_string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet_2 {
    static void main() {
        int[] arr = {1, 2, 2};
        List<List<Integer>> list = subsetDup(arr);
        System.out.println(list);
    }
    static List<List<Integer>> subsetDup(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outerList = new ArrayList<>();

        outerList.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;
            // if current and previous element is same, s = e + 1;
            if (i > 0 && arr[i] == arr[i - 1])
                start = end + 1;
            end = outerList.size() - 1;
            int n = outerList.size();
            for (int j = start; j < n; j++) {
                ArrayList<Integer> internalList = new ArrayList<>(outerList.get(j));
                internalList.add(arr[i]);
//                if (!outerList.contains(internalList))
//                    outerList.add(internalList);
                // Or
                outerList.add(internalList);
            }
        }

        return outerList;
    }
}
