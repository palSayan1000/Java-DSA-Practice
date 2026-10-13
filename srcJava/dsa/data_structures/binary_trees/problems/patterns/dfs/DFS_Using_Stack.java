package dsa.data_structures.binary_trees.problems.patterns.dfs;

import dsa.data_structures.binary_trees.problems.TreeNode;

import java.util.Stack;

// Should you use this type of method no recursion method is great
public class DFS_Using_Stack {
    // dfs using stack
    public void dfsStacks(TreeNode node) {
        if (node == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);

        while (!stack.isEmpty()) {
            TreeNode removed = stack.pop();
            System.out.println(removed.val + "  ");
            if (removed.right != null) {
                stack.push(removed.right);
            }
            if (removed.left != null) {
                stack.push(removed.left);
            }
        }
    }
}
