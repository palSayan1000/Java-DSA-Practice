package dsa.algorithms.bit_manupulation.problems;

// https://leetcode.com/problems/find-the-original-array-of-prefix-xor/description/
public class Find_The_Original_Array_Of_Prefix_Xor {
    static void main() {
        System.out.println(java.util.Arrays.toString(
                new Find_The_Original_Array_Of_Prefix_Xor().findArray(new int[] {5,2,0,3,1})
        ));
    }

    public int[] findArray(int[] pref) {
        if (pref.length == 0) {
            return new int[0];
        }
        int[] arr = new int[pref.length];
        arr[0] = pref[0];

        for (int i = 1; i < pref.length; i++) {
            arr[i] = pref[i - 1] ^ pref[i];
        }

        return arr;
    }
}
