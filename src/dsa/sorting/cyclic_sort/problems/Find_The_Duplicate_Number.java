package dsa.sorting.cyclic_sort.problems;
// https://leetcode.com/problems/find-the-duplicate-number/description/
public class Find_The_Duplicate_Number {
    static int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] - 1 != i && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i --] = temp;
            }
        return nums[nums.length - 1];
    }

    static void main() {
        int[] nums = {1,3,4,2,2};
        System.out.println("The duplicate number is: " + findDuplicate(nums));
    }
}