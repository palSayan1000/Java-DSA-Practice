package dsa.data_structures.binary_trees.problems.practice.bfs;

import dsa.data_structures.binary_trees.problems.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/same-tree/description/?envType=problem-list-v2&envId=breadth-first-search
public class Same_Tree {
    private boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        Queue<TreeNode> pQueue = new LinkedList<>(), qQueue = new LinkedList<>();
        pQueue.offer(p);
        qQueue.offer(q);

        while (!pQueue.isEmpty() || !qQueue.isEmpty()) {
            for (int i = pQueue.size(); i > 0; i--) {
                TreeNode pNode = pQueue.poll();
                TreeNode qNode = qQueue.poll();

                assert pNode != null;
                if (pNode.left != null) {
                    pQueue.offer(pNode.left);
                    if (qNode.left == null) {
                        return false;
                    }
                }
                if (pNode.right != null) {
                    pQueue.offer(pNode.right);
                    if (qNode.right == null) {
                        return false;
                    }
                }
                assert qNode != null;
                if (qNode.left != null) {
                    qQueue.offer(qNode.left);
                    if (pNode.left == null) {
                        return false;
                    }
                }
                if (qNode.right != null) {
                    qQueue.offer(qNode.right);
                    if (pNode.right == null) {
                        return false;
                    }
                }

                if (pNode.val != qNode.val) {
                    return false;
                }
            }
            if (pQueue.size() != qQueue.size()) {
                return false;
            }
        }

        return true;
    }
}
