package dsa.data_structures.stacks_queues.problems.patterns;

import java.util.Stack;

public class Minimum_Insertions_To_Balance_A_Parentheses_String {
    static void main() {
        System.out.println(new Minimum_Insertions_To_Balance_A_Parentheses_String().minInsertions("))())("));
    }
    public int minInsertions(String s) {
        int res = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i ++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            } else {
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i ++;
                } else {
                    res ++;
                }
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    res ++;
                }
            }
        }
        res += stack.size() * 2;
        return res;
    }
}
