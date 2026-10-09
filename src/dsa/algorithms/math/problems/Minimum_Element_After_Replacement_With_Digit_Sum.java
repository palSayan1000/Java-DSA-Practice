package dsa.algorithms.math.problems;

// https://leetcode.com/problems/minimum-element-after-replacement-with-digit-sum/description/
public class Minimum_Element_After_Replacement_With_Digit_Sum {
    static void main() {
        System.out.println(new Minimum_Element_After_Replacement_With_Digit_Sum()
                .minElement(
                        new int[] {999,19,199}
                ));
    }

    public int minElement(int[] nums) {
        int minSum = Integer.MAX_VALUE;

        for (int i : nums) {
            minSum = Math.min(minSum, digitSum(i));
        }

        return minSum;
    }

    private int digitSum(int n) {
        int sum = 0;

        for (int i = n; i > 0; i /= 10) {
            sum += i % 10;
        }

        return sum;
    }
}
