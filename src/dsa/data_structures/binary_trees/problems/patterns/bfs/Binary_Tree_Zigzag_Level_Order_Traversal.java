package dsa.data_structures.binary_trees.problems.patterns.bfs;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/
public class Binary_Tree_Zigzag_Level_Order_Traversal {
    // kunal solution better logical one using deque
    private static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        boolean reverse = false;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                if (!reverse) {
                    TreeNode currentNode = queue.pollFirst();
                    assert currentNode != null;
                    currentLevel.add(currentNode.val);
                    if (currentNode.left != null) {
                        queue.addLast(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        queue.addLast(currentNode.right);
                    }
                } else {
                    TreeNode currentNode = queue.pollLast();
                    assert currentNode != null;
                    currentLevel.add(currentNode.val);
                    if (currentNode.right != null) {
                        queue.addFirst(currentNode.right);
                    }
                    if (currentNode.left != null) {
                        queue.addFirst(currentNode.left);
                    }
                }
            }
            reverse = !reverse;
            result.add(currentLevel);
        }
        return result;
    }

    // My Solution works fine on lee code
//    static private List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//
//        List<List<Integer>> list = new ArrayList<>();
//
//        if (root == null) {
//            return list;
//        }
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        boolean levelOrder = true;
//
//        while (!queue.isEmpty()) {
//            list.add(new ArrayList<>()/* current level list*/);
//
//            for (int i = 1, levelSize = queue.size(); i <= levelSize; i++) {
//
//                TreeNode node = queue.poll();
//
//                assert node != null;
//                if (node.left != null) {
//                    queue.offer(node.left);
//                }
//                if (node.right != null) {
//                    queue.offer(node.right);
//                }
//
//                if (levelOrder) {
//                    list.getLast().add(node.val);
//                } else {
//                    list.getLast().addFirst(node.val);
//                }
//            }
//
//            levelOrder = !levelOrder;
//        }
//
//        return list;
//    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
