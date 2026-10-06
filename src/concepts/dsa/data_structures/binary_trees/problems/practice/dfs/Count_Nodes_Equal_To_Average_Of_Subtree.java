package concepts.dsa.data_structures.binary_trees.problems.practice.dfs;

import concepts.dsa.data_structures.binary_trees.problems.TreeNode;

// https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree/description/
public class Count_Nodes_Equal_To_Average_Of_Subtree {
    int count = 0;

    public int averageOfSubtree(TreeNode root) {
        helper(root);
        return count;
    }

    private int[] helper(TreeNode node) {
        if (node == null) {
            return new int[]{0, 0};
        }
        if (node.left == null && node.right == null) {
            count++;
            return new int[]{node.val, 1};
        }

        int[] left = helper(node.left);
        int[] right = helper(node.right);
        int sum, count;
        if ((sum = left[0] + right[0] + node.val) / (count = left[1] + right[1] + 1) == node.val) {
            this.count++;
        }

        return new int[]{sum, count};
    }
}
