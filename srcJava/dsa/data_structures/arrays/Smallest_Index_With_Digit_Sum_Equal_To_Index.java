package dsa.data_structures.arrays;

// https://leetcode.com/problems/smallest-index-with-digit-sum-equal-to-index/description/?envType=daily-question&envId=2026-09-24
public class Smallest_Index_With_Digit_Sum_Equal_To_Index {
    static void main() {
        System.out.println(new Smallest_Index_With_Digit_Sum_Equal_To_Index()
                .smallestIndex(new int[]{1, 10, 11}));
    }

    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i == digitSum(nums[i])) {
                return i;
            }
        }

        return -1;
    }

    public int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
