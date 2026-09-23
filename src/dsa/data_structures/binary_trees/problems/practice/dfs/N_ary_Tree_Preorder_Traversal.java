package dsa.data_structures.binary_trees.problems.practice.dfs;

import java.util.ArrayList;
import java.util.List;

public class N_ary_Tree_Preorder_Traversal {

    private List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        preorderTraversal(root, result);
        return result;
    }
    private void preorderTraversal(Node node, List<Integer> list) {
        if (node == null) {
            return;
        }
        list.add(node.val);
        for (Node dummy : node.children) {
            preorderTraversal(dummy, list);
        }
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
