package dsa.data_structures.binary_trees.understanding.avl;

public class Main {
    static void main() {
        AVL tree = new AVL();

        for (int i = 0; i < 1000; i++) {
            tree.insert(i);
        }

        System.out.println(tree.height());
        tree.display();
        System.out.println(tree.isBalanced());
    }
}
