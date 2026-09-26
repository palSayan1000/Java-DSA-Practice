package dsa.algorithms.math.problems;

// https://leetcode.com/problems/gcd-of-odd-and-even-sums/description/
public class GCD_Of_Odd_And_Even_Sums {
    static void main() {
        System.out.println(new GCD_Of_Odd_And_Even_Sums().gcdOfOddEvenSums(4));
    }
    public int gcdOfOddEvenSums(int n) {
        // The first n odd numbers sum to n * n
        // First n even numbers sum to n * (n + 1)
        // gcd(n, n + 1) = 1, so the answer is n
        return n;
    }
}
