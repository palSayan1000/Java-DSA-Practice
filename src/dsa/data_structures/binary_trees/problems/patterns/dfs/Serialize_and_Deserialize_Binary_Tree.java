package dsa.data_structures.binary_trees.problems.patterns.dfs;

import dsa.data_structures.binary_trees.problems.TreeNode;

import java.util.*;

// https://leetcode.com/problems/serialize-and-deserialize-binary-tree/description/
public class Serialize_and_Deserialize_Binary_Tree {
    // kunal's one
    public List<String> serialize(TreeNode node) {
        List<String> list = new ArrayList<>();
        helper(node, list);
        return list;
    }

    public void helper(TreeNode node, List<String> list) {
        if (node == null) {
            list.add("null");
            return;
        }

        list.add(String.valueOf(node.val));

        helper(node.left, list);
        helper(node.right, list);
    }

    TreeNode deserialize(List<String> list) {
        Collections.reverse(list);
        TreeNode node = helper2(list);
        return node;
    }

    TreeNode helper2(List<String> list) {
        String val = list.removeLast();

        if (val.equals("null")) {
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(val));

        node.left = helper2(list);
        node.right = helper2(list);

        return node;
    }
}

class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        return serialize(root, new StringBuilder()).toString();
    }

    public StringBuilder serialize(TreeNode node, StringBuilder sb) {
        if (node == null) {
            return sb.append('X').append(',');
        }
        sb.append(node.val).append(',');
        serialize(node.left, sb);
        serialize(node.right, sb);
        return sb;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        return deserialize(new LinkedList<>(Arrays.asList(data.split(",+"))));
    }

    public TreeNode deserialize(Queue<String> queue) {
        assert queue.peek() != null;
        if (queue.peek().equals("X")) {
            queue.poll();
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(queue.poll()));
        node.left = deserialize(queue);
        node.right = deserialize(queue);

        return node;
    }
}