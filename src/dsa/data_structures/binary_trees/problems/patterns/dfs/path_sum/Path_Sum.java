package dsa.data_structures.binary_trees.problems.patterns.dfs.path_sum;

import dsa.data_structures.binary_trees.problems.TreeNode;

// https://leetcode.com/problems/path-sum/description/
public class Path_Sum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        // return hasPathSum(root, targetSum, 0);
        if (root.left == null && root.right == null) {
            return targetSum == 0;
        }
        return hasPathSum(root.left, targetSum - root.val) ||
                hasPathSum(root.right, targetSum - root.val);
    }

    public boolean hasPathSum(TreeNode node, int targetSum, int currSum) {
        if (node == null) {
            return false;
        }
        if (node.left == null && node.right == null) {
            return targetSum == currSum + node.val;
        }
        return hasPathSum(node.left, targetSum, currSum + node.val) ||
                hasPathSum(node.right, targetSum, currSum + node.val);
    }
}
