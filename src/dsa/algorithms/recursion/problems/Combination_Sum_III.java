package dsa.algorithms.recursion.problems;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/combination-sum-iii/description/?envType=problem-list-v2&envId=backtracking
public class Combination_Sum_III {
    static void main() {
        System.out.println(new Combination_Sum_III().combinationSum3(3, 7));
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        combinationSum3(1, n, k, new ArrayList<>(), list);
        return list;
    }

    public void combinationSum3(int index, int n, int k, List<Integer> lst,
                                List<List<Integer>> list) {
        if (k == 0 && n == 0) {
            list.add(new ArrayList<>(lst));
            return;
        }
        for (int i = index; i <= 9; i++) {
            if (n - i < 0) {
                break;
            }
            lst.add(i);
            combinationSum3(i + 1, n - i, k - 1, lst, list);
            lst.removeLast();
        }
    }
}
