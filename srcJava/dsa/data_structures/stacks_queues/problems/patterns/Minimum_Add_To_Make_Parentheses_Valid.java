package dsa.data_structures.stacks_queues.problems.patterns;

import java.util.Stack;

public class Minimum_Add_To_Make_Parentheses_Valid {
    static void main() {
        var obj = new Minimum_Add_To_Make_Parentheses_Valid();

        System.out.println(obj.minAddToMakeValid("((("));
    }

    public int minAddToMakeValid(String s) {
        int count = 0;
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(')
                stack.push(ch);
            else if (stack.isEmpty() || (ch == ')' && stack.pop() != '(')) {
                count++;
            }
        }
        return stack.size() + count;
    }
}
