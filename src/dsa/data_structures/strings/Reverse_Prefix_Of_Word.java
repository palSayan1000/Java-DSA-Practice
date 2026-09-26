package dsa.data_structures.strings;

// https://leetcode.com/problems/reverse-prefix-of-word/description/
public class Reverse_Prefix_Of_Word {
    static void main() {
        System.out.println(new Reverse_Prefix_Of_Word().reversePrefix("abcdefd", 'd'));
    }
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index == -1) {
            return word;
        }
        return new StringBuilder(word.substring(0, index + 1)).
                reverse().
                append(word.substring(index + 1)).
                toString();
    }
}
