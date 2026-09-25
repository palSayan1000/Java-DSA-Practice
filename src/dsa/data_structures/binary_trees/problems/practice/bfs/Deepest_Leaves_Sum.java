package dsa.data_structures.binary_trees.problems.practice.bfs;

import dsa.data_structures.binary_trees.problems.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/deepest-leaves-sum/description/?envType=problem-list-v2&envId=depth-first-search
public class Deepest_Leaves_Sum {
    public int deepestLeavesSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int sum = 0;

        while (!queue.isEmpty()) {
            sum = 0;
            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                assert node != null;
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                sum += node.val;
            }
        }

        return sum;
    }
}
