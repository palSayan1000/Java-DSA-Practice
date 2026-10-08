package dsa.data_structures.binary_trees.problems.patterns.bfs;

// https://leetcode.com/problems/populating-next-right-pointers-in-each-node/description/
public class Populating_Next_Right_Pointers_In_Each_Node {
    // Kunal solution better one
    private Node connect(Node root) {
        if (root == null) {
            return null;
        }

        Node leftMost = root;

        while (leftMost.left != null) {
            Node current = leftMost;
            while (current != null) {
                current.left.next = current.right;
                if (current.next != null) {
                    current.right.next = current.next.left;
                }
                current = current.next;
            }
            leftMost = leftMost.left;
        }

        return root;
    }

    private static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    // My solution simple one
//    private Node connect(Node root) {
//        if (root == null) {
//            return null;
//        }
//        Queue<Node> queue = new LinkedList<>();
//        queue.offer(root);
//
//        while (!queue.isEmpty()) {
//            Node dummy = null;
//            for (int i = queue.size(); i > 0; i--) {
//                Node node = queue.poll();
//                assert node != null;
//                if (node.left != null) {
//                    queue.offer(node.left);
//                }
//                if (node.right != null) {
//                    queue.offer(node.right);
//                }
//                if (dummy != null) {
//                    dummy.next = node;
//                }
//                dummy = node;
//            }
//            dummy.next = null;
//        }
//
//        return root;
//    }
}
