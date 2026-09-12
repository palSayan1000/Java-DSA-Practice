package dsa.two_pointers.strings.problems;

// https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75
public class Merge_Strings_Alternatively {
    static void main() {
        var obj = new Merge_Strings_Alternatively();

        System.out.println(obj.mergeAlternately("abc", "pqr").equals("apbqcr"));
        System.out.println(obj.mergeAlternately("ab", "pqrs").equals("apbqrs"));
        System.out.println(obj.mergeAlternately("abcd", "pq").equals("apbqcd"));
    }

    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;

        while (i < word1.length() && j < word2.length()) {
            sb.append(word1.charAt(i++)).append(word2.charAt(j++));
        }

        if (i != word1.length()) {
            sb.append(word1, i, word1.length());
        } else if (j != word2.length()) {
            sb.append(word2, j, word2.length());
        }

        return sb.toString();
    }
}
