package dsa.recursion.problems;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/letter-case-permutation/description/
public class Letter_Case_Permutation {
    static void main() {
        System.out.println(new Letter_Case_Permutation(). letterCasePermutation("a1b2"));
    }
    public List<String> letterCasePermutation(String s) {
        List<String> list = new ArrayList<>();
        letterCasePermutation(s, 0, new StringBuilder(), list); // this one is better
        // letterCasePermutation(new StringBuilder(s), 0, list);
        return list;
    }
    public void letterCasePermutation(String s, int index, StringBuilder stringBuilder, List<String> list) {
        if (index == s.length()) {
            list.add(stringBuilder.toString());
            return;
        }

        stringBuilder.append(Character.toUpperCase(s.charAt(index)));
        letterCasePermutation(s, index + 1, stringBuilder, list);
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);

        if (!Character.isDigit(s.charAt(index))){
            stringBuilder.append(Character.toLowerCase(s.charAt(index)));
            letterCasePermutation(s, index + 1, stringBuilder, list);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }
    public void letterCasePermutation(StringBuilder stringBuilder, int index, List<String> list) {
        if (index == stringBuilder.length()) {
            list.add(stringBuilder.toString());
            return;
        }

        letterCasePermutation(stringBuilder, index + 1, list);

        if (Character.isLetter(stringBuilder.charAt(index))) {
            stringBuilder.setCharAt(index, Character.toUpperCase(stringBuilder.charAt(index)));
            letterCasePermutation(stringBuilder, index + 1, list);
            stringBuilder.setCharAt(index, Character.toLowerCase(stringBuilder.charAt(index)));
        }
    }
}