package dsa.data_structures.strings;

// https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/description/
public class Number_Of_Strings_That_Appear_As_Substrings_In_Word {
    static void main() {
        System.out.println(new Number_Of_Strings_That_Appear_As_Substrings_In_Word()
                .numOfStrings(
                        new String[] {"a","abc","bc","d"},
                        "abc"
                ));
    }

    public int numOfStrings(String[] patterns, String word) {
        int count = 0;

        for (String pattern : patterns) {
            if (word.contains(pattern)) {
                count++;
            }
        }

        return count;
    }
}
