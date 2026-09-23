package dsa.data_structures.binary_trees.problems.practice.dfs;

import dsa.data_structures.binary_trees.problems.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Inorder_Traversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        inorderTraversal(root, result);
        return result;
    }
    public void inorderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left, list);
        list.add(root.val);
        inorderTraversal(root.right, list);
    }
}
