package dsa.data_structures.binary_trees.problems.practice.dfs;

import dsa.data_structures.binary_trees.problems.TreeNode;

// https://leetcode.com/problems/balanced-binary-tree/description/
public class Balanced_Binary_Tree {
    private boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        return Math.abs(height(root.left) - height(root.right)) <= 1 && isBalanced(root.right) && isBalanced(root.left);
    }

    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return Math.max(
                height(node.left), height(node.right)
        ) + 1;
    }
}
