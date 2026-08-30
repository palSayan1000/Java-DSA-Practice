package dsa.sorting.cyclic_sort.problems;
// https://leetcode.com/problems/first-missing-positive/description/
public class Find_Missing_Positive {
    static void main() {
        System.out.println("The first missing positive: " + firstMissingPositive(new int[]{3,4,-1,1}));
    }
    static int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i ++)
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i] - 1]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i --] = temp;
            }
        for (int i = 0; i < nums.length; i ++)
            if (nums[i] != i + 1)
                return i + 1;
        return nums.length + 1;
    }
}
