package dsa.data_structures.binary_trees.problems.patterns.dfs;

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

    private static class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode() {}
       TreeNode(int val) { this.val = val; }
       TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
       }
    }
}
