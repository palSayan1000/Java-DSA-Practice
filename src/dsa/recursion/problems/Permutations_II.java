package dsa.recursion.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Permutations_II {
    static void main() {
        int[] arr = {1, 2, 2, 3};
        System.out.println(permuteUnique(arr));
    }
    static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        permuteUnique(nums, 0, list, new HashSet<>());
        return list;
    }
    static void permuteUnique(int[] nums, int index, List<List<Integer>> list, HashSet<List<Integer>> set) {
        if (index == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int i: nums)
                temp.add(i);
            if (set.add(temp))
                list.add(temp);
            return;
        }
        for (int i = 0; i <= index; i++) {
            swap(nums, i, index);
            permuteUnique(nums, index + 1, list, set);
            swap(nums, i, index);
        }
    }
    static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
