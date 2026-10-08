package dsa.algorithms.two_pointers.arrays.problems;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public class Remove_Duplicates_From_Sorted_Array {
    static void main() {
        System.out.println(new Remove_Duplicates_From_Sorted_Array().removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        int i = 1, k = 1;

        while (i < nums.length) {
            if (nums[i] != nums[i - 1]) {
                nums[k++] = nums[i];
            }
            i++;
        }

        return k;
    }
}
