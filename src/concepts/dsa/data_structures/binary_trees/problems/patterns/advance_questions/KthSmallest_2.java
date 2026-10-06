package concepts.dsa.data_structures.binary_trees.problems.patterns.advance_questions;

import concepts.dsa.data_structures.binary_trees.problems.TreeNode;

// https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/
public class KthSmallest_2 {
    private int count = 0;
    private int ans;

    public int kthSmallest(TreeNode root, int k) {
        helper(root, k);
        return ans;
    }

    private void helper(TreeNode node, int k) {
        if (node == null) {
            return;
        }
        if (count == k) {
            return;
        }
        helper(node.left, k);
        if (count != k) {
            count++;
            ans = node.val;
        }
        helper(node.right, k);
    }
}
