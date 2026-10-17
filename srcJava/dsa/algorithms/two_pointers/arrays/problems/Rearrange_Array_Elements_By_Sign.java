package dsa.algorithms.two_pointers.arrays.problems;

// https://leetcode.com/problems/rearrange-array-elements-by-sign/description/
public class Rearrange_Array_Elements_By_Sign {
    static void main() {
        System.out.println(java.util.Arrays.toString(
                new Rearrange_Array_Elements_By_Sign()
                        .rearrangeArray(new int[]{3, 1, -2, -5, 2, -4})
        ));
    }

    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];

        for (int i = 0, j = 1, k = 0; k < nums.length; k++) {
            if (nums[k] > 0) {
                arr[i] = nums[k];
                i += 2;
            } else if (nums[k] < 0) {
                arr[j] = nums[k];
                j += 2;
            }
        }

        return arr;
    }
}
