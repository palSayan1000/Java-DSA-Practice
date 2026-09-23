package dsa.data_structures.stacks_queues.problems.practice;

import java.util.Stack;

// https://leetcode.com/problems/evaluate-reverse-polish-notation/description/?envType=problem-list-v2&envId=dsa-linear-shoal-stack
public class Evaluate_Reverse_Polish_Notation {
    static void main() {
        System.out.println(new Evaluate_Reverse_Polish_Notation().evalRPN(new String[] {"2","1","+","3","*"}));
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String str: tokens) {
            if (isOperator(str)) {
                stack.push(Integer.parseInt(str));
            } else {
                stack.push(operation(stack.pop(), stack.pop(), str.charAt(0)));
            }
        }

        return stack.pop();
    }
    public boolean isOperator(String str) {
        return switch (str) {
            case "-", "+", "/", "*" -> false;
            default -> true;
        };
    }
    public int operation(int j, int i, char token) {
        return switch (token) {
            case '+' -> i + j;
            case '-' -> i - j;
            case '*' -> i * j;
            case '/' -> i / j;
            default -> 0;
        };
    }
}
