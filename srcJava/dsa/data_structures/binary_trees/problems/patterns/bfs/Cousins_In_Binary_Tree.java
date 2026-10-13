package dsa.data_structures.binary_trees.problems.patterns.bfs;

import dsa.data_structures.binary_trees.problems.TreeNode;

// https://leetcode.com/problems/cousins-in-binary-tree/description/
public class Cousins_In_Binary_Tree {

    private boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx = findNode(root, x);
        TreeNode yy = findNode(root, y);

        return (
                level(root, xx, 0) == level(root, yy, 0) && !isSiblings(root, xx, yy)
        );
    }

    private boolean isSiblings(TreeNode node, TreeNode xx, TreeNode yy) {
        if (node == null) {
            return false;
        }
        return (
                (node.left == xx && node.right == yy) || (node.right == xx && node.left == yy) ||
                        isSiblings(node.left, xx, yy) || isSiblings(node.right, xx, yy)
        );
    }

    private int level(TreeNode node, TreeNode find, int level) {
        if (node == null) {
            return 0;
        }
        if (node == find) {
            return level;
        }
        return Math.max(
                level(node.left, find, level + 1), level(node.right, find, level + 1)
        );
    }

    private TreeNode findNode(TreeNode node, int find) {
        if (node == null) {
            return null;
        }
        if (node.val == find) {
            return node;
        }
        TreeNode nn = findNode(node.left, find);
        if (nn != null) {
            return nn;
        }
        return findNode(node.right, find);
    }
}
