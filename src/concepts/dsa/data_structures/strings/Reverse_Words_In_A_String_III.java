package concepts.dsa.data_structures.strings;

// https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
public class Reverse_Words_In_A_String_III {
    static void main() {
        System.out.println(new Reverse_Words_In_A_String_III().reverseWords("Let's take LeetCode contest"));
    }

    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder(),
                sb = new StringBuilder();

        for (String word : s.split(" ")) {
            sb.append(word);
            ans.append(sb.reverse()).append(' ');
            sb.setLength(0);
        }

        return ans.substring(0, ans.length() - 1);
    }
}
