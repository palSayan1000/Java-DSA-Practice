package dsa.data_structures.binary_trees.problems.patterns.advance_questions;

import dsa.data_structures.binary_trees.problems.TreeNode;

// https://leetcode.com/problems/recover-binary-search-tree/description/
public class Recover_Binary_Search_Tree {

    TreeNode first, second, prev;

    public void recoverTree(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root);
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    public void inOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);

        if (prev != null && prev.val > node.val) {
            if (first == null) {
                first = prev;
            }
            second = node;
        }

        prev = node;

        inOrder(node.right);
    }
}
