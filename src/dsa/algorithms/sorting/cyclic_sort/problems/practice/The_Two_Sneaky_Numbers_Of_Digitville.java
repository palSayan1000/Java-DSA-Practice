package dsa.algorithms.sorting.cyclic_sort.problems.practice;

import java.util.Arrays;

// https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville/description/
public class The_Two_Sneaky_Numbers_Of_Digitville {
    static void main() {
        System.out.println(Arrays.toString(new The_Two_Sneaky_Numbers_Of_Digitville().getSneakyNumbers(new int[]{0, 3, 2, 1, 3, 2})));
    }

    public int[] getSneakyNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i && nums[nums[i]] != nums[i]) {
                int temp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = temp;
                i--;
            }
        }

        return new int[]{nums[nums.length - 2], nums[nums.length - 1]};
    }
}
