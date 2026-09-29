package dsa.data_structures.stacks_queues.problems.practice;

// https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description/?envType=daily-question&envId=2026-09-28
public class Maximum_Nesting_Depth_Of_The_Parentheses {
    static void main() {
        System.out.println(new Maximum_Nesting_Depth_Of_The_Parentheses().maxDepth("(1+(2*3)+((8)/4))+1"));
    }

    public int maxDepth(String s) {
        int maxSize = 0, size = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                maxSize = Math.max(++size, maxSize);
            } else if (ch == ')') {
                size--;
            }
        }

        return maxSize;
    }
}
