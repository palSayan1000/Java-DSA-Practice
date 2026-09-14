package dsa.stacks_queues.problems.patterns;

import java.util.Stack;

// https://leetcode.com/problems/valid-parentheses/description/
public class Valid_Parentheses {
    static void main() {
        var obj = new Valid_Parentheses();

        System.out.println(obj.isValid("()[]{}"));
        System.out.println(obj.isValid("()"));
        System.out.println(obj.isValid("([)]"));
        System.out.println(obj.isValid("([])"));
        System.out.println(obj.isValid("(]"));
    }

    public boolean isValid(String s) {
        if (s.length() % 2 != 0)
            return false;
        Stack<Character> stack = new Stack<>();
        for (char ch: s.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(')
                stack.push(ch);
            else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (ch == '}' && stack.pop() != '{') {
                    return false;
                }
                if (ch == ']' && stack.pop() != '[') {
                    return false;
                }
                if (ch == ')' && stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
