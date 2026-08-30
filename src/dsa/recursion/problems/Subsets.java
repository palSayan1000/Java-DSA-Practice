package dsa.recursion.problems;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        subsets(nums, 0, new ArrayList<>(), list);
        return list;
    }
    void subsets(int[] nums, int index, List<Integer> lst, List<List<Integer>> list) {
        if (index == nums.length) {
            list.add(new ArrayList<>(lst));
            return;
        }
        lst.add(nums[index]);
        subsets(nums, index + 1, lst, list);
        lst.removeLast();
        subsets(nums, index + 1, lst, list);
    }
    static void main() {
        System.out.println(new Subsets().subsets(new int[] {1, 2, 3}));
    }
}
