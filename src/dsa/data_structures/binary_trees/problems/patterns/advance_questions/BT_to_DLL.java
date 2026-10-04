package dsa.data_structures.binary_trees.problems.patterns.advance_questions;

// converting binary tree to double linked list
public class BT_to_DLL {
    LLNode head;
    LLNode tail;

    LLNode convert(TreeNode root) {
        if (root == null) {
            return null;
        }

        helper(root);

        return head;
    }

    private void helper(TreeNode node) {
        if (node == null) {
            return;
        }

        helper(node.left);

        LLNode newNode = new LLNode(node.val);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        helper(node.right);
    }
}

class LLNode {
    int val;
    LLNode prev;
    LLNode next;

    public LLNode(int val) {
       this.val = val;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}