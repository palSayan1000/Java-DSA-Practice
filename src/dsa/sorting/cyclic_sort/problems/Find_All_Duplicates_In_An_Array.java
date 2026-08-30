package dsa.sorting.cyclic_sort.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class Find_All_Duplicates_In_An_Array {
    static List<Integer> findDuplicates(int[] nums) {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] - 1 != i && nums[i] != nums[nums[i] - 1]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i --] = temp;
            }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++)
            if (nums[i] != i + 1)
                res.add(nums[i]);
        return res;
    }

    static void main() {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println("All the duplicates in the array are: " + findDuplicates(arr));
    }
}
