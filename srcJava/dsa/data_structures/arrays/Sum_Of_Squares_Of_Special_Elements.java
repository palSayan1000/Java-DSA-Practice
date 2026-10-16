package dsa.data_structures.arrays;

// https://leetcode.com/problems/sum-of-squares-of-special-elements/description/
public class Sum_Of_Squares_Of_Special_Elements {
    static void main() {
        System.out.println(new Sum_Of_Squares_Of_Special_Elements()
                .sumOfSquares(new int[] {1,2,3,4}));
    }

    public int sumOfSquares(int[] nums) {
        int sum = 0, n = nums.length;

        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                sum = (int) (sum + Math.pow(nums[i - 1], 2));

        return sum;
    }
}
