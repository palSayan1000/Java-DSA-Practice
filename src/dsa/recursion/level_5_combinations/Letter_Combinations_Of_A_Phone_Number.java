package dsa.recursion.level_5_combinations;

import java.sql.SQLOutput;
import java.util.*;

// https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
public class Letter_Combinations_Of_A_Phone_Number {
    static void main() {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }
    static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        getLetterCombinations(digits, new String[]{"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"}, 0, new StringBuilder(), result);
        return result;
    }
    // My one
    static void getLetterCombinations(String digits, String[] map, int index, StringBuilder current, List<String> list) {
        if (index == digits.length()){
            list.add(current.toString());
            return;
        }
        for (int i = 0; i < map[digits.charAt(index) - 48 - 2].length(); i++) {
            current.append(map[digits.charAt(index) - 48 - 2].charAt(i));
            getLetterCombinations(digits, map, index + 1, current, list);
            current.deleteCharAt(current.length() - 1);
        }
    }
    // Kunal's one
    static void pad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0'; // this will convert '2' to 2
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char)('a' + i);
            pad(p + ch, up.substring(1));
        }
    }
    // Kunal's two
    static ArrayList<String> padRtn(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0'; // this will convert '2' to 2
        ArrayList<String> list = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char)('a' + i);
            list.addAll(padRtn(p + ch, up.substring(1)));
        }
        return list;
    }
    // Kunal's three
    static int padCount(String p, String up) {
        if (up.isEmpty()) return 1;
        int digit = up.charAt(0) - '0', count = 0; // this will convert '2' to 2
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char)('a' + i);
            count += padCount(p + ch, up.substring(1));
        }
        return count;
    }
}
