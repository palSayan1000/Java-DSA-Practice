package dsa.data_structures.binary_trees.problems.patterns.dfs.path_sum;

import dsa.data_structures.binary_trees.problems.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Path_Sum_III_kunal_All_Paths {
    public List<List<Integer>> findTotalPaths(TreeNode node, int sum) {
        List<List<Integer>> paths = new ArrayList<>();
        helper(node, sum, new ArrayList<>(), paths);
        return paths;
    }

    // it calculates the root to the leaf only not the middle ones
    public void helper(TreeNode node, int targetSum, List<Integer> path, List<List<Integer>> paths) {
        if (node == null) {
            return;
        }
        path.add(node.val);

        if (node.val == targetSum && node.left == null && node.right == null) {
            paths.add(new ArrayList<>(path));
        } else {
            helper(node.left, targetSum - node.val, path, paths);
            helper(node.right, targetSum - node.val, path, paths);
        }

        // backtrack
        path.removeLast();
    }
}
