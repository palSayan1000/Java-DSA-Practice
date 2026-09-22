package dsa.data_structures.binary_trees.problems.patterns.bst;

import dsa.data_structures.binary_trees.problems.TreeNode;

// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/
public class Convert_Sorted_Array_To_Binary_Search_Tree {
    TreeNode root;

    private TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        populateSorted(nums, 0, nums.length - 1);
        return root;
    }

    private void populateSorted(int[] nums, int start, int end) {
        if (start > end) {
            return;
        }
        int mid = start + (end - start) / 2;

        root = insert(nums[mid], root);

        populateSorted(nums, start, mid - 1);
        populateSorted(nums, mid + 1, end);
    }

    private TreeNode insert(int value, TreeNode node) {
        if (node == null) {
            node = new TreeNode(value);
            return node;
        }
        if (value < node.val) {
            node.left = insert(value, node.left);
        }
        if (value > node.val) {
            node.right = insert(value, node.right);
        }
        return node;
    }
}
