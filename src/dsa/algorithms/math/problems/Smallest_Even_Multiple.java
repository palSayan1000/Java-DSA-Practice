package dsa.algorithms.math.problems;

// https://leetcode.com/problems/smallest-even-multiple/description/
public class Smallest_Even_Multiple {
    static void main() {
        System.out.println(new Smallest_Even_Multiple().smallestEvenMultiple(5));
    }

    public int smallestEvenMultiple(int n) {
        return n * 2 / gcd(n, 2);
    }

    public int gcd(int n, int two) {
        if (n == 0) {
            return two;
        }
        return gcd(two % n, n);
    }
}
