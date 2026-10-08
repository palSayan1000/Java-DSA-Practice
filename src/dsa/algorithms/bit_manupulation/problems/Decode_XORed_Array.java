package dsa.algorithms.bit_manupulation.problems;

import java.util.Arrays;

// https://leetcode.com/problems/decode-xored-array/description/
public class Decode_XORed_Array {
    static void main() {
        System.out.println(Arrays.toString(new Decode_XORed_Array().decode(new int[]{1, 2, 3}, 1)));
    }

    public int[] decode(int[] encoded, int first) {
        int[] decoded = new int[encoded.length + 1];
        decoded[0] = first;
        for (int i = 1; i < decoded.length; i++) {
            decoded[i] = encoded[i - 1] ^ decoded[i - 1];
        }
        return decoded;
    }
}
