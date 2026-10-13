package dsa.data_structures.binary_trees.problems.patterns.bfs;

import dsa.data_structures.binary_trees.problems.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/problems/binary-tree-level-order-traversal-ii/description/
public class Binary_Tree_Level_Order_Traversal_II {
    private List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();

        if (root == null) {
            return list;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            list.addFirst(new ArrayList<>()/* current level list*/);

            for (int i = 1, levelSize = queue.size(); i <= levelSize; i++) {

                TreeNode node = queue.poll();

                assert node != null;
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }

                list.getFirst().add(node.val);
            }
        }

        return list;
    }
}
