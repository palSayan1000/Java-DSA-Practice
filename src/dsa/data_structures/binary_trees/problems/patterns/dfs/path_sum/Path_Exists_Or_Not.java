package dsa.data_structures.binary_trees.problems.patterns.dfs.path_sum;

import dsa.data_structures.binary_trees.problems.TreeNode;

public class Path_Exists_Or_Not {
    public boolean pathExists(TreeNode root, int[] nums) {
        if (root == null) {
            return nums.length == 0;
        }
        return pathExists(root, nums, 0);
    }

    public boolean pathExists(TreeNode node, int[] nums, int level) {
        if (node == null) {
            return false;
        }
        if (level >= nums.length || node.val != nums[level]) {
            return false;
        }
        if (node.left == null && node.right == null && nums.length - 1 == level) {
            return nums[level] == node.val;
        }

        return pathExists(node.left, nums, level + 1) ||
                pathExists(node.right, nums, level + 1);
    }
}
