package dsa.data_structures.binary_trees.problems.practice.dfs;

import dsa.data_structures.binary_trees.problems.TreeNode;

// https://leetcode.com/problems/minimum-depth-of-binary-tree/description/
public class Minimum_Depth_Of_Binary_Tree {
    int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return Math.min(root.right != null ? minDepth(root.right) : Integer.MAX_VALUE, root.left != null ? minDepth(root.left) : Integer.MAX_VALUE) + 1;
    }
}
