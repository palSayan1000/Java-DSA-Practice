package dsa.data_structures.binary_trees.problems.practice.dfs;

import dsa.data_structures.binary_trees.problems.TreeNode;

// https://leetcode.com/problems/deepest-leaves-sum/description/?envType=problem-list-v2&envId=depth-first-search
public class Deepest_Leaves_Sum {
    public int sum = 0, maxDepth = 0;

    public int deepestLeavesSum(TreeNode root) {
        deepestLeavesSum(root, 1);
        return sum;
    }

    public void deepestLeavesSum(TreeNode node, int height) {
        if (node == null) {
            return;
        }
        if (height > maxDepth) {
            maxDepth = height;
            sum = node.val;
        } else if (height == maxDepth) {
            sum += node.val;
        }
        deepestLeavesSum(node.left, height + 1);
        deepestLeavesSum(node.right, height + 1);
    }
}
