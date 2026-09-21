package dsa.data_structures.binary_trees.problems.patterns.dfs;

// https://leetcode.com/problems/invert-binary-tree/description/
public class Invert_Binary_Tree {

    private TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode left = invertTree(root.left);

        root.left = invertTree(root.right);
        root.right = left;

        return root;
    }

//    private void invertTreeBaby(TreeNode node) {
//        if (node == null) {
//            return;
//        }
//        invertTreeBaby(node.left);
//        invertTreeBaby(node.right);
//
//        TreeNode dummy = node.left;
//        node.left = node.right;
//        node.right = dummy;
//    }

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
