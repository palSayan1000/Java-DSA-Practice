package dsa.bit_manupulation.problems;
// https://leetcode.com/problems/complement-of-base-10-integer/description/
public class Complement_Base10_Integer {
    public static int bitwiseComplement(int n) {
        return n ^ ((1 << Integer.toBinaryString(n).length()) - 1);
    }

    static void main() {
        System.out.println(bitwiseComplement(5));
    }
}
