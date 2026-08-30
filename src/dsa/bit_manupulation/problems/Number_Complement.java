package dsa.bit_manupulation.problems;
// https://leetcode.com/problems/number-complement/description/
public class Number_Complement {
    public static int findComplement(int num) {
        return num ^ ((1 << Integer.toBinaryString(num).length()) - 1);
    }

    static void main() {
        System.out.println(findComplement(5));
    }
}
