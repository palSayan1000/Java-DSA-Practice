package dsa.data_structures.binary_trees.problems.patterns.dfs;

import dsa.data_structures.binary_trees.problems.TreeNode;

// https://leetcode.com/problems/flatten-binary-tree-to-linked-list/description/
public class Flatten_Binary_Tree_to_Linked_List {

    private void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode current = root;
        while (current != null) {
            if (current.left != null) {
                TreeNode temp = current.left;
                while (temp.right != null) {
                    temp = temp.right;
                }
                temp.right = current.right;
                current.right = current.left;
                current.left = null;
            }
            current = current.right;
        }
    }

//    private void flatten(TreeNode root) {
//        if (root == null) {
//            return;
//        }
//        flattener(root);
//    }
//
//    private TreeNode flattener(TreeNode node) {
//        if (node == null) {
//            return null;
//        }
//        if (node.left == null && node.right == null) {
//            return node;
//        }
//        if (node.left != null) {
//            TreeNode temp = node.right;
//            node.right = node.left;
//            node.left = null;
//            TreeNode lastNode = flattener(node.right);
//            if (lastNode != null)
//                lastNode.right = temp;
//            return temp == null? lastNode : flattener(temp);
//        } else {
//            return flattener(node.right);
//        }
//    }
}
