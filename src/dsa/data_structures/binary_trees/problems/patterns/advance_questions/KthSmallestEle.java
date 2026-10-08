package dsa.data_structures.binary_trees.problems.patterns.advance_questions;

import dsa.data_structures.binary_trees.problems.TreeNode;

import java.util.PriorityQueue;

// https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/
public class KthSmallestEle {
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        helper(root, minHeap, k);

        // remove k elements -->
        int ans = 0;
        for (int i = 0; i < k; i++) {
            //noinspection DataFlowIssue
            ans = minHeap.poll();
        }
        return ans;
    }

    private void helper(TreeNode node, PriorityQueue<Integer> minHeap, int k) {
        if (node == null) {
            return;
        }
        helper(node.left, minHeap, k);
        minHeap.offer(node.val);
        helper(node.right, minHeap, k);
    }
}
