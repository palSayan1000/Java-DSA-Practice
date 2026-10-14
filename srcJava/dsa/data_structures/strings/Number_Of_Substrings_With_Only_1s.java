package dsa.data_structures.strings;

// https://leetcode.com/problems/number-of-substrings-with-only-1s/description/?envType=problem-list-v2&envId=dbe72sy1
public class Number_Of_Substrings_With_Only_1s {
    static void main() {
        System.out.println(new Number_Of_Substrings_With_Only_1s()
                .numSub("0110111"));
    }

    public int numSub(String s) {
        final int MOD = 1_000_000_007;
        long totalCount = 0, currCount = 0;
        s += '0';

        for (int i : s.toCharArray())
            if (i == 48)
                currCount = 0;
            else
                totalCount += ++currCount;

        return (int) (totalCount % MOD);
    }
}
