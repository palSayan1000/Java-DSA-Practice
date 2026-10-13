package dsa.data_structures.binary_trees.problems.patterns.advance_questions;

import dsa.data_structures.binary_trees.problems.TreeNode;

import java.util.*;

/// this is kunal's solution bitches
public class VerticalTraversal {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        int col = 0;

        Queue<Map.Entry<TreeNode, Integer>> queue = new ArrayDeque<>();
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        queue.offer(new AbstractMap.SimpleEntry<>(root, col));

        int max = 0;
        int min = 0;

        while (!queue.isEmpty()) {
            Map.Entry<TreeNode, Integer> removed = queue.poll();
            TreeNode node = removed.getKey();
            col = removed.getValue();

            if (node != null) {
                if (!map.containsKey(col)) {
                    map.put(col, new ArrayList<>());
                }

                map.get(col).add(node.val);

                min = Math.min(min, col);
                max = Math.max(max, col);

                queue.offer(new AbstractMap.SimpleEntry<>(node.left, col - 1));
                queue.offer(new AbstractMap.SimpleEntry<>(node.right, col + 1));
            }
        }

        for (int i = min; i < max; i++) {
            ans.add(map.get(i));
        }

        return ans;
    }
}
