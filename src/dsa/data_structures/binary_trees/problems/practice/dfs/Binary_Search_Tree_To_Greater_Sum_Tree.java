package dsa.data_structures.binary_trees.problems.practice.dfs;

import dsa.data_structures.binary_trees.problems.TreeNode;

// https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/description/
public class Binary_Search_Tree_To_Greater_Sum_Tree {
    int sum = 0;

    public TreeNode bstToGst(TreeNode root) {
        // L -> + -> R -> getting the BST values in sorted order -> ascending
        // reversing it
        // R -> + -> L -> getting the BST values in descending order

        // helper(root);

        if (root == null) {
            return null;
        }

        TreeNode temp = bstToGst(root.right);
        sum += root.val;
        root.val = sum;
        temp = bstToGst(root.left);

        return root;
    }

    // int sum = 0;

    // private void helper(TreeNode node) {
    //     if (node == null) {
    //         return;
    //     }
    //     helper(node.right);
    //     sum += node.val;
    //     node.val = sum;
    //     helper(node.left);
    // }
}
