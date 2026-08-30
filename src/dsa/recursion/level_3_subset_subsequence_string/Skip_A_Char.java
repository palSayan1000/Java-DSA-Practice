package dsa.recursion.level_3_subset_subsequence_string;

public class Skip_A_Char {
    static void main() {
        String str = "baccad";
        System.out.println(skipChar(str, 0).toString());
    }
    static StringBuilder skipChar(String str, int index) {
        if (index == str.length())
            return new StringBuilder();
        StringBuilder skip = skipChar(str, index + 1);
        if (str.charAt(index) != 'a')
            skip.insert(0, str.charAt(index));
        return skip;
    }
    static void skip(String processedString, String unprocessedString) {
        if (unprocessedString.isEmpty()) {
            System.out.println(processedString);
            return;
        }
        if (unprocessedString.charAt(0) == 'a' || unprocessedString.charAt(0) == 'A')
            skip(unprocessedString.charAt(0) + processedString, unprocessedString.substring(1));
        else skip(processedString, unprocessedString.substring(1));
    }
    static String skip(String str, int index) {
        if (index == str.length())
            return "";
        return (str.charAt(index) == 'a' ? "" : str.charAt(index) + "" ) + skip(str, index + 1);
    }
}
