package dsa.data_structures.binary_trees.problems.practice.dfs;

import java.util.ArrayList;
import java.util.List;

public class N_ary_Tree_Postorder_Traversal {

    private List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        postorder(root, list);
        return list;
    }

    private void postorder(Node node, List<Integer> list) {
        if (node == null) {
            return;
        }
        for (Node dummy : node.children) {
            postorder(dummy, list);
        }
        list.add(node.val);
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
    }
}
