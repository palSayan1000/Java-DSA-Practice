package dsa.data_structures.binary_trees.problems.practice.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// https://leetcode.com/problems/n-ary-tree-level-order-traversal/description/?envType=problem-list-v2&envId=breadth-first-search
public class N_ary_Tree_Level_Order_Traversal {
    private List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            List<Integer> lst = new ArrayList<>();

            for (int i = queue.size(); i > 0; i--) {
                Node node = queue.poll();

                assert node != null;
                for (Node dummy : node.children) {
                    if (dummy != null) {
                        queue.offer(dummy);
                    }
                }

                lst.add(node.val);
            }

            list.add(lst);
        }

        return list;
    }
    private static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
}
