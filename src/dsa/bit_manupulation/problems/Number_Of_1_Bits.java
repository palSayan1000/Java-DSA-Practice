package dsa.bit_manupulation.problems;

// https://leetcode.com/problems/number-of-1-bits/description/

public class Number_Of_1_Bits {
    static void main() {
        System.out.println(hammingWeight(11));
    }
    static int hammingWeight(int n) {
        return Integer.bitCount(n);
//        while (n > 0) {
//            if ((n & 1) == 1)
//                count ++;
//            n >>= 1;
//        }
//        return count;
    }
}
