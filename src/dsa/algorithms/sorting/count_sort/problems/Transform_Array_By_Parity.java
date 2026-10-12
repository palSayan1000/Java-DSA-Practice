package dsa.algorithms.sorting.count_sort.problems;

// https://leetcode.com/problems/transform-array-by-parity/description/
public class Transform_Array_By_Parity {
    static void main() {
        System.out.println(java.util.Arrays.toString(new Transform_Array_By_Parity().transformArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})));
    }

    public int[] transformArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0, j = nums.length - 1; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                ans[j--] = 1;
            }
        }

        return ans;
    }
}
