package dsa.bit_manupulation.problems;

// https://leetcode.com/problems/power-of-two/description/

public class Power_Of_Two {
    static void main() {
        System.out.println(isPowerOfTwo(16));
    }
    static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        return (n & --n) == 0;
    }
}
