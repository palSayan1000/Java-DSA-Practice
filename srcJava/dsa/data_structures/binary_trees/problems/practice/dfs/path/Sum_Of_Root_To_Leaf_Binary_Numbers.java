package dsa.data_structures.binary_trees.problems.practice.dfs.path;

import dsa.data_structures.binary_trees.problems.TreeNode;

// https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/description/?envType=problem-list-v2&envId=depth-first-search
public class Sum_Of_Root_To_Leaf_Binary_Numbers {

    public int sumRootToLeaf(TreeNode root) {
        return sumRootToLeaf(root, 0);
    }

    public int sumRootToLeaf(TreeNode node, int current) {
        if (node == null) {
            return 0;
        }
        current = current * 2 + node.val;
        if (node.left == null && node.right == null) {
            return current;
        }
        return sumRootToLeaf(node.left, current) + sumRootToLeaf(node.right, current);
    }
//    public int sum = 0;
//
//    public int sumRootToLeaf(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//        sumRootToLeaf(root, new StringBuilder());
//        return sum;
//    }
//
//    public void sumRootToLeaf(TreeNode node, StringBuilder sb) {
//        if (node == null) {
//            return;
//        }
//
//        int prevLen = sb.length();
//        sb.append(node.val);
//
//        if (node.left == null && node.right == null) {
//            sum += Integer.parseInt(sb.toString(), 2);
//        }
//
//        sumRootToLeaf(node.left, sb);
//        sumRootToLeaf(node.right, sb);
//
//        sb.setLength(prevLen);
//    }
}
