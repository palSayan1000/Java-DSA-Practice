package dsa.data_structures.binary_trees.problems.patterns.dfs;

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

    private static class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode() {}
       TreeNode(int val) { this.val = val; }
       TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
       }
    }
}
