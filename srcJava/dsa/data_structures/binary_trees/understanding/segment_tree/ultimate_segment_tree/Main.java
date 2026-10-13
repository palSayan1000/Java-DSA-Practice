package dsa.data_structures.binary_trees.understanding.segment_tree.ultimate_segment_tree;

public class Main {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        long[] arr2 = {3, 8, 7, 6, -2, -8, 4, 9};
        Float[] arr3 = {0.1f, .2f, .3f, .4f, .5f, .6f, .7f, .8f, .9f};
        float[] arr33 = {0.1f, .2f, .3f, .4f, .5f, .6f, .7f, .8f, .9f};
        double[] arr4 = {.1, .01, .001, .0001, .00001, .000001, .0000001};
        // Short[] ar = {1, 2, 3, 4};

        SegmentTree<Integer> tree1 = SegmentTree.of(arr, IntegerOps.PRODUCT);
        // SegmentTree.of() -> func is static and takes arr converts to Integer class boxed and passes the object of the
        // SegmentTree class
        SegmentTree<Long> tree2 = SegmentTree.of(arr2, LongOps.ADD);
        SegmentTree<Float> tree3 = new SegmentTree<>(arr3, FloatOps.MODULES),
                tree33 = SegmentTree.of(arr33, FloatOps.MIN);
        SegmentTree<Double> tree4 = SegmentTree.of(arr4, DoubleOps.MAX);
        // SegmentTree<Short> treeAR = new SegmentTree<>(ar, IntegerOps.SUBTRACT);
        System.out.println(tree1); // automatically calls toString as it over
        System.out.println(tree4.query(0, 4));
        System.out.println(tree33.query(5, arr33.length - 1));
        tree2.display();
        System.out.println(tree2.query(0, 1));
        tree2.update(0, 4L);
        System.out.println(tree2);
        System.out.println(tree3);
    }
}
