package dsa.algorithms.two_pointers.strings.problems;

// https://leetcode.com/problems/permutation-difference-between-two-strings/description/
public class Permutation_Difference_Between_Two_Strings {
    static void main() {
        System.out.println(new Permutation_Difference_Between_Two_Strings()
                .findPermutationDifference("abc", "bac"));
    }

    public int findPermutationDifference(String s, String t) {
        // HashMap<Character, Integer> mapS = new HashMap<>();
        // int permuDiff = 0;

        // for (int i = 0; i < s.length(); i++) {
        //     mapS.put(s.charAt(i), i);
        // }

        // for (int i = 0; i < t.length(); i++) {
        //     permuDiff += Math.abs(i - mapS.get(t.charAt(i)));
        // }

        // return permuDiff;

        int[] mapS = new int[26], mapT = new int[26];
        int permuDiff = 0;

        for (int i = 0; i < s.length(); i++) {
            mapS[s.charAt(i) - 97] = i;
            mapT[t.charAt(i) - 97] = i;
        }

        for (int i = 0; i < 26; i++) {
            permuDiff += Math.abs(mapS[i] - mapT[i]);
        }

        return permuDiff;
    }
}
