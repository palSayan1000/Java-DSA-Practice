package dsa.two_pointers.arrays.problems;

import java.util.Arrays;

public class Move_Zeros {
    static void main() {
        int[] arr = {1, 0};
        new Move_Zeros().moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    public void moveZeroes(int[] nums) {
        if (nums.length < 2) return;
        int i = 0, j = 0;
        while (i < nums.length && j < nums.length) {
            if (nums[i] != 0) {
                i++;
                continue;
            }
            if (nums[j] == 0) {
                j++;
                continue;
            }
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            j++;
            i++;
        }
    }
}
