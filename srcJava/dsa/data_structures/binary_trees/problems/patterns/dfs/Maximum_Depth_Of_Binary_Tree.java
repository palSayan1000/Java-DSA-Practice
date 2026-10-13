package dsa.data_structures.binary_trees.problems.patterns.dfs;

import dsa.data_structures.binary_trees.problems.TreeNode;

// https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
public class Maximum_Depth_Of_Binary_Tree {

    private int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return (
                Math.max(/*Left Height*/maxDepth(root.left), /*Right Height*/maxDepth(root.right)) + 1
        );
    }
}
