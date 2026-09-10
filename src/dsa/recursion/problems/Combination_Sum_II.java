package dsa.recursion.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/combination-sum-ii/description/
public class Combination_Sum_II {
    static void main() {
        System.out.println(new Combination_Sum_II().combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        getAllCombo(candidates, target, 0, new ArrayList<>(), list);
        return list;
    }

    public void getAllCombo(int[] nums, int target, int index, ArrayList<Integer> lst, List<List<Integer>> list) {
        if (target == 0) {
            list.add(new ArrayList<>(lst));
            return;
        }
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) continue;
            if (nums[i] > target) return;
            lst.add(nums[i]);
            getAllCombo(nums, target - nums[i], i + 1, lst, list);
            lst.removeLast();
        }
    }
}
