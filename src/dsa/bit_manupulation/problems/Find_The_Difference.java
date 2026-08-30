package dsa.bit_manupulation.problems;

// https://leetcode.com/problems/find-the-difference/description/
public class Find_The_Difference {
    static void main() {
        System.out.println(findTheDifference("abcd", "abcde"));
    }
    static char findTheDifference(String s, String t) {
        if (s.isBlank())
            return t.charAt(0);
        int ans = 0;
        for (int i: s.toCharArray())
            ans ^= i;
        for (int i: t.toCharArray())
            ans ^= i;
        return (char)ans;
    }
}
