package dsa.data_structures.arrays;

// https://leetcode.com/problems/maximum-substrings-with-distinct-start/description/
public class Maximum_Substrings_With_Distinct_Start {
    static void main() {
        System.out.println(new Maximum_Substrings_With_Distinct_Start().maxDistinct("abababababababababcd"));
    }

    public int maxDistinct(String s) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 97] ++;
        }

        int countUnique = 0;
        for (int i : freq) {
            if (i != 0) {
                countUnique ++;
            }
        }

        return countUnique;
    }
}
