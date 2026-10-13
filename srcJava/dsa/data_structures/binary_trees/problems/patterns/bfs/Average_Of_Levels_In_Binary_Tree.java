package dsa.data_structures.binary_trees.problems.patterns.bfs;

import dsa.data_structures.binary_trees.problems.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Average_Of_Levels_In_Binary_Tree {

    static private List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();

        if (root == null) {
            return list;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            int levelSize = queue.size();
            double sum = 0;

            for (int i = 1; i <= levelSize; i++) {

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

            list.add(sum / levelSize);
        }

        return list;
    }
}
