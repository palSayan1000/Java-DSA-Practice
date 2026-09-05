package dsa.recursion.problems;
// https://leetcode.com/problems/count-sorted-vowel-strings/description/?envType=problem-list-v2&envId=combinatorics
public class Count_Sorted_Vowel_Strings {
    @FunctionalInterface
    interface countVowelStrings {
        int totalVowelStrings(countVowelStrings self, int index, int length);
    }
    static void main() {
        System.out.println(new Count_Sorted_Vowel_Strings().countVowelStrings(2));
    }
    public int countVowelStrings(int n) {
        countVowelStrings dfs = (countVowelStrings self, int index, int length) -> {
            if (length == 0)
                return 1;
            int sum = 0;
            for (int i = index; i < 5; i++)
                sum += self.totalVowelStrings(self, i, length - 1);
            return sum;
        };
        return dfs.totalVowelStrings(dfs, 0, n);
    }
}
