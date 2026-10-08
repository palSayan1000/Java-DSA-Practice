package dsa.data_structures.binary_trees.problems.practice.bfs;

import dsa.data_structures.binary_trees.problems.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/serialize-and-deserialize-bst/description/?envType=problem-list-v2&envId=depth-first-search
public class Serialize_and_Deserialize_BST {
    public class Codec {
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
}
