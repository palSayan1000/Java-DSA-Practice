package dsa.recursion.level_3_subset_subsequence_string;

import java.util.List;
import java.util.ArrayList;

public class SubSet {
    static void main() {
        int[] arr = {1, 2, 3};
        List<List<Integer>> list = subset(arr);
        System.out.println(list);
    }
    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outerList = new ArrayList<>();

        outerList.add(new ArrayList<>());

        for (int num: arr) {
            int n = outerList.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> internalList = new ArrayList<>(outerList.get(i));
                internalList.add(num);
                outerList.add(internalList);
            }
        }

        return outerList;
    }
}
