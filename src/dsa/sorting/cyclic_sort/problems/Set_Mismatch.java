package dsa.sorting.cyclic_sort.problems;

import java.util.Arrays;

public class Set_Mismatch {
    static void main() {
        int[] arr = {3, 2, 2};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
    static int[] findErrorNums(int[] nums) {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] - 1 != i && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i--] = temp;
            }
        for (int i = 0; i < nums.length; i++)
            if (i + 1 != nums[i])
                return new int[]{nums[i], i + 1};
        return new int[]{-1, -1};
    }
}
