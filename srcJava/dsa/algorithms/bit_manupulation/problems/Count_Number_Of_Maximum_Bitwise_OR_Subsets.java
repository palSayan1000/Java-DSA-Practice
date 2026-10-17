package dsa.algorithms.bit_manupulation.problems;

// https://leetcode.com/problems/count-number-of-maximum-bitwise-or-subsets/description/
public class Count_Number_Of_Maximum_Bitwise_OR_Subsets {
    static void main() {
        System.out.println(new Count_Number_Of_Maximum_Bitwise_OR_Subsets()
                .countMaxOrSubsets(new int[]{3, 1}));
    }

    public int countMaxOrSubsets(int[] nums) {
        int maxOrValue = 0;
        for (int num : nums) {
            maxOrValue |= num;
        }
        return countSubsets(nums, 0, 0, maxOrValue);
    }

    public int countSubsets(int[] nums, int index, int currentXOR, int target) {
        if (nums.length == index) {
            return currentXOR == target ? 1 : 0;
        }

        return countSubsets(nums, index + 1, currentXOR | nums[index], target) +
                countSubsets(nums, index + 1, currentXOR, target);
    }
}
