package dsa.data_structures.binary_trees.problems.patterns.dfs.path_sum;

import dsa.data_structures.binary_trees.problems.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Path_Sum_III_kunal_count {
    public int countPaths(TreeNode node, int sum) {
        List<Integer> path = new ArrayList<>();
        return helper(node, sum, path);
    }

    public int helper(TreeNode node, int targetSum, List<Integer> path) {
        if (node == null) {
            return 0;
        }
        path.add(node.val);
        int count = 0;
        int sum = 0;
        // how many paths can I make
        ListIterator<Integer> iterator = path.listIterator();
        while (iterator.hasPrevious()) {
            sum += iterator.
                    previous();
            if (sum == targetSum) {
                count++;
            }
        }

        count += helper(node.left, targetSum - node.val, path) + helper(node.right, targetSum - node.val, path);

        // backtrack
        path.removeLast();

        return count;
    }
}
