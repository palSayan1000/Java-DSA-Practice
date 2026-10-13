package dsa.data_structures.binary_trees.understanding.segment_tree;

public class Main {
    static void main() {
        int[] arr = {3, 8, 6, 7, -2, -8, 4, 9};
        SegmentTree tree = new SegmentTree(arr);
//        tree.display();

        System.out.println(tree.query(1, 6));
    }
}