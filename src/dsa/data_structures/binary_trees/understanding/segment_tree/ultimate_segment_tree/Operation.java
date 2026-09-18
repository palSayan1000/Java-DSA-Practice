package dsa.data_structures.binary_trees.understanding.segment_tree.ultimate_segment_tree;

public interface Operation<T extends Number> {
    T apply(T a, T b);
    T identity(); // neutral value: 0 for add, MIN_VALUE for max, 1 for multiply
}
