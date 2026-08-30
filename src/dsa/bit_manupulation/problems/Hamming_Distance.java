package dsa.bit_manupulation.problems;

// https://leetcode.com/problems/hamming-distance/description/

public class Hamming_Distance {
    static int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    static void main() {
        System.out.println(hammingDistance(1, 5));
    }
}
