package dsa.data_structures.binary_trees.problems.patterns.bfs;

import dsa.data_structures.binary_trees.problems.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// https://leetcode.com/problems/binary-tree-right-side-view/description/
public class Binary_Tree_Right_Side_View {

    private List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        if (root == null)
            return list;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int lastNodeVal = 0;

            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();

                assert node != null;
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);

                lastNodeVal = node.val;
            }
            list.add(lastNodeVal);
        }

        return list;
    }
}
