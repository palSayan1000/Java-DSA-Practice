package dsa.data_structures.binary_trees;

import java.util.Scanner;

public class BinaryTree {

    public BinaryTree() {

    }

    private static class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    private Node root;

    // insert elements
    public void populate(Scanner scanner) {
        System.out.println("Enter the root node value: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);

    }

    private void populate(Scanner scanner, Node root) {

    }
}
