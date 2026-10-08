package dsa.data_structures.binary_trees.problems.practice.dfs.path;

import dsa.data_structures.binary_trees.problems.TreeNode;

// https://leetcode.com/problems/smallest-string-starting-from-leaf/description/
public class Smallest_String_Starting_From_Leaf {
    String str = "";

    public String smallestFromLeaf(TreeNode root) {
        smallestFromLeaf(root, new StringBuilder());
        return str;
    }

    public void smallestFromLeaf(TreeNode node, StringBuilder sb) {
        if (node == null) {
            return;
        }
        sb.append((char) (node.val + 97));
        if (node.left == null && node.right == null) {
            sb.reverse();
            str = str.isEmpty() ? sb.toString() : str.compareTo(String.valueOf(sb)) < 0 ? str : sb.toString();
            sb.reverse();
        }
        smallestFromLeaf(node.left, sb);
        smallestFromLeaf(node.right, sb);
        sb.deleteCharAt(sb.length() - 1);
    }
}
