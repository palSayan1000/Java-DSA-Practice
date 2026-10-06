package concepts.dsa.data_structures.binary_trees.problems.patterns.advance_questions;

// kunal version of the (Recover Binary Search Tree)
// https://leetcode.com/problems/recover-binary-search-tree/description/
public class TwoNodeSwap {
    Node first;
    Node second;
    Node prev;

    void helper(Node root) {
        iot(root);

        // swap
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    private void iot(Node node) {
        if (node == null) {
            return;
        }
        iot(node.left);

        if (prev != null && prev.val > node.val) {
            if (first == null) {
                first = prev;
            }
            second = node;
        }

        prev = node;

        iot(node.right);
    }
}

class Node {
    int val;
    Node left;
    Node right;

    public Node(int val) {
        this.val = val;
    }
}