package dsa.data_structures.binary_trees.problems.patterns.dfs;

import dsa.data_structures.binary_trees.problems.TreeNode;

// https://leetcode.com/problems/symmetric-tree/description/
public class Symmetric_Tree {

    private boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return false;
        }
        return isSymmetric(root.left, root.right);
    }

    // dfs baby
    private boolean isSymmetric(TreeNode firstNode, TreeNode secondNode) {
        if (firstNode == null && secondNode == null) {
            return true;
        }
        if (firstNode == null || secondNode == null) {
            return false;
        }
        return (
                firstNode.val == secondNode.val &&
                        isSymmetric(firstNode.left, secondNode.right) && isSymmetric(firstNode.right, secondNode.left)
        );
    }
}
