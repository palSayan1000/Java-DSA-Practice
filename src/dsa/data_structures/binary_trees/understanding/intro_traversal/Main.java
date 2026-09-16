package dsa.data_structures.binary_trees.understanding.intro_traversal;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(scanner);
        tree.prettiestdisplay();
        tree.prettyDisplay();

    }
}
