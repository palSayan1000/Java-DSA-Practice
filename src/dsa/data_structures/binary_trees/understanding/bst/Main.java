package dsa.data_structures.binary_trees.understanding.bst;


public class Main {
    static void main() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.populate(new int[] {5, 2, 7, 1, 4, 6, 9, 8, 3, 10});
        tree.display();

        new BinarySearchTree(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                                21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40}).display();
    }
}
