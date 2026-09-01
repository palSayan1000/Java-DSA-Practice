package dsa.recursion.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    static void main() {
        int[] nums = {1, 2, 3};
        System.out.println(permute(nums));
    }
    static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        permute(nums, 0, list);
        return list;
    }
    static void permute(int[] nums, int index, List<List<Integer>> list) {
        if (index == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int i: nums)
                temp.add(i);
            list.add(temp);
            return;
        }
        for (int i = 0; i <= index; i++) {
            swap(nums, i, index);
            permute(nums, index + 1, list);
            swap(nums, i, index);
        }
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
