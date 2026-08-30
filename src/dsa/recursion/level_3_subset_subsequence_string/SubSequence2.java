package dsa.recursion.level_3_subset_subsequence_string;

public class SubSequence2 {
    static void main() {
        String str = "ab";
        // subSequence("", str);
        subSequenceAscii(str, 0, "");
    }
    static void subSequenceAscii(String str, int index, String current) {
        if (index == str.length()) {
            System.out.println(current);
            return;
        }
        subSequenceAscii(str, index + 1, current + str.charAt(index));
        subSequenceAscii(str, index + 1, current + (int)str.charAt(index));
        subSequenceAscii(str, index + 1, current);
    }
}
