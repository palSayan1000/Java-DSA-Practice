package dsa.data_structures.strings;

// https://leetcode.com/problems/find-most-frequent-vowel-and-consonant/description/
public class Find_Most_Frequent_Vowel_And_Consonant {
    static void main() {
        System.out.println(new Find_Most_Frequent_Vowel_And_Consonant()
                .maxFreqSum("successes"));
    }

    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        int constMax = Integer.MIN_VALUE, vowelMax = Integer.MIN_VALUE;

        for (int i : s.toCharArray()) {
            freq[i - 97]++;
        }

        for (int i = 0; i < 26; i++) {
            if ("aeiou".indexOf((char) (i + 97)) != -1) {
                vowelMax = Math.max(vowelMax, freq[i]);
            } else {
                constMax = Math.max(constMax, freq[i]);
            }
        }

        return vowelMax + constMax;
    }
}
