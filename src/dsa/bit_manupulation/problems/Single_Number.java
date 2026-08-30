package dsa.bit_manupulation.problems;
//https://leetcode.com/problems/single-number/description/
public class Single_Number {
    static int singleNumber(int[] nums) {
        int num = 0;
        for (int i: nums) num ^= i;
        return num;
    }

    static void main() {
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
    }
}
