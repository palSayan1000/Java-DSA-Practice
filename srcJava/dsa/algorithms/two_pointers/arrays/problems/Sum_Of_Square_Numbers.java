package dsa.algorithms.two_pointers.arrays.problems;

// https://leetcode.com/problems/sum-of-square-numbers/description/
public class Sum_Of_Square_Numbers {
    static void main() {
        System.out.println(new Sum_Of_Square_Numbers()
                .judgeSquareSum(5));
    }

    public boolean judgeSquareSum(int c) {
        long left = 0, right = (int) Math.sqrt(c);

        while (left <= right) {
            long sum = left * left + right * right;
            if (sum == c) {
                return true;
            }
            if (sum < c) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }
}
