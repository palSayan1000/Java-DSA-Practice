package dsa.data_structures.binary_trees.problems.practice.dfs.path;

import dsa.data_structures.binary_trees.problems.TreeNode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/binary-tree-paths/description/
public class Binary_Tree_Paths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        binaryTreePaths(root, new StringBuilder(), list);
        return list;
    }

    public void binaryTreePaths(TreeNode node, StringBuilder sb, List<String> list) {
        if (node == null) {
            return;
        }
        int currLen = sb.length();
        sb.append(node.val).append("->");
        if (node.left == null && node.right == null) {
            list.add(sb.substring(0, sb.length() - 2));
        }
        binaryTreePaths(node.left, sb, list);
        binaryTreePaths(node.right, sb, list);
        sb.setLength(currLen); // backtracking
    }
}
