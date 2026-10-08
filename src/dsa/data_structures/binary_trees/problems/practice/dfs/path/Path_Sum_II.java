package dsa.data_structures.binary_trees.problems.practice.dfs.path;

import dsa.data_structures.binary_trees.problems.TreeNode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/path-sum-ii/description/
public class Path_Sum_II {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<>();
        pathSum(root, targetSum, new ArrayList<>(), list);
        return list;
    }

    public void pathSum(TreeNode node, int targetSum, ArrayList<Integer> lst, List<List<Integer>> list) {
        if (node == null) {
            return;
        }
        lst.add(node.val);
        if (node.left == null && node.right == null && targetSum == node.val) {
            list.add(new ArrayList<>(lst));
        }
        pathSum(node.left, targetSum - node.val, lst, list);
        pathSum(node.right, targetSum - node.val, lst, list);
        lst.removeLast();
    }
}
