package concepts.dsa.data_structures.stacks_queues.problems.practice;

import java.util.Stack;

// https://leetcode.com/problems/baseball-game/description/?envType=problem-list-v2&envId=prshgx6i
public class Baseball_Game {
    static void main() {
        System.out.println(new Baseball_Game()
                .calPoints(new String[]{"5", "2", "C", "D", "+"}));
    }

    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        for (String op : operations) {
            switch (op) {
                case "C":
                    stack.pop();
                    break;
                case "D":
                    stack.push(stack.peek() * 2);
                    break;
                case "+":
                    int pop = stack.pop();
                    int add = stack.peek() + pop;
                    stack.push(pop);
                    stack.push(add);
                    break;
                default:
                    stack.push(Integer.parseInt(op));
            }
        }

        for (int i : stack) {
            sum += i;
        }

        return sum;
    }
}
