package dsa.algorithms.two_pointers.arrays.problems;

// https://leetcode.com/problems/move-zeroes/description/
public class Move_Zeroes {
    static void main() {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        new Move_Zeroes().moveZeroes(nums);
        System.out.println(java.util.Arrays.toString(nums));
    }

    public void moveZeroes(int[] nums) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        while (j < nums.length) {
            nums[j++] = 0;
        }
    }
}
