package concepts.dsa.data_structures.binary_trees.problems.patterns.advance_questions;

import concepts.dsa.data_structures.binary_trees.problems.TreeNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

// https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/description/
public class Vertical_Order_Traversal_Of_A_Binary_Tree {

    private List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        TreeMap<Integer, List<Integer[]>> map = new TreeMap<>();
        verticalTraversal(root, 0, 0, map);
        map.forEach((col, values) -> {
            values.sort(Comparator.<Integer[]>comparingInt(a -> a[0]).thenComparingInt(a -> a[1]));
            List<Integer> column = new ArrayList<>();
            for (Integer[] v : values) column.add(v[1]);
            list.add(column);
        });

        return list;
    }

    private void verticalTraversal(TreeNode node, int row, int verticalLevel, TreeMap<Integer, List<Integer[]>> map) {
        if (node == null) {
            return;
        }
        map.putIfAbsent(verticalLevel, new ArrayList<>());
        map.get(verticalLevel).addLast(new Integer[]{row, node.val});

        verticalTraversal(node.left, row + 1, verticalLevel - 1, map);
        verticalTraversal(node.right, row + 1, verticalLevel + 1, map);
    }
}
