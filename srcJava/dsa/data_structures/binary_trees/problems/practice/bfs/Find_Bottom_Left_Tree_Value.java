package dsa.data_structures.binary_trees.problems.practice.bfs;

import dsa.data_structures.binary_trees.problems.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/find-bottom-left-tree-value/description/?envType=problem-list-v2&envId=depth-first-search
public class Find_Bottom_Left_Tree_Value {

    public int findBottomLeftValue(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int leftMostLastRow = 0;

        while (!queue.isEmpty()) {
            leftMostLastRow = queue.peek().val;
            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                assert node != null;
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }

        return leftMostLastRow;
    }
}
