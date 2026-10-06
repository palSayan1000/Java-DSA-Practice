package concepts.dsa.data_structures.strings;

// https://leetcode.com/problems/longest-common-prefix/description/
public class Longest_Common_Prefix {
    static void main() {
        System.out.println(new Longest_Common_Prefix().longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();

        outerLoop:
        for (int i = 0; i < strs[0].length(); i++) {
            sb.append(strs[0].charAt(i));
            for (String word : strs) {
                if (i >= word.length() || word.charAt(i) != sb.charAt(i)) {
                    sb.setLength(i);
                    break outerLoop;
                }
            }
        }

        return sb.toString();
    }
}
