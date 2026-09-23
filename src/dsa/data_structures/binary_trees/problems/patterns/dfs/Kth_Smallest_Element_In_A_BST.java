package dsa.data_structures.binary_trees.problems.patterns.dfs;

import dsa.data_structures.binary_trees.problems.TreeNode;

public class Kth_Smallest_Element_In_A_BST {

    int count = 0;

    public int kthSmallest(TreeNode root, int k) {
        if (root == null) {
            return 0;
        }
        return helper(root, k).val;
    }

    private TreeNode helper(TreeNode node, int k) {
        if (node == null) {
            return null;
        }
        TreeNode left = helper(node.left, k);

        if (left != null) {
            return left;
        }

        count ++;

        if (count == k) {
            return node;
        }

        return helper(node.right, k);
    }
}
