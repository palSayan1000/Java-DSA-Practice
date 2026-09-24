package dsa.data_structures.binary_trees.problems.patterns.dfs;

import dsa.data_structures.binary_trees.problems.TreeNode;

import java.util.Arrays;

// https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/
public class Construct_Binary_Tree_From_Preorder_And_Inorder_Traversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }

        int root = preorder[0];
        int index = 0;

        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == root) {
                index = i;
                break;
            }
        }

        TreeNode node = new TreeNode(root);
        node.left = buildTree(Arrays.copyOfRange(preorder, 1, index + 1),
                Arrays.copyOfRange(inorder, 0, index));
        node.right = buildTree(Arrays.copyOfRange(preorder, index + 1, preorder.length),
                Arrays.copyOfRange(inorder, index + 1, inorder.length));

        return node;
    }
}