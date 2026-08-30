package dsa.recursion.level_5_combinations;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/combination-sum/description/
public class Combination_Sum {
    static void main() {
        System.out.println(new Combination_Sum().combinationSum(new int[]{2,3,6,7}, 7));
    }
    List<List<Integer>> list = new ArrayList<>();
    List<List<Integer>> combinationSum(int[] candidates, int target){
        combinationSum(candidates, target, 0, new ArrayList<Integer>());
        return list;
    }
    void combinationSum(int[] candidates, int target, int index, List<Integer> list) {
        if (target == 0) {
            this.list.add(new ArrayList<>(list));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = index; i < candidates.length; i++)
            if (target - candidates[i] >= 0){
                list.add(candidates[i]);
                combinationSum(candidates, target - candidates[i], i, list);
                list.removeLast();
            }
    }
}