package dsa.data_structures.binary_trees.problems.patterns.dfs;

// https://leetcode.com/problems/diameter-of-binary-tree/description/
public class Diameter_Of_Binary_Tree {
    int diameter = 0;
    private int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter - 1;
    }
    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        int diameter = leftHeight + rightHeight + 1;
        this.diameter = Math.max(diameter, this.diameter);

        return Math.max(leftHeight, rightHeight) + 1;
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
