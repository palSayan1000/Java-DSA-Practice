package dsa.recursion.level_3_subset_subsequence_string;

import java.util.ArrayList;

public class SubSequence {
    static void main() {
        String str = "abcde";
        // subSequence("", str);
        subSequence(str, 0, "");
    }
    /// My Approach
    static void subSequence(String str, int index, String current) {
        if (index == str.length()) {
            System.out.print(current + "\t");
            return;
        }
        subSequence(str, index + 1, current + str.charAt(index));
        subSequence(str, index + 1, current);
    }
    /// Returning ArrayList<String> but not taking as parameter
    static ArrayList<String> subsequence(String str, int index, String current) {
        if (index == str.length()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(current);
            return list;
        }
        ArrayList<String> list = subsequence(str, index + 1, current + str.charAt(index));
        list.addAll(subsequence(str, index + 1, current));
        return list;
    }
    /// Taking arraylist<> as parameter
    static void subsequence(String str, int index, String current, ArrayList<String> list) {
        if (index == str.length()) {
            list.add(current);
            return;
        }
        subSequence(str, index + 1, current + str.charAt(index));
        subSequence(str, index + 1, current);
    }
    /// Kunal's Approach
    static void subSequence(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.print(processed + "\t");
            return;
        }
        subSequence(processed + unprocessed.charAt(0), unprocessed.substring(1));
        subSequence(processed, unprocessed.substring(1));
    }
}
