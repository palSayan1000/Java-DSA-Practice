package dsa.data_structures.binary_trees.problems.practice.dfs;

import dsa.data_structures.binary_trees.problems.TreeNode;

// https://leetcode.com/problems/sum-root-to-leaf-numbers/description/?envType=problem-list-v2&envId=depth-first-search
public class Sum_Root_To_Leaf_Numbers {
    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return sumNumbers(root, 0);
    }

    public int sumNumbers(TreeNode node, int currNum) {
        if (node == null) {
            return 0;
        }
        currNum = currNum * 10 + node.val;
        if (node.left == null && node.right == null) {
            return currNum;
        }
        int leftSum = sumNumbers(node.left, currNum);
        int rightSum = sumNumbers(node.right, currNum);

        return leftSum + rightSum;
    }
}
