package dsa.data_structures.arrays;

// https://leetcode.com/problems/compute-alternating-sum/description/
public class Compute_Alternating_Sum {
    static void main() {
        System.out.println(new Compute_Alternating_Sum().alternatingSum(new int[]{1, 3, 5, 7}));
    }

    public int alternatingSum(int[] nums) {
        int sign = 1, sum = 0;

        for (int num : nums) {
            sum += num * sign;
            sign *= -1;
        }

        return sum;
    }
}
