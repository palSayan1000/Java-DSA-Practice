package dsa.data_structures.binary_trees.problems.patterns.dfs.path_sum;

import dsa.data_structures.binary_trees.problems.TreeNode;

public class Binary_Tree_Maximum_Path_Sum {
    int ans = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        helper(root);
        return ans;
    }

    public int helper(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = Math.max(0, helper(node.left));
        int right = Math.max(0, helper(node.right));
//        left = Math.max(0, left);
//        right = Math.max(right, 0);
        ans = Math.max(ans, left + right + node.val);
        return Math.max(left, right) + node.val;
    }
}
