package dsa.algorithms.recursion.problems;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/generate-binary-strings-without-adjacent-zeros/description/
public class Generate_Binary_Strings_Without_Adjacent_Zeros {
    static void main() {
        System.out.println(new Generate_Binary_Strings_Without_Adjacent_Zeros()
                .validStrings(3));
    }

    public List<String> validStrings(int n) {
        List<String> list = new ArrayList<>();

        if (n == 0) {
            return list;
        }
        validStrings(n, new StringBuilder(), list);

        return list;
    }

    private void validStrings(int n, StringBuilder sb, List<String> list) {
        if (n == 0) {
            list.add(sb.toString());
            return;
        }
        int prevLength = sb.length();

        sb.append('1');
        validStrings(n - 1, sb, list);
        sb.setLength(prevLength);

        if (prevLength > 0 && sb.charAt(prevLength - 1) == '0') {
            return;
        }

        sb.append('0');
        validStrings(n - 1, sb, list);
        sb.setLength(prevLength);
    }
}
