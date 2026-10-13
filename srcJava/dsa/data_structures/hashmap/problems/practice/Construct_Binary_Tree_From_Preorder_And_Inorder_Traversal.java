package dsa.data_structures.hashmap.problems.practice;

import dsa.data_structures.binary_trees.problems.TreeNode;

import java.util.HashMap;

// https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/
public class Construct_Binary_Tree_From_Preorder_And_Inorder_Traversal {

    int index = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> inorderMap = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        return helper(preorder, inorder, 0, preorder.length - 1, inorderMap);
    }

    public TreeNode helper(int[] preOrder, int[] inOrder, int left, int right, HashMap<Integer, Integer> map) {
        if (left > right) {
            return null;
        }

        int current = preOrder[index];
        index++;
        TreeNode node = new TreeNode(current);

        if (left == right) {
            return node;
        }

        int inOrderIndex = map.get(current);

        node.left = helper(preOrder, inOrder, left, inOrderIndex - 1, map);
        node.right = helper(preOrder, inOrder, inOrderIndex + 1, right, map);

        return node;
    }
}