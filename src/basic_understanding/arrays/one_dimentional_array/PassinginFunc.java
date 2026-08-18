package basic_understanding.arrays.one_dimentional_array;

import java.util.Scanner;
import java.util.Arrays;

public class PassinginFunc {
    public static void main() {
        int[] nums = {3, 4, 5, 12};
        System.out.println(Arrays.toString(nums));
        chnage(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void chnage(int[] nums) {
        nums[0] = 99;
    }
}
