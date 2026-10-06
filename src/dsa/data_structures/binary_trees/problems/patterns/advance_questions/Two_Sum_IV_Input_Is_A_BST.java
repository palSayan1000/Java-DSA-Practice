package dsa.data_structures.binary_trees.problems.patterns.advance_questions;

import dsa.data_structures.binary_trees.problems.TreeNode;

import java.util.HashSet;

// https://leetcode.com/problems/two-sum-iv-input-is-a-bst/description/
public class Two_Sum_IV_Input_Is_A_BST {
    HashSet<Integer> set = new HashSet<>();

    public boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        if (set.contains(k - root.val)) {
            return true;
        }
        set.add(root.val);
        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}
