package dsa.data_structures.arrays;

// https://leetcode.com/problems/concatenate-array-with-reverse/description/
public class Concatenate_Array_With_Reverse {
    static void main() {
        System.out.println(java.util.Arrays.toString(new Concatenate_Array_With_Reverse().concatWithReverse(new int[] {1, 2, 3})));
    }

    public int[] concatWithReverse(int[] nums) {
        int[] arr = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            arr[i + nums.length] = nums[nums.length - 1 - i];
        }

        return arr;
    }
}
