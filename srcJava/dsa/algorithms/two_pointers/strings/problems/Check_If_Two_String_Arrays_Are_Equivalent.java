package dsa.algorithms.two_pointers.strings.problems;

// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/
public class Check_If_Two_String_Arrays_Are_Equivalent {
    static void main() {
        System.out.println(
                new Check_If_Two_String_Arrays_Are_Equivalent()
                        .arrayStringsAreEqual(
                                new String[]{"ab", "c"},
                                new String[]{"a", "bc"}
                        )
        );
    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // here i, j points to the index of the arrays
        // and the ii, jj points to the index of the words strings inside the arrays

        // int i = 0, j = 0, ii = 0, jj = 0;

        // while (i < word1.length && j < word2.length) {
        //     while (ii < word1[i].length() && jj < word2[j].length()) {
        //         if (word1[i].charAt(ii) != word2[j].charAt(jj)) {
        //             return false;
        //         }
        //         ii++;
        //         jj++;
        //     }
        //     if (ii == word1[i].length()) {
        //         i++;
        //         ii = 0;
        //     }
        //     if (jj == word2[j].length()) {
        //         j++;
        //         jj = 0;
        //     }
        // }

        // return i == word1.length && j == word2.length;

        StringBuilder string1 = new StringBuilder(), string2 = new StringBuilder();
        for (String word : word1) {
            string1.append(word);
        }
        for (String word : word2) {
            string2.append(word);
        }
        return string1.compareTo(string2) == 0;
    }
}
