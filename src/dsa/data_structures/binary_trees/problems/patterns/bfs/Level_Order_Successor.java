package dsa.data_structures.binary_trees.problems.patterns.bfs;

import dsa.data_structures.binary_trees.problems.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Level_Order_Successor {

    private TreeNode getLevelOrderSuccessor(TreeNode root, int ele) {
        if (root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            assert node != null;
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }

            if (node.val == ele) {
                return queue.peek();
            }
        }

        return null;
    }
}
