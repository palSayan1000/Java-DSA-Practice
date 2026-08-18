package dsa.sliding_window.fixed;

import java.util.*;

public class Substring_Of_Size_Three_With_Distinct_Characters {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        System.out.println("No.of unique three digit substring: " + new Solution().countGoodSubstrings(sc.next()));
    }
}

class Solution {
    public int countGoodSubstrings(String s) {
        int goodSubstringCount = 0;
        for (int i = 0; i < s.length() - 2; i++)
            if (s.charAt(i) != s.charAt(i + 1) && s.charAt(i) != s.charAt(i + 2) && s.charAt(i + 1) != s.charAt(i + 2))
                goodSubstringCount++;
        return goodSubstringCount;
    }
}