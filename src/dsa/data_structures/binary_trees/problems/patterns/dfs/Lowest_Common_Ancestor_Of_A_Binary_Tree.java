package dsa.data_structures.binary_trees.problems.patterns.dfs;

import dsa.data_structures.binary_trees.problems.TreeNode;

public class Lowest_Common_Ancestor_Of_A_Binary_Tree {
    // https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }
        if (left == null && right != null) {
            return right;
        }
        return left;
    }
}
