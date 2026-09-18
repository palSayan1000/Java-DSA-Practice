package dsa.data_structures.arrays;

import java.util.Arrays;

public class Squares_Of_A_Sorted_Array {
    static void main() {
        System.out.println(Arrays.toString(new Squares_Of_A_Sorted_Array().sortedSquares(new int[]{-4, -1, 0, 3, 10})));
    }
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
