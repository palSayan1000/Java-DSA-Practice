package dsa.algorithms.recursion.problems;

// https://leetcode.com/problems/sum-of-all-subset-xor-totals/description/
public class Sum_Of_All_Subset_XOR_Totals {
    static void main() {
        System.out.println(new Sum_Of_All_Subset_XOR_Totals()
                .subsetXORSum(new int[] {3,4,5,6,7,8}));
    }

    public int subsetXORSum(int[] nums) {
        return subsetXORSum(nums, 0, 0);
    }

    public int subsetXORSum(int[] nums, int index, int currentXOR) {
        if (nums.length == index) {
            return currentXOR;
        }

        return subsetXORSum(nums, index + 1, currentXOR ^ nums[index]) +
                subsetXORSum(nums, index + 1, currentXOR);
    }
}
